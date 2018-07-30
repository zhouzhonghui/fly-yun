package cn.fly.yun.domain;

import cn.fly.yun.base.BaseReq;

public class GetDetailForNewsReq extends BaseReq {
    private static final long serialVersionUID = 8897208723534381739L;

    private Long newsid ;

    private String mobile ;

    public Long getNewsid() {
        return newsid;
    }

    public void setNewsid(Long newsid) {
        this.newsid = newsid;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "GetDetailForNewsReq{" +
                "newsid=" + newsid +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
