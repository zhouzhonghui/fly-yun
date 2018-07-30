package cn.fly.yun.base;

import java.io.Serializable;

public class TransLog implements Serializable {
    private static final long serialVersionUID = -1764917466167519463L;

    /**
     * 流水号
     */
    private String seq;
    /**
     * 访问服务
     */
    private String serviceName;
    /**
     * 交易对应中文名称
     */
    private String transName ;
    /**
     * 访问ip
     */
    private String ip;
    /**
     * 国际化
     */
    private String requestLocale;

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
    /**
     * 服务器接到请求时间
     */
    private String inDate;
    /**
     * 服务器应答时间
     */
    private String outDate;
    /**
     * 交易耗时
     */
    private long timeConsume;
    /**
     * 请求数据
     */
    private String requestData;
    /**
     * 应答数据
     */
    private String responseData;

    private String token;

    private String redisMobile;

    private Long memberId;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRedisMobile() {
        return redisMobile;
    }

    public void setRedisMobile(String redisMobile) {
        this.redisMobile = redisMobile;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getRequestLocale() {
        return requestLocale;
    }

    public void setRequestLocale(String requestLocale) {
        this.requestLocale = requestLocale;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getAppNameEn() {
        return appNameEn;
    }

    public void setAppNameEn(String appNameEn) {
        this.appNameEn = appNameEn;
    }

    public String getIdfa() {
        return idfa;
    }

    public void setIdfa(String idfa) {
        this.idfa = idfa;
    }

    public String getRequestTimestamp() {
        return requestTimestamp;
    }

    public void setRequestTimestamp(String requestTimestamp) {
        this.requestTimestamp = requestTimestamp;
    }

    public String getInDate() {
        return inDate;
    }

    public void setInDate(String inDate) {
        this.inDate = inDate;
    }

    public String getOutDate() {
        return outDate;
    }

    public void setOutDate(String outDate) {
        this.outDate = outDate;
    }

    public long getTimeConsume() {
        return timeConsume;
    }

    public void setTimeConsume(long timeConsume) {
        this.timeConsume = timeConsume;
    }

    public String getRequestData() {
        return requestData;
    }

    public void setRequestData(String requestData) {
        this.requestData = requestData;
    }

    public String getResponseData() {
        return responseData;
    }

    public void setResponseData(String responseData) {
        this.responseData = responseData;
    }

    public String getTransName() {
        return transName;
    }

    public void setTransName(String transName) {
        this.transName = transName;
    }
}
