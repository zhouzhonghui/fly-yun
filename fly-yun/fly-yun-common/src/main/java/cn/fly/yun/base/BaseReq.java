package cn.fly.yun.base;

import java.beans.Transient;

public class BaseReq extends BaseDomain {
    private static final long serialVersionUID = 8358368281326024339L;

    /**
     * 流水号
     */
    private String seq;

    /**
     * 访问ip
     */
    private String ip;

    /**
     * 以下为ios参数
     */
    private String userAgent;
    private String appNameEn;
    private String idfa;
    /**
     * 请求参数中时间戳
     */
    private String requestTimestamp;

    private String token;

    private String redisMobile;

    private Long memberId;

    @Transient
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Transient
    public String getRedisMobile() {
        return redisMobile;
    }

    public void setRedisMobile(String redisMobile) {
        this.redisMobile = redisMobile;
    }

    @Transient
    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    @Transient
    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    @Transient
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Transient
    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    @Transient
    public String getAppNameEn() {
        return appNameEn;
    }

    public void setAppNameEn(String appNameEn) {
        this.appNameEn = appNameEn;
    }

    @Transient
    public String getIdfa() {
        return idfa;
    }

    public void setIdfa(String idfa) {
        this.idfa = idfa;
    }

    @Transient
    public String getRequestTimestamp() {
        return requestTimestamp;
    }

    public void setRequestTimestamp(String requestTimestamp) {
        this.requestTimestamp = requestTimestamp;
    }
}
