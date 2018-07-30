package cn.fly.yun.domain;

import java.util.Date;

public class WybbMemberCoupon {
    private Long id;

    private Date createdAt;

    private String remark;

    private Integer sort;

    private Integer state;

    private Date updatedAt;

    private Long memberId;

    private Long orderId;

    private Long refuelOrderId;

    private Integer status;

    private Long couponId;

    private Long lotteryActivityId;

    private Date endOfTime;

    private WybbCoupon wybbCoupon ;

    public WybbCoupon getWybbCoupon() {
        return wybbCoupon;
    }

    public void setWybbCoupon(WybbCoupon wybbCoupon) {
        this.wybbCoupon = wybbCoupon;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getRefuelOrderId() {
        return refuelOrderId;
    }

    public void setRefuelOrderId(Long refuelOrderId) {
        this.refuelOrderId = refuelOrderId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Long getLotteryActivityId() {
        return lotteryActivityId;
    }

    public void setLotteryActivityId(Long lotteryActivityId) {
        this.lotteryActivityId = lotteryActivityId;
    }

    public Date getEndOfTime() {
        return endOfTime;
    }

    public void setEndOfTime(Date endOfTime) {
        this.endOfTime = endOfTime;
    }
}