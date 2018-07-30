package cn.fly.yun.domain;

import java.util.Date;

public class WybbLotteryActivity {
    private Long id;

    private Date createdAt;

    private Integer state;

    private Date updatedAt;

    private Date rewardBegin;

    private Date rewardEnd;

    private String name;

    private String description;

    private Integer isInit;

    private String couponIds;

    private String secondTakeCouponId;

    private String couponIdsCount;

    private Integer rewardType;

    private String rewardOdds;

    private Integer participateNumber;

    private Integer isLimitMember;

    private String remark;

    private Integer sort;

    private String inviteCode;

    private String descriptionEn;

    private String nameEn;

    private String descriptionJp;

    private String nameJp;

    private String descriptionKr;

    private String nameKr;

    private String nameMsg;

    private String descMsg;

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

    public Date getRewardBegin() {
        return rewardBegin;
    }

    public void setRewardBegin(Date rewardBegin) {
        this.rewardBegin = rewardBegin;
    }

    public Date getRewardEnd() {
        return rewardEnd;
    }

    public void setRewardEnd(Date rewardEnd) {
        this.rewardEnd = rewardEnd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getIsInit() {
        return isInit;
    }

    public void setIsInit(Integer isInit) {
        this.isInit = isInit;
    }

    public String getCouponIds() {
        return couponIds;
    }

    public void setCouponIds(String couponIds) {
        this.couponIds = couponIds == null ? null : couponIds.trim();
    }

    public String getSecondTakeCouponId() {
        return secondTakeCouponId;
    }

    public void setSecondTakeCouponId(String secondTakeCouponId) {
        this.secondTakeCouponId = secondTakeCouponId == null ? null : secondTakeCouponId.trim();
    }

    public String getCouponIdsCount() {
        return couponIdsCount;
    }

    public void setCouponIdsCount(String couponIdsCount) {
        this.couponIdsCount = couponIdsCount == null ? null : couponIdsCount.trim();
    }

    public Integer getRewardType() {
        return rewardType;
    }

    public void setRewardType(Integer rewardType) {
        this.rewardType = rewardType;
    }

    public String getRewardOdds() {
        return rewardOdds;
    }

    public void setRewardOdds(String rewardOdds) {
        this.rewardOdds = rewardOdds == null ? null : rewardOdds.trim();
    }

    public Integer getParticipateNumber() {
        return participateNumber;
    }

    public void setParticipateNumber(Integer participateNumber) {
        this.participateNumber = participateNumber;
    }

    public Integer getIsLimitMember() {
        return isLimitMember;
    }

    public void setIsLimitMember(Integer isLimitMember) {
        this.isLimitMember = isLimitMember;
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

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode == null ? null : inviteCode.trim();
    }

    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn == null ? null : descriptionEn.trim();
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn == null ? null : nameEn.trim();
    }

    public String getDescriptionJp() {
        return descriptionJp;
    }

    public void setDescriptionJp(String descriptionJp) {
        this.descriptionJp = descriptionJp == null ? null : descriptionJp.trim();
    }

    public String getNameJp() {
        return nameJp;
    }

    public void setNameJp(String nameJp) {
        this.nameJp = nameJp == null ? null : nameJp.trim();
    }

    public String getDescriptionKr() {
        return descriptionKr;
    }

    public void setDescriptionKr(String descriptionKr) {
        this.descriptionKr = descriptionKr == null ? null : descriptionKr.trim();
    }

    public String getNameKr() {
        return nameKr;
    }

    public void setNameKr(String nameKr) {
        this.nameKr = nameKr == null ? null : nameKr.trim();
    }

    public String getNameMsg() {
        return nameMsg;
    }

    public void setNameMsg(String nameMsg) {
        this.nameMsg = nameMsg == null ? null : nameMsg.trim();
    }

    public String getDescMsg() {
        return descMsg;
    }

    public void setDescMsg(String descMsg) {
        this.descMsg = descMsg == null ? null : descMsg.trim();
    }
}