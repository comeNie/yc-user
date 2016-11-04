package com.ai.yc.user.dao.mapper.bo;

import java.util.ArrayList;
import java.util.List;

public class UsrCustFileExtCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public UsrCustFileExtCriteria() {
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

        public Criteria andInfoExtIdIsNull() {
            addCriterion("INFO_EXT_ID is null");
            return (Criteria) this;
        }

        public Criteria andInfoExtIdIsNotNull() {
            addCriterion("INFO_EXT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInfoExtIdEqualTo(String value) {
            addCriterion("INFO_EXT_ID =", value, "infoExtId");
            return (Criteria) this;
        }

        public Criteria andInfoExtIdNotEqualTo(String value) {
            addCriterion("INFO_EXT_ID <>", value, "infoExtId");
            return (Criteria) this;
        }

        public Criteria andInfoExtIdGreaterThan(String value) {
            addCriterion("INFO_EXT_ID >", value, "infoExtId");
            return (Criteria) this;
        }

        public Criteria andInfoExtIdGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_EXT_ID >=", value, "infoExtId");
            return (Criteria) this;
        }

        public Criteria andInfoExtIdLessThan(String value) {
            addCriterion("INFO_EXT_ID <", value, "infoExtId");
            return (Criteria) this;
        }

        public Criteria andInfoExtIdLessThanOrEqualTo(String value) {
            addCriterion("INFO_EXT_ID <=", value, "infoExtId");
            return (Criteria) this;
        }

        public Criteria andInfoExtIdLike(String value) {
            addCriterion("INFO_EXT_ID like", value, "infoExtId");
            return (Criteria) this;
        }

        public Criteria andInfoExtIdNotLike(String value) {
            addCriterion("INFO_EXT_ID not like", value, "infoExtId");
            return (Criteria) this;
        }

        public Criteria andInfoExtIdIn(List<String> values) {
            addCriterion("INFO_EXT_ID in", values, "infoExtId");
            return (Criteria) this;
        }

        public Criteria andInfoExtIdNotIn(List<String> values) {
            addCriterion("INFO_EXT_ID not in", values, "infoExtId");
            return (Criteria) this;
        }

        public Criteria andInfoExtIdBetween(String value1, String value2) {
            addCriterion("INFO_EXT_ID between", value1, value2, "infoExtId");
            return (Criteria) this;
        }

