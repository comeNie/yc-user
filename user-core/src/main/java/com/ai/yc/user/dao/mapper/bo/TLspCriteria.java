package com.ai.yc.user.dao.mapper.bo;

import java.util.ArrayList;
import java.util.List;

public class TLspCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public TLspCriteria() {
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

        public Criteria andLspIdIsNull() {
            addCriterion("LSP_ID is null");
            return (Criteria) this;
        }

        public Criteria andLspIdIsNotNull() {
            addCriterion("LSP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLspIdEqualTo(String value) {
            addCriterion("LSP_ID =", value, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdNotEqualTo(String value) {
            addCriterion("LSP_ID <>", value, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdGreaterThan(String value) {
            addCriterion("LSP_ID >", value, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdGreaterThanOrEqualTo(String value) {
            addCriterion("LSP_ID >=", value, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdLessThan(String value) {
            addCriterion("LSP_ID <", value, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdLessThanOrEqualTo(String value) {
            addCriterion("LSP_ID <=", value, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdLike(String value) {
            addCriterion("LSP_ID like", value, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdNotLike(String value) {
            addCriterion("LSP_ID not like", value, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdIn(List<String> values) {
            addCriterion("LSP_ID in", values, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdNotIn(List<String> values) {
            addCriterion("LSP_ID not in", values, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdBetween(String value1, String value2) {
            addCriterion("LSP_ID between", value1, value2, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdNotBetween(String value1, String value2) {
            addCriterion("LSP_ID not between", value1, value2, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspNameIsNull() {
            addCriterion("LSP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLspNameIsNotNull() {
            addCriterion("LSP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLspNameEqualTo(String value) {
            addCriterion("LSP_NAME =", value, "lspName");
            return (Criteria) this;
        }

        public Criteria andLspNameNotEqualTo(String value) {
            addCriterion("LSP_NAME <>", value, "lspName");
            return (Criteria) this;
        }

        public Criteria andLspNameGreaterThan(String value) {
            addCriterion("LSP_NAME >", value, "lspName");
            return (Criteria) this;
        }

        public Criteria andLspNameGreaterThanOrEqualTo(String value) {
            addCriterion("LSP_NAME >=", value, "lspName");
            return (Criteria) this;
        }

        public Criteria andLspNameLessThan(String value) {
            addCriterion("LSP_NAME <", value, "lspName");
            return (Criteria) this;
        }

        public Criteria andLspNameLessThanOrEqualTo(String value) {
            addCriterion("LSP_NAME <=", value, "lspName");
            return (Criteria) this;
        }

        public Criteria andLspNameLike(String value) {
            addCriterion("LSP_NAME like", value, "lspName");
            return (Criteria) this;
        }

        public Criteria andLspNameNotLike(String value) {
            addCriterion("LSP_NAME not like", value, "lspName");
            return (Criteria) this;
        }

        public Criteria andLspNameIn(List<String> values) {
            addCriterion("LSP_NAME in", values, "lspName");
            return (Criteria) this;
        }

        public Criteria andLspNameNotIn(List<String> values) {
            addCriterion("LSP_NAME not in", values, "lspName");
            return (Criteria) this;
        }

        public Criteria andLspNameBetween(String value1, String value2) {
            addCriterion("LSP_NAME between", value1, value2, "lspName");
            return (Criteria) this;
        }

        public Criteria andLspNameNotBetween(String value1, String value2) {
            addCriterion("LSP_NAME not between", value1, value2, "lspName");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("CONTACT is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("CONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("CONTACT =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("CONTACT <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("CONTACT >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("CONTACT <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("CONTACT <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("CONTACT like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("CONTACT not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("CONTACT in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("CONTACT not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("CONTACT between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("CONTACT not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIsNull() {
            addCriterion("PHONE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIsNotNull() {
            addCriterion("PHONE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumEqualTo(String value) {
            addCriterion("PHONE_NUM =", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotEqualTo(String value) {
            addCriterion("PHONE_NUM <>", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumGreaterThan(String value) {
            addCriterion("PHONE_NUM >", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE_NUM >=", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLessThan(String value) {
            addCriterion("PHONE_NUM <", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLessThanOrEqualTo(String value) {
            addCriterion("PHONE_NUM <=", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLike(String value) {
            addCriterion("PHONE_NUM like", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotLike(String value) {
            addCriterion("PHONE_NUM not like", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIn(List<String> values) {
            addCriterion("PHONE_NUM in", values, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotIn(List<String> values) {
            addCriterion("PHONE_NUM not in", values, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumBetween(String value1, String value2) {
            addCriterion("PHONE_NUM between", value1, value2, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotBetween(String value1, String value2) {
            addCriterion("PHONE_NUM not between", value1, value2, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNull() {
            addCriterion("COMPANY_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNotNull() {
            addCriterion("COMPANY_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressEqualTo(String value) {
            addCriterion("COMPANY_ADDRESS =", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotEqualTo(String value) {
            addCriterion("COMPANY_ADDRESS <>", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThan(String value) {
            addCriterion("COMPANY_ADDRESS >", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_ADDRESS >=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThan(String value) {
            addCriterion("COMPANY_ADDRESS <", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_ADDRESS <=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLike(String value) {
            addCriterion("COMPANY_ADDRESS like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotLike(String value) {
            addCriterion("COMPANY_ADDRESS not like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIn(List<String> values) {
            addCriterion("COMPANY_ADDRESS in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotIn(List<String> values) {
            addCriterion("COMPANY_ADDRESS not in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressBetween(String value1, String value2) {
            addCriterion("COMPANY_ADDRESS between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotBetween(String value1, String value2) {
            addCriterion("COMPANY_ADDRESS not between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroductionIsNull() {
            addCriterion("COMPANY_INTRODUCTION is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroductionIsNotNull() {
            addCriterion("COMPANY_INTRODUCTION is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroductionEqualTo(String value) {
            addCriterion("COMPANY_INTRODUCTION =", value, "companyIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroductionNotEqualTo(String value) {
            addCriterion("COMPANY_INTRODUCTION <>", value, "companyIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroductionGreaterThan(String value) {
            addCriterion("COMPANY_INTRODUCTION >", value, "companyIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_INTRODUCTION >=", value, "companyIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroductionLessThan(String value) {
            addCriterion("COMPANY_INTRODUCTION <", value, "companyIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroductionLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_INTRODUCTION <=", value, "companyIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroductionLike(String value) {
            addCriterion("COMPANY_INTRODUCTION like", value, "companyIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroductionNotLike(String value) {
            addCriterion("COMPANY_INTRODUCTION not like", value, "companyIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroductionIn(List<String> values) {
            addCriterion("COMPANY_INTRODUCTION in", values, "companyIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroductionNotIn(List<String> values) {
            addCriterion("COMPANY_INTRODUCTION not in", values, "companyIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroductionBetween(String value1, String value2) {
            addCriterion("COMPANY_INTRODUCTION between", value1, value2, "companyIntroduction");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroductionNotBetween(String value1, String value2) {
            addCriterion("COMPANY_INTRODUCTION not between", value1, value2, "companyIntroduction");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogPathIsNull() {
            addCriterion("ENTERPRISE_LOG_PATH is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogPathIsNotNull() {
            addCriterion("ENTERPRISE_LOG_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogPathEqualTo(String value) {
            addCriterion("ENTERPRISE_LOG_PATH =", value, "enterpriseLogPath");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogPathNotEqualTo(String value) {
            addCriterion("ENTERPRISE_LOG_PATH <>", value, "enterpriseLogPath");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogPathGreaterThan(String value) {
            addCriterion("ENTERPRISE_LOG_PATH >", value, "enterpriseLogPath");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogPathGreaterThanOrEqualTo(String value) {
            addCriterion("ENTERPRISE_LOG_PATH >=", value, "enterpriseLogPath");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogPathLessThan(String value) {
            addCriterion("ENTERPRISE_LOG_PATH <", value, "enterpriseLogPath");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogPathLessThanOrEqualTo(String value) {
            addCriterion("ENTERPRISE_LOG_PATH <=", value, "enterpriseLogPath");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogPathLike(String value) {
            addCriterion("ENTERPRISE_LOG_PATH like", value, "enterpriseLogPath");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogPathNotLike(String value) {
            addCriterion("ENTERPRISE_LOG_PATH not like", value, "enterpriseLogPath");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogPathIn(List<String> values) {
            addCriterion("ENTERPRISE_LOG_PATH in", values, "enterpriseLogPath");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogPathNotIn(List<String> values) {
            addCriterion("ENTERPRISE_LOG_PATH not in", values, "enterpriseLogPath");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogPathBetween(String value1, String value2) {
            addCriterion("ENTERPRISE_LOG_PATH between", value1, value2, "enterpriseLogPath");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLogPathNotBetween(String value1, String value2) {
            addCriterion("ENTERPRISE_LOG_PATH not between", value1, value2, "enterpriseLogPath");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
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