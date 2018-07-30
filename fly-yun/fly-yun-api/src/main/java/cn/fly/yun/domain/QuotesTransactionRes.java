package cn.fly.yun.domain;

import cn.fly.yun.base.BaseRes;

import java.util.Date;
import java.util.List;

public class QuotesTransactionRes extends BaseRes {
    private static final long serialVersionUID = 5321761870428720535L;

    private Long id;

    private String priceNow;

    private String increasePercentage;

    private String high;

    private String low;

    private String priceDoller;

    private String priceBtc;

    private String marketValue;

    private String marketValueDoller;

    private String marketValueBtc;

    private String marketValueRate;

    private String circulationValue;

    private String circulationTotal;

    private String circulationRate;

    private String turnoverTotal;

    private String turnoverDoller;

    private String turnoverBtc;

    private String turnoverRank;

    private String turnoverRate;

    private Date createAt;

    private Integer status;

    private String remark;

    public List<QuotesExchangeRes> list ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPriceNow() {
        return priceNow;
    }

    public void setPriceNow(String priceNow) {
        this.priceNow = priceNow == null ? null : priceNow.trim();
    }

    public String getIncreasePercentage() {
        return increasePercentage;
    }

    public void setIncreasePercentage(String increasePercentage) {
        this.increasePercentage = increasePercentage == null ? null : increasePercentage.trim();
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high == null ? null : high.trim();
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low == null ? null : low.trim();
    }

    public String getPriceDoller() {
        return priceDoller;
    }

    public void setPriceDoller(String priceDoller) {
        this.priceDoller = priceDoller == null ? null : priceDoller.trim();
    }

    public String getPriceBtc() {
        return priceBtc;
    }

    public void setPriceBtc(String priceBtc) {
        this.priceBtc = priceBtc == null ? null : priceBtc.trim();
    }

    public String getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(String marketValue) {
        this.marketValue = marketValue == null ? null : marketValue.trim();
    }

    public String getMarketValueDoller() {
        return marketValueDoller;
    }

    public void setMarketValueDoller(String marketValueDoller) {
        this.marketValueDoller = marketValueDoller == null ? null : marketValueDoller.trim();
    }

    public String getMarketValueBtc() {
        return marketValueBtc;
    }

    public void setMarketValueBtc(String marketValueBtc) {
        this.marketValueBtc = marketValueBtc == null ? null : marketValueBtc.trim();
    }

    public String getMarketValueRate() {
        return marketValueRate;
    }

    public void setMarketValueRate(String marketValueRate) {
        this.marketValueRate = marketValueRate == null ? null : marketValueRate.trim();
    }

    public String getCirculationValue() {
        return circulationValue;
    }

    public void setCirculationValue(String circulationValue) {
        this.circulationValue = circulationValue == null ? null : circulationValue.trim();
    }

    public String getCirculationTotal() {
        return circulationTotal;
    }

    public void setCirculationTotal(String circulationTotal) {
        this.circulationTotal = circulationTotal == null ? null : circulationTotal.trim();
    }

    public String getCirculationRate() {
        return circulationRate;
    }

    public void setCirculationRate(String circulationRate) {
        this.circulationRate = circulationRate == null ? null : circulationRate.trim();
    }

    public String getTurnoverTotal() {
        return turnoverTotal;
    }

    public void setTurnoverTotal(String turnoverTotal) {
        this.turnoverTotal = turnoverTotal == null ? null : turnoverTotal.trim();
    }

    public String getTurnoverDoller() {
        return turnoverDoller;
    }

    public void setTurnoverDoller(String turnoverDoller) {
        this.turnoverDoller = turnoverDoller == null ? null : turnoverDoller.trim();
    }

    public String getTurnoverBtc() {
        return turnoverBtc;
    }

    public void setTurnoverBtc(String turnoverBtc) {
        this.turnoverBtc = turnoverBtc == null ? null : turnoverBtc.trim();
    }

    public String getTurnoverRank() {
        return turnoverRank;
    }

    public void setTurnoverRank(String turnoverRank) {
        this.turnoverRank = turnoverRank == null ? null : turnoverRank.trim();
    }

    public String getTurnoverRate() {
        return turnoverRate;
    }

    public void setTurnoverRate(String turnoverRate) {
        this.turnoverRate = turnoverRate == null ? null : turnoverRate.trim();
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

    public List<QuotesExchangeRes> getList() {
        return list;
    }

    public void setList(List<QuotesExchangeRes> list) {
        this.list = list;
    }
}
