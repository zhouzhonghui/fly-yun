package cn.fly.yun.domain;

import java.math.BigDecimal;
import java.util.Date;

public class WybbCoupon {
    private Long id;

    private String name;

    private Long couponCategoryId;

    private BigDecimal discountRate;

    private BigDecimal discountAmount;

    private BigDecimal discountReduction;

    private Date beginTime;

    private Integer validDate;

    private Date overTime;

    private Date createdAt;

    private Long num;

    private Integer categoryType;

    private String description;

    private Date updatedAt;

    private String icon;

    private Integer state;

    private String remark;

    private Integer sort;

    private Integer limitLeastTime;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getCouponCategoryId() {
        return couponCategoryId;
    }

    public void setCouponCategoryId(Long couponCategoryId) {
        this.couponCategoryId = couponCategoryId;
    }

    public BigDecimal getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(BigDecimal discountRate) {
        this.discountRate = discountRate;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public BigDecimal getDiscountReduction() {
        return discountReduction;
    }

    public void setDiscountReduction(BigDecimal discountReduction) {
        this.discountReduction = discountReduction;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Integer getValidDate() {
        return validDate;
    }

    public void setValidDate(Integer validDate) {
        this.validDate = validDate;
    }

    public Date getOverTime() {
        return overTime;
    }

    public void setOverTime(Date overTime) {
        this.overTime = overTime;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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

    public Integer getLimitLeastTime() {
        return limitLeastTime;
    }

    public void setLimitLeastTime(Integer limitLeastTime) {
        this.limitLeastTime = limitLeastTime;
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