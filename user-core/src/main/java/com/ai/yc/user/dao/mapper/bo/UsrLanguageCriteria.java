package com.ai.yc.user.dao.mapper.bo;

import java.util.ArrayList;
import java.util.List;

public class UsrLanguageCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public UsrLanguageCriteria() {
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

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
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

        public Criteria andTranslatorIdIsNull() {
            addCriterion("TRANSLATOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andTranslatorIdIsNotNull() {
            addCriterion("TRANSLATOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTranslatorIdEqualTo(String value) {
            addCriterion("TRANSLATOR_ID =", value, "translatorId");
            return (Criteria) this;
        }

        public Criteria andTranslatorIdNotEqualTo(String value) {
            addCriterion("TRANSLATOR_ID <>", value, "translatorId");
            return (Criteria) this;
        }

        public Criteria andTranslatorIdGreaterThan(String value) {
            addCriterion("TRANSLATOR_ID >", value, "translatorId");
            return (Criteria) this;
        }

        public Criteria andTranslatorIdGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSLATOR_ID >=", value, "translatorId");
            return (Criteria) this;
        }

        public Criteria andTranslatorIdLessThan(String value) {
            addCriterion("TRANSLATOR_ID <", value, "translatorId");
            return (Criteria) this;
        }

        public Criteria andTranslatorIdLessThanOrEqualTo(String value) {
            addCriterion("TRANSLATOR_ID <=", value, "translatorId");
            return (Criteria) this;
        }

        public Criteria andTranslatorIdLike(String value) {
            addCriterion("TRANSLATOR_ID like", value, "translatorId");
            return (Criteria) this;
        }

        public Criteria andTranslatorIdNotLike(String value) {
            addCriterion("TRANSLATOR_ID not like", value, "translatorId");
            return (Criteria) this;
        }

        public Criteria andTranslatorIdIn(List<String> values) {
            addCriterion("TRANSLATOR_ID in", values, "translatorId");
            return (Criteria) this;
        }

        public Criteria andTranslatorIdNotIn(List<String> values) {
            addCriterion("TRANSLATOR_ID not in", values, "translatorId");
            return (Criteria) this;
        }

        public Criteria andTranslatorIdBetween(String value1, String value2) {
            addCriterion("TRANSLATOR_ID between", value1, value2, "translatorId");
            return (Criteria) this;
        }

        public Criteria andTranslatorIdNotBetween(String value1, String value2) {
            addCriterion("TRANSLATOR_ID not between", value1, value2, "translatorId");
            return (Criteria) this;
        }

        public Criteria andExtendIdIsNull() {
            addCriterion("EXTEND_ID is null");
            return (Criteria) this;
        }

        public Criteria andExtendIdIsNotNull() {
            addCriterion("EXTEND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExtendIdEqualTo(String value) {
            addCriterion("EXTEND_ID =", value, "extendId");
            return (Criteria) this;
        }

        public Criteria andExtendIdNotEqualTo(String value) {
            addCriterion("EXTEND_ID <>", value, "extendId");
            return (Criteria) this;
        }

        public Criteria andExtendIdGreaterThan(String value) {
            addCriterion("EXTEND_ID >", value, "extendId");
            return (Criteria) this;
        }

        public Criteria andExtendIdGreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND_ID >=", value, "extendId");
            return (Criteria) this;
        }

        public Criteria andExtendIdLessThan(String value) {
            addCriterion("EXTEND_ID <", value, "extendId");
            return (Criteria) this;
        }

        public Criteria andExtendIdLessThanOrEqualTo(String value) {
            addCriterion("EXTEND_ID <=", value, "extendId");
            return (Criteria) this;
        }

        public Criteria andExtendIdLike(String value) {
            addCriterion("EXTEND_ID like", value, "extendId");
            return (Criteria) this;
        }

        public Criteria andExtendIdNotLike(String value) {
            addCriterion("EXTEND_ID not like", value, "extendId");
            return (Criteria) this;
        }

        public Criteria andExtendIdIn(List<String> values) {
            addCriterion("EXTEND_ID in", values, "extendId");
            return (Criteria) this;
        }

        public Criteria andExtendIdNotIn(List<String> values) {
            addCriterion("EXTEND_ID not in", values, "extendId");
            return (Criteria) this;
        }

        public Criteria andExtendIdBetween(String value1, String value2) {
            addCriterion("EXTEND_ID between", value1, value2, "extendId");
            return (Criteria) this;
        }

        public Criteria andExtendIdNotBetween(String value1, String value2) {
            addCriterion("EXTEND_ID not between", value1, value2, "extendId");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("USER_TYPE =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("USER_TYPE <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("USER_TYPE >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_TYPE >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("USER_TYPE <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("USER_TYPE <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("USER_TYPE like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("USER_TYPE not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("USER_TYPE in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("USER_TYPE not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("USER_TYPE between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("USER_TYPE not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andReferencePriceIsNull() {
            addCriterion("REFERENCE_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andReferencePriceIsNotNull() {
            addCriterion("REFERENCE_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andReferencePriceEqualTo(Integer value) {
            addCriterion("REFERENCE_PRICE =", value, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceNotEqualTo(Integer value) {
            addCriterion("REFERENCE_PRICE <>", value, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceGreaterThan(Integer value) {
            addCriterion("REFERENCE_PRICE >", value, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("REFERENCE_PRICE >=", value, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceLessThan(Integer value) {
            addCriterion("REFERENCE_PRICE <", value, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceLessThanOrEqualTo(Integer value) {
            addCriterion("REFERENCE_PRICE <=", value, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceIn(List<Integer> values) {
            addCriterion("REFERENCE_PRICE in", values, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceNotIn(List<Integer> values) {
            addCriterion("REFERENCE_PRICE not in", values, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceBetween(Integer value1, Integer value2) {
            addCriterion("REFERENCE_PRICE between", value1, value2, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceNotBetween(Integer value1, Integer value2) {
            addCriterion("REFERENCE_PRICE not between", value1, value2, "referencePrice");
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