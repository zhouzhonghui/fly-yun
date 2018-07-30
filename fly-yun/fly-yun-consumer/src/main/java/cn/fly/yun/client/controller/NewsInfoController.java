package cn.fly.yun.client.controller;

import cn.fly.yun.config.annotations.RedisLock;
import cn.fly.yun.domain.*;
import cn.fly.yun.handle.RedisHandle;
import cn.fly.yun.service.NewsInfoService;
import com.alibaba.dubbo.config.annotation.Reference;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Locale;

@RestController
@Api(value = "资讯信息", description = "资讯服务")
@RequestMapping(value = "app/newsInfo", consumes = "application/json", produces = "application/json")
public class NewsInfoController {

    @Resource
    RedisHandle redisHandle;

    @Resource(name = "redisTemplate")
    protected RedisTemplate redisTemplate;


    @Reference(version = "1.0.0")
    private NewsInfoService newsInfoService;

    @Autowired
    MessageSourceAccessor messageSourceAccessor ;

    @RedisLock(value = "21212",params = {"1212"},timeOut = 12)
    @RequestMapping(value = "/getNewsList", method = RequestMethod.POST, name = "查看资讯列表")
    GetNewsListRes getNewsList(@RequestBody GetNewsListReq req) throws Exception {
        GetNewsListRes res = newsInfoService.getNewsList(req);
        return res;
    }

    @RequestMapping(value = "/thumbUp", method = RequestMethod.POST, name = "点赞")
    ThumbUpRes thumbUp(@RequestBody ThumbUpReq req) throws Exception {
        ThumbUpRes res = newsInfoService.thumbUp(req);
        return res;
    }

    @RequestMapping(value = "/thumbDown", method = RequestMethod.POST, name = "取消点赞")
    ThumbDownRes thumbDown(@RequestBody ThumbDownReq req) throws Exception {
        ThumbDownRes res = newsInfoService.thumbDown(req);
        return res;
    }

    @RequestMapping(value = "/getDetailForNews", method = RequestMethod.POST, name = "得到图文详情,token")
    GetDetailForNewsRes getDetailForNews(@RequestBody GetDetailForNewsReq req) throws Exception {
        GetDetailForNewsRes res = newsInfoService.getDetailForNews(req);
        String str1 =messageSourceAccessor.getMessage("ERROR_400_SOLUTION", (String) null, Locale.CHINA);
        String str2 =messageSourceAccessor.getMessage("ERROR_400_SOLUTION", (String) null, Locale.ENGLISH);
        String str3 =messageSourceAccessor.getMessage("ERROR_400_SOLUTION", (String) null, Locale.JAPAN);
        String str4 =messageSourceAccessor.getMessage("ERROR_400_SOLUTION", (String) null, Locale.KOREA);
        return res;
    }

    @RequestMapping(value = "/quotesTransaction", method = RequestMethod.POST, name = "得到行情,token")
    QuotesTransactionRes quotesTransaction(@RequestBody QuotesTransactionReq req) throws Exception {
        QuotesTransactionRes res = newsInfoService.quotesTransaction(req);
        return res;
    }
}
