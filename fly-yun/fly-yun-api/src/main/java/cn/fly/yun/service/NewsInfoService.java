package cn.fly.yun.service;

import cn.fly.yun.domain.*;


public interface NewsInfoService {

    GetNewsListRes getNewsList(GetNewsListReq req);

    ThumbUpRes thumbUp(ThumbUpReq req) throws Exception;

    ThumbDownRes thumbDown(ThumbDownReq req) throws Exception;

    GetDetailForNewsRes getDetailForNews(GetDetailForNewsReq req) throws Exception;

    QuotesTransactionRes quotesTransaction(QuotesTransactionReq req) throws Exception;
}
