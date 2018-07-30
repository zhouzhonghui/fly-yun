package cn.fly.yun.domain;

import java.util.Date;

public class QuotesExchange {
    private Long id;

    private Long tqId;

    private String exchange;

    private String transactionPair;

    private String priceNative;

    private String priceCny;

    private String priceBtc;

    private String priceEth;

    private String priceUsd;

    private String volume;

    private String turnover;

    private Date createAt;

    private Integer status;

    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTqId() {
        return tqId;
    }

    public void setTqId(Long tqId) {
        this.tqId = tqId;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange == null ? null : exchange.trim();
    }

    public String getTransactionPair() {
        return transactionPair;
    }

    public void setTransactionPair(String transactionPair) {
        this.transactionPair = transactionPair == null ? null : transactionPair.trim();
    }

    public String getPriceNative() {
        return priceNative;
    }

    public void setPriceNative(String priceNative) {
        this.priceNative = priceNative == null ? null : priceNative.trim();
    }

    public String getPriceCny() {
        return priceCny;
    }

    public void setPriceCny(String priceCny) {
        this.priceCny = priceCny == null ? null : priceCny.trim();
    }

    public String getPriceBtc() {
        return priceBtc;
    }

    public void setPriceBtc(String priceBtc) {
        this.priceBtc = priceBtc == null ? null : priceBtc.trim();
    }

    public String getPriceEth() {
        return priceEth;
    }

    public void setPriceEth(String priceEth) {
        this.priceEth = priceEth == null ? null : priceEth.trim();
    }

    public String getPriceUsd() {
        return priceUsd;
    }

    public void setPriceUsd(String priceUsd) {
        this.priceUsd = priceUsd == null ? null : priceUsd.trim();
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume == null ? null : volume.trim();
    }

    public String getTurnover() {
        return turnover;
    }

    public void setTurnover(String turnover) {
        this.turnover = turnover == null ? null : turnover.trim();
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}