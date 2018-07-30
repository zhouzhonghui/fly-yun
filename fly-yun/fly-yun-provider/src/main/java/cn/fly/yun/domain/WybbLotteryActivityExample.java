package cn.fly.yun.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WybbLotteryActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WybbLotteryActivityExample() {
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

        public Criteria andRewardBeginIsNull() {
            addCriterion("reward_begin is null");
            return (Criteria) this;
        }

        public Criteria andRewardBeginIsNotNull() {
            addCriterion("reward_begin is not null");
            return (Criteria) this;
        }

        public Criteria andRewardBeginEqualTo(Date value) {
            addCriterion("reward_begin =", value, "rewardBegin");
            return (Criteria) this;
        }

        public Criteria andRewardBeginNotEqualTo(Date value) {
            addCriterion("reward_begin <>", value, "rewardBegin");
            return (Criteria) this;
        }

        public Criteria andRewardBeginGreaterThan(Date value) {
            addCriterion("reward_begin >", value, "rewardBegin");
            return (Criteria) this;
        }

        public Criteria andRewardBeginGreaterThanOrEqualTo(Date value) {
            addCriterion("reward_begin >=", value, "rewardBegin");
            return (Criteria) this;
        }

        public Criteria andRewardBeginLessThan(Date value) {
            addCriterion("reward_begin <", value, "rewardBegin");
            return (Criteria) this;
        }

        public Criteria andRewardBeginLessThanOrEqualTo(Date value) {
            addCriterion("reward_begin <=", value, "rewardBegin");
            return (Criteria) this;
        }

        public Criteria andRewardBeginIn(List<Date> values) {
            addCriterion("reward_begin in", values, "rewardBegin");
            return (Criteria) this;
        }

        public Criteria andRewardBeginNotIn(List<Date> values) {
            addCriterion("reward_begin not in", values, "rewardBegin");
            return (Criteria) this;
        }

        public Criteria andRewardBeginBetween(Date value1, Date value2) {
            addCriterion("reward_begin between", value1, value2, "rewardBegin");
            return (Criteria) this;
        }

        public Criteria andRewardBeginNotBetween(Date value1, Date value2) {
            addCriterion("reward_begin not between", value1, value2, "rewardBegin");
            return (Criteria) this;
        }

        public Criteria andRewardEndIsNull() {
            addCriterion("reward_end is null");
            return (Criteria) this;
        }

        public Criteria andRewardEndIsNotNull() {
            addCriterion("reward_end is not null");
            return (Criteria) this;
        }

        public Criteria andRewardEndEqualTo(Date value) {
            addCriterion("reward_end =", value, "rewardEnd");
            return (Criteria) this;
        }

        public Criteria andRewardEndNotEqualTo(Date value) {
            addCriterion("reward_end <>", value, "rewardEnd");
            return (Criteria) this;
        }

        public Criteria andRewardEndGreaterThan(Date value) {
            addCriterion("reward_end >", value, "rewardEnd");
            return (Criteria) this;
        }

        public Criteria andRewardEndGreaterThanOrEqualTo(Date value) {
            addCriterion("reward_end >=", value, "rewardEnd");
            return (Criteria) this;
        }

        public Criteria andRewardEndLessThan(Date value) {
            addCriterion("reward_end <", value, "rewardEnd");
            return (Criteria) this;
        }

        public Criteria andRewardEndLessThanOrEqualTo(Date value) {
            addCriterion("reward_end <=", value, "rewardEnd");
            return (Criteria) this;
        }

        public Criteria andRewardEndIn(List<Date> values) {
            addCriterion("reward_end in", values, "rewardEnd");
            return (Criteria) this;
        }

        public Criteria andRewardEndNotIn(List<Date> values) {
            addCriterion("reward_end not in", values, "rewardEnd");
            return (Criteria) this;
        }

        public Criteria andRewardEndBetween(Date value1, Date value2) {
            addCriterion("reward_end between", value1, value2, "rewardEnd");
            return (Criteria) this;
        }

        public Criteria andRewardEndNotBetween(Date value1, Date value2) {
            addCriterion("reward_end not between", value1, value2, "rewardEnd");
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

        public Criteria andIsInitIsNull() {
            addCriterion("is_init is null");
            return (Criteria) this;
        }

        public Criteria andIsInitIsNotNull() {
            addCriterion("is_init is not null");
            return (Criteria) this;
        }

        public Criteria andIsInitEqualTo(Integer value) {
            addCriterion("is_init =", value, "isInit");
            return (Criteria) this;
        }

        public Criteria andIsInitNotEqualTo(Integer value) {
            addCriterion("is_init <>", value, "isInit");
            return (Criteria) this;
        }

        public Criteria andIsInitGreaterThan(Integer value) {
            addCriterion("is_init >", value, "isInit");
            return (Criteria) this;
        }

        public Criteria andIsInitGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_init >=", value, "isInit");
            return (Criteria) this;
        }

        public Criteria andIsInitLessThan(Integer value) {
            addCriterion("is_init <", value, "isInit");
            return (Criteria) this;
        }

        public Criteria andIsInitLessThanOrEqualTo(Integer value) {
            addCriterion("is_init <=", value, "isInit");
            return (Criteria) this;
        }

        public Criteria andIsInitIn(List<Integer> values) {
            addCriterion("is_init in", values, "isInit");
            return (Criteria) this;
        }

        public Criteria andIsInitNotIn(List<Integer> values) {
            addCriterion("is_init not in", values, "isInit");
            return (Criteria) this;
        }

        public Criteria andIsInitBetween(Integer value1, Integer value2) {
            addCriterion("is_init between", value1, value2, "isInit");
            return (Criteria) this;
        }

        public Criteria andIsInitNotBetween(Integer value1, Integer value2) {
            addCriterion("is_init not between", value1, value2, "isInit");
            return (Criteria) this;
        }

        public Criteria andCouponIdsIsNull() {
            addCriterion("coupon_ids is null");
            return (Criteria) this;
        }

        public Criteria andCouponIdsIsNotNull() {
            addCriterion("coupon_ids is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIdsEqualTo(String value) {
            addCriterion("coupon_ids =", value, "couponIds");
            return (Criteria) this;
        }

        public Criteria andCouponIdsNotEqualTo(String value) {
            addCriterion("coupon_ids <>", value, "couponIds");
            return (Criteria) this;
        }

        public Criteria andCouponIdsGreaterThan(String value) {
            addCriterion("coupon_ids >", value, "couponIds");
            return (Criteria) this;
        }

        public Criteria andCouponIdsGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_ids >=", value, "couponIds");
            return (Criteria) this;
        }

        public Criteria andCouponIdsLessThan(String value) {
            addCriterion("coupon_ids <", value, "couponIds");
            return (Criteria) this;
        }

        public Criteria andCouponIdsLessThanOrEqualTo(String value) {
            addCriterion("coupon_ids <=", value, "couponIds");
            return (Criteria) this;
        }

        public Criteria andCouponIdsLike(String value) {
            addCriterion("coupon_ids like", value, "couponIds");
            return (Criteria) this;
        }

        public Criteria andCouponIdsNotLike(String value) {
            addCriterion("coupon_ids not like", value, "couponIds");
            return (Criteria) this;
        }

        public Criteria andCouponIdsIn(List<String> values) {
            addCriterion("coupon_ids in", values, "couponIds");
            return (Criteria) this;
        }

        public Criteria andCouponIdsNotIn(List<String> values) {
            addCriterion("coupon_ids not in", values, "couponIds");
            return (Criteria) this;
        }

        public Criteria andCouponIdsBetween(String value1, String value2) {
            addCriterion("coupon_ids between", value1, value2, "couponIds");
            return (Criteria) this;
        }

        public Criteria andCouponIdsNotBetween(String value1, String value2) {
            addCriterion("coupon_ids not between", value1, value2, "couponIds");
            return (Criteria) this;
        }

        public Criteria andSecondTakeCouponIdIsNull() {
            addCriterion("second_take_coupon_id is null");
            return (Criteria) this;
        }

        public Criteria andSecondTakeCouponIdIsNotNull() {
            addCriterion("second_take_coupon_id is not null");
            return (Criteria) this;
        }

        public Criteria andSecondTakeCouponIdEqualTo(String value) {
            addCriterion("second_take_coupon_id =", value, "secondTakeCouponId");
            return (Criteria) this;
        }

        public Criteria andSecondTakeCouponIdNotEqualTo(String value) {
            addCriterion("second_take_coupon_id <>", value, "secondTakeCouponId");
            return (Criteria) this;
        }

        public Criteria andSecondTakeCouponIdGreaterThan(String value) {
            addCriterion("second_take_coupon_id >", value, "secondTakeCouponId");
            return (Criteria) this;
        }

        public Criteria andSecondTakeCouponIdGreaterThanOrEqualTo(String value) {
            addCriterion("second_take_coupon_id >=", value, "secondTakeCouponId");
            return (Criteria) this;
        }

        public Criteria andSecondTakeCouponIdLessThan(String value) {
            addCriterion("second_take_coupon_id <", value, "secondTakeCouponId");
            return (Criteria) this;
        }

        public Criteria andSecondTakeCouponIdLessThanOrEqualTo(String value) {
            addCriterion("second_take_coupon_id <=", value, "secondTakeCouponId");
            return (Criteria) this;
        }

        public Criteria andSecondTakeCouponIdLike(String value) {
            addCriterion("second_take_coupon_id like", value, "secondTakeCouponId");
            return (Criteria) this;
        }

        public Criteria andSecondTakeCouponIdNotLike(String value) {
            addCriterion("second_take_coupon_id not like", value, "secondTakeCouponId");
            return (Criteria) this;
        }

        public Criteria andSecondTakeCouponIdIn(List<String> values) {
            addCriterion("second_take_coupon_id in", values, "secondTakeCouponId");
            return (Criteria) this;
        }

        public Criteria andSecondTakeCouponIdNotIn(List<String> values) {
            addCriterion("second_take_coupon_id not in", values, "secondTakeCouponId");
            return (Criteria) this;
        }

        public Criteria andSecondTakeCouponIdBetween(String value1, String value2) {
            addCriterion("second_take_coupon_id between", value1, value2, "secondTakeCouponId");
            return (Criteria) this;
        }

        public Criteria andSecondTakeCouponIdNotBetween(String value1, String value2) {
            addCriterion("second_take_coupon_id not between", value1, value2, "secondTakeCouponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdsCountIsNull() {
            addCriterion("coupon_ids_count is null");
            return (Criteria) this;
        }

        public Criteria andCouponIdsCountIsNotNull() {
            addCriterion("coupon_ids_count is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIdsCountEqualTo(String value) {
            addCriterion("coupon_ids_count =", value, "couponIdsCount");
            return (Criteria) this;
        }

        public Criteria andCouponIdsCountNotEqualTo(String value) {
            addCriterion("coupon_ids_count <>", value, "couponIdsCount");
            return (Criteria) this;
        }

        public Criteria andCouponIdsCountGreaterThan(String value) {
            addCriterion("coupon_ids_count >", value, "couponIdsCount");
            return (Criteria) this;
        }

        public Criteria andCouponIdsCountGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_ids_count >=", value, "couponIdsCount");
            return (Criteria) this;
        }

        public Criteria andCouponIdsCountLessThan(String value) {
            addCriterion("coupon_ids_count <", value, "couponIdsCount");
            return (Criteria) this;
        }

        public Criteria andCouponIdsCountLessThanOrEqualTo(String value) {
            addCriterion("coupon_ids_count <=", value, "couponIdsCount");
            return (Criteria) this;
        }

        public Criteria andCouponIdsCountLike(String value) {
            addCriterion("coupon_ids_count like", value, "couponIdsCount");
            return (Criteria) this;
        }

        public Criteria andCouponIdsCountNotLike(String value) {
            addCriterion("coupon_ids_count not like", value, "couponIdsCount");
            return (Criteria) this;
        }

        public Criteria andCouponIdsCountIn(List<String> values) {
            addCriterion("coupon_ids_count in", values, "couponIdsCount");
            return (Criteria) this;
        }

        public Criteria andCouponIdsCountNotIn(List<String> values) {
            addCriterion("coupon_ids_count not in", values, "couponIdsCount");
            return (Criteria) this;
        }

        public Criteria andCouponIdsCountBetween(String value1, String value2) {
            addCriterion("coupon_ids_count between", value1, value2, "couponIdsCount");
            return (Criteria) this;
        }

        public Criteria andCouponIdsCountNotBetween(String value1, String value2) {
            addCriterion("coupon_ids_count not between", value1, value2, "couponIdsCount");
            return (Criteria) this;
        }

        public Criteria andRewardTypeIsNull() {
            addCriterion("reward_type is null");
            return (Criteria) this;
        }

        public Criteria andRewardTypeIsNotNull() {
            addCriterion("reward_type is not null");
            return (Criteria) this;
        }

        public Criteria andRewardTypeEqualTo(Integer value) {
            addCriterion("reward_type =", value, "rewardType");
            return (Criteria) this;
        }

        public Criteria andRewardTypeNotEqualTo(Integer value) {
            addCriterion("reward_type <>", value, "rewardType");
            return (Criteria) this;
        }

        public Criteria andRewardTypeGreaterThan(Integer value) {
            addCriterion("reward_type >", value, "rewardType");
            return (Criteria) this;
        }

        public Criteria andRewardTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("reward_type >=", value, "rewardType");
            return (Criteria) this;
        }

        public Criteria andRewardTypeLessThan(Integer value) {
            addCriterion("reward_type <", value, "rewardType");
            return (Criteria) this;
        }

        public Criteria andRewardTypeLessThanOrEqualTo(Integer value) {
            addCriterion("reward_type <=", value, "rewardType");
            return (Criteria) this;
        }

        public Criteria andRewardTypeIn(List<Integer> values) {
            addCriterion("reward_type in", values, "rewardType");
            return (Criteria) this;
        }

        public Criteria andRewardTypeNotIn(List<Integer> values) {
            addCriterion("reward_type not in", values, "rewardType");
            return (Criteria) this;
        }

        public Criteria andRewardTypeBetween(Integer value1, Integer value2) {
            addCriterion("reward_type between", value1, value2, "rewardType");
            return (Criteria) this;
        }

        public Criteria andRewardTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("reward_type not between", value1, value2, "rewardType");
            return (Criteria) this;
        }

        public Criteria andRewardOddsIsNull() {
            addCriterion("reward_odds is null");
            return (Criteria) this;
        }

        public Criteria andRewardOddsIsNotNull() {
            addCriterion("reward_odds is not null");
            return (Criteria) this;
        }

        public Criteria andRewardOddsEqualTo(String value) {
            addCriterion("reward_odds =", value, "rewardOdds");
            return (Criteria) this;
        }

        public Criteria andRewardOddsNotEqualTo(String value) {
            addCriterion("reward_odds <>", value, "rewardOdds");
            return (Criteria) this;
        }

        public Criteria andRewardOddsGreaterThan(String value) {
            addCriterion("reward_odds >", value, "rewardOdds");
            return (Criteria) this;
        }

        public Criteria andRewardOddsGreaterThanOrEqualTo(String value) {
            addCriterion("reward_odds >=", value, "rewardOdds");
            return (Criteria) this;
        }

        public Criteria andRewardOddsLessThan(String value) {
            addCriterion("reward_odds <", value, "rewardOdds");
            return (Criteria) this;
        }

        public Criteria andRewardOddsLessThanOrEqualTo(String value) {
            addCriterion("reward_odds <=", value, "rewardOdds");
            return (Criteria) this;
        }

        public Criteria andRewardOddsLike(String value) {
            addCriterion("reward_odds like", value, "rewardOdds");
            return (Criteria) this;
        }

        public Criteria andRewardOddsNotLike(String value) {
            addCriterion("reward_odds not like", value, "rewardOdds");
            return (Criteria) this;
        }

        public Criteria andRewardOddsIn(List<String> values) {
            addCriterion("reward_odds in", values, "rewardOdds");
            return (Criteria) this;
        }

        public Criteria andRewardOddsNotIn(List<String> values) {
            addCriterion("reward_odds not in", values, "rewardOdds");
            return (Criteria) this;
        }

        public Criteria andRewardOddsBetween(String value1, String value2) {
            addCriterion("reward_odds between", value1, value2, "rewardOdds");
            return (Criteria) this;
        }

        public Criteria andRewardOddsNotBetween(String value1, String value2) {
            addCriterion("reward_odds not between", value1, value2, "rewardOdds");
            return (Criteria) this;
        }

        public Criteria andParticipateNumberIsNull() {
            addCriterion("participate_number is null");
            return (Criteria) this;
        }

        public Criteria andParticipateNumberIsNotNull() {
            addCriterion("participate_number is not null");
            return (Criteria) this;
        }

        public Criteria andParticipateNumberEqualTo(Integer value) {
            addCriterion("participate_number =", value, "participateNumber");
            return (Criteria) this;
        }

        public Criteria andParticipateNumberNotEqualTo(Integer value) {
            addCriterion("participate_number <>", value, "participateNumber");
            return (Criteria) this;
        }

        public Criteria andParticipateNumberGreaterThan(Integer value) {
            addCriterion("participate_number >", value, "participateNumber");
            return (Criteria) this;
        }

        public Criteria andParticipateNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("participate_number >=", value, "participateNumber");
            return (Criteria) this;
        }

        public Criteria andParticipateNumberLessThan(Integer value) {
            addCriterion("participate_number <", value, "participateNumber");
            return (Criteria) this;
        }

        public Criteria andParticipateNumberLessThanOrEqualTo(Integer value) {
            addCriterion("participate_number <=", value, "participateNumber");
            return (Criteria) this;
        }

        public Criteria andParticipateNumberIn(List<Integer> values) {
            addCriterion("participate_number in", values, "participateNumber");
            return (Criteria) this;
        }

        public Criteria andParticipateNumberNotIn(List<Integer> values) {
            addCriterion("participate_number not in", values, "participateNumber");
            return (Criteria) this;
        }

        public Criteria andParticipateNumberBetween(Integer value1, Integer value2) {
            addCriterion("participate_number between", value1, value2, "participateNumber");
            return (Criteria) this;
        }

        public Criteria andParticipateNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("participate_number not between", value1, value2, "participateNumber");
            return (Criteria) this;
        }

        public Criteria andIsLimitMemberIsNull() {
            addCriterion("is_limit_member is null");
            return (Criteria) this;
        }

        public Criteria andIsLimitMemberIsNotNull() {
            addCriterion("is_limit_member is not null");
            return (Criteria) this;
        }

        public Criteria andIsLimitMemberEqualTo(Integer value) {
            addCriterion("is_limit_member =", value, "isLimitMember");
            return (Criteria) this;
        }

        public Criteria andIsLimitMemberNotEqualTo(Integer value) {
            addCriterion("is_limit_member <>", value, "isLimitMember");
            return (Criteria) this;
        }

        public Criteria andIsLimitMemberGreaterThan(Integer value) {
            addCriterion("is_limit_member >", value, "isLimitMember");
            return (Criteria) this;
        }

        public Criteria andIsLimitMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_limit_member >=", value, "isLimitMember");
            return (Criteria) this;
        }

        public Criteria andIsLimitMemberLessThan(Integer value) {
            addCriterion("is_limit_member <", value, "isLimitMember");
            return (Criteria) this;
        }

        public Criteria andIsLimitMemberLessThanOrEqualTo(Integer value) {
            addCriterion("is_limit_member <=", value, "isLimitMember");
            return (Criteria) this;
        }

        public Criteria andIsLimitMemberIn(List<Integer> values) {
            addCriterion("is_limit_member in", values, "isLimitMember");
            return (Criteria) this;
        }

        public Criteria andIsLimitMemberNotIn(List<Integer> values) {
            addCriterion("is_limit_member not in", values, "isLimitMember");
            return (Criteria) this;
        }

        public Criteria andIsLimitMemberBetween(Integer value1, Integer value2) {
            addCriterion("is_limit_member between", value1, value2, "isLimitMember");
            return (Criteria) this;
        }

        public Criteria andIsLimitMemberNotBetween(Integer value1, Integer value2) {
            addCriterion("is_limit_member not between", value1, value2, "isLimitMember");
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

        public Criteria andInviteCodeIsNull() {
            addCriterion("invite_code is null");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIsNotNull() {
            addCriterion("invite_code is not null");
            return (Criteria) this;
        }

        public Criteria andInviteCodeEqualTo(String value) {
            addCriterion("invite_code =", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotEqualTo(String value) {
            addCriterion("invite_code <>", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeGreaterThan(String value) {
            addCriterion("invite_code >", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeGreaterThanOrEqualTo(String value) {
            addCriterion("invite_code >=", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeLessThan(String value) {
            addCriterion("invite_code <", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeLessThanOrEqualTo(String value) {
            addCriterion("invite_code <=", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeLike(String value) {
            addCriterion("invite_code like", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotLike(String value) {
            addCriterion("invite_code not like", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIn(List<String> values) {
            addCriterion("invite_code in", values, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotIn(List<String> values) {
            addCriterion("invite_code not in", values, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeBetween(String value1, String value2) {
            addCriterion("invite_code between", value1, value2, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotBetween(String value1, String value2) {
            addCriterion("invite_code not between", value1, value2, "inviteCode");
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