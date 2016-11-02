package com.ai.yc.user.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class TCertificateCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public TCertificateCriteria() {
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

        public Criteria andCertificateTypeIsNull() {
            addCriterion("CERTIFICATE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIsNotNull() {
            addCriterion("CERTIFICATE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeEqualTo(String value) {
            addCriterion("CERTIFICATE_TYPE =", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotEqualTo(String value) {
            addCriterion("CERTIFICATE_TYPE <>", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThan(String value) {
            addCriterion("CERTIFICATE_TYPE >", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE_TYPE >=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThan(String value) {
            addCriterion("CERTIFICATE_TYPE <", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE_TYPE <=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLike(String value) {
            addCriterion("CERTIFICATE_TYPE like", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotLike(String value) {
            addCriterion("CERTIFICATE_TYPE not like", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIn(List<String> values) {
            addCriterion("CERTIFICATE_TYPE in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotIn(List<String> values) {
            addCriterion("CERTIFICATE_TYPE not in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeBetween(String value1, String value2) {
            addCriterion("CERTIFICATE_TYPE between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATE_TYPE not between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelIsNull() {
            addCriterion("CERTIFICATE_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelIsNotNull() {
            addCriterion("CERTIFICATE_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelEqualTo(Integer value) {
            addCriterion("CERTIFICATE_LEVEL =", value, "certificateLevel");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelNotEqualTo(Integer value) {
            addCriterion("CERTIFICATE_LEVEL <>", value, "certificateLevel");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelGreaterThan(Integer value) {
            addCriterion("CERTIFICATE_LEVEL >", value, "certificateLevel");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("CERTIFICATE_LEVEL >=", value, "certificateLevel");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelLessThan(Integer value) {
            addCriterion("CERTIFICATE_LEVEL <", value, "certificateLevel");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelLessThanOrEqualTo(Integer value) {
            addCriterion("CERTIFICATE_LEVEL <=", value, "certificateLevel");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelIn(List<Integer> values) {
            addCriterion("CERTIFICATE_LEVEL in", values, "certificateLevel");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelNotIn(List<Integer> values) {
            addCriterion("CERTIFICATE_LEVEL not in", values, "certificateLevel");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelBetween(Integer value1, Integer value2) {
            addCriterion("CERTIFICATE_LEVEL between", value1, value2, "certificateLevel");
            return (Criteria) this;
        }

        public Criteria andCertificateLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("CERTIFICATE_LEVEL not between", value1, value2, "certificateLevel");
            return (Criteria) this;
        }

        public Criteria andCertificateNameIsNull() {
            addCriterion("CERTIFICATE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCertificateNameIsNotNull() {
            addCriterion("CERTIFICATE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateNameEqualTo(String value) {
            addCriterion("CERTIFICATE_NAME =", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameNotEqualTo(String value) {
            addCriterion("CERTIFICATE_NAME <>", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameGreaterThan(String value) {
            addCriterion("CERTIFICATE_NAME >", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE_NAME >=", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameLessThan(String value) {
            addCriterion("CERTIFICATE_NAME <", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE_NAME <=", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameLike(String value) {
            addCriterion("CERTIFICATE_NAME like", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameNotLike(String value) {
            addCriterion("CERTIFICATE_NAME not like", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameIn(List<String> values) {
            addCriterion("CERTIFICATE_NAME in", values, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameNotIn(List<String> values) {
            addCriterion("CERTIFICATE_NAME not in", values, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameBetween(String value1, String value2) {
            addCriterion("CERTIFICATE_NAME between", value1, value2, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATE_NAME not between", value1, value2, "certificateName");
            return (Criteria) this;
        }

        public Criteria andGrantingInstitutionIsNull() {
            addCriterion("GRANTING_INSTITUTION is null");
            return (Criteria) this;
        }

        public Criteria andGrantingInstitutionIsNotNull() {
            addCriterion("GRANTING_INSTITUTION is not null");
            return (Criteria) this;
        }

        public Criteria andGrantingInstitutionEqualTo(String value) {
            addCriterion("GRANTING_INSTITUTION =", value, "grantingInstitution");
            return (Criteria) this;
        }

        public Criteria andGrantingInstitutionNotEqualTo(String value) {
            addCriterion("GRANTING_INSTITUTION <>", value, "grantingInstitution");
            return (Criteria) this;
        }

        public Criteria andGrantingInstitutionGreaterThan(String value) {
            addCriterion("GRANTING_INSTITUTION >", value, "grantingInstitution");
            return (Criteria) this;
        }

        public Criteria andGrantingInstitutionGreaterThanOrEqualTo(String value) {
            addCriterion("GRANTING_INSTITUTION >=", value, "grantingInstitution");
            return (Criteria) this;
        }

        public Criteria andGrantingInstitutionLessThan(String value) {
            addCriterion("GRANTING_INSTITUTION <", value, "grantingInstitution");
            return (Criteria) this;
        }

        public Criteria andGrantingInstitutionLessThanOrEqualTo(String value) {
            addCriterion("GRANTING_INSTITUTION <=", value, "grantingInstitution");
            return (Criteria) this;
        }

        public Criteria andGrantingInstitutionLike(String value) {
            addCriterion("GRANTING_INSTITUTION like", value, "grantingInstitution");
            return (Criteria) this;
        }

        public Criteria andGrantingInstitutionNotLike(String value) {
            addCriterion("GRANTING_INSTITUTION not like", value, "grantingInstitution");
            return (Criteria) this;
        }

        public Criteria andGrantingInstitutionIn(List<String> values) {
            addCriterion("GRANTING_INSTITUTION in", values, "grantingInstitution");
            return (Criteria) this;
        }

        public Criteria andGrantingInstitutionNotIn(List<String> values) {
            addCriterion("GRANTING_INSTITUTION not in", values, "grantingInstitution");
            return (Criteria) this;
        }

        public Criteria andGrantingInstitutionBetween(String value1, String value2) {
            addCriterion("GRANTING_INSTITUTION between", value1, value2, "grantingInstitution");
            return (Criteria) this;
        }

        public Criteria andGrantingInstitutionNotBetween(String value1, String value2) {
            addCriterion("GRANTING_INSTITUTION not between", value1, value2, "grantingInstitution");
            return (Criteria) this;
        }

        public Criteria andAwardedTimeIsNull() {
            addCriterion("AWARDED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAwardedTimeIsNotNull() {
            addCriterion("AWARDED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAwardedTimeEqualTo(String value) {
            addCriterion("AWARDED_TIME =", value, "awardedTime");
            return (Criteria) this;
        }

        public Criteria andAwardedTimeNotEqualTo(String value) {
            addCriterion("AWARDED_TIME <>", value, "awardedTime");
            return (Criteria) this;
        }

        public Criteria andAwardedTimeGreaterThan(String value) {
            addCriterion("AWARDED_TIME >", value, "awardedTime");
            return (Criteria) this;
        }

        public Criteria andAwardedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("AWARDED_TIME >=", value, "awardedTime");
            return (Criteria) this;
        }

        public Criteria andAwardedTimeLessThan(String value) {
            addCriterion("AWARDED_TIME <", value, "awardedTime");
            return (Criteria) this;
        }

        public Criteria andAwardedTimeLessThanOrEqualTo(String value) {
            addCriterion("AWARDED_TIME <=", value, "awardedTime");
            return (Criteria) this;
        }

        public Criteria andAwardedTimeLike(String value) {
            addCriterion("AWARDED_TIME like", value, "awardedTime");
            return (Criteria) this;
        }

        public Criteria andAwardedTimeNotLike(String value) {
            addCriterion("AWARDED_TIME not like", value, "awardedTime");
            return (Criteria) this;
        }

        public Criteria andAwardedTimeIn(List<String> values) {
            addCriterion("AWARDED_TIME in", values, "awardedTime");
            return (Criteria) this;
        }

        public Criteria andAwardedTimeNotIn(List<String> values) {
            addCriterion("AWARDED_TIME not in", values, "awardedTime");
            return (Criteria) this;
        }

        public Criteria andAwardedTimeBetween(String value1, String value2) {
            addCriterion("AWARDED_TIME between", value1, value2, "awardedTime");
            return (Criteria) this;
        }

        public Criteria andAwardedTimeNotBetween(String value1, String value2) {
            addCriterion("AWARDED_TIME not between", value1, value2, "awardedTime");
            return (Criteria) this;
        }

        public Criteria andCertificatesDescribeIsNull() {
            addCriterion("CERTIFICATES_DESCRIBE is null");
            return (Criteria) this;
        }

        public Criteria andCertificatesDescribeIsNotNull() {
            addCriterion("CERTIFICATES_DESCRIBE is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatesDescribeEqualTo(String value) {
            addCriterion("CERTIFICATES_DESCRIBE =", value, "certificatesDescribe");
            return (Criteria) this;
        }

        public Criteria andCertificatesDescribeNotEqualTo(String value) {
            addCriterion("CERTIFICATES_DESCRIBE <>", value, "certificatesDescribe");
            return (Criteria) this;
        }

        public Criteria andCertificatesDescribeGreaterThan(String value) {
            addCriterion("CERTIFICATES_DESCRIBE >", value, "certificatesDescribe");
            return (Criteria) this;
        }

        public Criteria andCertificatesDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATES_DESCRIBE >=", value, "certificatesDescribe");
            return (Criteria) this;
        }

        public Criteria andCertificatesDescribeLessThan(String value) {
            addCriterion("CERTIFICATES_DESCRIBE <", value, "certificatesDescribe");
            return (Criteria) this;
        }

        public Criteria andCertificatesDescribeLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATES_DESCRIBE <=", value, "certificatesDescribe");
            return (Criteria) this;
        }

        public Criteria andCertificatesDescribeLike(String value) {
            addCriterion("CERTIFICATES_DESCRIBE like", value, "certificatesDescribe");
            return (Criteria) this;
        }

        public Criteria andCertificatesDescribeNotLike(String value) {
            addCriterion("CERTIFICATES_DESCRIBE not like", value, "certificatesDescribe");
            return (Criteria) this;
        }

        public Criteria andCertificatesDescribeIn(List<String> values) {
            addCriterion("CERTIFICATES_DESCRIBE in", values, "certificatesDescribe");
            return (Criteria) this;
        }

        public Criteria andCertificatesDescribeNotIn(List<String> values) {
            addCriterion("CERTIFICATES_DESCRIBE not in", values, "certificatesDescribe");
            return (Criteria) this;
        }

        public Criteria andCertificatesDescribeBetween(String value1, String value2) {
            addCriterion("CERTIFICATES_DESCRIBE between", value1, value2, "certificatesDescribe");
            return (Criteria) this;
        }

        public Criteria andCertificatesDescribeNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATES_DESCRIBE not between", value1, value2, "certificatesDescribe");
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

        public Criteria andCertificateIdIsNull() {
            addCriterion("CERTIFICATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCertificateIdIsNotNull() {
            addCriterion("CERTIFICATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateIdEqualTo(String value) {
            addCriterion("CERTIFICATE_ID =", value, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdNotEqualTo(String value) {
            addCriterion("CERTIFICATE_ID <>", value, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdGreaterThan(String value) {
            addCriterion("CERTIFICATE_ID >", value, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE_ID >=", value, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdLessThan(String value) {
            addCriterion("CERTIFICATE_ID <", value, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE_ID <=", value, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdLike(String value) {
            addCriterion("CERTIFICATE_ID like", value, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdNotLike(String value) {
            addCriterion("CERTIFICATE_ID not like", value, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdIn(List<String> values) {
            addCriterion("CERTIFICATE_ID in", values, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdNotIn(List<String> values) {
            addCriterion("CERTIFICATE_ID not in", values, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdBetween(String value1, String value2) {
            addCriterion("CERTIFICATE_ID between", value1, value2, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATE_ID not between", value1, value2, "certificateId");
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