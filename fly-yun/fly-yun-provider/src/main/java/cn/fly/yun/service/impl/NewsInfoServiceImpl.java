package cn.fly.yun.service.impl;

import cn.fly.yun.base.PageBean;
import cn.fly.yun.config.exceptions.BusinessException;
import cn.fly.yun.domain.*;
import cn.fly.yun.handle.RedisHandle;
import cn.fly.yun.mapper.NewsInfoMapper;
import cn.fly.yun.mapper.QuotesExchangeMapper;
import cn.fly.yun.mapper.QuotesTransactionMapper;
import cn.fly.yun.service.NewsInfoService;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

//@Service(version = "1.0.0", timeout = 60000, delay = -1, retries = 0)
public class NewsInfoServiceImpl implements NewsInfoService {
    private static final Logger LOGGER = LoggerFactory.getLogger(NewsInfoServiceImpl.class);

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    RedisHandle redisHandle;

    @Autowired
    NewsInfoMapper newsInfoMapper;

    @Autowired
    QuotesExchangeMapper quotesExchangeMapper;

    @Autowired
    QuotesTransactionMapper quotesTransactionMapper;

    /**
     * 资讯列表
     *
     * @param req
     * @return
     */
    @Override
    public GetNewsListRes getNewsList(GetNewsListReq req) {
        NewsInfoExample example = new NewsInfoExample();
        example.setOrderByClause("istop desc,publishtime desc");

        PageHelper.startPage(req.getCurrentPage(), req.getPageSize());
        List<NewsInfo> list = newsInfoMapper.selectByExample(example);
        int totalnum = newsInfoMapper.countByExample(example);

        List<NewsInfoDomain> retList = new ArrayList();

        list.forEach(newsInfo -> {
            NewsInfoDomain domain = new NewsInfoDomain();
            BeanUtils.copyProperties(newsInfo, domain);

            List<String> coverRedisList = redisTemplate.opsForList().range(domain.getAttaid() + "cover", 0, 3);
            List<NewsAttachment> coverList = new ArrayList();
            coverRedisList.forEach(str -> {
                NewsAttachment attachment = JSON.parseObject(str, NewsAttachment.class);
                coverList.add(attachment);
            });

            domain.setCoverList(coverList);
            computePraise(domain, req.getMobile());
            retList.add(domain);
        });

        PageBean<NewsInfoDomain> pageData = new PageBean<>(req.getCurrentPage(), req.getPageSize(), totalnum);
        pageData.setItems(retList);
        GetNewsListRes res = new GetNewsListRes();
        res.setPageBean(pageData);
        return res;
    }

    /**
     * 点赞
     *
     * @param req
     * @return
     * @throws Exception
     */
    @Override
    public ThumbUpRes thumbUp(ThumbUpReq req) throws Exception {
        int i = isThumbUpForNewsId(req.getMobile(), req.getNewsid());

        /**
         * 已点赞
         */
        if (i > -1) {
            throw new BusinessException("isv.mobile.has.Praise");
        }

//        redisTemplate.opsForList().rightPush(req.getNewsid() + "_praise", req.getMobile());
        redisHandle.addList(req.getNewsid() + "_praise", req.getMobile());

        return new ThumbUpRes();
    }

    /**
     * 取消点赞
     *
     * @param req
     * @return
     * @throws Exception
     */
    @Override
    public ThumbDownRes thumbDown(ThumbDownReq req) throws Exception {
        int i = isThumbUpForNewsId(req.getMobile(), req.getNewsid());
        LOGGER.debug("thumbDown====================" + i);

        /**
         * 未点赞
         */
        if (i == -1) {
            throw new BusinessException("isv.mobile.has.not.Praise");
        }

//        redisTemplate.opsForList().remove(req.getNewsid() + "_praise", i, req.getMobile());
        redisHandle.removeListValue(req.getNewsid() + "_praise", req.getMobile());

        return new ThumbDownRes();
    }

