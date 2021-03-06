package cn.fly.yun.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WybbCouponExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WybbCouponExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCouponCategoryIdIsNull() {
            addCriterion("coupon_category_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponCategoryIdIsNotNull() {
            addCriterion("coupon_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponCategoryIdEqualTo(Long value) {
            addCriterion("coupon_category_id =", value, "couponCategoryId");
            return (Criteria) this;
        }

        public Criteria andCouponCategoryIdNotEqualTo(Long value) {
            addCriterion("coupon_category_id <>", value, "couponCategoryId");
            return (Criteria) this;
        }

        public Criteria andCouponCategoryIdGreaterThan(Long value) {
            addCriterion("coupon_category_id >", value, "couponCategoryId");
            return (Criteria) this;
        }

        public Criteria andCouponCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("coupon_category_id >=", value, "couponCategoryId");
            return (Criteria) this;
        }

        public Criteria andCouponCategoryIdLessThan(Long value) {
            addCriterion("coupon_category_id <", value, "couponCategoryId");
            return (Criteria) this;
        }

        public Criteria andCouponCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("coupon_category_id <=", value, "couponCategoryId");
            return (Criteria) this;
        }

        public Criteria andCouponCategoryIdIn(List<Long> values) {
            addCriterion("coupon_category_id in", values, "couponCategoryId");
            return (Criteria) this;
        }

        public Criteria andCouponCategoryIdNotIn(List<Long> values) {
            addCriterion("coupon_category_id not in", values, "couponCategoryId");
            return (Criteria) this;
        }

        public Criteria andCouponCategoryIdBetween(Long value1, Long value2) {
            addCriterion("coupon_category_id between", value1, value2, "couponCategoryId");
            return (Criteria) this;
        }

        public Criteria andCouponCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("coupon_category_id not between", value1, value2, "couponCategoryId");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIsNull() {
            addCriterion("discount_rate is null");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIsNotNull() {
            addCriterion("discount_rate is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountRateEqualTo(BigDecimal value) {
            addCriterion("discount_rate =", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotEqualTo(BigDecimal value) {
            addCriterion("discount_rate <>", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateGreaterThan(BigDecimal value) {
            addCriterion("discount_rate >", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_rate >=", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateLessThan(BigDecimal value) {
            addCriterion("discount_rate <", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_rate <=", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIn(List<BigDecimal> values) {
            addCriterion("discount_rate in", values, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotIn(List<BigDecimal> values) {
            addCriterion("discount_rate not in", values, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_rate between", value1, value2, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_rate not between", value1, value2, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNull() {
            addCriterion("discount_amount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNotNull() {
            addCriterion("discount_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountEqualTo(BigDecimal value) {
            addCriterion("discount_amount =", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotEqualTo(BigDecimal value) {
            addCriterion("discount_amount <>", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThan(BigDecimal value) {
            addCriterion("discount_amount >", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_amount >=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThan(BigDecimal value) {
            addCriterion("discount_amount <", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_amount <=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIn(List<BigDecimal> values) {
            addCriterion("discount_amount in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotIn(List<BigDecimal> values) {
            addCriterion("discount_amount not in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_amount between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_amount not between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountReductionIsNull() {
            addCriterion("discount_reduction is null");
            return (Criteria) this;
        }

        public Criteria andDiscountReductionIsNotNull() {
            addCriterion("discount_reduction is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountReductionEqualTo(BigDecimal value) {
            addCriterion("discount_reduction =", value, "discountReduction");
            return (Criteria) this;
        }

        public Criteria andDiscountReductionNotEqualTo(BigDecimal value) {
            addCriterion("discount_reduction <>", value, "discountReduction");
            return (Criteria) this;
        }

        public Criteria andDiscountReductionGreaterThan(BigDecimal value) {
            addCriterion("discount_reduction >", value, "discountReduction");
            return (Criteria) this;
        }

        public Criteria andDiscountReductionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_reduction >=", value, "discountReduction");
            return (Criteria) this;
        }

        public Criteria andDiscountReductionLessThan(BigDecimal value) {
            addCriterion("discount_reduction <", value, "discountReduction");
            return (Criteria) this;
        }

        public Criteria andDiscountReductionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_reduction <=", value, "discountReduction");
            return (Criteria) this;
        }

        public Criteria andDiscountReductionIn(List<BigDecimal> values) {
            addCriterion("discount_reduction in", values, "discountReduction");
            return (Criteria) this;
        }

        public Criteria andDiscountReductionNotIn(List<BigDecimal> values) {
            addCriterion("discount_reduction not in", values, "discountReduction");
            return (Criteria) this;
        }

        public Criteria andDiscountReductionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_reduction between", value1, value2, "discountReduction");
            return (Criteria) this;
        }

        public Criteria andDiscountReductionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_reduction not between", value1, value2, "discountReduction");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNull() {
            addCriterion("begin_time is null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNotNull() {
            addCriterion("begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeEqualTo(Date value) {
            addCriterion("begin_time =", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotEqualTo(Date value) {
            addCriterion("begin_time <>", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThan(Date value) {
            addCriterion("begin_time >", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("begin_time >=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThan(Date value) {
            addCriterion("begin_time <", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("begin_time <=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIn(List<Date> values) {
            addCriterion("begin_time in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotIn(List<Date> values) {
            addCriterion("begin_time not in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeBetween(Date value1, Date value2) {
            addCriterion("begin_time between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("begin_time not between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andValidDateIsNull() {
            addCriterion("valid_date is null");
            return (Criteria) this;
        }

        public Criteria andValidDateIsNotNull() {
            addCriterion("valid_date is not null");
            return (Criteria) this;
        }

        public Criteria andValidDateEqualTo(Integer value) {
            addCriterion("valid_date =", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotEqualTo(Integer value) {
            addCriterion("valid_date <>", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateGreaterThan(Integer value) {
            addCriterion("valid_date >", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("valid_date >=", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLessThan(Integer value) {
            addCriterion("valid_date <", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateLessThanOrEqualTo(Integer value) {
            addCriterion("valid_date <=", value, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateIn(List<Integer> values) {
            addCriterion("valid_date in", values, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotIn(List<Integer> values) {
            addCriterion("valid_date not in", values, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateBetween(Integer value1, Integer value2) {
            addCriterion("valid_date between", value1, value2, "validDate");
            return (Criteria) this;
        }

        public Criteria andValidDateNotBetween(Integer value1, Integer value2) {
            addCriterion("valid_date not between", value1, value2, "validDate");
            return (Criteria) this;
        }

        public Criteria andOverTimeIsNull() {
            addCriterion("over_time is null");
            return (Criteria) this;
        }

        public Criteria andOverTimeIsNotNull() {
            addCriterion("over_time is not null");
            return (Criteria) this;
        }

        public Criteria andOverTimeEqualTo(Date value) {
            addCriterion("over_time =", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeNotEqualTo(Date value) {
            addCriterion("over_time <>", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeGreaterThan(Date value) {
            addCriterion("over_time >", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("over_time >=", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeLessThan(Date value) {
            addCriterion("over_time <", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeLessThanOrEqualTo(Date value) {
            addCriterion("over_time <=", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeIn(List<Date> values) {
            addCriterion("over_time in", values, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeNotIn(List<Date> values) {
            addCriterion("over_time not in", values, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeBetween(Date value1, Date value2) {
            addCriterion("over_time between", value1, value2, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeNotBetween(Date value1, Date value2) {
            addCriterion("over_time not between", value1, value2, "overTime");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Long value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Long value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Long value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Long value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Long value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Long value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Long> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Long> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Long value1, Long value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Long value1, Long value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeIsNull() {
            addCriterion("category_type is null");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeIsNotNull() {
            addCriterion("category_type is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeEqualTo(Integer value) {
            addCriterion("category_type =", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeNotEqualTo(Integer value) {
            addCriterion("category_type <>", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeGreaterThan(Integer value) {
            addCriterion("category_type >", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_type >=", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeLessThan(Integer value) {
            addCriterion("category_type <", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeLessThanOrEqualTo(Integer value) {
            addCriterion("category_type <=", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeIn(List<Integer> values) {
            addCriterion("category_type in", values, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeNotIn(List<Integer> values) {
            addCriterion("category_type not in", values, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeBetween(Integer value1, Integer value2) {
            addCriterion("category_type between", value1, value2, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("category_type not between", value1, value2, "categoryType");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andLimitLeastTimeIsNull() {
            addCriterion("limit_least_time is null");
            return (Criteria) this;
        }

        public Criteria andLimitLeastTimeIsNotNull() {
            addCriterion("limit_least_time is not null");
            return (Criteria) this;
        }

        public Criteria andLimitLeastTimeEqualTo(Integer value) {
            addCriterion("limit_least_time =", value, "limitLeastTime");
            return (Criteria) this;
        }

        public Criteria andLimitLeastTimeNotEqualTo(Integer value) {
            addCriterion("limit_least_time <>", value, "limitLeastTime");
            return (Criteria) this;
        }

        public Criteria andLimitLeastTimeGreaterThan(Integer value) {
            addCriterion("limit_least_time >", value, "limitLeastTime");
            return (Criteria) this;
        }

        public Criteria andLimitLeastTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("limit_least_time >=", value, "limitLeastTime");
            return (Criteria) this;
        }

        public Criteria andLimitLeastTimeLessThan(Integer value) {
            addCriterion("limit_least_time <", value, "limitLeastTime");
            return (Criteria) this;
        }

        public Criteria andLimitLeastTimeLessThanOrEqualTo(Integer value) {
            addCriterion("limit_least_time <=", value, "limitLeastTime");
            return (Criteria) this;
        }

        public Criteria andLimitLeastTimeIn(List<Integer> values) {
            addCriterion("limit_least_time in", values, "limitLeastTime");
            return (Criteria) this;
        }

        public Criteria andLimitLeastTimeNotIn(List<Integer> values) {
            addCriterion("limit_least_time not in", values, "limitLeastTime");
            return (Criteria) this;
        }

        public Criteria andLimitLeastTimeBetween(Integer value1, Integer value2) {
            addCriterion("limit_least_time between", value1, value2, "limitLeastTime");
            return (Criteria) this;
        }

        public Criteria andLimitLeastTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("limit_least_time not between", value1, value2, "limitLeastTime");
            return (Criteria) this;
        }

        public Criteria andDescriptionEnIsNull() {
            addCriterion("description_en is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEnIsNotNull() {
            addCriterion("description_en is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEnEqualTo(String value) {
            addCriterion("description_en =", value, "descriptionEn");
            return (Criteria) this;
        }

        public Criteria andDescriptionEnNotEqualTo(String value) {
            addCriterion("description_en <>", value, "descriptionEn");
            return (Criteria) this;
        }

        public Criteria andDescriptionEnGreaterThan(String value) {
            addCriterion("description_en >", value, "descriptionEn");
            return (Criteria) this;
        }

        public Criteria andDescriptionEnGreaterThanOrEqualTo(String value) {
            addCriterion("description_en >=", value, "descriptionEn");
            return (Criteria) this;
        }

        public Criteria andDescriptionEnLessThan(String value) {
            addCriterion("description_en <", value, "descriptionEn");
            return (Criteria) this;
        }

        public Criteria andDescriptionEnLessThanOrEqualTo(String value) {
            addCriterion("description_en <=", value, "descriptionEn");
            return (Criteria) this;
        }

        public Criteria andDescriptionEnLike(String value) {
            addCriterion("description_en like", value, "descriptionEn");
            return (Criteria) this;
        }

        public Criteria andDescriptionEnNotLike(String value) {
            addCriterion("description_en not like", value, "descriptionEn");
            return (Criteria) this;
        }

        public Criteria andDescriptionEnIn(List<String> values) {
            addCriterion("description_en in", values, "descriptionEn");
            return (Criteria) this;
        }

        public Criteria andDescriptionEnNotIn(List<String> values) {
            addCriterion("description_en not in", values, "descriptionEn");
            return (Criteria) this;
        }

        public Criteria andDescriptionEnBetween(String value1, String value2) {
            addCriterion("description_en between", value1, value2, "descriptionEn");
            return (Criteria) this;
        }

        public Criteria andDescriptionEnNotBetween(String value1, String value2) {
            addCriterion("description_en not between", value1, value2, "descriptionEn");
            return (Criteria) this;
        }

        public Criteria andNameEnIsNull() {
            addCriterion("name_en is null");
            return (Criteria) this;
        }

        public Criteria andNameEnIsNotNull() {
            addCriterion("name_en is not null");
            return (Criteria) this;
        }

        public Criteria andNameEnEqualTo(String value) {
            addCriterion("name_en =", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotEqualTo(String value) {
            addCriterion("name_en <>", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThan(String value) {
            addCriterion("name_en >", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("name_en >=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThan(String value) {
            addCriterion("name_en <", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThanOrEqualTo(String value) {
            addCriterion("name_en <=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLike(String value) {
            addCriterion("name_en like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotLike(String value) {
            addCriterion("name_en not like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnIn(List<String> values) {
            addCriterion("name_en in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotIn(List<String> values) {
            addCriterion("name_en not in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnBetween(String value1, String value2) {
            addCriterion("name_en between", value1, value2, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotBetween(String value1, String value2) {
            addCriterion("name_en not between", value1, value2, "nameEn");
            return (Criteria) this;
        }

        public Criteria andDescriptionJpIsNull() {
            addCriterion("description_jp is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionJpIsNotNull() {
            addCriterion("description_jp is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionJpEqualTo(String value) {
            addCriterion("description_jp =", value, "descriptionJp");
            return (Criteria) this;
        }

        public Criteria andDescriptionJpNotEqualTo(String value) {
            addCriterion("description_jp <>", value, "descriptionJp");
            return (Criteria) this;
        }

        public Criteria andDescriptionJpGreaterThan(String value) {
            addCriterion("description_jp >", value, "descriptionJp");
            return (Criteria) this;
        }

        public Criteria andDescriptionJpGreaterThanOrEqualTo(String value) {
            addCriterion("description_jp >=", value, "descriptionJp");
            return (Criteria) this;
        }

        public Criteria andDescriptionJpLessThan(String value) {
            addCriterion("description_jp <", value, "descriptionJp");
            return (Criteria) this;
        }

        public Criteria andDescriptionJpLessThanOrEqualTo(String value) {
            addCriterion("description_jp <=", value, "descriptionJp");
            return (Criteria) this;
        }

        public Criteria andDescriptionJpLike(String value) {
            addCriterion("description_jp like", value, "descriptionJp");
            return (Criteria) this;
        }

        public Criteria andDescriptionJpNotLike(String value) {
            addCriterion("description_jp not like", value, "descriptionJp");
            return (Criteria) this;
        }

        public Criteria andDescriptionJpIn(List<String> values) {
            addCriterion("description_jp in", values, "descriptionJp");
            return (Criteria) this;
        }

        public Criteria andDescriptionJpNotIn(List<String> values) {
            addCriterion("description_jp not in", values, "descriptionJp");
            return (Criteria) this;
        }

        public Criteria andDescriptionJpBetween(String value1, String value2) {
            addCriterion("description_jp between", value1, value2, "descriptionJp");
            return (Criteria) this;
        }

        public Criteria andDescriptionJpNotBetween(String value1, String value2) {
            addCriterion("description_jp not between", value1, value2, "descriptionJp");
            return (Criteria) this;
        }

        public Criteria andNameJpIsNull() {
            addCriterion("name_jp is null");
            return (Criteria) this;
        }

        public Criteria andNameJpIsNotNull() {
            addCriterion("name_jp is not null");
            return (Criteria) this;
        }

        public Criteria andNameJpEqualTo(String value) {
            addCriterion("name_jp =", value, "nameJp");
            return (Criteria) this;
        }

        public Criteria andNameJpNotEqualTo(String value) {
            addCriterion("name_jp <>", value, "nameJp");
            return (Criteria) this;
        }

        public Criteria andNameJpGreaterThan(String value) {
            addCriterion("name_jp >", value, "nameJp");
            return (Criteria) this;
        }

        public Criteria andNameJpGreaterThanOrEqualTo(String value) {
            addCriterion("name_jp >=", value, "nameJp");
            return (Criteria) this;
        }

        public Criteria andNameJpLessThan(String value) {
            addCriterion("name_jp <", value, "nameJp");
            return (Criteria) this;
        }

        public Criteria andNameJpLessThanOrEqualTo(String value) {
            addCriterion("name_jp <=", value, "nameJp");
            return (Criteria) this;
        }

        public Criteria andNameJpLike(String value) {
            addCriterion("name_jp like", value, "nameJp");
            return (Criteria) this;
        }

        public Criteria andNameJpNotLike(String value) {
            addCriterion("name_jp not like", value, "nameJp");
            return (Criteria) this;
        }

        public Criteria andNameJpIn(List<String> values) {
            addCriterion("name_jp in", values, "nameJp");
            return (Criteria) this;
        }

        public Criteria andNameJpNotIn(List<String> values) {
            addCriterion("name_jp not in", values, "nameJp");
            return (Criteria) this;
        }

        public Criteria andNameJpBetween(String value1, String value2) {
            addCriterion("name_jp between", value1, value2, "nameJp");
            return (Criteria) this;
        }

        public Criteria andNameJpNotBetween(String value1, String value2) {
            addCriterion("name_jp not between", value1, value2, "nameJp");
            return (Criteria) this;
        }

        public Criteria andDescriptionKrIsNull() {
            addCriterion("description_kr is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionKrIsNotNull() {
            addCriterion("description_kr is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionKrEqualTo(String value) {
            addCriterion("description_kr =", value, "descriptionKr");
            return (Criteria) this;
        }

        public Criteria andDescriptionKrNotEqualTo(String value) {
            addCriterion("description_kr <>", value, "descriptionKr");
            return (Criteria) this;
        }

        public Criteria andDescriptionKrGreaterThan(String value) {
            addCriterion("description_kr >", value, "descriptionKr");
            return (Criteria) this;
        }

        public Criteria andDescriptionKrGreaterThanOrEqualTo(String value) {
            addCriterion("description_kr >=", value, "descriptionKr");
            return (Criteria) this;
        }

        public Criteria andDescriptionKrLessThan(String value) {
            addCriterion("description_kr <", value, "descriptionKr");
            return (Criteria) this;
        }

        public Criteria andDescriptionKrLessThanOrEqualTo(String value) {
            addCriterion("description_kr <=", value, "descriptionKr");
            return (Criteria) this;
        }

        public Criteria andDescriptionKrLike(String value) {
            addCriterion("description_kr like", value, "descriptionKr");
            return (Criteria) this;
        }

        public Criteria andDescriptionKrNotLike(String value) {
            addCriterion("description_kr not like", value, "descriptionKr");
            return (Criteria) this;
        }

        public Criteria andDescriptionKrIn(List<String> values) {
            addCriterion("description_kr in", values, "descriptionKr");
            return (Criteria) this;
        }

        public Criteria andDescriptionKrNotIn(List<String> values) {
            addCriterion("description_kr not in", values, "descriptionKr");
            return (Criteria) this;
        }

        public Criteria andDescriptionKrBetween(String value1, String value2) {
            addCriterion("description_kr between", value1, value2, "descriptionKr");
            return (Criteria) this;
        }

        public Criteria andDescriptionKrNotBetween(String value1, String value2) {
            addCriterion("description_kr not between", value1, value2, "descriptionKr");
            return (Criteria) this;
        }

        public Criteria andNameKrIsNull() {
            addCriterion("name_kr is null");
            return (Criteria) this;
        }

        public Criteria andNameKrIsNotNull() {
            addCriterion("name_kr is not null");
            return (Criteria) this;
        }

        public Criteria andNameKrEqualTo(String value) {
            addCriterion("name_kr =", value, "nameKr");
            return (Criteria) this;
        }

        public Criteria andNameKrNotEqualTo(String value) {
            addCriterion("name_kr <>", value, "nameKr");
            return (Criteria) this;
        }

        public Criteria andNameKrGreaterThan(String value) {
            addCriterion("name_kr >", value, "nameKr");
            return (Criteria) this;
        }

        public Criteria andNameKrGreaterThanOrEqualTo(String value) {
            addCriterion("name_kr >=", value, "nameKr");
            return (Criteria) this;
        }

        public Criteria andNameKrLessThan(String value) {
            addCriterion("name_kr <", value, "nameKr");
            return (Criteria) this;
        }

        public Criteria andNameKrLessThanOrEqualTo(String value) {
            addCriterion("name_kr <=", value, "nameKr");
            return (Criteria) this;
        }

        public Criteria andNameKrLike(String value) {
            addCriterion("name_kr like", value, "nameKr");
            return (Criteria) this;
        }

        public Criteria andNameKrNotLike(String value) {
            addCriterion("name_kr not like", value, "nameKr");
            return (Criteria) this;
        }

        public Criteria andNameKrIn(List<String> values) {
            addCriterion("name_kr in", values, "nameKr");
            return (Criteria) this;
        }

        public Criteria andNameKrNotIn(List<String> values) {
            addCriterion("name_kr not in", values, "nameKr");
            return (Criteria) this;
        }

        public Criteria andNameKrBetween(String value1, String value2) {
            addCriterion("name_kr between", value1, value2, "nameKr");
            return (Criteria) this;
        }

        public Criteria andNameKrNotBetween(String value1, String value2) {
            addCriterion("name_kr not between", value1, value2, "nameKr");
            return (Criteria) this;
        }

        public Criteria andNameMsgIsNull() {
            addCriterion("name_msg is null");
            return (Criteria) this;
        }

        public Criteria andNameMsgIsNotNull() {
            addCriterion("name_msg is not null");
            return (Criteria) this;
        }

        public Criteria andNameMsgEqualTo(String value) {
            addCriterion("name_msg =", value, "nameMsg");
            return (Criteria) this;
        }

        public Criteria andNameMsgNotEqualTo(String value) {
            addCriterion("name_msg <>", value, "nameMsg");
            return (Criteria) this;
        }

        public Criteria andNameMsgGreaterThan(String value) {
            addCriterion("name_msg >", value, "nameMsg");
            return (Criteria) this;
        }

        public Criteria andNameMsgGreaterThanOrEqualTo(String value) {
            addCriterion("name_msg >=", value, "nameMsg");
            return (Criteria) this;
        }

        public Criteria andNameMsgLessThan(String value) {
            addCriterion("name_msg <", value, "nameMsg");
            return (Criteria) this;
        }

        public Criteria andNameMsgLessThanOrEqualTo(String value) {
            addCriterion("name_msg <=", value, "nameMsg");
            return (Criteria) this;
        }

        public Criteria andNameMsgLike(String value) {
            addCriterion("name_msg like", value, "nameMsg");
            return (Criteria) this;
        }

        public Criteria andNameMsgNotLike(String value) {
            addCriterion("name_msg not like", value, "nameMsg");
            return (Criteria) this;
        }

        public Criteria andNameMsgIn(List<String> values) {
            addCriterion("name_msg in", values, "nameMsg");
            return (Criteria) this;
        }

        public Criteria andNameMsgNotIn(List<String> values) {
            addCriterion("name_msg not in", values, "nameMsg");
            return (Criteria) this;
        }

        public Criteria andNameMsgBetween(String value1, String value2) {
            addCriterion("name_msg between", value1, value2, "nameMsg");
            return (Criteria) this;
        }

        public Criteria andNameMsgNotBetween(String value1, String value2) {
            addCriterion("name_msg not between", value1, value2, "nameMsg");
            return (Criteria) this;
        }

        public Criteria andDescMsgIsNull() {
            addCriterion("desc_msg is null");
            return (Criteria) this;
        }

        public Criteria andDescMsgIsNotNull() {
            addCriterion("desc_msg is not null");
            return (Criteria) this;
        }

        public Criteria andDescMsgEqualTo(String value) {
            addCriterion("desc_msg =", value, "descMsg");
            return (Criteria) this;
        }

        public Criteria andDescMsgNotEqualTo(String value) {
            addCriterion("desc_msg <>", value, "descMsg");
            return (Criteria) this;
        }

        public Criteria andDescMsgGreaterThan(String value) {
            addCriterion("desc_msg >", value, "descMsg");
            return (Criteria) this;
        }

        public Criteria andDescMsgGreaterThanOrEqualTo(String value) {
            addCriterion("desc_msg >=", value, "descMsg");
            return (Criteria) this;
        }

        public Criteria andDescMsgLessThan(String value) {
            addCriterion("desc_msg <", value, "descMsg");
            return (Criteria) this;
        }

        public Criteria andDescMsgLessThanOrEqualTo(String value) {
            addCriterion("desc_msg <=", value, "descMsg");
            return (Criteria) this;
        }

        public Criteria andDescMsgLike(String value) {
            addCriterion("desc_msg like", value, "descMsg");
            return (Criteria) this;
        }

        public Criteria andDescMsgNotLike(String value) {
            addCriterion("desc_msg not like", value, "descMsg");
            return (Criteria) this;
        }

        public Criteria andDescMsgIn(List<String> values) {
            addCriterion("desc_msg in", values, "descMsg");
            return (Criteria) this;
        }

        public Criteria andDescMsgNotIn(List<String> values) {
            addCriterion("desc_msg not in", values, "descMsg");
            return (Criteria) this;
        }

        public Criteria andDescMsgBetween(String value1, String value2) {
            addCriterion("desc_msg between", value1, value2, "descMsg");
            return (Criteria) this;
        }

        public Criteria andDescMsgNotBetween(String value1, String value2) {
            addCriterion("desc_msg not between", value1, value2, "descMsg");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}