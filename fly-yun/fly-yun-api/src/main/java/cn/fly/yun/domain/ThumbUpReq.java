package cn.fly.yun.domain;

import cn.fly.yun.base.BaseReq;
import org.hibernate.validator.constraints.NotEmpty;

public class ThumbUpReq extends BaseReq {
    private static final long serialVersionUID = -3731648538377745613L;
    @NotEmpty
    private String newsid ;
    @NotEmpty
    private String mobile ;

    public String getNewsid() {
        return newsid;
    }

    public void setNewsid(String newsid) {
        this.newsid = newsid;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