    /**
     * 得到图文详情
     *
     * @param req
     * @return
     * @throws Exception
     */
    @Override
    public GetDetailForNewsRes getDetailForNews(GetDetailForNewsReq req) throws Exception {
        GetDetailForNewsRes res = new GetDetailForNewsRes();
        LOGGER.debug("getDetailForNews====================" + req.toString());

        NewsInfo newsInfo = newsInfoMapper.selectByPrimaryKey(req.getNewsid());
        BeanUtils.copyProperties(newsInfo, res);

        /**
         * 图片
         */
        if ("1".equals(newsInfo.getNewstype())) {
            List<String> picRedisList = redisTemplate.opsForList().range(res.getAttaid() + "pic", 0, 20);
            List<NewsAttachment> picList = new ArrayList();
            picRedisList.forEach(str -> {
                NewsAttachment attachment = JSON.parseObject(str, NewsAttachment.class);
                picList.add(attachment);
            });

            res.setPicList(picList);
        }
        /**
         * 视频
         */
        else if ("2".equals(newsInfo.getNewstype())) {
            List<String> videoList = redisTemplate.opsForList().range(res.getAttaid() + "video", 0, 3);
            String str = videoList.get(0);
            NewsAttachment attachment = JSON.parseObject(str, NewsAttachment.class);
            res.setVideoDesc(attachment.getContent());
            res.setVideoUrl(attachment.getUrlpath());
        }
        /**
         * 图文
         */
        else {

        }

        /**
         * 计算是否点赞
         */
        NewsInfoDomain domain = new NewsInfoDomain();
        domain.setNewsid(req.getNewsid());
        computePraise(domain, req.getMobile());
        res.setPraise(domain.isPraise());
        res.setPraiseNum(domain.getPraiseNum());

        return res;
    }

    /**
     * 查看交易行情
     *
     * @param req
     * @return
     * @throws Exception
     */
    @Override
    public QuotesTransactionRes quotesTransaction(QuotesTransactionReq req) throws Exception {
        QuotesTransactionRes res = new QuotesTransactionRes();
        QuotesTransactionExample transactionExample = new QuotesTransactionExample();
        transactionExample.createCriteria().andStatusEqualTo(Integer.valueOf(1));
        transactionExample.setOrderByClause("id desc");

        List<QuotesTransaction> transactionList = quotesTransactionMapper.selectByExample(transactionExample);

        if (1 > transactionList.size()) {
            throw new BusinessException("quotesTransactionList.size.is.null", "quotesTransactionList.size.is.null");
        }

        QuotesTransaction quotesTransaction = transactionList.get(0);
        BeanUtils.copyProperties(quotesTransaction, res);

        QuotesExchangeExample exchangeExample = new QuotesExchangeExample();
        exchangeExample.createCriteria().andTqIdEqualTo(res.getId());
        exchangeExample.setOrderByClause("id");
        List<QuotesExchange> exchangeList = quotesExchangeMapper.selectByExample(exchangeExample);
        List<QuotesExchangeRes> exchangeResList = new ArrayList();
        exchangeList.forEach(quotesExchange -> {
            QuotesExchangeRes exchangeRes = new QuotesExchangeRes();
            BeanUtils.copyProperties(quotesExchange, exchangeRes);
            exchangeResList.add(exchangeRes);
        });
        res.setList(exchangeResList);

        return res;
    }


    /**
     * 客户是否对资讯点赞
     *
     * @param mobile
     * @param newsid
     * @return
     */
    private int isThumbUpForNewsId(String mobile, String newsid) {
        int i = -1;

        List praiseList = redisHandle.getList(newsid + "_praise");

        LOGGER.debug("isThumbUpForNewsId====================" + praiseList.size());
        if (praiseList.size() > 0) {

            if (StringUtil.isNotEmpty(mobile))
                i = praiseList.indexOf(mobile);
        }
        return i;
    }

    /**
     * 计算指定资讯的点赞数   并判断客户是否对资讯点赞
     *
     * @param domain
     * @param mobile
     */
    private void computePraise(NewsInfoDomain domain, String mobile) {
        long praiseNum = redisTemplate.opsForList().size(domain.getNewsid() + "_praise");
        LOGGER.debug("computePraise====================" + praiseNum);

        boolean isPraise = false;
        if (praiseNum > 0) {
            List praiseList = redisTemplate.opsForList().range(domain.getNewsid() + "_praise", 0, praiseNum);
            if (StringUtil.isNotEmpty(mobile) && praiseList.indexOf(mobile) > -1) {
                isPraise = true;
                LOGGER.debug("praiseList.indexOf(mobile) > -1====================" + isPraise);
            }


            if (praiseNum > 999)
                domain.setPraiseNum("999+");
            else
                domain.setPraiseNum(String.valueOf(praiseNum));
        } else
            domain.setPraiseNum("0");
        domain.setPraise(isPraise);
    }


}
