package cn.fly.yun.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    //每页条数
    private int limit;

    private int offset ;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    protected List<Criteria> oredCriteria;

    public NewsInfoExample() {
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

        public Criteria andNewsidIsNull() {
            addCriterion("newsid is null");
            return (Criteria) this;
        }

        public Criteria andNewsidIsNotNull() {
            addCriterion("newsid is not null");
            return (Criteria) this;
        }

        public Criteria andNewsidEqualTo(Long value) {
            addCriterion("newsid =", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotEqualTo(Long value) {
            addCriterion("newsid <>", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidGreaterThan(Long value) {
            addCriterion("newsid >", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidGreaterThanOrEqualTo(Long value) {
            addCriterion("newsid >=", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidLessThan(Long value) {
            addCriterion("newsid <", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidLessThanOrEqualTo(Long value) {
            addCriterion("newsid <=", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidIn(List<Long> values) {
            addCriterion("newsid in", values, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotIn(List<Long> values) {
            addCriterion("newsid not in", values, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidBetween(Long value1, Long value2) {
            addCriterion("newsid between", value1, value2, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotBetween(Long value1, Long value2) {
            addCriterion("newsid not between", value1, value2, "newsid");
            return (Criteria) this;
        }

        public Criteria andBacktitleIsNull() {
            addCriterion("backtitle is null");
            return (Criteria) this;
        }

        public Criteria andBacktitleIsNotNull() {
            addCriterion("backtitle is not null");
            return (Criteria) this;
        }

        public Criteria andBacktitleEqualTo(String value) {
            addCriterion("backtitle =", value, "backtitle");
            return (Criteria) this;
        }

        public Criteria andBacktitleNotEqualTo(String value) {
            addCriterion("backtitle <>", value, "backtitle");
            return (Criteria) this;
        }

        public Criteria andBacktitleGreaterThan(String value) {
            addCriterion("backtitle >", value, "backtitle");
            return (Criteria) this;
        }

        public Criteria andBacktitleGreaterThanOrEqualTo(String value) {
            addCriterion("backtitle >=", value, "backtitle");
            return (Criteria) this;
        }

        public Criteria andBacktitleLessThan(String value) {
            addCriterion("backtitle <", value, "backtitle");
            return (Criteria) this;
        }

        public Criteria andBacktitleLessThanOrEqualTo(String value) {
            addCriterion("backtitle <=", value, "backtitle");
            return (Criteria) this;
        }

        public Criteria andBacktitleLike(String value) {
            addCriterion("backtitle like", value, "backtitle");
            return (Criteria) this;
        }

        public Criteria andBacktitleNotLike(String value) {
            addCriterion("backtitle not like", value, "backtitle");
            return (Criteria) this;
        }

        public Criteria andBacktitleIn(List<String> values) {
            addCriterion("backtitle in", values, "backtitle");
            return (Criteria) this;
        }

        public Criteria andBacktitleNotIn(List<String> values) {
            addCriterion("backtitle not in", values, "backtitle");
            return (Criteria) this;
        }

        public Criteria andBacktitleBetween(String value1, String value2) {
            addCriterion("backtitle between", value1, value2, "backtitle");
            return (Criteria) this;
        }

        public Criteria andBacktitleNotBetween(String value1, String value2) {
            addCriterion("backtitle not between", value1, value2, "backtitle");
            return (Criteria) this;
        }

        public Criteria andNewstypeIsNull() {
            addCriterion("newstype is null");
            return (Criteria) this;
        }

        public Criteria andNewstypeIsNotNull() {
            addCriterion("newstype is not null");
            return (Criteria) this;
        }

        public Criteria andNewstypeEqualTo(String value) {
            addCriterion("newstype =", value, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeNotEqualTo(String value) {
            addCriterion("newstype <>", value, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeGreaterThan(String value) {
            addCriterion("newstype >", value, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeGreaterThanOrEqualTo(String value) {
            addCriterion("newstype >=", value, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeLessThan(String value) {
            addCriterion("newstype <", value, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeLessThanOrEqualTo(String value) {
            addCriterion("newstype <=", value, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeLike(String value) {
            addCriterion("newstype like", value, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeNotLike(String value) {
            addCriterion("newstype not like", value, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeIn(List<String> values) {
            addCriterion("newstype in", values, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeNotIn(List<String> values) {
            addCriterion("newstype not in", values, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeBetween(String value1, String value2) {
            addCriterion("newstype between", value1, value2, "newstype");
            return (Criteria) this;
        }

        public Criteria andNewstypeNotBetween(String value1, String value2) {
            addCriterion("newstype not between", value1, value2, "newstype");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIsNull() {
            addCriterion("publishtime is null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIsNotNull() {
            addCriterion("publishtime is not null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeEqualTo(Date value) {
            addCriterion("publishtime =", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotEqualTo(Date value) {
            addCriterion("publishtime <>", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThan(Date value) {
            addCriterion("publishtime >", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("publishtime >=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThan(Date value) {
            addCriterion("publishtime <", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThanOrEqualTo(Date value) {
            addCriterion("publishtime <=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIn(List<Date> values) {
            addCriterion("publishtime in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotIn(List<Date> values) {
            addCriterion("publishtime not in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeBetween(Date value1, Date value2) {
            addCriterion("publishtime between", value1, value2, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotBetween(Date value1, Date value2) {
            addCriterion("publishtime not between", value1, value2, "publishtime");
            return (Criteria) this;
        }

        public Criteria andFronttitleIsNull() {
            addCriterion("fronttitle is null");
            return (Criteria) this;
        }

        public Criteria andFronttitleIsNotNull() {
            addCriterion("fronttitle is not null");
            return (Criteria) this;
        }

        public Criteria andFronttitleEqualTo(String value) {
            addCriterion("fronttitle =", value, "fronttitle");
            return (Criteria) this;
        }

        public Criteria andFronttitleNotEqualTo(String value) {
            addCriterion("fronttitle <>", value, "fronttitle");
            return (Criteria) this;
        }

        public Criteria andFronttitleGreaterThan(String value) {
            addCriterion("fronttitle >", value, "fronttitle");
            return (Criteria) this;
        }

        public Criteria andFronttitleGreaterThanOrEqualTo(String value) {
            addCriterion("fronttitle >=", value, "fronttitle");
            return (Criteria) this;
        }

        public Criteria andFronttitleLessThan(String value) {
            addCriterion("fronttitle <", value, "fronttitle");
            return (Criteria) this;
        }

        public Criteria andFronttitleLessThanOrEqualTo(String value) {
            addCriterion("fronttitle <=", value, "fronttitle");
            return (Criteria) this;
        }

        public Criteria andFronttitleLike(String value) {
            addCriterion("fronttitle like", value, "fronttitle");
            return (Criteria) this;
        }

        public Criteria andFronttitleNotLike(String value) {
            addCriterion("fronttitle not like", value, "fronttitle");
            return (Criteria) this;
        }

        public Criteria andFronttitleIn(List<String> values) {
            addCriterion("fronttitle in", values, "fronttitle");
            return (Criteria) this;
        }

        public Criteria andFronttitleNotIn(List<String> values) {
            addCriterion("fronttitle not in", values, "fronttitle");
            return (Criteria) this;
        }

        public Criteria andFronttitleBetween(String value1, String value2) {
            addCriterion("fronttitle between", value1, value2, "fronttitle");
            return (Criteria) this;
        }

        public Criteria andFronttitleNotBetween(String value1, String value2) {
            addCriterion("fronttitle not between", value1, value2, "fronttitle");
            return (Criteria) this;
        }

        public Criteria andIstopIsNull() {
            addCriterion("istop is null");
            return (Criteria) this;
        }

        public Criteria andIstopIsNotNull() {
            addCriterion("istop is not null");
            return (Criteria) this;
        }

        public Criteria andIstopEqualTo(String value) {
            addCriterion("istop =", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotEqualTo(String value) {
            addCriterion("istop <>", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopGreaterThan(String value) {
            addCriterion("istop >", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopGreaterThanOrEqualTo(String value) {
            addCriterion("istop >=", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopLessThan(String value) {
            addCriterion("istop <", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopLessThanOrEqualTo(String value) {
            addCriterion("istop <=", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopLike(String value) {
            addCriterion("istop like", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotLike(String value) {
            addCriterion("istop not like", value, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopIn(List<String> values) {
            addCriterion("istop in", values, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotIn(List<String> values) {
            addCriterion("istop not in", values, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopBetween(String value1, String value2) {
            addCriterion("istop between", value1, value2, "istop");
            return (Criteria) this;
        }

        public Criteria andIstopNotBetween(String value1, String value2) {
            addCriterion("istop not between", value1, value2, "istop");
            return (Criteria) this;
        }

        public Criteria andIshotIsNull() {
            addCriterion("ishot is null");
            return (Criteria) this;
        }

        public Criteria andIshotIsNotNull() {
            addCriterion("ishot is not null");
            return (Criteria) this;
        }

        public Criteria andIshotEqualTo(String value) {
            addCriterion("ishot =", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotEqualTo(String value) {
            addCriterion("ishot <>", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotGreaterThan(String value) {
            addCriterion("ishot >", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotGreaterThanOrEqualTo(String value) {
            addCriterion("ishot >=", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotLessThan(String value) {
            addCriterion("ishot <", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotLessThanOrEqualTo(String value) {
            addCriterion("ishot <=", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotLike(String value) {
            addCriterion("ishot like", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotLike(String value) {
            addCriterion("ishot not like", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotIn(List<String> values) {
            addCriterion("ishot in", values, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotIn(List<String> values) {
            addCriterion("ishot not in", values, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotBetween(String value1, String value2) {
            addCriterion("ishot between", value1, value2, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotBetween(String value1, String value2) {
            addCriterion("ishot not between", value1, value2, "ishot");
            return (Criteria) this;
        }

        public Criteria andNewsfromIsNull() {
            addCriterion("newsfrom is null");
            return (Criteria) this;
        }

        public Criteria andNewsfromIsNotNull() {
            addCriterion("newsfrom is not null");
            return (Criteria) this;
        }

        public Criteria andNewsfromEqualTo(String value) {
            addCriterion("newsfrom =", value, "newsfrom");
            return (Criteria) this;
        }

        public Criteria andNewsfromNotEqualTo(String value) {
            addCriterion("newsfrom <>", value, "newsfrom");
            return (Criteria) this;
        }

        public Criteria andNewsfromGreaterThan(String value) {
            addCriterion("newsfrom >", value, "newsfrom");
            return (Criteria) this;
        }

        public Criteria andNewsfromGreaterThanOrEqualTo(String value) {
            addCriterion("newsfrom >=", value, "newsfrom");
            return (Criteria) this;
        }

        public Criteria andNewsfromLessThan(String value) {
            addCriterion("newsfrom <", value, "newsfrom");
            return (Criteria) this;
        }

        public Criteria andNewsfromLessThanOrEqualTo(String value) {
            addCriterion("newsfrom <=", value, "newsfrom");
            return (Criteria) this;
        }

        public Criteria andNewsfromLike(String value) {
            addCriterion("newsfrom like", value, "newsfrom");
            return (Criteria) this;
        }

        public Criteria andNewsfromNotLike(String value) {
            addCriterion("newsfrom not like", value, "newsfrom");
            return (Criteria) this;
        }

        public Criteria andNewsfromIn(List<String> values) {
            addCriterion("newsfrom in", values, "newsfrom");
            return (Criteria) this;
        }

        public Criteria andNewsfromNotIn(List<String> values) {
            addCriterion("newsfrom not in", values, "newsfrom");
            return (Criteria) this;
        }

        public Criteria andNewsfromBetween(String value1, String value2) {
            addCriterion("newsfrom between", value1, value2, "newsfrom");
            return (Criteria) this;
        }

        public Criteria andNewsfromNotBetween(String value1, String value2) {
            addCriterion("newsfrom not between", value1, value2, "newsfrom");
            return (Criteria) this;
        }

        public Criteria andAutherIsNull() {
            addCriterion("auther is null");
            return (Criteria) this;
        }

        public Criteria andAutherIsNotNull() {
            addCriterion("auther is not null");
            return (Criteria) this;
        }

        public Criteria andAutherEqualTo(String value) {
            addCriterion("auther =", value, "auther");
            return (Criteria) this;
        }

        public Criteria andAutherNotEqualTo(String value) {
            addCriterion("auther <>", value, "auther");
            return (Criteria) this;
        }

        public Criteria andAutherGreaterThan(String value) {
            addCriterion("auther >", value, "auther");
            return (Criteria) this;
        }

        public Criteria andAutherGreaterThanOrEqualTo(String value) {
            addCriterion("auther >=", value, "auther");
            return (Criteria) this;
        }

        public Criteria andAutherLessThan(String value) {
            addCriterion("auther <", value, "auther");
            return (Criteria) this;
        }

        public Criteria andAutherLessThanOrEqualTo(String value) {
            addCriterion("auther <=", value, "auther");
            return (Criteria) this;
        }

        public Criteria andAutherLike(String value) {
            addCriterion("auther like", value, "auther");
            return (Criteria) this;
        }

        public Criteria andAutherNotLike(String value) {
            addCriterion("auther not like", value, "auther");
            return (Criteria) this;
        }

        public Criteria andAutherIn(List<String> values) {
            addCriterion("auther in", values, "auther");
            return (Criteria) this;
        }

        public Criteria andAutherNotIn(List<String> values) {
            addCriterion("auther not in", values, "auther");
            return (Criteria) this;
        }

        public Criteria andAutherBetween(String value1, String value2) {
            addCriterion("auther between", value1, value2, "auther");
            return (Criteria) this;
        }

        public Criteria andAutherNotBetween(String value1, String value2) {
            addCriterion("auther not between", value1, value2, "auther");
            return (Criteria) this;
        }

        public Criteria andLinkurlIsNull() {
            addCriterion("linkurl is null");
            return (Criteria) this;
        }

        public Criteria andLinkurlIsNotNull() {
            addCriterion("linkurl is not null");
            return (Criteria) this;
        }

        public Criteria andLinkurlEqualTo(String value) {
            addCriterion("linkurl =", value, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlNotEqualTo(String value) {
            addCriterion("linkurl <>", value, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlGreaterThan(String value) {
            addCriterion("linkurl >", value, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlGreaterThanOrEqualTo(String value) {
            addCriterion("linkurl >=", value, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlLessThan(String value) {
            addCriterion("linkurl <", value, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlLessThanOrEqualTo(String value) {
            addCriterion("linkurl <=", value, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlLike(String value) {
            addCriterion("linkurl like", value, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlNotLike(String value) {
            addCriterion("linkurl not like", value, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlIn(List<String> values) {
            addCriterion("linkurl in", values, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlNotIn(List<String> values) {
            addCriterion("linkurl not in", values, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlBetween(String value1, String value2) {
            addCriterion("linkurl between", value1, value2, "linkurl");
            return (Criteria) this;
        }

        public Criteria andLinkurlNotBetween(String value1, String value2) {
            addCriterion("linkurl not between", value1, value2, "linkurl");
            return (Criteria) this;
        }

        public Criteria andCreateatIsNull() {
            addCriterion("createat is null");
            return (Criteria) this;
        }

        public Criteria andCreateatIsNotNull() {
            addCriterion("createat is not null");
            return (Criteria) this;
        }

        public Criteria andCreateatEqualTo(Date value) {
            addCriterion("createat =", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatNotEqualTo(Date value) {
            addCriterion("createat <>", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatGreaterThan(Date value) {
            addCriterion("createat >", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatGreaterThanOrEqualTo(Date value) {
            addCriterion("createat >=", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatLessThan(Date value) {
            addCriterion("createat <", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatLessThanOrEqualTo(Date value) {
            addCriterion("createat <=", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatIn(List<Date> values) {
            addCriterion("createat in", values, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatNotIn(List<Date> values) {
            addCriterion("createat not in", values, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatBetween(Date value1, Date value2) {
            addCriterion("createat between", value1, value2, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatNotBetween(Date value1, Date value2) {
            addCriterion("createat not between", value1, value2, "createat");
            return (Criteria) this;
        }

        public Criteria andModityatIsNull() {
            addCriterion("modityat is null");
            return (Criteria) this;
        }

        public Criteria andModityatIsNotNull() {
            addCriterion("modityat is not null");
            return (Criteria) this;
        }

        public Criteria andModityatEqualTo(Date value) {
            addCriterion("modityat =", value, "modityat");
            return (Criteria) this;
        }

        public Criteria andModityatNotEqualTo(Date value) {
            addCriterion("modityat <>", value, "modityat");
            return (Criteria) this;
        }

        public Criteria andModityatGreaterThan(Date value) {
            addCriterion("modityat >", value, "modityat");
            return (Criteria) this;
        }

        public Criteria andModityatGreaterThanOrEqualTo(Date value) {
            addCriterion("modityat >=", value, "modityat");
            return (Criteria) this;
        }

        public Criteria andModityatLessThan(Date value) {
            addCriterion("modityat <", value, "modityat");
            return (Criteria) this;
        }

        public Criteria andModityatLessThanOrEqualTo(Date value) {
            addCriterion("modityat <=", value, "modityat");
            return (Criteria) this;
        }

        public Criteria andModityatIn(List<Date> values) {
            addCriterion("modityat in", values, "modityat");
            return (Criteria) this;
        }

        public Criteria andModityatNotIn(List<Date> values) {
            addCriterion("modityat not in", values, "modityat");
            return (Criteria) this;
        }

        public Criteria andModityatBetween(Date value1, Date value2) {
            addCriterion("modityat between", value1, value2, "modityat");
            return (Criteria) this;
        }

        public Criteria andModityatNotBetween(Date value1, Date value2) {
            addCriterion("modityat not between", value1, value2, "modityat");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNull() {
            addCriterion("createuser is null");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNotNull() {
            addCriterion("createuser is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuserEqualTo(Long value) {
            addCriterion("createuser =", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotEqualTo(Long value) {
            addCriterion("createuser <>", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThan(Long value) {
            addCriterion("createuser >", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThanOrEqualTo(Long value) {
            addCriterion("createuser >=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThan(Long value) {
            addCriterion("createuser <", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThanOrEqualTo(Long value) {
            addCriterion("createuser <=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserIn(List<Long> values) {
            addCriterion("createuser in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotIn(List<Long> values) {
            addCriterion("createuser not in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserBetween(Long value1, Long value2) {
            addCriterion("createuser between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotBetween(Long value1, Long value2) {
            addCriterion("createuser not between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserIsNull() {
            addCriterion("modifyuser is null");
            return (Criteria) this;
        }

        public Criteria andModifyuserIsNotNull() {
            addCriterion("modifyuser is not null");
            return (Criteria) this;
        }

        public Criteria andModifyuserEqualTo(Long value) {
            addCriterion("modifyuser =", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserNotEqualTo(Long value) {
            addCriterion("modifyuser <>", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserGreaterThan(Long value) {
            addCriterion("modifyuser >", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserGreaterThanOrEqualTo(Long value) {
            addCriterion("modifyuser >=", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserLessThan(Long value) {
            addCriterion("modifyuser <", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserLessThanOrEqualTo(Long value) {
            addCriterion("modifyuser <=", value, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserIn(List<Long> values) {
            addCriterion("modifyuser in", values, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserNotIn(List<Long> values) {
            addCriterion("modifyuser not in", values, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserBetween(Long value1, Long value2) {
            addCriterion("modifyuser between", value1, value2, "modifyuser");
            return (Criteria) this;
        }

        public Criteria andModifyuserNotBetween(Long value1, Long value2) {
            addCriterion("modifyuser not between", value1, value2, "modifyuser");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAttaidIsNull() {
            addCriterion("attaid is null");
            return (Criteria) this;
        }

        public Criteria andAttaidIsNotNull() {
            addCriterion("attaid is not null");
            return (Criteria) this;
        }

        public Criteria andAttaidEqualTo(String value) {
            addCriterion("attaid =", value, "attaid");
            return (Criteria) this;
        }

        public Criteria andAttaidNotEqualTo(String value) {
            addCriterion("attaid <>", value, "attaid");
            return (Criteria) this;
        }

        public Criteria andAttaidGreaterThan(String value) {
            addCriterion("attaid >", value, "attaid");
            return (Criteria) this;
        }

        public Criteria andAttaidGreaterThanOrEqualTo(String value) {
            addCriterion("attaid >=", value, "attaid");
            return (Criteria) this;
        }

        public Criteria andAttaidLessThan(String value) {
            addCriterion("attaid <", value, "attaid");
            return (Criteria) this;
        }

        public Criteria andAttaidLessThanOrEqualTo(String value) {
            addCriterion("attaid <=", value, "attaid");
            return (Criteria) this;
        }

        public Criteria andAttaidLike(String value) {
            addCriterion("attaid like", value, "attaid");
            return (Criteria) this;
        }

        public Criteria andAttaidNotLike(String value) {
            addCriterion("attaid not like", value, "attaid");
            return (Criteria) this;
        }

        public Criteria andAttaidIn(List<String> values) {
            addCriterion("attaid in", values, "attaid");
            return (Criteria) this;
        }

        public Criteria andAttaidNotIn(List<String> values) {
            addCriterion("attaid not in", values, "attaid");
            return (Criteria) this;
        }

        public Criteria andAttaidBetween(String value1, String value2) {
            addCriterion("attaid between", value1, value2, "attaid");
            return (Criteria) this;
        }

        public Criteria andAttaidNotBetween(String value1, String value2) {
            addCriterion("attaid not between", value1, value2, "attaid");
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