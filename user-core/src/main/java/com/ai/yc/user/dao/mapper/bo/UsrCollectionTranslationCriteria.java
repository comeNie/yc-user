package com.ai.yc.user.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class UsrCollectionTranslationCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public UsrCollectionTranslationCriteria() {
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

        public Criteria andCollectionIdIsNull() {
            addCriterion("collection_id is null");
            return (Criteria) this;
        }

        public Criteria andCollectionIdIsNotNull() {
            addCriterion("collection_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionIdEqualTo(String value) {
            addCriterion("collection_id =", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotEqualTo(String value) {
            addCriterion("collection_id <>", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdGreaterThan(String value) {
            addCriterion("collection_id >", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdGreaterThanOrEqualTo(String value) {
            addCriterion("collection_id >=", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdLessThan(String value) {
            addCriterion("collection_id <", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdLessThanOrEqualTo(String value) {
            addCriterion("collection_id <=", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdLike(String value) {
            addCriterion("collection_id like", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotLike(String value) {
            addCriterion("collection_id not like", value, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdIn(List<String> values) {
            addCriterion("collection_id in", values, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotIn(List<String> values) {
            addCriterion("collection_id not in", values, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdBetween(String value1, String value2) {
            addCriterion("collection_id between", value1, value2, "collectionId");
            return (Criteria) this;
        }

        public Criteria andCollectionIdNotBetween(String value1, String value2) {
            addCriterion("collection_id not between", value1, value2, "collectionId");
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

        public Criteria andOriginalIsNull() {
            addCriterion("original is null");
            return (Criteria) this;
        }

        public Criteria andOriginalIsNotNull() {
            addCriterion("original is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalEqualTo(String value) {
            addCriterion("original =", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalNotEqualTo(String value) {
            addCriterion("original <>", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalGreaterThan(String value) {
            addCriterion("original >", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalGreaterThanOrEqualTo(String value) {
            addCriterion("original >=", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalLessThan(String value) {
            addCriterion("original <", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalLessThanOrEqualTo(String value) {
            addCriterion("original <=", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalLike(String value) {
            addCriterion("original like", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalNotLike(String value) {
            addCriterion("original not like", value, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalIn(List<String> values) {
            addCriterion("original in", values, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalNotIn(List<String> values) {
            addCriterion("original not in", values, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalBetween(String value1, String value2) {
            addCriterion("original between", value1, value2, "original");
            return (Criteria) this;
        }

        public Criteria andOriginalNotBetween(String value1, String value2) {
            addCriterion("original not between", value1, value2, "original");
            return (Criteria) this;
        }

        public Criteria andTranslationIsNull() {
            addCriterion("translation is null");
            return (Criteria) this;
        }

        public Criteria andTranslationIsNotNull() {
            addCriterion("translation is not null");
            return (Criteria) this;
        }

        public Criteria andTranslationEqualTo(String value) {
            addCriterion("translation =", value, "translation");
            return (Criteria) this;
        }

        public Criteria andTranslationNotEqualTo(String value) {
            addCriterion("translation <>", value, "translation");
            return (Criteria) this;
        }

        public Criteria andTranslationGreaterThan(String value) {
            addCriterion("translation >", value, "translation");
            return (Criteria) this;
        }

        public Criteria andTranslationGreaterThanOrEqualTo(String value) {
            addCriterion("translation >=", value, "translation");
            return (Criteria) this;
        }

        public Criteria andTranslationLessThan(String value) {
            addCriterion("translation <", value, "translation");
            return (Criteria) this;
        }

        public Criteria andTranslationLessThanOrEqualTo(String value) {
            addCriterion("translation <=", value, "translation");
            return (Criteria) this;
        }

        public Criteria andTranslationLike(String value) {
            addCriterion("translation like", value, "translation");
            return (Criteria) this;
        }

        public Criteria andTranslationNotLike(String value) {
            addCriterion("translation not like", value, "translation");
            return (Criteria) this;
        }

        public Criteria andTranslationIn(List<String> values) {
            addCriterion("translation in", values, "translation");
            return (Criteria) this;
        }

        public Criteria andTranslationNotIn(List<String> values) {
            addCriterion("translation not in", values, "translation");
            return (Criteria) this;
        }

        public Criteria andTranslationBetween(String value1, String value2) {
            addCriterion("translation between", value1, value2, "translation");
            return (Criteria) this;
        }

        public Criteria andTranslationNotBetween(String value1, String value2) {
            addCriterion("translation not between", value1, value2, "translation");
            return (Criteria) this;
        }

        public Criteria andCollectTimeIsNull() {
            addCriterion("collect_time is null");
            return (Criteria) this;
        }

        public Criteria andCollectTimeIsNotNull() {
            addCriterion("collect_time is not null");
            return (Criteria) this;
        }

        public Criteria andCollectTimeEqualTo(Timestamp value) {
            addCriterion("collect_time =", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeNotEqualTo(Timestamp value) {
            addCriterion("collect_time <>", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeGreaterThan(Timestamp value) {
            addCriterion("collect_time >", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("collect_time >=", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeLessThan(Timestamp value) {
            addCriterion("collect_time <", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("collect_time <=", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeIn(List<Timestamp> values) {
            addCriterion("collect_time in", values, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeNotIn(List<Timestamp> values) {
            addCriterion("collect_time not in", values, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("collect_time between", value1, value2, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("collect_time not between", value1, value2, "collectTime");
            return (Criteria) this;
        }

        public Criteria andSourceLanguageIsNull() {
            addCriterion("source_language is null");
            return (Criteria) this;
        }

        public Criteria andSourceLanguageIsNotNull() {
            addCriterion("source_language is not null");
            return (Criteria) this;
        }

        public Criteria andSourceLanguageEqualTo(String value) {
            addCriterion("source_language =", value, "sourceLanguage");
            return (Criteria) this;
        }

        public Criteria andSourceLanguageNotEqualTo(String value) {
            addCriterion("source_language <>", value, "sourceLanguage");
            return (Criteria) this;
        }

        public Criteria andSourceLanguageGreaterThan(String value) {
            addCriterion("source_language >", value, "sourceLanguage");
            return (Criteria) this;
        }

        public Criteria andSourceLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("source_language >=", value, "sourceLanguage");
            return (Criteria) this;
        }

        public Criteria andSourceLanguageLessThan(String value) {
            addCriterion("source_language <", value, "sourceLanguage");
            return (Criteria) this;
        }

        public Criteria andSourceLanguageLessThanOrEqualTo(String value) {
            addCriterion("source_language <=", value, "sourceLanguage");
            return (Criteria) this;
        }

        public Criteria andSourceLanguageLike(String value) {
            addCriterion("source_language like", value, "sourceLanguage");
            return (Criteria) this;
        }

        public Criteria andSourceLanguageNotLike(String value) {
            addCriterion("source_language not like", value, "sourceLanguage");
            return (Criteria) this;
        }

        public Criteria andSourceLanguageIn(List<String> values) {
            addCriterion("source_language in", values, "sourceLanguage");
            return (Criteria) this;
        }

        public Criteria andSourceLanguageNotIn(List<String> values) {
            addCriterion("source_language not in", values, "sourceLanguage");
            return (Criteria) this;
        }

        public Criteria andSourceLanguageBetween(String value1, String value2) {
            addCriterion("source_language between", value1, value2, "sourceLanguage");
            return (Criteria) this;
        }

        public Criteria andSourceLanguageNotBetween(String value1, String value2) {
            addCriterion("source_language not between", value1, value2, "sourceLanguage");
            return (Criteria) this;
        }

        public Criteria andTargetLanguageIsNull() {
            addCriterion("target_language is null");
            return (Criteria) this;
        }

        public Criteria andTargetLanguageIsNotNull() {
            addCriterion("target_language is not null");
            return (Criteria) this;
        }

        public Criteria andTargetLanguageEqualTo(String value) {
            addCriterion("target_language =", value, "targetLanguage");
            return (Criteria) this;
        }

        public Criteria andTargetLanguageNotEqualTo(String value) {
            addCriterion("target_language <>", value, "targetLanguage");
            return (Criteria) this;
        }

        public Criteria andTargetLanguageGreaterThan(String value) {
            addCriterion("target_language >", value, "targetLanguage");
            return (Criteria) this;
        }

        public Criteria andTargetLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("target_language >=", value, "targetLanguage");
            return (Criteria) this;
        }

        public Criteria andTargetLanguageLessThan(String value) {
            addCriterion("target_language <", value, "targetLanguage");
            return (Criteria) this;
        }

        public Criteria andTargetLanguageLessThanOrEqualTo(String value) {
            addCriterion("target_language <=", value, "targetLanguage");
            return (Criteria) this;
        }

        public Criteria andTargetLanguageLike(String value) {
            addCriterion("target_language like", value, "targetLanguage");
            return (Criteria) this;
        }

        public Criteria andTargetLanguageNotLike(String value) {
            addCriterion("target_language not like", value, "targetLanguage");
            return (Criteria) this;
        }

        public Criteria andTargetLanguageIn(List<String> values) {
            addCriterion("target_language in", values, "targetLanguage");
            return (Criteria) this;
        }

        public Criteria andTargetLanguageNotIn(List<String> values) {
            addCriterion("target_language not in", values, "targetLanguage");
            return (Criteria) this;
        }

        public Criteria andTargetLanguageBetween(String value1, String value2) {
            addCriterion("target_language between", value1, value2, "targetLanguage");
            return (Criteria) this;
        }

        public Criteria andTargetLanguageNotBetween(String value1, String value2) {
            addCriterion("target_language not between", value1, value2, "targetLanguage");
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