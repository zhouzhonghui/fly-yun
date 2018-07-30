package cn.fly.yun.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuotesTransactionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuotesTransactionExample() {
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

        public Criteria andPriceNowIsNull() {
            addCriterion("price_now is null");
            return (Criteria) this;
        }

        public Criteria andPriceNowIsNotNull() {
            addCriterion("price_now is not null");
            return (Criteria) this;
        }

        public Criteria andPriceNowEqualTo(String value) {
            addCriterion("price_now =", value, "priceNow");
            return (Criteria) this;
        }

        public Criteria andPriceNowNotEqualTo(String value) {
            addCriterion("price_now <>", value, "priceNow");
            return (Criteria) this;
        }

        public Criteria andPriceNowGreaterThan(String value) {
            addCriterion("price_now >", value, "priceNow");
            return (Criteria) this;
        }

        public Criteria andPriceNowGreaterThanOrEqualTo(String value) {
            addCriterion("price_now >=", value, "priceNow");
            return (Criteria) this;
        }

        public Criteria andPriceNowLessThan(String value) {
            addCriterion("price_now <", value, "priceNow");
            return (Criteria) this;
        }

        public Criteria andPriceNowLessThanOrEqualTo(String value) {
            addCriterion("price_now <=", value, "priceNow");
            return (Criteria) this;
        }

        public Criteria andPriceNowLike(String value) {
            addCriterion("price_now like", value, "priceNow");
            return (Criteria) this;
        }

        public Criteria andPriceNowNotLike(String value) {
            addCriterion("price_now not like", value, "priceNow");
            return (Criteria) this;
        }

        public Criteria andPriceNowIn(List<String> values) {
            addCriterion("price_now in", values, "priceNow");
            return (Criteria) this;
        }

        public Criteria andPriceNowNotIn(List<String> values) {
            addCriterion("price_now not in", values, "priceNow");
            return (Criteria) this;
        }

        public Criteria andPriceNowBetween(String value1, String value2) {
            addCriterion("price_now between", value1, value2, "priceNow");
            return (Criteria) this;
        }

        public Criteria andPriceNowNotBetween(String value1, String value2) {
            addCriterion("price_now not between", value1, value2, "priceNow");
            return (Criteria) this;
        }

        public Criteria andIncreasePercentageIsNull() {
            addCriterion("increase_percentage is null");
            return (Criteria) this;
        }

        public Criteria andIncreasePercentageIsNotNull() {
            addCriterion("increase_percentage is not null");
            return (Criteria) this;
        }

        public Criteria andIncreasePercentageEqualTo(String value) {
            addCriterion("increase_percentage =", value, "increasePercentage");
            return (Criteria) this;
        }

        public Criteria andIncreasePercentageNotEqualTo(String value) {
            addCriterion("increase_percentage <>", value, "increasePercentage");
            return (Criteria) this;
        }

        public Criteria andIncreasePercentageGreaterThan(String value) {
            addCriterion("increase_percentage >", value, "increasePercentage");
            return (Criteria) this;
        }

        public Criteria andIncreasePercentageGreaterThanOrEqualTo(String value) {
            addCriterion("increase_percentage >=", value, "increasePercentage");
            return (Criteria) this;
        }

        public Criteria andIncreasePercentageLessThan(String value) {
            addCriterion("increase_percentage <", value, "increasePercentage");
            return (Criteria) this;
        }

        public Criteria andIncreasePercentageLessThanOrEqualTo(String value) {
            addCriterion("increase_percentage <=", value, "increasePercentage");
            return (Criteria) this;
        }

        public Criteria andIncreasePercentageLike(String value) {
            addCriterion("increase_percentage like", value, "increasePercentage");
            return (Criteria) this;
        }

        public Criteria andIncreasePercentageNotLike(String value) {
            addCriterion("increase_percentage not like", value, "increasePercentage");
            return (Criteria) this;
        }

        public Criteria andIncreasePercentageIn(List<String> values) {
            addCriterion("increase_percentage in", values, "increasePercentage");
            return (Criteria) this;
        }

        public Criteria andIncreasePercentageNotIn(List<String> values) {
            addCriterion("increase_percentage not in", values, "increasePercentage");
            return (Criteria) this;
        }

        public Criteria andIncreasePercentageBetween(String value1, String value2) {
            addCriterion("increase_percentage between", value1, value2, "increasePercentage");
            return (Criteria) this;
        }

        public Criteria andIncreasePercentageNotBetween(String value1, String value2) {
            addCriterion("increase_percentage not between", value1, value2, "increasePercentage");
            return (Criteria) this;
        }

        public Criteria andHighIsNull() {
            addCriterion("high is null");
            return (Criteria) this;
        }

        public Criteria andHighIsNotNull() {
            addCriterion("high is not null");
            return (Criteria) this;
        }

        public Criteria andHighEqualTo(String value) {
            addCriterion("high =", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotEqualTo(String value) {
            addCriterion("high <>", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighGreaterThan(String value) {
            addCriterion("high >", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighGreaterThanOrEqualTo(String value) {
            addCriterion("high >=", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighLessThan(String value) {
            addCriterion("high <", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighLessThanOrEqualTo(String value) {
            addCriterion("high <=", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighLike(String value) {
            addCriterion("high like", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotLike(String value) {
            addCriterion("high not like", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighIn(List<String> values) {
            addCriterion("high in", values, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotIn(List<String> values) {
            addCriterion("high not in", values, "high");
            return (Criteria) this;
        }

        public Criteria andHighBetween(String value1, String value2) {
            addCriterion("high between", value1, value2, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotBetween(String value1, String value2) {
            addCriterion("high not between", value1, value2, "high");
            return (Criteria) this;
        }

        public Criteria andLowIsNull() {
            addCriterion("low is null");
            return (Criteria) this;
        }

        public Criteria andLowIsNotNull() {
            addCriterion("low is not null");
            return (Criteria) this;
        }

        public Criteria andLowEqualTo(String value) {
            addCriterion("low =", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowNotEqualTo(String value) {
            addCriterion("low <>", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowGreaterThan(String value) {
            addCriterion("low >", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowGreaterThanOrEqualTo(String value) {
            addCriterion("low >=", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowLessThan(String value) {
            addCriterion("low <", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowLessThanOrEqualTo(String value) {
            addCriterion("low <=", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowLike(String value) {
            addCriterion("low like", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowNotLike(String value) {
            addCriterion("low not like", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowIn(List<String> values) {
            addCriterion("low in", values, "low");
            return (Criteria) this;
        }

        public Criteria andLowNotIn(List<String> values) {
            addCriterion("low not in", values, "low");
            return (Criteria) this;
        }

        public Criteria andLowBetween(String value1, String value2) {
            addCriterion("low between", value1, value2, "low");
            return (Criteria) this;
        }

        public Criteria andLowNotBetween(String value1, String value2) {
            addCriterion("low not between", value1, value2, "low");
            return (Criteria) this;
        }

        public Criteria andPriceDollerIsNull() {
            addCriterion("price_doller is null");
            return (Criteria) this;
        }

        public Criteria andPriceDollerIsNotNull() {
            addCriterion("price_doller is not null");
            return (Criteria) this;
        }

        public Criteria andPriceDollerEqualTo(String value) {
            addCriterion("price_doller =", value, "priceDoller");
            return (Criteria) this;
        }

        public Criteria andPriceDollerNotEqualTo(String value) {
            addCriterion("price_doller <>", value, "priceDoller");
            return (Criteria) this;
        }

        public Criteria andPriceDollerGreaterThan(String value) {
            addCriterion("price_doller >", value, "priceDoller");
            return (Criteria) this;
        }

        public Criteria andPriceDollerGreaterThanOrEqualTo(String value) {
            addCriterion("price_doller >=", value, "priceDoller");
            return (Criteria) this;
        }

        public Criteria andPriceDollerLessThan(String value) {
            addCriterion("price_doller <", value, "priceDoller");
            return (Criteria) this;
        }

        public Criteria andPriceDollerLessThanOrEqualTo(String value) {
            addCriterion("price_doller <=", value, "priceDoller");
            return (Criteria) this;
        }

        public Criteria andPriceDollerLike(String value) {
            addCriterion("price_doller like", value, "priceDoller");
            return (Criteria) this;
        }

        public Criteria andPriceDollerNotLike(String value) {
            addCriterion("price_doller not like", value, "priceDoller");
            return (Criteria) this;
        }

        public Criteria andPriceDollerIn(List<String> values) {
            addCriterion("price_doller in", values, "priceDoller");
            return (Criteria) this;
        }

        public Criteria andPriceDollerNotIn(List<String> values) {
            addCriterion("price_doller not in", values, "priceDoller");
            return (Criteria) this;
        }

        public Criteria andPriceDollerBetween(String value1, String value2) {
            addCriterion("price_doller between", value1, value2, "priceDoller");
            return (Criteria) this;
        }

        public Criteria andPriceDollerNotBetween(String value1, String value2) {
            addCriterion("price_doller not between", value1, value2, "priceDoller");
            return (Criteria) this;
        }

        public Criteria andPriceBtcIsNull() {
            addCriterion("price_btc is null");
            return (Criteria) this;
        }

        public Criteria andPriceBtcIsNotNull() {
            addCriterion("price_btc is not null");
            return (Criteria) this;
        }

        public Criteria andPriceBtcEqualTo(String value) {
            addCriterion("price_btc =", value, "priceBtc");
            return (Criteria) this;
        }

        public Criteria andPriceBtcNotEqualTo(String value) {
            addCriterion("price_btc <>", value, "priceBtc");
            return (Criteria) this;
        }

        public Criteria andPriceBtcGreaterThan(String value) {
            addCriterion("price_btc >", value, "priceBtc");
            return (Criteria) this;
        }

        public Criteria andPriceBtcGreaterThanOrEqualTo(String value) {
            addCriterion("price_btc >=", value, "priceBtc");
            return (Criteria) this;
        }

        public Criteria andPriceBtcLessThan(String value) {
            addCriterion("price_btc <", value, "priceBtc");
            return (Criteria) this;
        }

        public Criteria andPriceBtcLessThanOrEqualTo(String value) {
            addCriterion("price_btc <=", value, "priceBtc");
            return (Criteria) this;
        }

        public Criteria andPriceBtcLike(String value) {
            addCriterion("price_btc like", value, "priceBtc");
            return (Criteria) this;
        }

        public Criteria andPriceBtcNotLike(String value) {
            addCriterion("price_btc not like", value, "priceBtc");
            return (Criteria) this;
        }

        public Criteria andPriceBtcIn(List<String> values) {
            addCriterion("price_btc in", values, "priceBtc");
            return (Criteria) this;
        }

        public Criteria andPriceBtcNotIn(List<String> values) {
            addCriterion("price_btc not in", values, "priceBtc");
            return (Criteria) this;
        }

        public Criteria andPriceBtcBetween(String value1, String value2) {
            addCriterion("price_btc between", value1, value2, "priceBtc");
            return (Criteria) this;
        }

        public Criteria andPriceBtcNotBetween(String value1, String value2) {
            addCriterion("price_btc not between", value1, value2, "priceBtc");
            return (Criteria) this;
        }

        public Criteria andMarketValueIsNull() {
            addCriterion("market_value is null");
            return (Criteria) this;
        }

        public Criteria andMarketValueIsNotNull() {
            addCriterion("market_value is not null");
            return (Criteria) this;
        }

        public Criteria andMarketValueEqualTo(String value) {
            addCriterion("market_value =", value, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueNotEqualTo(String value) {
            addCriterion("market_value <>", value, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueGreaterThan(String value) {
            addCriterion("market_value >", value, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueGreaterThanOrEqualTo(String value) {
            addCriterion("market_value >=", value, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueLessThan(String value) {
            addCriterion("market_value <", value, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueLessThanOrEqualTo(String value) {
            addCriterion("market_value <=", value, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueLike(String value) {
            addCriterion("market_value like", value, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueNotLike(String value) {
            addCriterion("market_value not like", value, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueIn(List<String> values) {
            addCriterion("market_value in", values, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueNotIn(List<String> values) {
            addCriterion("market_value not in", values, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueBetween(String value1, String value2) {
            addCriterion("market_value between", value1, value2, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueNotBetween(String value1, String value2) {
            addCriterion("market_value not between", value1, value2, "marketValue");
            return (Criteria) this;
        }

        public Criteria andMarketValueDollerIsNull() {
            addCriterion("market_value_doller is null");
            return (Criteria) this;
        }

        public Criteria andMarketValueDollerIsNotNull() {
            addCriterion("market_value_doller is not null");
            return (Criteria) this;
        }

        public Criteria andMarketValueDollerEqualTo(String value) {
            addCriterion("market_value_doller =", value, "marketValueDoller");
            return (Criteria) this;
        }

        public Criteria andMarketValueDollerNotEqualTo(String value) {
            addCriterion("market_value_doller <>", value, "marketValueDoller");
            return (Criteria) this;
        }

        public Criteria andMarketValueDollerGreaterThan(String value) {
            addCriterion("market_value_doller >", value, "marketValueDoller");
            return (Criteria) this;
        }

        public Criteria andMarketValueDollerGreaterThanOrEqualTo(String value) {
            addCriterion("market_value_doller >=", value, "marketValueDoller");
            return (Criteria) this;
        }

        public Criteria andMarketValueDollerLessThan(String value) {
            addCriterion("market_value_doller <", value, "marketValueDoller");
            return (Criteria) this;
        }

        public Criteria andMarketValueDollerLessThanOrEqualTo(String value) {
            addCriterion("market_value_doller <=", value, "marketValueDoller");
            return (Criteria) this;
        }

        public Criteria andMarketValueDollerLike(String value) {
            addCriterion("market_value_doller like", value, "marketValueDoller");
            return (Criteria) this;
        }

        public Criteria andMarketValueDollerNotLike(String value) {
            addCriterion("market_value_doller not like", value, "marketValueDoller");
            return (Criteria) this;
        }

        public Criteria andMarketValueDollerIn(List<String> values) {
            addCriterion("market_value_doller in", values, "marketValueDoller");
            return (Criteria) this;
        }

        public Criteria andMarketValueDollerNotIn(List<String> values) {
            addCriterion("market_value_doller not in", values, "marketValueDoller");
            return (Criteria) this;
        }

        public Criteria andMarketValueDollerBetween(String value1, String value2) {
            addCriterion("market_value_doller between", value1, value2, "marketValueDoller");
            return (Criteria) this;
        }

        public Criteria andMarketValueDollerNotBetween(String value1, String value2) {
            addCriterion("market_value_doller not between", value1, value2, "marketValueDoller");
            return (Criteria) this;
        }

        public Criteria andMarketValueBtcIsNull() {
            addCriterion("market_value_btc is null");
            return (Criteria) this;
        }

        public Criteria andMarketValueBtcIsNotNull() {
            addCriterion("market_value_btc is not null");
            return (Criteria) this;
        }

        public Criteria andMarketValueBtcEqualTo(String value) {
            addCriterion("market_value_btc =", value, "marketValueBtc");
            return (Criteria) this;
        }

        public Criteria andMarketValueBtcNotEqualTo(String value) {
            addCriterion("market_value_btc <>", value, "marketValueBtc");
            return (Criteria) this;
        }

        public Criteria andMarketValueBtcGreaterThan(String value) {
            addCriterion("market_value_btc >", value, "marketValueBtc");
            return (Criteria) this;
        }

        public Criteria andMarketValueBtcGreaterThanOrEqualTo(String value) {
            addCriterion("market_value_btc >=", value, "marketValueBtc");
            return (Criteria) this;
        }

        public Criteria andMarketValueBtcLessThan(String value) {
            addCriterion("market_value_btc <", value, "marketValueBtc");
            return (Criteria) this;
        }

        public Criteria andMarketValueBtcLessThanOrEqualTo(String value) {
            addCriterion("market_value_btc <=", value, "marketValueBtc");
            return (Criteria) this;
        }

        public Criteria andMarketValueBtcLike(String value) {
            addCriterion("market_value_btc like", value, "marketValueBtc");
            return (Criteria) this;
        }

        public Criteria andMarketValueBtcNotLike(String value) {
            addCriterion("market_value_btc not like", value, "marketValueBtc");
            return (Criteria) this;
        }

        public Criteria andMarketValueBtcIn(List<String> values) {
            addCriterion("market_value_btc in", values, "marketValueBtc");
            return (Criteria) this;
        }

        public Criteria andMarketValueBtcNotIn(List<String> values) {
            addCriterion("market_value_btc not in", values, "marketValueBtc");
            return (Criteria) this;
        }

        public Criteria andMarketValueBtcBetween(String value1, String value2) {
            addCriterion("market_value_btc between", value1, value2, "marketValueBtc");
            return (Criteria) this;
        }

        public Criteria andMarketValueBtcNotBetween(String value1, String value2) {
            addCriterion("market_value_btc not between", value1, value2, "marketValueBtc");
            return (Criteria) this;
        }

        public Criteria andMarketValueRateIsNull() {
            addCriterion("market_value_rate is null");
            return (Criteria) this;
        }

        public Criteria andMarketValueRateIsNotNull() {
            addCriterion("market_value_rate is not null");
            return (Criteria) this;
        }

        public Criteria andMarketValueRateEqualTo(String value) {
            addCriterion("market_value_rate =", value, "marketValueRate");
            return (Criteria) this;
        }

        public Criteria andMarketValueRateNotEqualTo(String value) {
            addCriterion("market_value_rate <>", value, "marketValueRate");
            return (Criteria) this;
        }

        public Criteria andMarketValueRateGreaterThan(String value) {
            addCriterion("market_value_rate >", value, "marketValueRate");
            return (Criteria) this;
        }

        public Criteria andMarketValueRateGreaterThanOrEqualTo(String value) {
            addCriterion("market_value_rate >=", value, "marketValueRate");
            return (Criteria) this;
        }

        public Criteria andMarketValueRateLessThan(String value) {
            addCriterion("market_value_rate <", value, "marketValueRate");
            return (Criteria) this;
        }

        public Criteria andMarketValueRateLessThanOrEqualTo(String value) {
            addCriterion("market_value_rate <=", value, "marketValueRate");
            return (Criteria) this;
        }

        public Criteria andMarketValueRateLike(String value) {
            addCriterion("market_value_rate like", value, "marketValueRate");
            return (Criteria) this;
        }

        public Criteria andMarketValueRateNotLike(String value) {
            addCriterion("market_value_rate not like", value, "marketValueRate");
            return (Criteria) this;
        }

        public Criteria andMarketValueRateIn(List<String> values) {
            addCriterion("market_value_rate in", values, "marketValueRate");
            return (Criteria) this;
        }

        public Criteria andMarketValueRateNotIn(List<String> values) {
            addCriterion("market_value_rate not in", values, "marketValueRate");
            return (Criteria) this;
        }

        public Criteria andMarketValueRateBetween(String value1, String value2) {
            addCriterion("market_value_rate between", value1, value2, "marketValueRate");
            return (Criteria) this;
        }

        public Criteria andMarketValueRateNotBetween(String value1, String value2) {
            addCriterion("market_value_rate not between", value1, value2, "marketValueRate");
            return (Criteria) this;
        }

        public Criteria andCirculationValueIsNull() {
            addCriterion("circulation_value is null");
            return (Criteria) this;
        }

        public Criteria andCirculationValueIsNotNull() {
            addCriterion("circulation_value is not null");
            return (Criteria) this;
        }

        public Criteria andCirculationValueEqualTo(String value) {
            addCriterion("circulation_value =", value, "circulationValue");
            return (Criteria) this;
        }

        public Criteria andCirculationValueNotEqualTo(String value) {
            addCriterion("circulation_value <>", value, "circulationValue");
            return (Criteria) this;
        }

        public Criteria andCirculationValueGreaterThan(String value) {
            addCriterion("circulation_value >", value, "circulationValue");
            return (Criteria) this;
        }

        public Criteria andCirculationValueGreaterThanOrEqualTo(String value) {
            addCriterion("circulation_value >=", value, "circulationValue");
            return (Criteria) this;
        }

        public Criteria andCirculationValueLessThan(String value) {
            addCriterion("circulation_value <", value, "circulationValue");
            return (Criteria) this;
        }

        public Criteria andCirculationValueLessThanOrEqualTo(String value) {
            addCriterion("circulation_value <=", value, "circulationValue");
            return (Criteria) this;
        }

        public Criteria andCirculationValueLike(String value) {
            addCriterion("circulation_value like", value, "circulationValue");
            return (Criteria) this;
        }

        public Criteria andCirculationValueNotLike(String value) {
            addCriterion("circulation_value not like", value, "circulationValue");
            return (Criteria) this;
        }

        public Criteria andCirculationValueIn(List<String> values) {
            addCriterion("circulation_value in", values, "circulationValue");
            return (Criteria) this;
        }

        public Criteria andCirculationValueNotIn(List<String> values) {
            addCriterion("circulation_value not in", values, "circulationValue");
            return (Criteria) this;
        }

        public Criteria andCirculationValueBetween(String value1, String value2) {
            addCriterion("circulation_value between", value1, value2, "circulationValue");
            return (Criteria) this;
        }

        public Criteria andCirculationValueNotBetween(String value1, String value2) {
            addCriterion("circulation_value not between", value1, value2, "circulationValue");
            return (Criteria) this;
        }

        public Criteria andCirculationTotalIsNull() {
            addCriterion("circulation_total is null");
            return (Criteria) this;
        }

        public Criteria andCirculationTotalIsNotNull() {
            addCriterion("circulation_total is not null");
            return (Criteria) this;
        }

        public Criteria andCirculationTotalEqualTo(String value) {
            addCriterion("circulation_total =", value, "circulationTotal");
            return (Criteria) this;
        }

        public Criteria andCirculationTotalNotEqualTo(String value) {
            addCriterion("circulation_total <>", value, "circulationTotal");
            return (Criteria) this;
        }

        public Criteria andCirculationTotalGreaterThan(String value) {
            addCriterion("circulation_total >", value, "circulationTotal");
            return (Criteria) this;
        }

        public Criteria andCirculationTotalGreaterThanOrEqualTo(String value) {
            addCriterion("circulation_total >=", value, "circulationTotal");
            return (Criteria) this;
        }

        public Criteria andCirculationTotalLessThan(String value) {
            addCriterion("circulation_total <", value, "circulationTotal");
            return (Criteria) this;
        }

        public Criteria andCirculationTotalLessThanOrEqualTo(String value) {
            addCriterion("circulation_total <=", value, "circulationTotal");
            return (Criteria) this;
        }

        public Criteria andCirculationTotalLike(String value) {
            addCriterion("circulation_total like", value, "circulationTotal");
            return (Criteria) this;
        }

        public Criteria andCirculationTotalNotLike(String value) {
            addCriterion("circulation_total not like", value, "circulationTotal");
            return (Criteria) this;
        }

        public Criteria andCirculationTotalIn(List<String> values) {
            addCriterion("circulation_total in", values, "circulationTotal");
            return (Criteria) this;
        }

        public Criteria andCirculationTotalNotIn(List<String> values) {
            addCriterion("circulation_total not in", values, "circulationTotal");
            return (Criteria) this;
        }

        public Criteria andCirculationTotalBetween(String value1, String value2) {
            addCriterion("circulation_total between", value1, value2, "circulationTotal");
            return (Criteria) this;
        }

        public Criteria andCirculationTotalNotBetween(String value1, String value2) {
            addCriterion("circulation_total not between", value1, value2, "circulationTotal");
            return (Criteria) this;
        }

        public Criteria andCirculationRateIsNull() {
            addCriterion("circulation_rate is null");
            return (Criteria) this;
        }

        public Criteria andCirculationRateIsNotNull() {
            addCriterion("circulation_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCirculationRateEqualTo(String value) {
            addCriterion("circulation_rate =", value, "circulationRate");
            return (Criteria) this;
        }

        public Criteria andCirculationRateNotEqualTo(String value) {
            addCriterion("circulation_rate <>", value, "circulationRate");
            return (Criteria) this;
        }

        public Criteria andCirculationRateGreaterThan(String value) {
            addCriterion("circulation_rate >", value, "circulationRate");
            return (Criteria) this;
        }

        public Criteria andCirculationRateGreaterThanOrEqualTo(String value) {
            addCriterion("circulation_rate >=", value, "circulationRate");
            return (Criteria) this;
        }

        public Criteria andCirculationRateLessThan(String value) {
            addCriterion("circulation_rate <", value, "circulationRate");
            return (Criteria) this;
        }

        public Criteria andCirculationRateLessThanOrEqualTo(String value) {
            addCriterion("circulation_rate <=", value, "circulationRate");
            return (Criteria) this;
        }

        public Criteria andCirculationRateLike(String value) {
            addCriterion("circulation_rate like", value, "circulationRate");
            return (Criteria) this;
        }

        public Criteria andCirculationRateNotLike(String value) {
            addCriterion("circulation_rate not like", value, "circulationRate");
            return (Criteria) this;
        }

        public Criteria andCirculationRateIn(List<String> values) {
            addCriterion("circulation_rate in", values, "circulationRate");
            return (Criteria) this;
        }

        public Criteria andCirculationRateNotIn(List<String> values) {
            addCriterion("circulation_rate not in", values, "circulationRate");
            return (Criteria) this;
        }

        public Criteria andCirculationRateBetween(String value1, String value2) {
            addCriterion("circulation_rate between", value1, value2, "circulationRate");
            return (Criteria) this;
        }

        public Criteria andCirculationRateNotBetween(String value1, String value2) {
            addCriterion("circulation_rate not between", value1, value2, "circulationRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverTotalIsNull() {
            addCriterion("turnover_total is null");
            return (Criteria) this;
        }

        public Criteria andTurnoverTotalIsNotNull() {
            addCriterion("turnover_total is not null");
            return (Criteria) this;
        }

        public Criteria andTurnoverTotalEqualTo(String value) {
            addCriterion("turnover_total =", value, "turnoverTotal");
            return (Criteria) this;
        }

        public Criteria andTurnoverTotalNotEqualTo(String value) {
            addCriterion("turnover_total <>", value, "turnoverTotal");
            return (Criteria) this;
        }

        public Criteria andTurnoverTotalGreaterThan(String value) {
            addCriterion("turnover_total >", value, "turnoverTotal");
            return (Criteria) this;
        }

        public Criteria andTurnoverTotalGreaterThanOrEqualTo(String value) {
            addCriterion("turnover_total >=", value, "turnoverTotal");
            return (Criteria) this;
        }

        public Criteria andTurnoverTotalLessThan(String value) {
            addCriterion("turnover_total <", value, "turnoverTotal");
            return (Criteria) this;
        }

        public Criteria andTurnoverTotalLessThanOrEqualTo(String value) {
            addCriterion("turnover_total <=", value, "turnoverTotal");
            return (Criteria) this;
        }

        public Criteria andTurnoverTotalLike(String value) {
            addCriterion("turnover_total like", value, "turnoverTotal");
            return (Criteria) this;
        }

        public Criteria andTurnoverTotalNotLike(String value) {
            addCriterion("turnover_total not like", value, "turnoverTotal");
            return (Criteria) this;
        }

        public Criteria andTurnoverTotalIn(List<String> values) {
            addCriterion("turnover_total in", values, "turnoverTotal");
            return (Criteria) this;
        }

        public Criteria andTurnoverTotalNotIn(List<String> values) {
            addCriterion("turnover_total not in", values, "turnoverTotal");
            return (Criteria) this;
        }

        public Criteria andTurnoverTotalBetween(String value1, String value2) {
            addCriterion("turnover_total between", value1, value2, "turnoverTotal");
            return (Criteria) this;
        }

        public Criteria andTurnoverTotalNotBetween(String value1, String value2) {
            addCriterion("turnover_total not between", value1, value2, "turnoverTotal");
            return (Criteria) this;
        }

        public Criteria andTurnoverDollerIsNull() {
            addCriterion("turnover_doller is null");
            return (Criteria) this;
        }

        public Criteria andTurnoverDollerIsNotNull() {
            addCriterion("turnover_doller is not null");
            return (Criteria) this;
        }

        public Criteria andTurnoverDollerEqualTo(String value) {
            addCriterion("turnover_doller =", value, "turnoverDoller");
            return (Criteria) this;
        }

        public Criteria andTurnoverDollerNotEqualTo(String value) {
            addCriterion("turnover_doller <>", value, "turnoverDoller");
            return (Criteria) this;
        }

        public Criteria andTurnoverDollerGreaterThan(String value) {
            addCriterion("turnover_doller >", value, "turnoverDoller");
            return (Criteria) this;
        }

        public Criteria andTurnoverDollerGreaterThanOrEqualTo(String value) {
            addCriterion("turnover_doller >=", value, "turnoverDoller");
            return (Criteria) this;
        }

        public Criteria andTurnoverDollerLessThan(String value) {
            addCriterion("turnover_doller <", value, "turnoverDoller");
            return (Criteria) this;
        }

        public Criteria andTurnoverDollerLessThanOrEqualTo(String value) {
            addCriterion("turnover_doller <=", value, "turnoverDoller");
            return (Criteria) this;
        }

        public Criteria andTurnoverDollerLike(String value) {
            addCriterion("turnover_doller like", value, "turnoverDoller");
            return (Criteria) this;
        }

        public Criteria andTurnoverDollerNotLike(String value) {
            addCriterion("turnover_doller not like", value, "turnoverDoller");
            return (Criteria) this;
        }

        public Criteria andTurnoverDollerIn(List<String> values) {
            addCriterion("turnover_doller in", values, "turnoverDoller");
            return (Criteria) this;
        }

        public Criteria andTurnoverDollerNotIn(List<String> values) {
            addCriterion("turnover_doller not in", values, "turnoverDoller");
            return (Criteria) this;
        }

        public Criteria andTurnoverDollerBetween(String value1, String value2) {
            addCriterion("turnover_doller between", value1, value2, "turnoverDoller");
            return (Criteria) this;
        }

        public Criteria andTurnoverDollerNotBetween(String value1, String value2) {
            addCriterion("turnover_doller not between", value1, value2, "turnoverDoller");
            return (Criteria) this;
        }

        public Criteria andTurnoverBtcIsNull() {
            addCriterion("turnover_btc is null");
            return (Criteria) this;
        }

        public Criteria andTurnoverBtcIsNotNull() {
            addCriterion("turnover_btc is not null");
            return (Criteria) this;
        }

        public Criteria andTurnoverBtcEqualTo(String value) {
            addCriterion("turnover_btc =", value, "turnoverBtc");
            return (Criteria) this;
        }

        public Criteria andTurnoverBtcNotEqualTo(String value) {
            addCriterion("turnover_btc <>", value, "turnoverBtc");
            return (Criteria) this;
        }

        public Criteria andTurnoverBtcGreaterThan(String value) {
            addCriterion("turnover_btc >", value, "turnoverBtc");
            return (Criteria) this;
        }

        public Criteria andTurnoverBtcGreaterThanOrEqualTo(String value) {
            addCriterion("turnover_btc >=", value, "turnoverBtc");
            return (Criteria) this;
        }

        public Criteria andTurnoverBtcLessThan(String value) {
            addCriterion("turnover_btc <", value, "turnoverBtc");
            return (Criteria) this;
        }

        public Criteria andTurnoverBtcLessThanOrEqualTo(String value) {
            addCriterion("turnover_btc <=", value, "turnoverBtc");
            return (Criteria) this;
        }

        public Criteria andTurnoverBtcLike(String value) {
            addCriterion("turnover_btc like", value, "turnoverBtc");
            return (Criteria) this;
        }

        public Criteria andTurnoverBtcNotLike(String value) {
            addCriterion("turnover_btc not like", value, "turnoverBtc");
            return (Criteria) this;
        }

        public Criteria andTurnoverBtcIn(List<String> values) {
            addCriterion("turnover_btc in", values, "turnoverBtc");
            return (Criteria) this;
        }

        public Criteria andTurnoverBtcNotIn(List<String> values) {
            addCriterion("turnover_btc not in", values, "turnoverBtc");
            return (Criteria) this;
        }

        public Criteria andTurnoverBtcBetween(String value1, String value2) {
            addCriterion("turnover_btc between", value1, value2, "turnoverBtc");
            return (Criteria) this;
        }

        public Criteria andTurnoverBtcNotBetween(String value1, String value2) {
            addCriterion("turnover_btc not between", value1, value2, "turnoverBtc");
            return (Criteria) this;
        }

        public Criteria andTurnoverRankIsNull() {
            addCriterion("turnover_rank is null");
            return (Criteria) this;
        }

        public Criteria andTurnoverRankIsNotNull() {
            addCriterion("turnover_rank is not null");
            return (Criteria) this;
        }

        public Criteria andTurnoverRankEqualTo(String value) {
            addCriterion("turnover_rank =", value, "turnoverRank");
            return (Criteria) this;
        }

        public Criteria andTurnoverRankNotEqualTo(String value) {
            addCriterion("turnover_rank <>", value, "turnoverRank");
            return (Criteria) this;
        }

        public Criteria andTurnoverRankGreaterThan(String value) {
            addCriterion("turnover_rank >", value, "turnoverRank");
            return (Criteria) this;
        }

        public Criteria andTurnoverRankGreaterThanOrEqualTo(String value) {
            addCriterion("turnover_rank >=", value, "turnoverRank");
            return (Criteria) this;
        }

        public Criteria andTurnoverRankLessThan(String value) {
            addCriterion("turnover_rank <", value, "turnoverRank");
            return (Criteria) this;
        }

        public Criteria andTurnoverRankLessThanOrEqualTo(String value) {
            addCriterion("turnover_rank <=", value, "turnoverRank");
            return (Criteria) this;
        }

        public Criteria andTurnoverRankLike(String value) {
            addCriterion("turnover_rank like", value, "turnoverRank");
            return (Criteria) this;
        }

        public Criteria andTurnoverRankNotLike(String value) {
            addCriterion("turnover_rank not like", value, "turnoverRank");
            return (Criteria) this;
        }

        public Criteria andTurnoverRankIn(List<String> values) {
            addCriterion("turnover_rank in", values, "turnoverRank");
            return (Criteria) this;
        }

        public Criteria andTurnoverRankNotIn(List<String> values) {
            addCriterion("turnover_rank not in", values, "turnoverRank");
            return (Criteria) this;
        }

        public Criteria andTurnoverRankBetween(String value1, String value2) {
            addCriterion("turnover_rank between", value1, value2, "turnoverRank");
            return (Criteria) this;
        }

        public Criteria andTurnoverRankNotBetween(String value1, String value2) {
            addCriterion("turnover_rank not between", value1, value2, "turnoverRank");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateIsNull() {
            addCriterion("turnover_rate is null");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateIsNotNull() {
            addCriterion("turnover_rate is not null");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateEqualTo(String value) {
            addCriterion("turnover_rate =", value, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateNotEqualTo(String value) {
            addCriterion("turnover_rate <>", value, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateGreaterThan(String value) {
            addCriterion("turnover_rate >", value, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateGreaterThanOrEqualTo(String value) {
            addCriterion("turnover_rate >=", value, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateLessThan(String value) {
            addCriterion("turnover_rate <", value, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateLessThanOrEqualTo(String value) {
            addCriterion("turnover_rate <=", value, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateLike(String value) {
            addCriterion("turnover_rate like", value, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateNotLike(String value) {
            addCriterion("turnover_rate not like", value, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateIn(List<String> values) {
            addCriterion("turnover_rate in", values, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateNotIn(List<String> values) {
            addCriterion("turnover_rate not in", values, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateBetween(String value1, String value2) {
            addCriterion("turnover_rate between", value1, value2, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateNotBetween(String value1, String value2) {
            addCriterion("turnover_rate not between", value1, value2, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNull() {
            addCriterion("create_at is null");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNotNull() {
            addCriterion("create_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreateAtEqualTo(Date value) {
            addCriterion("create_at =", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotEqualTo(Date value) {
            addCriterion("create_at <>", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThan(Date value) {
            addCriterion("create_at >", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("create_at >=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThan(Date value) {
            addCriterion("create_at <", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThanOrEqualTo(Date value) {
            addCriterion("create_at <=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtIn(List<Date> values) {
            addCriterion("create_at in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotIn(List<Date> values) {
            addCriterion("create_at not in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtBetween(Date value1, Date value2) {
            addCriterion("create_at between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotBetween(Date value1, Date value2) {
            addCriterion("create_at not between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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