package cn.fly.yun.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuotesExchangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuotesExchangeExample() {
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

        public Criteria andTqIdIsNull() {
            addCriterion("tq_id is null");
            return (Criteria) this;
        }

        public Criteria andTqIdIsNotNull() {
            addCriterion("tq_id is not null");
            return (Criteria) this;
        }

        public Criteria andTqIdEqualTo(Long value) {
            addCriterion("tq_id =", value, "tqId");
            return (Criteria) this;
        }

        public Criteria andTqIdNotEqualTo(Long value) {
            addCriterion("tq_id <>", value, "tqId");
            return (Criteria) this;
        }

        public Criteria andTqIdGreaterThan(Long value) {
            addCriterion("tq_id >", value, "tqId");
            return (Criteria) this;
        }

        public Criteria andTqIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tq_id >=", value, "tqId");
            return (Criteria) this;
        }

        public Criteria andTqIdLessThan(Long value) {
            addCriterion("tq_id <", value, "tqId");
            return (Criteria) this;
        }

        public Criteria andTqIdLessThanOrEqualTo(Long value) {
            addCriterion("tq_id <=", value, "tqId");
            return (Criteria) this;
        }

        public Criteria andTqIdIn(List<Long> values) {
            addCriterion("tq_id in", values, "tqId");
            return (Criteria) this;
        }

        public Criteria andTqIdNotIn(List<Long> values) {
            addCriterion("tq_id not in", values, "tqId");
            return (Criteria) this;
        }

        public Criteria andTqIdBetween(Long value1, Long value2) {
            addCriterion("tq_id between", value1, value2, "tqId");
            return (Criteria) this;
        }

        public Criteria andTqIdNotBetween(Long value1, Long value2) {
            addCriterion("tq_id not between", value1, value2, "tqId");
            return (Criteria) this;
        }

        public Criteria andExchangeIsNull() {
            addCriterion("exchange is null");
            return (Criteria) this;
        }

        public Criteria andExchangeIsNotNull() {
            addCriterion("exchange is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeEqualTo(String value) {
            addCriterion("exchange =", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeNotEqualTo(String value) {
            addCriterion("exchange <>", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeGreaterThan(String value) {
            addCriterion("exchange >", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeGreaterThanOrEqualTo(String value) {
            addCriterion("exchange >=", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeLessThan(String value) {
            addCriterion("exchange <", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeLessThanOrEqualTo(String value) {
            addCriterion("exchange <=", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeLike(String value) {
            addCriterion("exchange like", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeNotLike(String value) {
            addCriterion("exchange not like", value, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeIn(List<String> values) {
            addCriterion("exchange in", values, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeNotIn(List<String> values) {
            addCriterion("exchange not in", values, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeBetween(String value1, String value2) {
            addCriterion("exchange between", value1, value2, "exchange");
            return (Criteria) this;
        }

        public Criteria andExchangeNotBetween(String value1, String value2) {
            addCriterion("exchange not between", value1, value2, "exchange");
            return (Criteria) this;
        }

        public Criteria andTransactionPairIsNull() {
            addCriterion("transaction_pair is null");
            return (Criteria) this;
        }

        public Criteria andTransactionPairIsNotNull() {
            addCriterion("transaction_pair is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionPairEqualTo(String value) {
            addCriterion("transaction_pair =", value, "transactionPair");
            return (Criteria) this;
        }

        public Criteria andTransactionPairNotEqualTo(String value) {
            addCriterion("transaction_pair <>", value, "transactionPair");
            return (Criteria) this;
        }

        public Criteria andTransactionPairGreaterThan(String value) {
            addCriterion("transaction_pair >", value, "transactionPair");
            return (Criteria) this;
        }

        public Criteria andTransactionPairGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_pair >=", value, "transactionPair");
            return (Criteria) this;
        }

        public Criteria andTransactionPairLessThan(String value) {
            addCriterion("transaction_pair <", value, "transactionPair");
            return (Criteria) this;
        }

        public Criteria andTransactionPairLessThanOrEqualTo(String value) {
            addCriterion("transaction_pair <=", value, "transactionPair");
            return (Criteria) this;
        }

        public Criteria andTransactionPairLike(String value) {
            addCriterion("transaction_pair like", value, "transactionPair");
            return (Criteria) this;
        }

        public Criteria andTransactionPairNotLike(String value) {
            addCriterion("transaction_pair not like", value, "transactionPair");
            return (Criteria) this;
        }

        public Criteria andTransactionPairIn(List<String> values) {
            addCriterion("transaction_pair in", values, "transactionPair");
            return (Criteria) this;
        }

        public Criteria andTransactionPairNotIn(List<String> values) {
            addCriterion("transaction_pair not in", values, "transactionPair");
            return (Criteria) this;
        }

        public Criteria andTransactionPairBetween(String value1, String value2) {
            addCriterion("transaction_pair between", value1, value2, "transactionPair");
            return (Criteria) this;
        }

        public Criteria andTransactionPairNotBetween(String value1, String value2) {
            addCriterion("transaction_pair not between", value1, value2, "transactionPair");
            return (Criteria) this;
        }

        public Criteria andPriceNativeIsNull() {
            addCriterion("price_native is null");
            return (Criteria) this;
        }

        public Criteria andPriceNativeIsNotNull() {
            addCriterion("price_native is not null");
            return (Criteria) this;
        }

        public Criteria andPriceNativeEqualTo(String value) {
            addCriterion("price_native =", value, "priceNative");
            return (Criteria) this;
        }

        public Criteria andPriceNativeNotEqualTo(String value) {
            addCriterion("price_native <>", value, "priceNative");
            return (Criteria) this;
        }

        public Criteria andPriceNativeGreaterThan(String value) {
            addCriterion("price_native >", value, "priceNative");
            return (Criteria) this;
        }

        public Criteria andPriceNativeGreaterThanOrEqualTo(String value) {
            addCriterion("price_native >=", value, "priceNative");
            return (Criteria) this;
        }

        public Criteria andPriceNativeLessThan(String value) {
            addCriterion("price_native <", value, "priceNative");
            return (Criteria) this;
        }

        public Criteria andPriceNativeLessThanOrEqualTo(String value) {
            addCriterion("price_native <=", value, "priceNative");
            return (Criteria) this;
        }

        public Criteria andPriceNativeLike(String value) {
            addCriterion("price_native like", value, "priceNative");
            return (Criteria) this;
        }

        public Criteria andPriceNativeNotLike(String value) {
            addCriterion("price_native not like", value, "priceNative");
            return (Criteria) this;
        }

        public Criteria andPriceNativeIn(List<String> values) {
            addCriterion("price_native in", values, "priceNative");
            return (Criteria) this;
        }

        public Criteria andPriceNativeNotIn(List<String> values) {
            addCriterion("price_native not in", values, "priceNative");
            return (Criteria) this;
        }

        public Criteria andPriceNativeBetween(String value1, String value2) {
            addCriterion("price_native between", value1, value2, "priceNative");
            return (Criteria) this;
        }

        public Criteria andPriceNativeNotBetween(String value1, String value2) {
            addCriterion("price_native not between", value1, value2, "priceNative");
            return (Criteria) this;
        }

        public Criteria andPriceCnyIsNull() {
            addCriterion("price_cny is null");
            return (Criteria) this;
        }

        public Criteria andPriceCnyIsNotNull() {
            addCriterion("price_cny is not null");
            return (Criteria) this;
        }

        public Criteria andPriceCnyEqualTo(String value) {
            addCriterion("price_cny =", value, "priceCny");
            return (Criteria) this;
        }

        public Criteria andPriceCnyNotEqualTo(String value) {
            addCriterion("price_cny <>", value, "priceCny");
            return (Criteria) this;
        }

        public Criteria andPriceCnyGreaterThan(String value) {
            addCriterion("price_cny >", value, "priceCny");
            return (Criteria) this;
        }

        public Criteria andPriceCnyGreaterThanOrEqualTo(String value) {
            addCriterion("price_cny >=", value, "priceCny");
            return (Criteria) this;
        }

        public Criteria andPriceCnyLessThan(String value) {
            addCriterion("price_cny <", value, "priceCny");
            return (Criteria) this;
        }

        public Criteria andPriceCnyLessThanOrEqualTo(String value) {
            addCriterion("price_cny <=", value, "priceCny");
            return (Criteria) this;
        }

        public Criteria andPriceCnyLike(String value) {
            addCriterion("price_cny like", value, "priceCny");
            return (Criteria) this;
        }

        public Criteria andPriceCnyNotLike(String value) {
            addCriterion("price_cny not like", value, "priceCny");
            return (Criteria) this;
        }

        public Criteria andPriceCnyIn(List<String> values) {
            addCriterion("price_cny in", values, "priceCny");
            return (Criteria) this;
        }

        public Criteria andPriceCnyNotIn(List<String> values) {
            addCriterion("price_cny not in", values, "priceCny");
            return (Criteria) this;
        }

        public Criteria andPriceCnyBetween(String value1, String value2) {
            addCriterion("price_cny between", value1, value2, "priceCny");
            return (Criteria) this;
        }

        public Criteria andPriceCnyNotBetween(String value1, String value2) {
            addCriterion("price_cny not between", value1, value2, "priceCny");
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

        public Criteria andPriceEthIsNull() {
            addCriterion("price_eth is null");
            return (Criteria) this;
        }

        public Criteria andPriceEthIsNotNull() {
            addCriterion("price_eth is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEthEqualTo(String value) {
            addCriterion("price_eth =", value, "priceEth");
            return (Criteria) this;
        }

        public Criteria andPriceEthNotEqualTo(String value) {
            addCriterion("price_eth <>", value, "priceEth");
            return (Criteria) this;
        }

        public Criteria andPriceEthGreaterThan(String value) {
            addCriterion("price_eth >", value, "priceEth");
            return (Criteria) this;
        }

        public Criteria andPriceEthGreaterThanOrEqualTo(String value) {
            addCriterion("price_eth >=", value, "priceEth");
            return (Criteria) this;
        }

        public Criteria andPriceEthLessThan(String value) {
            addCriterion("price_eth <", value, "priceEth");
            return (Criteria) this;
        }

        public Criteria andPriceEthLessThanOrEqualTo(String value) {
            addCriterion("price_eth <=", value, "priceEth");
            return (Criteria) this;
        }

        public Criteria andPriceEthLike(String value) {
            addCriterion("price_eth like", value, "priceEth");
            return (Criteria) this;
        }

        public Criteria andPriceEthNotLike(String value) {
            addCriterion("price_eth not like", value, "priceEth");
            return (Criteria) this;
        }

        public Criteria andPriceEthIn(List<String> values) {
            addCriterion("price_eth in", values, "priceEth");
            return (Criteria) this;
        }

        public Criteria andPriceEthNotIn(List<String> values) {
            addCriterion("price_eth not in", values, "priceEth");
            return (Criteria) this;
        }

        public Criteria andPriceEthBetween(String value1, String value2) {
            addCriterion("price_eth between", value1, value2, "priceEth");
            return (Criteria) this;
        }

        public Criteria andPriceEthNotBetween(String value1, String value2) {
            addCriterion("price_eth not between", value1, value2, "priceEth");
            return (Criteria) this;
        }

        public Criteria andPriceUsdIsNull() {
            addCriterion("price_usd is null");
            return (Criteria) this;
        }

        public Criteria andPriceUsdIsNotNull() {
            addCriterion("price_usd is not null");
            return (Criteria) this;
        }

        public Criteria andPriceUsdEqualTo(String value) {
            addCriterion("price_usd =", value, "priceUsd");
            return (Criteria) this;
        }

        public Criteria andPriceUsdNotEqualTo(String value) {
            addCriterion("price_usd <>", value, "priceUsd");
            return (Criteria) this;
        }

        public Criteria andPriceUsdGreaterThan(String value) {
            addCriterion("price_usd >", value, "priceUsd");
            return (Criteria) this;
        }

        public Criteria andPriceUsdGreaterThanOrEqualTo(String value) {
            addCriterion("price_usd >=", value, "priceUsd");
            return (Criteria) this;
        }

        public Criteria andPriceUsdLessThan(String value) {
            addCriterion("price_usd <", value, "priceUsd");
            return (Criteria) this;
        }

        public Criteria andPriceUsdLessThanOrEqualTo(String value) {
            addCriterion("price_usd <=", value, "priceUsd");
            return (Criteria) this;
        }

        public Criteria andPriceUsdLike(String value) {
            addCriterion("price_usd like", value, "priceUsd");
            return (Criteria) this;
        }

        public Criteria andPriceUsdNotLike(String value) {
            addCriterion("price_usd not like", value, "priceUsd");
            return (Criteria) this;
        }

        public Criteria andPriceUsdIn(List<String> values) {
            addCriterion("price_usd in", values, "priceUsd");
            return (Criteria) this;
        }

        public Criteria andPriceUsdNotIn(List<String> values) {
            addCriterion("price_usd not in", values, "priceUsd");
            return (Criteria) this;
        }

        public Criteria andPriceUsdBetween(String value1, String value2) {
            addCriterion("price_usd between", value1, value2, "priceUsd");
            return (Criteria) this;
        }

        public Criteria andPriceUsdNotBetween(String value1, String value2) {
            addCriterion("price_usd not between", value1, value2, "priceUsd");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(String value) {
            addCriterion("volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(String value) {
            addCriterion("volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(String value) {
            addCriterion("volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(String value) {
            addCriterion("volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(String value) {
            addCriterion("volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(String value) {
            addCriterion("volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLike(String value) {
            addCriterion("volume like", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotLike(String value) {
            addCriterion("volume not like", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<String> values) {
            addCriterion("volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<String> values) {
            addCriterion("volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(String value1, String value2) {
            addCriterion("volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(String value1, String value2) {
            addCriterion("volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andTurnoverIsNull() {
            addCriterion("turnover is null");
            return (Criteria) this;
        }

        public Criteria andTurnoverIsNotNull() {
            addCriterion("turnover is not null");
            return (Criteria) this;
        }

        public Criteria andTurnoverEqualTo(String value) {
            addCriterion("turnover =", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverNotEqualTo(String value) {
            addCriterion("turnover <>", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverGreaterThan(String value) {
            addCriterion("turnover >", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverGreaterThanOrEqualTo(String value) {
            addCriterion("turnover >=", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverLessThan(String value) {
            addCriterion("turnover <", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverLessThanOrEqualTo(String value) {
            addCriterion("turnover <=", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverLike(String value) {
            addCriterion("turnover like", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverNotLike(String value) {
            addCriterion("turnover not like", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverIn(List<String> values) {
            addCriterion("turnover in", values, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverNotIn(List<String> values) {
            addCriterion("turnover not in", values, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverBetween(String value1, String value2) {
            addCriterion("turnover between", value1, value2, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverNotBetween(String value1, String value2) {
            addCriterion("turnover not between", value1, value2, "turnover");
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