        public Criteria andInfoExtIdNotBetween(String value1, String value2) {
            addCriterion("INFO_EXT_ID not between", value1, value2, "infoExtId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andInfoTypeIsNull() {
            addCriterion("INFO_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andInfoTypeIsNotNull() {
            addCriterion("INFO_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInfoTypeEqualTo(String value) {
            addCriterion("INFO_TYPE =", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeNotEqualTo(String value) {
            addCriterion("INFO_TYPE <>", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeGreaterThan(String value) {
            addCriterion("INFO_TYPE >", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_TYPE >=", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeLessThan(String value) {
            addCriterion("INFO_TYPE <", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeLessThanOrEqualTo(String value) {
            addCriterion("INFO_TYPE <=", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeLike(String value) {
            addCriterion("INFO_TYPE like", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeNotLike(String value) {
            addCriterion("INFO_TYPE not like", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeIn(List<String> values) {
            addCriterion("INFO_TYPE in", values, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeNotIn(List<String> values) {
            addCriterion("INFO_TYPE not in", values, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeBetween(String value1, String value2) {
            addCriterion("INFO_TYPE between", value1, value2, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeNotBetween(String value1, String value2) {
            addCriterion("INFO_TYPE not between", value1, value2, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoItemIsNull() {
            addCriterion("INFO_ITEM is null");
            return (Criteria) this;
        }

        public Criteria andInfoItemIsNotNull() {
            addCriterion("INFO_ITEM is not null");
            return (Criteria) this;
        }

        public Criteria andInfoItemEqualTo(String value) {
            addCriterion("INFO_ITEM =", value, "infoItem");
            return (Criteria) this;
        }

        public Criteria andInfoItemNotEqualTo(String value) {
            addCriterion("INFO_ITEM <>", value, "infoItem");
            return (Criteria) this;
        }

        public Criteria andInfoItemGreaterThan(String value) {
            addCriterion("INFO_ITEM >", value, "infoItem");
            return (Criteria) this;
        }

        public Criteria andInfoItemGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_ITEM >=", value, "infoItem");
            return (Criteria) this;
        }

        public Criteria andInfoItemLessThan(String value) {
            addCriterion("INFO_ITEM <", value, "infoItem");
            return (Criteria) this;
        }

        public Criteria andInfoItemLessThanOrEqualTo(String value) {
            addCriterion("INFO_ITEM <=", value, "infoItem");
            return (Criteria) this;
        }

        public Criteria andInfoItemLike(String value) {
            addCriterion("INFO_ITEM like", value, "infoItem");
            return (Criteria) this;
        }

        public Criteria andInfoItemNotLike(String value) {
            addCriterion("INFO_ITEM not like", value, "infoItem");
            return (Criteria) this;
        }

        public Criteria andInfoItemIn(List<String> values) {
            addCriterion("INFO_ITEM in", values, "infoItem");
            return (Criteria) this;
        }

        public Criteria andInfoItemNotIn(List<String> values) {
            addCriterion("INFO_ITEM not in", values, "infoItem");
            return (Criteria) this;
        }

        public Criteria andInfoItemBetween(String value1, String value2) {
            addCriterion("INFO_ITEM between", value1, value2, "infoItem");
            return (Criteria) this;
        }

        public Criteria andInfoItemNotBetween(String value1, String value2) {
            addCriterion("INFO_ITEM not between", value1, value2, "infoItem");
            return (Criteria) this;
        }

        public Criteria andInfoNameIsNull() {
            addCriterion("INFO_NAME is null");
            return (Criteria) this;
        }

        public Criteria andInfoNameIsNotNull() {
            addCriterion("INFO_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andInfoNameEqualTo(String value) {
            addCriterion("INFO_NAME =", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameNotEqualTo(String value) {
            addCriterion("INFO_NAME <>", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameGreaterThan(String value) {
            addCriterion("INFO_NAME >", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_NAME >=", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameLessThan(String value) {
            addCriterion("INFO_NAME <", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameLessThanOrEqualTo(String value) {
            addCriterion("INFO_NAME <=", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameLike(String value) {
            addCriterion("INFO_NAME like", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameNotLike(String value) {
            addCriterion("INFO_NAME not like", value, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameIn(List<String> values) {
            addCriterion("INFO_NAME in", values, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameNotIn(List<String> values) {
            addCriterion("INFO_NAME not in", values, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameBetween(String value1, String value2) {
            addCriterion("INFO_NAME between", value1, value2, "infoName");
            return (Criteria) this;
        }

        public Criteria andInfoNameNotBetween(String value1, String value2) {
            addCriterion("INFO_NAME not between", value1, value2, "infoName");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andAttrIdIsNull() {
            addCriterion("ATTR_ID is null");
            return (Criteria) this;
        }

        public Criteria andAttrIdIsNotNull() {
            addCriterion("ATTR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAttrIdEqualTo(String value) {
            addCriterion("ATTR_ID =", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotEqualTo(String value) {
            addCriterion("ATTR_ID <>", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdGreaterThan(String value) {
            addCriterion("ATTR_ID >", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdGreaterThanOrEqualTo(String value) {
            addCriterion("ATTR_ID >=", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdLessThan(String value) {
            addCriterion("ATTR_ID <", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdLessThanOrEqualTo(String value) {
            addCriterion("ATTR_ID <=", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdLike(String value) {
            addCriterion("ATTR_ID like", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotLike(String value) {
            addCriterion("ATTR_ID not like", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdIn(List<String> values) {
            addCriterion("ATTR_ID in", values, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotIn(List<String> values) {
            addCriterion("ATTR_ID not in", values, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdBetween(String value1, String value2) {
            addCriterion("ATTR_ID between", value1, value2, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotBetween(String value1, String value2) {
            addCriterion("ATTR_ID not between", value1, value2, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrValueIsNull() {
            addCriterion("ATTR_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andAttrValueIsNotNull() {
            addCriterion("ATTR_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andAttrValueEqualTo(String value) {
            addCriterion("ATTR_VALUE =", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueNotEqualTo(String value) {
            addCriterion("ATTR_VALUE <>", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueGreaterThan(String value) {
            addCriterion("ATTR_VALUE >", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueGreaterThanOrEqualTo(String value) {
            addCriterion("ATTR_VALUE >=", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueLessThan(String value) {
            addCriterion("ATTR_VALUE <", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueLessThanOrEqualTo(String value) {
            addCriterion("ATTR_VALUE <=", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueLike(String value) {
            addCriterion("ATTR_VALUE like", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueNotLike(String value) {
            addCriterion("ATTR_VALUE not like", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueIn(List<String> values) {
            addCriterion("ATTR_VALUE in", values, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueNotIn(List<String> values) {
            addCriterion("ATTR_VALUE not in", values, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueBetween(String value1, String value2) {
            addCriterion("ATTR_VALUE between", value1, value2, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueNotBetween(String value1, String value2) {
            addCriterion("ATTR_VALUE not between", value1, value2, "attrValue");
            return (Criteria) this;
        }

        public Criteria andEditStateIsNull() {
            addCriterion("EDIT_STATE is null");
            return (Criteria) this;
        }

        public Criteria andEditStateIsNotNull() {
            addCriterion("EDIT_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andEditStateEqualTo(String value) {
            addCriterion("EDIT_STATE =", value, "editState");
            return (Criteria) this;
        }

        public Criteria andEditStateNotEqualTo(String value) {
            addCriterion("EDIT_STATE <>", value, "editState");
            return (Criteria) this;
        }

        public Criteria andEditStateGreaterThan(String value) {
            addCriterion("EDIT_STATE >", value, "editState");
            return (Criteria) this;
        }

        public Criteria andEditStateGreaterThanOrEqualTo(String value) {
            addCriterion("EDIT_STATE >=", value, "editState");
            return (Criteria) this;
        }

        public Criteria andEditStateLessThan(String value) {
            addCriterion("EDIT_STATE <", value, "editState");
            return (Criteria) this;
        }

        public Criteria andEditStateLessThanOrEqualTo(String value) {
            addCriterion("EDIT_STATE <=", value, "editState");
            return (Criteria) this;
        }

        public Criteria andEditStateLike(String value) {
            addCriterion("EDIT_STATE like", value, "editState");
            return (Criteria) this;
        }

        public Criteria andEditStateNotLike(String value) {
            addCriterion("EDIT_STATE not like", value, "editState");
            return (Criteria) this;
        }

        public Criteria andEditStateIn(List<String> values) {
            addCriterion("EDIT_STATE in", values, "editState");
            return (Criteria) this;
        }

        public Criteria andEditStateNotIn(List<String> values) {
            addCriterion("EDIT_STATE not in", values, "editState");
            return (Criteria) this;
        }

        public Criteria andEditStateBetween(String value1, String value2) {
            addCriterion("EDIT_STATE between", value1, value2, "editState");
            return (Criteria) this;
        }

        public Criteria andEditStateNotBetween(String value1, String value2) {
            addCriterion("EDIT_STATE not between", value1, value2, "editState");
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