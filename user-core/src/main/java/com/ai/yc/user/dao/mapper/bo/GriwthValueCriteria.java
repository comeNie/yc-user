package com.ai.yc.user.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class GriwthValueCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public GriwthValueCriteria() {
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

        public Criteria andRecordIdIsNull() {
            addCriterion("record_id is null");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNotNull() {
            addCriterion("record_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecordIdEqualTo(String value) {
            addCriterion("record_id =", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotEqualTo(String value) {
            addCriterion("record_id <>", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThan(String value) {
            addCriterion("record_id >", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("record_id >=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThan(String value) {
            addCriterion("record_id <", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThanOrEqualTo(String value) {
            addCriterion("record_id <=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLike(String value) {
            addCriterion("record_id like", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotLike(String value) {
            addCriterion("record_id not like", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdIn(List<String> values) {
            addCriterion("record_id in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotIn(List<String> values) {
            addCriterion("record_id not in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdBetween(String value1, String value2) {
            addCriterion("record_id between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotBetween(String value1, String value2) {
            addCriterion("record_id not between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Timestamp value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Timestamp value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Timestamp value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Timestamp value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Timestamp> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Timestamp> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andGriwthValueIsNull() {
            addCriterion("griwth_value is null");
            return (Criteria) this;
        }

        public Criteria andGriwthValueIsNotNull() {
            addCriterion("griwth_value is not null");
            return (Criteria) this;
        }

        public Criteria andGriwthValueEqualTo(Integer value) {
            addCriterion("griwth_value =", value, "griwthValue");
            return (Criteria) this;
        }

        public Criteria andGriwthValueNotEqualTo(Integer value) {
            addCriterion("griwth_value <>", value, "griwthValue");
            return (Criteria) this;
        }

        public Criteria andGriwthValueGreaterThan(Integer value) {
            addCriterion("griwth_value >", value, "griwthValue");
            return (Criteria) this;
        }

        public Criteria andGriwthValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("griwth_value >=", value, "griwthValue");
            return (Criteria) this;
        }

        public Criteria andGriwthValueLessThan(Integer value) {
            addCriterion("griwth_value <", value, "griwthValue");
            return (Criteria) this;
        }

        public Criteria andGriwthValueLessThanOrEqualTo(Integer value) {
            addCriterion("griwth_value <=", value, "griwthValue");
            return (Criteria) this;
        }

        public Criteria andGriwthValueIn(List<Integer> values) {
            addCriterion("griwth_value in", values, "griwthValue");
            return (Criteria) this;
        }

        public Criteria andGriwthValueNotIn(List<Integer> values) {
            addCriterion("griwth_value not in", values, "griwthValue");
            return (Criteria) this;
        }

        public Criteria andGriwthValueBetween(Integer value1, Integer value2) {
            addCriterion("griwth_value between", value1, value2, "griwthValue");
            return (Criteria) this;
        }

        public Criteria andGriwthValueNotBetween(Integer value1, Integer value2) {
            addCriterion("griwth_value not between", value1, value2, "griwthValue");
            return (Criteria) this;
        }

        public Criteria andGriwthResourceIsNull() {
            addCriterion("griwth_resource is null");
            return (Criteria) this;
        }

        public Criteria andGriwthResourceIsNotNull() {
            addCriterion("griwth_resource is not null");
            return (Criteria) this;
        }

        public Criteria andGriwthResourceEqualTo(String value) {
            addCriterion("griwth_resource =", value, "griwthResource");
            return (Criteria) this;
        }

        public Criteria andGriwthResourceNotEqualTo(String value) {
            addCriterion("griwth_resource <>", value, "griwthResource");
            return (Criteria) this;
        }

        public Criteria andGriwthResourceGreaterThan(String value) {
            addCriterion("griwth_resource >", value, "griwthResource");
            return (Criteria) this;
        }

        public Criteria andGriwthResourceGreaterThanOrEqualTo(String value) {
            addCriterion("griwth_resource >=", value, "griwthResource");
            return (Criteria) this;
        }

        public Criteria andGriwthResourceLessThan(String value) {
            addCriterion("griwth_resource <", value, "griwthResource");
            return (Criteria) this;
        }

        public Criteria andGriwthResourceLessThanOrEqualTo(String value) {
            addCriterion("griwth_resource <=", value, "griwthResource");
            return (Criteria) this;
        }

        public Criteria andGriwthResourceLike(String value) {
            addCriterion("griwth_resource like", value, "griwthResource");
            return (Criteria) this;
        }

        public Criteria andGriwthResourceNotLike(String value) {
            addCriterion("griwth_resource not like", value, "griwthResource");
            return (Criteria) this;
        }

        public Criteria andGriwthResourceIn(List<String> values) {
            addCriterion("griwth_resource in", values, "griwthResource");
            return (Criteria) this;
        }

        public Criteria andGriwthResourceNotIn(List<String> values) {
            addCriterion("griwth_resource not in", values, "griwthResource");
            return (Criteria) this;
        }

        public Criteria andGriwthResourceBetween(String value1, String value2) {
            addCriterion("griwth_resource between", value1, value2, "griwthResource");
            return (Criteria) this;
        }

        public Criteria andGriwthResourceNotBetween(String value1, String value2) {
            addCriterion("griwth_resource not between", value1, value2, "griwthResource");
            return (Criteria) this;
        }

        public Criteria andResourceDetailIsNull() {
            addCriterion("resource_detail is null");
            return (Criteria) this;
        }

        public Criteria andResourceDetailIsNotNull() {
            addCriterion("resource_detail is not null");
            return (Criteria) this;
        }

        public Criteria andResourceDetailEqualTo(String value) {
            addCriterion("resource_detail =", value, "resourceDetail");
            return (Criteria) this;
        }

        public Criteria andResourceDetailNotEqualTo(String value) {
            addCriterion("resource_detail <>", value, "resourceDetail");
            return (Criteria) this;
        }

        public Criteria andResourceDetailGreaterThan(String value) {
            addCriterion("resource_detail >", value, "resourceDetail");
            return (Criteria) this;
        }

        public Criteria andResourceDetailGreaterThanOrEqualTo(String value) {
            addCriterion("resource_detail >=", value, "resourceDetail");
            return (Criteria) this;
        }

        public Criteria andResourceDetailLessThan(String value) {
            addCriterion("resource_detail <", value, "resourceDetail");
            return (Criteria) this;
        }

        public Criteria andResourceDetailLessThanOrEqualTo(String value) {
            addCriterion("resource_detail <=", value, "resourceDetail");
            return (Criteria) this;
        }

        public Criteria andResourceDetailLike(String value) {
            addCriterion("resource_detail like", value, "resourceDetail");
            return (Criteria) this;
        }

        public Criteria andResourceDetailNotLike(String value) {
            addCriterion("resource_detail not like", value, "resourceDetail");
            return (Criteria) this;
        }

        public Criteria andResourceDetailIn(List<String> values) {
            addCriterion("resource_detail in", values, "resourceDetail");
            return (Criteria) this;
        }

        public Criteria andResourceDetailNotIn(List<String> values) {
            addCriterion("resource_detail not in", values, "resourceDetail");
            return (Criteria) this;
        }

        public Criteria andResourceDetailBetween(String value1, String value2) {
            addCriterion("resource_detail between", value1, value2, "resourceDetail");
            return (Criteria) this;
        }

        public Criteria andResourceDetailNotBetween(String value1, String value2) {
            addCriterion("resource_detail not between", value1, value2, "resourceDetail");
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