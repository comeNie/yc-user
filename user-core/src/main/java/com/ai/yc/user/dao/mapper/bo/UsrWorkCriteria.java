package com.ai.yc.user.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class UsrWorkCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public UsrWorkCriteria() {
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

        public Criteria andWorkIdIsNull() {
            addCriterion("WORK_ID is null");
            return (Criteria) this;
        }

        public Criteria andWorkIdIsNotNull() {
            addCriterion("WORK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWorkIdEqualTo(Long value) {
            addCriterion("WORK_ID =", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdNotEqualTo(Long value) {
            addCriterion("WORK_ID <>", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdGreaterThan(Long value) {
            addCriterion("WORK_ID >", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdGreaterThanOrEqualTo(Long value) {
            addCriterion("WORK_ID >=", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdLessThan(Long value) {
            addCriterion("WORK_ID <", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdLessThanOrEqualTo(Long value) {
            addCriterion("WORK_ID <=", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdIn(List<Long> values) {
            addCriterion("WORK_ID in", values, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdNotIn(List<Long> values) {
            addCriterion("WORK_ID not in", values, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdBetween(Long value1, Long value2) {
            addCriterion("WORK_ID between", value1, value2, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdNotBetween(Long value1, Long value2) {
            addCriterion("WORK_ID not between", value1, value2, "workId");
            return (Criteria) this;
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

        public Criteria andCompanyIsNull() {
            addCriterion("COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("COMPANY =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("COMPANY <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("COMPANY >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("COMPANY <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("COMPANY <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("COMPANY like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("COMPANY not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("COMPANY in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("COMPANY not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("COMPANY between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("COMPANY not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("POSITION is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("POSITION =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("POSITION <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("POSITION >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("POSITION <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("POSITION <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("POSITION like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("POSITION not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("POSITION in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("POSITION not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("POSITION between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("POSITION not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andWorkStartTimeIsNull() {
            addCriterion("WORK_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andWorkStartTimeIsNotNull() {
            addCriterion("WORK_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andWorkStartTimeEqualTo(String value) {
            addCriterion("WORK_START_TIME =", value, "workStartTime");
            return (Criteria) this;
        }

        public Criteria andWorkStartTimeNotEqualTo(String value) {
            addCriterion("WORK_START_TIME <>", value, "workStartTime");
            return (Criteria) this;
        }

        public Criteria andWorkStartTimeGreaterThan(String value) {
            addCriterion("WORK_START_TIME >", value, "workStartTime");
            return (Criteria) this;
        }

        public Criteria andWorkStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_START_TIME >=", value, "workStartTime");
            return (Criteria) this;
        }

        public Criteria andWorkStartTimeLessThan(String value) {
            addCriterion("WORK_START_TIME <", value, "workStartTime");
            return (Criteria) this;
        }

        public Criteria andWorkStartTimeLessThanOrEqualTo(String value) {
            addCriterion("WORK_START_TIME <=", value, "workStartTime");
            return (Criteria) this;
        }

        public Criteria andWorkStartTimeLike(String value) {
            addCriterion("WORK_START_TIME like", value, "workStartTime");
            return (Criteria) this;
        }

        public Criteria andWorkStartTimeNotLike(String value) {
            addCriterion("WORK_START_TIME not like", value, "workStartTime");
            return (Criteria) this;
        }

        public Criteria andWorkStartTimeIn(List<String> values) {
            addCriterion("WORK_START_TIME in", values, "workStartTime");
            return (Criteria) this;
        }

        public Criteria andWorkStartTimeNotIn(List<String> values) {
            addCriterion("WORK_START_TIME not in", values, "workStartTime");
            return (Criteria) this;
        }

        public Criteria andWorkStartTimeBetween(String value1, String value2) {
            addCriterion("WORK_START_TIME between", value1, value2, "workStartTime");
            return (Criteria) this;
        }

        public Criteria andWorkStartTimeNotBetween(String value1, String value2) {
            addCriterion("WORK_START_TIME not between", value1, value2, "workStartTime");
            return (Criteria) this;
        }

        public Criteria andWorkEndTimeIsNull() {
            addCriterion("WORK_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andWorkEndTimeIsNotNull() {
            addCriterion("WORK_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andWorkEndTimeEqualTo(String value) {
            addCriterion("WORK_END_TIME =", value, "workEndTime");
            return (Criteria) this;
        }

        public Criteria andWorkEndTimeNotEqualTo(String value) {
            addCriterion("WORK_END_TIME <>", value, "workEndTime");
            return (Criteria) this;
        }

        public Criteria andWorkEndTimeGreaterThan(String value) {
            addCriterion("WORK_END_TIME >", value, "workEndTime");
            return (Criteria) this;
        }

        public Criteria andWorkEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_END_TIME >=", value, "workEndTime");
            return (Criteria) this;
        }

        public Criteria andWorkEndTimeLessThan(String value) {
            addCriterion("WORK_END_TIME <", value, "workEndTime");
            return (Criteria) this;
        }

        public Criteria andWorkEndTimeLessThanOrEqualTo(String value) {
            addCriterion("WORK_END_TIME <=", value, "workEndTime");
            return (Criteria) this;
        }

        public Criteria andWorkEndTimeLike(String value) {
            addCriterion("WORK_END_TIME like", value, "workEndTime");
            return (Criteria) this;
        }

        public Criteria andWorkEndTimeNotLike(String value) {
            addCriterion("WORK_END_TIME not like", value, "workEndTime");
            return (Criteria) this;
        }

        public Criteria andWorkEndTimeIn(List<String> values) {
            addCriterion("WORK_END_TIME in", values, "workEndTime");
            return (Criteria) this;
        }

        public Criteria andWorkEndTimeNotIn(List<String> values) {
            addCriterion("WORK_END_TIME not in", values, "workEndTime");
            return (Criteria) this;
        }

        public Criteria andWorkEndTimeBetween(String value1, String value2) {
            addCriterion("WORK_END_TIME between", value1, value2, "workEndTime");
            return (Criteria) this;
        }

        public Criteria andWorkEndTimeNotBetween(String value1, String value2) {
            addCriterion("WORK_END_TIME not between", value1, value2, "workEndTime");
            return (Criteria) this;
        }

        public Criteria andWorkSummarizeIsNull() {
            addCriterion("WORK_SUMMARIZE is null");
            return (Criteria) this;
        }

        public Criteria andWorkSummarizeIsNotNull() {
            addCriterion("WORK_SUMMARIZE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkSummarizeEqualTo(String value) {
            addCriterion("WORK_SUMMARIZE =", value, "workSummarize");
            return (Criteria) this;
        }

        public Criteria andWorkSummarizeNotEqualTo(String value) {
            addCriterion("WORK_SUMMARIZE <>", value, "workSummarize");
            return (Criteria) this;
        }

        public Criteria andWorkSummarizeGreaterThan(String value) {
            addCriterion("WORK_SUMMARIZE >", value, "workSummarize");
            return (Criteria) this;
        }

        public Criteria andWorkSummarizeGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_SUMMARIZE >=", value, "workSummarize");
            return (Criteria) this;
        }

        public Criteria andWorkSummarizeLessThan(String value) {
            addCriterion("WORK_SUMMARIZE <", value, "workSummarize");
            return (Criteria) this;
        }

        public Criteria andWorkSummarizeLessThanOrEqualTo(String value) {
            addCriterion("WORK_SUMMARIZE <=", value, "workSummarize");
            return (Criteria) this;
        }

        public Criteria andWorkSummarizeLike(String value) {
            addCriterion("WORK_SUMMARIZE like", value, "workSummarize");
            return (Criteria) this;
        }

        public Criteria andWorkSummarizeNotLike(String value) {
            addCriterion("WORK_SUMMARIZE not like", value, "workSummarize");
            return (Criteria) this;
        }

        public Criteria andWorkSummarizeIn(List<String> values) {
            addCriterion("WORK_SUMMARIZE in", values, "workSummarize");
            return (Criteria) this;
        }

        public Criteria andWorkSummarizeNotIn(List<String> values) {
            addCriterion("WORK_SUMMARIZE not in", values, "workSummarize");
            return (Criteria) this;
        }

        public Criteria andWorkSummarizeBetween(String value1, String value2) {
            addCriterion("WORK_SUMMARIZE between", value1, value2, "workSummarize");
            return (Criteria) this;
        }

        public Criteria andWorkSummarizeNotBetween(String value1, String value2) {
            addCriterion("WORK_SUMMARIZE not between", value1, value2, "workSummarize");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Timestamp value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Timestamp value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Timestamp> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Timestamp> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
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