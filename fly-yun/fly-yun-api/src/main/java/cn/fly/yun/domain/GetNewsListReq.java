package cn.fly.yun.domain;

import cn.fly.yun.base.BasePageReq;


public class GetNewsListReq extends BasePageReq {
    private static final long serialVersionUID = 8611501096477093491L;

    private String mobile ;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
