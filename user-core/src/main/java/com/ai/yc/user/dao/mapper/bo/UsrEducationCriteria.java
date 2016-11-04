package com.ai.yc.user.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class UsrEducationCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public UsrEducationCriteria() {
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

        public Criteria andEducationIdIsNull() {
            addCriterion("EDUCATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andEducationIdIsNotNull() {
            addCriterion("EDUCATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEducationIdEqualTo(Long value) {
            addCriterion("EDUCATION_ID =", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdNotEqualTo(Long value) {
            addCriterion("EDUCATION_ID <>", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdGreaterThan(Long value) {
            addCriterion("EDUCATION_ID >", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("EDUCATION_ID >=", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdLessThan(Long value) {
            addCriterion("EDUCATION_ID <", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdLessThanOrEqualTo(Long value) {
            addCriterion("EDUCATION_ID <=", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdIn(List<Long> values) {
            addCriterion("EDUCATION_ID in", values, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdNotIn(List<Long> values) {
            addCriterion("EDUCATION_ID not in", values, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdBetween(Long value1, Long value2) {
            addCriterion("EDUCATION_ID between", value1, value2, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdNotBetween(Long value1, Long value2) {
            addCriterion("EDUCATION_ID not between", value1, value2, "educationId");
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

        public Criteria andSchoolIsNull() {
            addCriterion("SCHOOL is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("SCHOOL is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("SCHOOL =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("SCHOOL <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("SCHOOL >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOL >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("SCHOOL <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("SCHOOL <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("SCHOOL like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("SCHOOL not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("SCHOOL in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("SCHOOL not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("SCHOOL between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("SCHOOL not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andProfessionIsNull() {
            addCriterion("PROFESSION is null");
            return (Criteria) this;
        }

        public Criteria andProfessionIsNotNull() {
            addCriterion("PROFESSION is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionEqualTo(String value) {
            addCriterion("PROFESSION =", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotEqualTo(String value) {
            addCriterion("PROFESSION <>", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionGreaterThan(String value) {
            addCriterion("PROFESSION >", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionGreaterThanOrEqualTo(String value) {
            addCriterion("PROFESSION >=", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLessThan(String value) {
            addCriterion("PROFESSION <", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLessThanOrEqualTo(String value) {
            addCriterion("PROFESSION <=", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLike(String value) {
            addCriterion("PROFESSION like", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotLike(String value) {
            addCriterion("PROFESSION not like", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionIn(List<String> values) {
            addCriterion("PROFESSION in", values, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotIn(List<String> values) {
            addCriterion("PROFESSION not in", values, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionBetween(String value1, String value2) {
            addCriterion("PROFESSION between", value1, value2, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotBetween(String value1, String value2) {
            addCriterion("PROFESSION not between", value1, value2, "profession");
            return (Criteria) this;
        }

        public Criteria andStudyStartTimeIsNull() {
            addCriterion("STUDY_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStudyStartTimeIsNotNull() {
            addCriterion("STUDY_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStudyStartTimeEqualTo(String value) {
            addCriterion("STUDY_START_TIME =", value, "studyStartTime");
            return (Criteria) this;
        }

        public Criteria andStudyStartTimeNotEqualTo(String value) {
            addCriterion("STUDY_START_TIME <>", value, "studyStartTime");
            return (Criteria) this;
        }

        public Criteria andStudyStartTimeGreaterThan(String value) {
            addCriterion("STUDY_START_TIME >", value, "studyStartTime");
            return (Criteria) this;
        }

        public Criteria andStudyStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("STUDY_START_TIME >=", value, "studyStartTime");
            return (Criteria) this;
        }

        public Criteria andStudyStartTimeLessThan(String value) {
            addCriterion("STUDY_START_TIME <", value, "studyStartTime");
            return (Criteria) this;
        }

        public Criteria andStudyStartTimeLessThanOrEqualTo(String value) {
            addCriterion("STUDY_START_TIME <=", value, "studyStartTime");
            return (Criteria) this;
        }

        public Criteria andStudyStartTimeLike(String value) {
            addCriterion("STUDY_START_TIME like", value, "studyStartTime");
            return (Criteria) this;
        }

        public Criteria andStudyStartTimeNotLike(String value) {
            addCriterion("STUDY_START_TIME not like", value, "studyStartTime");
            return (Criteria) this;
        }

        public Criteria andStudyStartTimeIn(List<String> values) {
            addCriterion("STUDY_START_TIME in", values, "studyStartTime");
            return (Criteria) this;
        }

        public Criteria andStudyStartTimeNotIn(List<String> values) {
            addCriterion("STUDY_START_TIME not in", values, "studyStartTime");
            return (Criteria) this;
        }

        public Criteria andStudyStartTimeBetween(String value1, String value2) {
            addCriterion("STUDY_START_TIME between", value1, value2, "studyStartTime");
            return (Criteria) this;
        }

        public Criteria andStudyStartTimeNotBetween(String value1, String value2) {
            addCriterion("STUDY_START_TIME not between", value1, value2, "studyStartTime");
            return (Criteria) this;
        }

        public Criteria andStudyEndTimeIsNull() {
            addCriterion("STUDY_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStudyEndTimeIsNotNull() {
            addCriterion("STUDY_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStudyEndTimeEqualTo(String value) {
            addCriterion("STUDY_END_TIME =", value, "studyEndTime");
            return (Criteria) this;
        }

        public Criteria andStudyEndTimeNotEqualTo(String value) {
            addCriterion("STUDY_END_TIME <>", value, "studyEndTime");
            return (Criteria) this;
        }

        public Criteria andStudyEndTimeGreaterThan(String value) {
            addCriterion("STUDY_END_TIME >", value, "studyEndTime");
            return (Criteria) this;
        }

        public Criteria andStudyEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("STUDY_END_TIME >=", value, "studyEndTime");
            return (Criteria) this;
        }

        public Criteria andStudyEndTimeLessThan(String value) {
            addCriterion("STUDY_END_TIME <", value, "studyEndTime");
            return (Criteria) this;
        }

        public Criteria andStudyEndTimeLessThanOrEqualTo(String value) {
            addCriterion("STUDY_END_TIME <=", value, "studyEndTime");
            return (Criteria) this;
        }

        public Criteria andStudyEndTimeLike(String value) {
            addCriterion("STUDY_END_TIME like", value, "studyEndTime");
            return (Criteria) this;
        }

        public Criteria andStudyEndTimeNotLike(String value) {
            addCriterion("STUDY_END_TIME not like", value, "studyEndTime");
            return (Criteria) this;
        }

        public Criteria andStudyEndTimeIn(List<String> values) {
            addCriterion("STUDY_END_TIME in", values, "studyEndTime");
            return (Criteria) this;
        }

        public Criteria andStudyEndTimeNotIn(List<String> values) {
            addCriterion("STUDY_END_TIME not in", values, "studyEndTime");
            return (Criteria) this;
        }

        public Criteria andStudyEndTimeBetween(String value1, String value2) {
            addCriterion("STUDY_END_TIME between", value1, value2, "studyEndTime");
            return (Criteria) this;
        }

        public Criteria andStudyEndTimeNotBetween(String value1, String value2) {
            addCriterion("STUDY_END_TIME not between", value1, value2, "studyEndTime");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundIsNull() {
            addCriterion("EDU_BACKGROUND is null");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundIsNotNull() {
            addCriterion("EDU_BACKGROUND is not null");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundEqualTo(String value) {
            addCriterion("EDU_BACKGROUND =", value, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundNotEqualTo(String value) {
            addCriterion("EDU_BACKGROUND <>", value, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundGreaterThan(String value) {
            addCriterion("EDU_BACKGROUND >", value, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundGreaterThanOrEqualTo(String value) {
            addCriterion("EDU_BACKGROUND >=", value, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundLessThan(String value) {
            addCriterion("EDU_BACKGROUND <", value, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundLessThanOrEqualTo(String value) {
            addCriterion("EDU_BACKGROUND <=", value, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundLike(String value) {
            addCriterion("EDU_BACKGROUND like", value, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundNotLike(String value) {
            addCriterion("EDU_BACKGROUND not like", value, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundIn(List<String> values) {
            addCriterion("EDU_BACKGROUND in", values, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundNotIn(List<String> values) {
            addCriterion("EDU_BACKGROUND not in", values, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundBetween(String value1, String value2) {
            addCriterion("EDU_BACKGROUND between", value1, value2, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andEduBackgroundNotBetween(String value1, String value2) {
            addCriterion("EDU_BACKGROUND not between", value1, value2, "eduBackground");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("COUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("COUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("COUNTRY =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("COUNTRY <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("COUNTRY >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRY >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("COUNTRY <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("COUNTRY <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("COUNTRY like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("COUNTRY not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("COUNTRY in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("COUNTRY not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("COUNTRY between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("COUNTRY not between", value1, value2, "country");
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