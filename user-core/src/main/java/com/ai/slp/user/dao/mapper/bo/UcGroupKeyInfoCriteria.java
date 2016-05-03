package com.ai.slp.user.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class UcGroupKeyInfoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public UcGroupKeyInfoCriteria() {
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

        public Criteria andTenantIdIsNull() {
            addCriterion("TENANT_ID is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("TENANT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(String value) {
            addCriterion("TENANT_ID =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(String value) {
            addCriterion("TENANT_ID <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(String value) {
            addCriterion("TENANT_ID >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(String value) {
            addCriterion("TENANT_ID >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(String value) {
            addCriterion("TENANT_ID <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(String value) {
            addCriterion("TENANT_ID <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLike(String value) {
            addCriterion("TENANT_ID like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotLike(String value) {
            addCriterion("TENANT_ID not like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<String> values) {
            addCriterion("TENANT_ID in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<String> values) {
            addCriterion("TENANT_ID not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(String value1, String value2) {
            addCriterion("TENANT_ID between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(String value1, String value2) {
            addCriterion("TENANT_ID not between", value1, value2, "tenantId");
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

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
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

        public Criteria andCertNumIsNull() {
            addCriterion("CERT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCertNumIsNotNull() {
            addCriterion("CERT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCertNumEqualTo(String value) {
            addCriterion("CERT_NUM =", value, "certNum");
            return (Criteria) this;
        }

        public Criteria andCertNumNotEqualTo(String value) {
            addCriterion("CERT_NUM <>", value, "certNum");
            return (Criteria) this;
        }

        public Criteria andCertNumGreaterThan(String value) {
            addCriterion("CERT_NUM >", value, "certNum");
            return (Criteria) this;
        }

        public Criteria andCertNumGreaterThanOrEqualTo(String value) {
            addCriterion("CERT_NUM >=", value, "certNum");
            return (Criteria) this;
        }

        public Criteria andCertNumLessThan(String value) {
            addCriterion("CERT_NUM <", value, "certNum");
            return (Criteria) this;
        }

        public Criteria andCertNumLessThanOrEqualTo(String value) {
            addCriterion("CERT_NUM <=", value, "certNum");
            return (Criteria) this;
        }

        public Criteria andCertNumLike(String value) {
            addCriterion("CERT_NUM like", value, "certNum");
            return (Criteria) this;
        }

        public Criteria andCertNumNotLike(String value) {
            addCriterion("CERT_NUM not like", value, "certNum");
            return (Criteria) this;
        }

        public Criteria andCertNumIn(List<String> values) {
            addCriterion("CERT_NUM in", values, "certNum");
            return (Criteria) this;
        }

        public Criteria andCertNumNotIn(List<String> values) {
            addCriterion("CERT_NUM not in", values, "certNum");
            return (Criteria) this;
        }

        public Criteria andCertNumBetween(String value1, String value2) {
            addCriterion("CERT_NUM between", value1, value2, "certNum");
            return (Criteria) this;
        }

        public Criteria andCertNumNotBetween(String value1, String value2) {
            addCriterion("CERT_NUM not between", value1, value2, "certNum");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNull() {
            addCriterion("CUST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNotNull() {
            addCriterion("CUST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustNameEqualTo(String value) {
            addCriterion("CUST_NAME =", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotEqualTo(String value) {
            addCriterion("CUST_NAME <>", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThan(String value) {
            addCriterion("CUST_NAME >", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_NAME >=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThan(String value) {
            addCriterion("CUST_NAME <", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThanOrEqualTo(String value) {
            addCriterion("CUST_NAME <=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLike(String value) {
            addCriterion("CUST_NAME like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotLike(String value) {
            addCriterion("CUST_NAME not like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameIn(List<String> values) {
            addCriterion("CUST_NAME in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotIn(List<String> values) {
            addCriterion("CUST_NAME not in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameBetween(String value1, String value2) {
            addCriterion("CUST_NAME between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotBetween(String value1, String value2) {
            addCriterion("CUST_NAME not between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNull() {
            addCriterion("PROVINCE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNotNull() {
            addCriterion("PROVINCE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeEqualTo(String value) {
            addCriterion("PROVINCE_CODE =", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotEqualTo(String value) {
            addCriterion("PROVINCE_CODE <>", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThan(String value) {
            addCriterion("PROVINCE_CODE >", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE_CODE >=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThan(String value) {
            addCriterion("PROVINCE_CODE <", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE_CODE <=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLike(String value) {
            addCriterion("PROVINCE_CODE like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotLike(String value) {
            addCriterion("PROVINCE_CODE not like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIn(List<String> values) {
            addCriterion("PROVINCE_CODE in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotIn(List<String> values) {
            addCriterion("PROVINCE_CODE not in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeBetween(String value1, String value2) {
            addCriterion("PROVINCE_CODE between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotBetween(String value1, String value2) {
            addCriterion("PROVINCE_CODE not between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("CITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("CITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("CITY_CODE =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("CITY_CODE <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("CITY_CODE >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_CODE >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("CITY_CODE <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("CITY_CODE <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("CITY_CODE like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("CITY_CODE not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("CITY_CODE in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("CITY_CODE not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("CITY_CODE between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("CITY_CODE not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeIsNull() {
            addCriterion("COUNTY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCountyCodeIsNotNull() {
            addCriterion("COUNTY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCountyCodeEqualTo(String value) {
            addCriterion("COUNTY_CODE =", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeNotEqualTo(String value) {
            addCriterion("COUNTY_CODE <>", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeGreaterThan(String value) {
            addCriterion("COUNTY_CODE >", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTY_CODE >=", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeLessThan(String value) {
            addCriterion("COUNTY_CODE <", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeLessThanOrEqualTo(String value) {
            addCriterion("COUNTY_CODE <=", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeLike(String value) {
            addCriterion("COUNTY_CODE like", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeNotLike(String value) {
            addCriterion("COUNTY_CODE not like", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeIn(List<String> values) {
            addCriterion("COUNTY_CODE in", values, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeNotIn(List<String> values) {
            addCriterion("COUNTY_CODE not in", values, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeBetween(String value1, String value2) {
            addCriterion("COUNTY_CODE between", value1, value2, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeNotBetween(String value1, String value2) {
            addCriterion("COUNTY_CODE not between", value1, value2, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCertAddrIsNull() {
            addCriterion("CERT_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andCertAddrIsNotNull() {
            addCriterion("CERT_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andCertAddrEqualTo(String value) {
            addCriterion("CERT_ADDR =", value, "certAddr");
            return (Criteria) this;
        }

        public Criteria andCertAddrNotEqualTo(String value) {
            addCriterion("CERT_ADDR <>", value, "certAddr");
            return (Criteria) this;
        }

        public Criteria andCertAddrGreaterThan(String value) {
            addCriterion("CERT_ADDR >", value, "certAddr");
            return (Criteria) this;
        }

        public Criteria andCertAddrGreaterThanOrEqualTo(String value) {
            addCriterion("CERT_ADDR >=", value, "certAddr");
            return (Criteria) this;
        }

        public Criteria andCertAddrLessThan(String value) {
            addCriterion("CERT_ADDR <", value, "certAddr");
            return (Criteria) this;
        }

        public Criteria andCertAddrLessThanOrEqualTo(String value) {
            addCriterion("CERT_ADDR <=", value, "certAddr");
            return (Criteria) this;
        }

        public Criteria andCertAddrLike(String value) {
            addCriterion("CERT_ADDR like", value, "certAddr");
            return (Criteria) this;
        }

        public Criteria andCertAddrNotLike(String value) {
            addCriterion("CERT_ADDR not like", value, "certAddr");
            return (Criteria) this;
        }

        public Criteria andCertAddrIn(List<String> values) {
            addCriterion("CERT_ADDR in", values, "certAddr");
            return (Criteria) this;
        }

        public Criteria andCertAddrNotIn(List<String> values) {
            addCriterion("CERT_ADDR not in", values, "certAddr");
            return (Criteria) this;
        }

        public Criteria andCertAddrBetween(String value1, String value2) {
            addCriterion("CERT_ADDR between", value1, value2, "certAddr");
            return (Criteria) this;
        }

        public Criteria andCertAddrNotBetween(String value1, String value2) {
            addCriterion("CERT_ADDR not between", value1, value2, "certAddr");
            return (Criteria) this;
        }

        public Criteria andCertIssueDateIsNull() {
            addCriterion("CERT_ISSUE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCertIssueDateIsNotNull() {
            addCriterion("CERT_ISSUE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCertIssueDateEqualTo(Timestamp value) {
            addCriterion("CERT_ISSUE_DATE =", value, "certIssueDate");
            return (Criteria) this;
        }

        public Criteria andCertIssueDateNotEqualTo(Timestamp value) {
            addCriterion("CERT_ISSUE_DATE <>", value, "certIssueDate");
            return (Criteria) this;
        }

        public Criteria andCertIssueDateGreaterThan(Timestamp value) {
            addCriterion("CERT_ISSUE_DATE >", value, "certIssueDate");
            return (Criteria) this;
        }

        public Criteria andCertIssueDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("CERT_ISSUE_DATE >=", value, "certIssueDate");
            return (Criteria) this;
        }

        public Criteria andCertIssueDateLessThan(Timestamp value) {
            addCriterion("CERT_ISSUE_DATE <", value, "certIssueDate");
            return (Criteria) this;
        }

        public Criteria andCertIssueDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("CERT_ISSUE_DATE <=", value, "certIssueDate");
            return (Criteria) this;
        }

        public Criteria andCertIssueDateIn(List<Timestamp> values) {
            addCriterion("CERT_ISSUE_DATE in", values, "certIssueDate");
            return (Criteria) this;
        }

        public Criteria andCertIssueDateNotIn(List<Timestamp> values) {
            addCriterion("CERT_ISSUE_DATE not in", values, "certIssueDate");
            return (Criteria) this;
        }

        public Criteria andCertIssueDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CERT_ISSUE_DATE between", value1, value2, "certIssueDate");
            return (Criteria) this;
        }

        public Criteria andCertIssueDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CERT_ISSUE_DATE not between", value1, value2, "certIssueDate");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalsIsNull() {
            addCriterion("REGISTERED_CAPITAlS is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalsIsNotNull() {
            addCriterion("REGISTERED_CAPITAlS is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalsEqualTo(Long value) {
            addCriterion("REGISTERED_CAPITAlS =", value, "registeredCapitals");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalsNotEqualTo(Long value) {
            addCriterion("REGISTERED_CAPITAlS <>", value, "registeredCapitals");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalsGreaterThan(Long value) {
            addCriterion("REGISTERED_CAPITAlS >", value, "registeredCapitals");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalsGreaterThanOrEqualTo(Long value) {
            addCriterion("REGISTERED_CAPITAlS >=", value, "registeredCapitals");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalsLessThan(Long value) {
            addCriterion("REGISTERED_CAPITAlS <", value, "registeredCapitals");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalsLessThanOrEqualTo(Long value) {
            addCriterion("REGISTERED_CAPITAlS <=", value, "registeredCapitals");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalsIn(List<Long> values) {
            addCriterion("REGISTERED_CAPITAlS in", values, "registeredCapitals");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalsNotIn(List<Long> values) {
            addCriterion("REGISTERED_CAPITAlS not in", values, "registeredCapitals");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalsBetween(Long value1, Long value2) {
            addCriterion("REGISTERED_CAPITAlS between", value1, value2, "registeredCapitals");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalsNotBetween(Long value1, Long value2) {
            addCriterion("REGISTERED_CAPITAlS not between", value1, value2, "registeredCapitals");
            return (Criteria) this;
        }

        public Criteria andCertValidDateIsNull() {
            addCriterion("CERT_VALID_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCertValidDateIsNotNull() {
            addCriterion("CERT_VALID_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCertValidDateEqualTo(Timestamp value) {
            addCriterion("CERT_VALID_DATE =", value, "certValidDate");
            return (Criteria) this;
        }

        public Criteria andCertValidDateNotEqualTo(Timestamp value) {
            addCriterion("CERT_VALID_DATE <>", value, "certValidDate");
            return (Criteria) this;
        }

        public Criteria andCertValidDateGreaterThan(Timestamp value) {
            addCriterion("CERT_VALID_DATE >", value, "certValidDate");
            return (Criteria) this;
        }

        public Criteria andCertValidDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("CERT_VALID_DATE >=", value, "certValidDate");
            return (Criteria) this;
        }

        public Criteria andCertValidDateLessThan(Timestamp value) {
            addCriterion("CERT_VALID_DATE <", value, "certValidDate");
            return (Criteria) this;
        }

        public Criteria andCertValidDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("CERT_VALID_DATE <=", value, "certValidDate");
            return (Criteria) this;
        }

        public Criteria andCertValidDateIn(List<Timestamp> values) {
            addCriterion("CERT_VALID_DATE in", values, "certValidDate");
            return (Criteria) this;
        }

        public Criteria andCertValidDateNotIn(List<Timestamp> values) {
            addCriterion("CERT_VALID_DATE not in", values, "certValidDate");
            return (Criteria) this;
        }

        public Criteria andCertValidDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CERT_VALID_DATE between", value1, value2, "certValidDate");
            return (Criteria) this;
        }

        public Criteria andCertValidDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CERT_VALID_DATE not between", value1, value2, "certValidDate");
            return (Criteria) this;
        }

        public Criteria andCertInvalidDateIsNull() {
            addCriterion("CERT_INVALID_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCertInvalidDateIsNotNull() {
            addCriterion("CERT_INVALID_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCertInvalidDateEqualTo(Timestamp value) {
            addCriterion("CERT_INVALID_DATE =", value, "certInvalidDate");
            return (Criteria) this;
        }

        public Criteria andCertInvalidDateNotEqualTo(Timestamp value) {
            addCriterion("CERT_INVALID_DATE <>", value, "certInvalidDate");
            return (Criteria) this;
        }

        public Criteria andCertInvalidDateGreaterThan(Timestamp value) {
            addCriterion("CERT_INVALID_DATE >", value, "certInvalidDate");
            return (Criteria) this;
        }

        public Criteria andCertInvalidDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("CERT_INVALID_DATE >=", value, "certInvalidDate");
            return (Criteria) this;
        }

        public Criteria andCertInvalidDateLessThan(Timestamp value) {
            addCriterion("CERT_INVALID_DATE <", value, "certInvalidDate");
            return (Criteria) this;
        }

        public Criteria andCertInvalidDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("CERT_INVALID_DATE <=", value, "certInvalidDate");
            return (Criteria) this;
        }

        public Criteria andCertInvalidDateIn(List<Timestamp> values) {
            addCriterion("CERT_INVALID_DATE in", values, "certInvalidDate");
            return (Criteria) this;
        }

        public Criteria andCertInvalidDateNotIn(List<Timestamp> values) {
            addCriterion("CERT_INVALID_DATE not in", values, "certInvalidDate");
            return (Criteria) this;
        }

        public Criteria andCertInvalidDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CERT_INVALID_DATE between", value1, value2, "certInvalidDate");
            return (Criteria) this;
        }

        public Criteria andCertInvalidDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CERT_INVALID_DATE not between", value1, value2, "certInvalidDate");
            return (Criteria) this;
        }

        public Criteria andWebFlagIsNull() {
            addCriterion("WEB_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andWebFlagIsNotNull() {
            addCriterion("WEB_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andWebFlagEqualTo(String value) {
            addCriterion("WEB_FLAG =", value, "webFlag");
            return (Criteria) this;
        }

        public Criteria andWebFlagNotEqualTo(String value) {
            addCriterion("WEB_FLAG <>", value, "webFlag");
            return (Criteria) this;
        }

        public Criteria andWebFlagGreaterThan(String value) {
            addCriterion("WEB_FLAG >", value, "webFlag");
            return (Criteria) this;
        }

        public Criteria andWebFlagGreaterThanOrEqualTo(String value) {
            addCriterion("WEB_FLAG >=", value, "webFlag");
            return (Criteria) this;
        }

        public Criteria andWebFlagLessThan(String value) {
            addCriterion("WEB_FLAG <", value, "webFlag");
            return (Criteria) this;
        }

        public Criteria andWebFlagLessThanOrEqualTo(String value) {
            addCriterion("WEB_FLAG <=", value, "webFlag");
            return (Criteria) this;
        }

        public Criteria andWebFlagLike(String value) {
            addCriterion("WEB_FLAG like", value, "webFlag");
            return (Criteria) this;
        }

        public Criteria andWebFlagNotLike(String value) {
            addCriterion("WEB_FLAG not like", value, "webFlag");
            return (Criteria) this;
        }

        public Criteria andWebFlagIn(List<String> values) {
            addCriterion("WEB_FLAG in", values, "webFlag");
            return (Criteria) this;
        }

        public Criteria andWebFlagNotIn(List<String> values) {
            addCriterion("WEB_FLAG not in", values, "webFlag");
            return (Criteria) this;
        }

        public Criteria andWebFlagBetween(String value1, String value2) {
            addCriterion("WEB_FLAG between", value1, value2, "webFlag");
            return (Criteria) this;
        }

        public Criteria andWebFlagNotBetween(String value1, String value2) {
            addCriterion("WEB_FLAG not between", value1, value2, "webFlag");
            return (Criteria) this;
        }

        public Criteria andGroupWebsiteIsNull() {
            addCriterion("GROUP_WEBSITE is null");
            return (Criteria) this;
        }

        public Criteria andGroupWebsiteIsNotNull() {
            addCriterion("GROUP_WEBSITE is not null");
            return (Criteria) this;
        }

        public Criteria andGroupWebsiteEqualTo(String value) {
            addCriterion("GROUP_WEBSITE =", value, "groupWebsite");
            return (Criteria) this;
        }

        public Criteria andGroupWebsiteNotEqualTo(String value) {
            addCriterion("GROUP_WEBSITE <>", value, "groupWebsite");
            return (Criteria) this;
        }

        public Criteria andGroupWebsiteGreaterThan(String value) {
            addCriterion("GROUP_WEBSITE >", value, "groupWebsite");
            return (Criteria) this;
        }

        public Criteria andGroupWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_WEBSITE >=", value, "groupWebsite");
            return (Criteria) this;
        }

        public Criteria andGroupWebsiteLessThan(String value) {
            addCriterion("GROUP_WEBSITE <", value, "groupWebsite");
            return (Criteria) this;
        }

        public Criteria andGroupWebsiteLessThanOrEqualTo(String value) {
            addCriterion("GROUP_WEBSITE <=", value, "groupWebsite");
            return (Criteria) this;
        }

        public Criteria andGroupWebsiteLike(String value) {
            addCriterion("GROUP_WEBSITE like", value, "groupWebsite");
            return (Criteria) this;
        }

        public Criteria andGroupWebsiteNotLike(String value) {
            addCriterion("GROUP_WEBSITE not like", value, "groupWebsite");
            return (Criteria) this;
        }

        public Criteria andGroupWebsiteIn(List<String> values) {
            addCriterion("GROUP_WEBSITE in", values, "groupWebsite");
            return (Criteria) this;
        }

        public Criteria andGroupWebsiteNotIn(List<String> values) {
            addCriterion("GROUP_WEBSITE not in", values, "groupWebsite");
            return (Criteria) this;
        }

        public Criteria andGroupWebsiteBetween(String value1, String value2) {
            addCriterion("GROUP_WEBSITE between", value1, value2, "groupWebsite");
            return (Criteria) this;
        }

        public Criteria andGroupWebsiteNotBetween(String value1, String value2) {
            addCriterion("GROUP_WEBSITE not between", value1, value2, "groupWebsite");
            return (Criteria) this;
        }

        public Criteria andGroupMemberScaleIsNull() {
            addCriterion("GROUP_MEMBER_SCALE is null");
            return (Criteria) this;
        }

        public Criteria andGroupMemberScaleIsNotNull() {
            addCriterion("GROUP_MEMBER_SCALE is not null");
            return (Criteria) this;
        }

        public Criteria andGroupMemberScaleEqualTo(String value) {
            addCriterion("GROUP_MEMBER_SCALE =", value, "groupMemberScale");
            return (Criteria) this;
        }

        public Criteria andGroupMemberScaleNotEqualTo(String value) {
            addCriterion("GROUP_MEMBER_SCALE <>", value, "groupMemberScale");
            return (Criteria) this;
        }

        public Criteria andGroupMemberScaleGreaterThan(String value) {
            addCriterion("GROUP_MEMBER_SCALE >", value, "groupMemberScale");
            return (Criteria) this;
        }

        public Criteria andGroupMemberScaleGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_MEMBER_SCALE >=", value, "groupMemberScale");
            return (Criteria) this;
        }

        public Criteria andGroupMemberScaleLessThan(String value) {
            addCriterion("GROUP_MEMBER_SCALE <", value, "groupMemberScale");
            return (Criteria) this;
        }

        public Criteria andGroupMemberScaleLessThanOrEqualTo(String value) {
            addCriterion("GROUP_MEMBER_SCALE <=", value, "groupMemberScale");
            return (Criteria) this;
        }

        public Criteria andGroupMemberScaleLike(String value) {
            addCriterion("GROUP_MEMBER_SCALE like", value, "groupMemberScale");
            return (Criteria) this;
        }

        public Criteria andGroupMemberScaleNotLike(String value) {
            addCriterion("GROUP_MEMBER_SCALE not like", value, "groupMemberScale");
            return (Criteria) this;
        }

        public Criteria andGroupMemberScaleIn(List<String> values) {
            addCriterion("GROUP_MEMBER_SCALE in", values, "groupMemberScale");
            return (Criteria) this;
        }

        public Criteria andGroupMemberScaleNotIn(List<String> values) {
            addCriterion("GROUP_MEMBER_SCALE not in", values, "groupMemberScale");
            return (Criteria) this;
        }

        public Criteria andGroupMemberScaleBetween(String value1, String value2) {
            addCriterion("GROUP_MEMBER_SCALE between", value1, value2, "groupMemberScale");
            return (Criteria) this;
        }

        public Criteria andGroupMemberScaleNotBetween(String value1, String value2) {
            addCriterion("GROUP_MEMBER_SCALE not between", value1, value2, "groupMemberScale");
            return (Criteria) this;
        }

        public Criteria andGroupTypeIsNull() {
            addCriterion("GROUP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andGroupTypeIsNotNull() {
            addCriterion("GROUP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGroupTypeEqualTo(String value) {
            addCriterion("GROUP_TYPE =", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeNotEqualTo(String value) {
            addCriterion("GROUP_TYPE <>", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeGreaterThan(String value) {
            addCriterion("GROUP_TYPE >", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_TYPE >=", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeLessThan(String value) {
            addCriterion("GROUP_TYPE <", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeLessThanOrEqualTo(String value) {
            addCriterion("GROUP_TYPE <=", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeLike(String value) {
            addCriterion("GROUP_TYPE like", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeNotLike(String value) {
            addCriterion("GROUP_TYPE not like", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeIn(List<String> values) {
            addCriterion("GROUP_TYPE in", values, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeNotIn(List<String> values) {
            addCriterion("GROUP_TYPE not in", values, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeBetween(String value1, String value2) {
            addCriterion("GROUP_TYPE between", value1, value2, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeNotBetween(String value1, String value2) {
            addCriterion("GROUP_TYPE not between", value1, value2, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupIndustryIsNull() {
            addCriterion("GROUP_INDUSTRY is null");
            return (Criteria) this;
        }

        public Criteria andGroupIndustryIsNotNull() {
            addCriterion("GROUP_INDUSTRY is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIndustryEqualTo(String value) {
            addCriterion("GROUP_INDUSTRY =", value, "groupIndustry");
            return (Criteria) this;
        }

        public Criteria andGroupIndustryNotEqualTo(String value) {
            addCriterion("GROUP_INDUSTRY <>", value, "groupIndustry");
            return (Criteria) this;
        }

        public Criteria andGroupIndustryGreaterThan(String value) {
            addCriterion("GROUP_INDUSTRY >", value, "groupIndustry");
            return (Criteria) this;
        }

        public Criteria andGroupIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_INDUSTRY >=", value, "groupIndustry");
            return (Criteria) this;
        }

        public Criteria andGroupIndustryLessThan(String value) {
            addCriterion("GROUP_INDUSTRY <", value, "groupIndustry");
            return (Criteria) this;
        }

        public Criteria andGroupIndustryLessThanOrEqualTo(String value) {
            addCriterion("GROUP_INDUSTRY <=", value, "groupIndustry");
            return (Criteria) this;
        }

        public Criteria andGroupIndustryLike(String value) {
            addCriterion("GROUP_INDUSTRY like", value, "groupIndustry");
            return (Criteria) this;
        }

        public Criteria andGroupIndustryNotLike(String value) {
            addCriterion("GROUP_INDUSTRY not like", value, "groupIndustry");
            return (Criteria) this;
        }

        public Criteria andGroupIndustryIn(List<String> values) {
            addCriterion("GROUP_INDUSTRY in", values, "groupIndustry");
            return (Criteria) this;
        }

        public Criteria andGroupIndustryNotIn(List<String> values) {
            addCriterion("GROUP_INDUSTRY not in", values, "groupIndustry");
            return (Criteria) this;
        }

        public Criteria andGroupIndustryBetween(String value1, String value2) {
            addCriterion("GROUP_INDUSTRY between", value1, value2, "groupIndustry");
            return (Criteria) this;
        }

        public Criteria andGroupIndustryNotBetween(String value1, String value2) {
            addCriterion("GROUP_INDUSTRY not between", value1, value2, "groupIndustry");
            return (Criteria) this;
        }

        public Criteria andGroupBusinessScopeIsNull() {
            addCriterion("GROUP_BUSINESS_SCOPE is null");
            return (Criteria) this;
        }

        public Criteria andGroupBusinessScopeIsNotNull() {
            addCriterion("GROUP_BUSINESS_SCOPE is not null");
            return (Criteria) this;
        }

        public Criteria andGroupBusinessScopeEqualTo(String value) {
            addCriterion("GROUP_BUSINESS_SCOPE =", value, "groupBusinessScope");
            return (Criteria) this;
        }

        public Criteria andGroupBusinessScopeNotEqualTo(String value) {
            addCriterion("GROUP_BUSINESS_SCOPE <>", value, "groupBusinessScope");
            return (Criteria) this;
        }

        public Criteria andGroupBusinessScopeGreaterThan(String value) {
            addCriterion("GROUP_BUSINESS_SCOPE >", value, "groupBusinessScope");
            return (Criteria) this;
        }

        public Criteria andGroupBusinessScopeGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_BUSINESS_SCOPE >=", value, "groupBusinessScope");
            return (Criteria) this;
        }

        public Criteria andGroupBusinessScopeLessThan(String value) {
            addCriterion("GROUP_BUSINESS_SCOPE <", value, "groupBusinessScope");
            return (Criteria) this;
        }

        public Criteria andGroupBusinessScopeLessThanOrEqualTo(String value) {
            addCriterion("GROUP_BUSINESS_SCOPE <=", value, "groupBusinessScope");
            return (Criteria) this;
        }

        public Criteria andGroupBusinessScopeLike(String value) {
            addCriterion("GROUP_BUSINESS_SCOPE like", value, "groupBusinessScope");
            return (Criteria) this;
        }

        public Criteria andGroupBusinessScopeNotLike(String value) {
            addCriterion("GROUP_BUSINESS_SCOPE not like", value, "groupBusinessScope");
            return (Criteria) this;
        }

        public Criteria andGroupBusinessScopeIn(List<String> values) {
            addCriterion("GROUP_BUSINESS_SCOPE in", values, "groupBusinessScope");
            return (Criteria) this;
        }

        public Criteria andGroupBusinessScopeNotIn(List<String> values) {
            addCriterion("GROUP_BUSINESS_SCOPE not in", values, "groupBusinessScope");
            return (Criteria) this;
        }

        public Criteria andGroupBusinessScopeBetween(String value1, String value2) {
            addCriterion("GROUP_BUSINESS_SCOPE between", value1, value2, "groupBusinessScope");
            return (Criteria) this;
        }

        public Criteria andGroupBusinessScopeNotBetween(String value1, String value2) {
            addCriterion("GROUP_BUSINESS_SCOPE not between", value1, value2, "groupBusinessScope");
            return (Criteria) this;
        }

        public Criteria andGroupProductIsNull() {
            addCriterion("GROUP_PRODUCT is null");
            return (Criteria) this;
        }

        public Criteria andGroupProductIsNotNull() {
            addCriterion("GROUP_PRODUCT is not null");
            return (Criteria) this;
        }

        public Criteria andGroupProductEqualTo(String value) {
            addCriterion("GROUP_PRODUCT =", value, "groupProduct");
            return (Criteria) this;
        }

        public Criteria andGroupProductNotEqualTo(String value) {
            addCriterion("GROUP_PRODUCT <>", value, "groupProduct");
            return (Criteria) this;
        }

        public Criteria andGroupProductGreaterThan(String value) {
            addCriterion("GROUP_PRODUCT >", value, "groupProduct");
            return (Criteria) this;
        }

        public Criteria andGroupProductGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_PRODUCT >=", value, "groupProduct");
            return (Criteria) this;
        }

        public Criteria andGroupProductLessThan(String value) {
            addCriterion("GROUP_PRODUCT <", value, "groupProduct");
            return (Criteria) this;
        }

        public Criteria andGroupProductLessThanOrEqualTo(String value) {
            addCriterion("GROUP_PRODUCT <=", value, "groupProduct");
            return (Criteria) this;
        }

        public Criteria andGroupProductLike(String value) {
            addCriterion("GROUP_PRODUCT like", value, "groupProduct");
            return (Criteria) this;
        }

        public Criteria andGroupProductNotLike(String value) {
            addCriterion("GROUP_PRODUCT not like", value, "groupProduct");
            return (Criteria) this;
        }

        public Criteria andGroupProductIn(List<String> values) {
            addCriterion("GROUP_PRODUCT in", values, "groupProduct");
            return (Criteria) this;
        }

        public Criteria andGroupProductNotIn(List<String> values) {
            addCriterion("GROUP_PRODUCT not in", values, "groupProduct");
            return (Criteria) this;
        }

        public Criteria andGroupProductBetween(String value1, String value2) {
            addCriterion("GROUP_PRODUCT between", value1, value2, "groupProduct");
            return (Criteria) this;
        }

        public Criteria andGroupProductNotBetween(String value1, String value2) {
            addCriterion("GROUP_PRODUCT not between", value1, value2, "groupProduct");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNull() {
            addCriterion("LEGAL_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNotNull() {
            addCriterion("LEGAL_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonEqualTo(String value) {
            addCriterion("LEGAL_PERSON =", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotEqualTo(String value) {
            addCriterion("LEGAL_PERSON <>", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThan(String value) {
            addCriterion("LEGAL_PERSON >", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSON >=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThan(String value) {
            addCriterion("LEGAL_PERSON <", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSON <=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLike(String value) {
            addCriterion("LEGAL_PERSON like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotLike(String value) {
            addCriterion("LEGAL_PERSON not like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIn(List<String> values) {
            addCriterion("LEGAL_PERSON in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotIn(List<String> values) {
            addCriterion("LEGAL_PERSON not in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSON between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSON not between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalCertNumIsNull() {
            addCriterion("LEGAL_CERT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andLegalCertNumIsNotNull() {
            addCriterion("LEGAL_CERT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andLegalCertNumEqualTo(String value) {
            addCriterion("LEGAL_CERT_NUM =", value, "legalCertNum");
            return (Criteria) this;
        }

        public Criteria andLegalCertNumNotEqualTo(String value) {
            addCriterion("LEGAL_CERT_NUM <>", value, "legalCertNum");
            return (Criteria) this;
        }

        public Criteria andLegalCertNumGreaterThan(String value) {
            addCriterion("LEGAL_CERT_NUM >", value, "legalCertNum");
            return (Criteria) this;
        }

        public Criteria andLegalCertNumGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_CERT_NUM >=", value, "legalCertNum");
            return (Criteria) this;
        }

        public Criteria andLegalCertNumLessThan(String value) {
            addCriterion("LEGAL_CERT_NUM <", value, "legalCertNum");
            return (Criteria) this;
        }

        public Criteria andLegalCertNumLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_CERT_NUM <=", value, "legalCertNum");
            return (Criteria) this;
        }

        public Criteria andLegalCertNumLike(String value) {
            addCriterion("LEGAL_CERT_NUM like", value, "legalCertNum");
            return (Criteria) this;
        }

        public Criteria andLegalCertNumNotLike(String value) {
            addCriterion("LEGAL_CERT_NUM not like", value, "legalCertNum");
            return (Criteria) this;
        }

        public Criteria andLegalCertNumIn(List<String> values) {
            addCriterion("LEGAL_CERT_NUM in", values, "legalCertNum");
            return (Criteria) this;
        }

        public Criteria andLegalCertNumNotIn(List<String> values) {
            addCriterion("LEGAL_CERT_NUM not in", values, "legalCertNum");
            return (Criteria) this;
        }

        public Criteria andLegalCertNumBetween(String value1, String value2) {
            addCriterion("LEGAL_CERT_NUM between", value1, value2, "legalCertNum");
            return (Criteria) this;
        }

        public Criteria andLegalCertNumNotBetween(String value1, String value2) {
            addCriterion("LEGAL_CERT_NUM not between", value1, value2, "legalCertNum");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNull() {
            addCriterion("ORG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNotNull() {
            addCriterion("ORG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeEqualTo(String value) {
            addCriterion("ORG_CODE =", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotEqualTo(String value) {
            addCriterion("ORG_CODE <>", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThan(String value) {
            addCriterion("ORG_CODE >", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_CODE >=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThan(String value) {
            addCriterion("ORG_CODE <", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("ORG_CODE <=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLike(String value) {
            addCriterion("ORG_CODE like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotLike(String value) {
            addCriterion("ORG_CODE not like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIn(List<String> values) {
            addCriterion("ORG_CODE in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotIn(List<String> values) {
            addCriterion("ORG_CODE not in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeBetween(String value1, String value2) {
            addCriterion("ORG_CODE between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotBetween(String value1, String value2) {
            addCriterion("ORG_CODE not between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andTaxpayerCodeIsNull() {
            addCriterion("TAXPAYER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerCodeIsNotNull() {
            addCriterion("TAXPAYER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerCodeEqualTo(String value) {
            addCriterion("TAXPAYER_CODE =", value, "taxpayerCode");
            return (Criteria) this;
        }

        public Criteria andTaxpayerCodeNotEqualTo(String value) {
            addCriterion("TAXPAYER_CODE <>", value, "taxpayerCode");
            return (Criteria) this;
        }

        public Criteria andTaxpayerCodeGreaterThan(String value) {
            addCriterion("TAXPAYER_CODE >", value, "taxpayerCode");
            return (Criteria) this;
        }

        public Criteria andTaxpayerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TAXPAYER_CODE >=", value, "taxpayerCode");
            return (Criteria) this;
        }

        public Criteria andTaxpayerCodeLessThan(String value) {
            addCriterion("TAXPAYER_CODE <", value, "taxpayerCode");
            return (Criteria) this;
        }

        public Criteria andTaxpayerCodeLessThanOrEqualTo(String value) {
            addCriterion("TAXPAYER_CODE <=", value, "taxpayerCode");
            return (Criteria) this;
        }

        public Criteria andTaxpayerCodeLike(String value) {
            addCriterion("TAXPAYER_CODE like", value, "taxpayerCode");
            return (Criteria) this;
        }

        public Criteria andTaxpayerCodeNotLike(String value) {
            addCriterion("TAXPAYER_CODE not like", value, "taxpayerCode");
            return (Criteria) this;
        }

        public Criteria andTaxpayerCodeIn(List<String> values) {
            addCriterion("TAXPAYER_CODE in", values, "taxpayerCode");
            return (Criteria) this;
        }

        public Criteria andTaxpayerCodeNotIn(List<String> values) {
            addCriterion("TAXPAYER_CODE not in", values, "taxpayerCode");
            return (Criteria) this;
        }

        public Criteria andTaxpayerCodeBetween(String value1, String value2) {
            addCriterion("TAXPAYER_CODE between", value1, value2, "taxpayerCode");
            return (Criteria) this;
        }

        public Criteria andTaxpayerCodeNotBetween(String value1, String value2) {
            addCriterion("TAXPAYER_CODE not between", value1, value2, "taxpayerCode");
            return (Criteria) this;
        }

        public Criteria andTaxpayerTypeIsNull() {
            addCriterion("TAXPAYER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerTypeIsNotNull() {
            addCriterion("TAXPAYER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerTypeEqualTo(String value) {
            addCriterion("TAXPAYER_TYPE =", value, "taxpayerType");
            return (Criteria) this;
        }

        public Criteria andTaxpayerTypeNotEqualTo(String value) {
            addCriterion("TAXPAYER_TYPE <>", value, "taxpayerType");
            return (Criteria) this;
        }

        public Criteria andTaxpayerTypeGreaterThan(String value) {
            addCriterion("TAXPAYER_TYPE >", value, "taxpayerType");
            return (Criteria) this;
        }

        public Criteria andTaxpayerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TAXPAYER_TYPE >=", value, "taxpayerType");
            return (Criteria) this;
        }

        public Criteria andTaxpayerTypeLessThan(String value) {
            addCriterion("TAXPAYER_TYPE <", value, "taxpayerType");
            return (Criteria) this;
        }

        public Criteria andTaxpayerTypeLessThanOrEqualTo(String value) {
            addCriterion("TAXPAYER_TYPE <=", value, "taxpayerType");
            return (Criteria) this;
        }

        public Criteria andTaxpayerTypeLike(String value) {
            addCriterion("TAXPAYER_TYPE like", value, "taxpayerType");
            return (Criteria) this;
        }

        public Criteria andTaxpayerTypeNotLike(String value) {
            addCriterion("TAXPAYER_TYPE not like", value, "taxpayerType");
            return (Criteria) this;
        }

        public Criteria andTaxpayerTypeIn(List<String> values) {
            addCriterion("TAXPAYER_TYPE in", values, "taxpayerType");
            return (Criteria) this;
        }

        public Criteria andTaxpayerTypeNotIn(List<String> values) {
            addCriterion("TAXPAYER_TYPE not in", values, "taxpayerType");
            return (Criteria) this;
        }

        public Criteria andTaxpayerTypeBetween(String value1, String value2) {
            addCriterion("TAXPAYER_TYPE between", value1, value2, "taxpayerType");
            return (Criteria) this;
        }

        public Criteria andTaxpayerTypeNotBetween(String value1, String value2) {
            addCriterion("TAXPAYER_TYPE not between", value1, value2, "taxpayerType");
            return (Criteria) this;
        }

        public Criteria andTaxpayerTypeCodeIsNull() {
            addCriterion("TAXPAYER_TYPE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerTypeCodeIsNotNull() {
            addCriterion("TAXPAYER_TYPE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayerTypeCodeEqualTo(String value) {
            addCriterion("TAXPAYER_TYPE_CODE =", value, "taxpayerTypeCode");
            return (Criteria) this;
        }

        public Criteria andTaxpayerTypeCodeNotEqualTo(String value) {
            addCriterion("TAXPAYER_TYPE_CODE <>", value, "taxpayerTypeCode");
            return (Criteria) this;
        }

        public Criteria andTaxpayerTypeCodeGreaterThan(String value) {
            addCriterion("TAXPAYER_TYPE_CODE >", value, "taxpayerTypeCode");
            return (Criteria) this;
        }

        public Criteria andTaxpayerTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TAXPAYER_TYPE_CODE >=", value, "taxpayerTypeCode");
            return (Criteria) this;
        }

        public Criteria andTaxpayerTypeCodeLessThan(String value) {
            addCriterion("TAXPAYER_TYPE_CODE <", value, "taxpayerTypeCode");
            return (Criteria) this;
        }

        public Criteria andTaxpayerTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("TAXPAYER_TYPE_CODE <=", value, "taxpayerTypeCode");
            return (Criteria) this;
        }

        public Criteria andTaxpayerTypeCodeLike(String value) {
            addCriterion("TAXPAYER_TYPE_CODE like", value, "taxpayerTypeCode");
            return (Criteria) this;
        }

        public Criteria andTaxpayerTypeCodeNotLike(String value) {
            addCriterion("TAXPAYER_TYPE_CODE not like", value, "taxpayerTypeCode");
            return (Criteria) this;
        }

        public Criteria andTaxpayerTypeCodeIn(List<String> values) {
            addCriterion("TAXPAYER_TYPE_CODE in", values, "taxpayerTypeCode");
            return (Criteria) this;
        }

        public Criteria andTaxpayerTypeCodeNotIn(List<String> values) {
            addCriterion("TAXPAYER_TYPE_CODE not in", values, "taxpayerTypeCode");
            return (Criteria) this;
        }

        public Criteria andTaxpayerTypeCodeBetween(String value1, String value2) {
            addCriterion("TAXPAYER_TYPE_CODE between", value1, value2, "taxpayerTypeCode");
            return (Criteria) this;
        }

        public Criteria andTaxpayerTypeCodeNotBetween(String value1, String value2) {
            addCriterion("TAXPAYER_TYPE_CODE not between", value1, value2, "taxpayerTypeCode");
            return (Criteria) this;
        }

        public Criteria andGroupInfoIsNull() {
            addCriterion("GROUP_INFO is null");
            return (Criteria) this;
        }

        public Criteria andGroupInfoIsNotNull() {
            addCriterion("GROUP_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andGroupInfoEqualTo(String value) {
            addCriterion("GROUP_INFO =", value, "groupInfo");
            return (Criteria) this;
        }

        public Criteria andGroupInfoNotEqualTo(String value) {
            addCriterion("GROUP_INFO <>", value, "groupInfo");
            return (Criteria) this;
        }

        public Criteria andGroupInfoGreaterThan(String value) {
            addCriterion("GROUP_INFO >", value, "groupInfo");
            return (Criteria) this;
        }

        public Criteria andGroupInfoGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_INFO >=", value, "groupInfo");
            return (Criteria) this;
        }

        public Criteria andGroupInfoLessThan(String value) {
            addCriterion("GROUP_INFO <", value, "groupInfo");
            return (Criteria) this;
        }

        public Criteria andGroupInfoLessThanOrEqualTo(String value) {
            addCriterion("GROUP_INFO <=", value, "groupInfo");
            return (Criteria) this;
        }

        public Criteria andGroupInfoLike(String value) {
            addCriterion("GROUP_INFO like", value, "groupInfo");
            return (Criteria) this;
        }

        public Criteria andGroupInfoNotLike(String value) {
            addCriterion("GROUP_INFO not like", value, "groupInfo");
            return (Criteria) this;
        }

        public Criteria andGroupInfoIn(List<String> values) {
            addCriterion("GROUP_INFO in", values, "groupInfo");
            return (Criteria) this;
        }

        public Criteria andGroupInfoNotIn(List<String> values) {
            addCriterion("GROUP_INFO not in", values, "groupInfo");
            return (Criteria) this;
        }

        public Criteria andGroupInfoBetween(String value1, String value2) {
            addCriterion("GROUP_INFO between", value1, value2, "groupInfo");
            return (Criteria) this;
        }

        public Criteria andGroupInfoNotBetween(String value1, String value2) {
            addCriterion("GROUP_INFO not between", value1, value2, "groupInfo");
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

        public Criteria andCreateChlIdIsNull() {
            addCriterion("CREATE_CHL_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreateChlIdIsNotNull() {
            addCriterion("CREATE_CHL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateChlIdEqualTo(String value) {
            addCriterion("CREATE_CHL_ID =", value, "createChlId");
            return (Criteria) this;
        }

        public Criteria andCreateChlIdNotEqualTo(String value) {
            addCriterion("CREATE_CHL_ID <>", value, "createChlId");
            return (Criteria) this;
        }

        public Criteria andCreateChlIdGreaterThan(String value) {
            addCriterion("CREATE_CHL_ID >", value, "createChlId");
            return (Criteria) this;
        }

        public Criteria andCreateChlIdGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_CHL_ID >=", value, "createChlId");
            return (Criteria) this;
        }

        public Criteria andCreateChlIdLessThan(String value) {
            addCriterion("CREATE_CHL_ID <", value, "createChlId");
            return (Criteria) this;
        }

        public Criteria andCreateChlIdLessThanOrEqualTo(String value) {
            addCriterion("CREATE_CHL_ID <=", value, "createChlId");
            return (Criteria) this;
        }

        public Criteria andCreateChlIdLike(String value) {
            addCriterion("CREATE_CHL_ID like", value, "createChlId");
            return (Criteria) this;
        }

        public Criteria andCreateChlIdNotLike(String value) {
            addCriterion("CREATE_CHL_ID not like", value, "createChlId");
            return (Criteria) this;
        }

        public Criteria andCreateChlIdIn(List<String> values) {
            addCriterion("CREATE_CHL_ID in", values, "createChlId");
            return (Criteria) this;
        }

        public Criteria andCreateChlIdNotIn(List<String> values) {
            addCriterion("CREATE_CHL_ID not in", values, "createChlId");
            return (Criteria) this;
        }

        public Criteria andCreateChlIdBetween(String value1, String value2) {
            addCriterion("CREATE_CHL_ID between", value1, value2, "createChlId");
            return (Criteria) this;
        }

        public Criteria andCreateChlIdNotBetween(String value1, String value2) {
            addCriterion("CREATE_CHL_ID not between", value1, value2, "createChlId");
            return (Criteria) this;
        }

        public Criteria andCreateOperIdIsNull() {
            addCriterion("CREATE_OPER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreateOperIdIsNotNull() {
            addCriterion("CREATE_OPER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateOperIdEqualTo(Long value) {
            addCriterion("CREATE_OPER_ID =", value, "createOperId");
            return (Criteria) this;
        }

        public Criteria andCreateOperIdNotEqualTo(Long value) {
            addCriterion("CREATE_OPER_ID <>", value, "createOperId");
            return (Criteria) this;
        }

        public Criteria andCreateOperIdGreaterThan(Long value) {
            addCriterion("CREATE_OPER_ID >", value, "createOperId");
            return (Criteria) this;
        }

        public Criteria andCreateOperIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATE_OPER_ID >=", value, "createOperId");
            return (Criteria) this;
        }

        public Criteria andCreateOperIdLessThan(Long value) {
            addCriterion("CREATE_OPER_ID <", value, "createOperId");
            return (Criteria) this;
        }

        public Criteria andCreateOperIdLessThanOrEqualTo(Long value) {
            addCriterion("CREATE_OPER_ID <=", value, "createOperId");
            return (Criteria) this;
        }

        public Criteria andCreateOperIdIn(List<Long> values) {
            addCriterion("CREATE_OPER_ID in", values, "createOperId");
            return (Criteria) this;
        }

        public Criteria andCreateOperIdNotIn(List<Long> values) {
            addCriterion("CREATE_OPER_ID not in", values, "createOperId");
            return (Criteria) this;
        }

        public Criteria andCreateOperIdBetween(Long value1, Long value2) {
            addCriterion("CREATE_OPER_ID between", value1, value2, "createOperId");
            return (Criteria) this;
        }

        public Criteria andCreateOperIdNotBetween(Long value1, Long value2) {
            addCriterion("CREATE_OPER_ID not between", value1, value2, "createOperId");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Timestamp value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Timestamp value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Timestamp value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Timestamp value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Timestamp> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Timestamp> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateChlIdIsNull() {
            addCriterion("UPDATE_CHL_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpdateChlIdIsNotNull() {
            addCriterion("UPDATE_CHL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateChlIdEqualTo(String value) {
            addCriterion("UPDATE_CHL_ID =", value, "updateChlId");
            return (Criteria) this;
        }

        public Criteria andUpdateChlIdNotEqualTo(String value) {
            addCriterion("UPDATE_CHL_ID <>", value, "updateChlId");
            return (Criteria) this;
        }

        public Criteria andUpdateChlIdGreaterThan(String value) {
            addCriterion("UPDATE_CHL_ID >", value, "updateChlId");
            return (Criteria) this;
        }

        public Criteria andUpdateChlIdGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_CHL_ID >=", value, "updateChlId");
            return (Criteria) this;
        }

        public Criteria andUpdateChlIdLessThan(String value) {
            addCriterion("UPDATE_CHL_ID <", value, "updateChlId");
            return (Criteria) this;
        }

        public Criteria andUpdateChlIdLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_CHL_ID <=", value, "updateChlId");
            return (Criteria) this;
        }

        public Criteria andUpdateChlIdLike(String value) {
            addCriterion("UPDATE_CHL_ID like", value, "updateChlId");
            return (Criteria) this;
        }

        public Criteria andUpdateChlIdNotLike(String value) {
            addCriterion("UPDATE_CHL_ID not like", value, "updateChlId");
            return (Criteria) this;
        }

        public Criteria andUpdateChlIdIn(List<String> values) {
            addCriterion("UPDATE_CHL_ID in", values, "updateChlId");
            return (Criteria) this;
        }

        public Criteria andUpdateChlIdNotIn(List<String> values) {
            addCriterion("UPDATE_CHL_ID not in", values, "updateChlId");
            return (Criteria) this;
        }

        public Criteria andUpdateChlIdBetween(String value1, String value2) {
            addCriterion("UPDATE_CHL_ID between", value1, value2, "updateChlId");
            return (Criteria) this;
        }

        public Criteria andUpdateChlIdNotBetween(String value1, String value2) {
            addCriterion("UPDATE_CHL_ID not between", value1, value2, "updateChlId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdIsNull() {
            addCriterion("UPDATE_OPER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdIsNotNull() {
            addCriterion("UPDATE_OPER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdEqualTo(Long value) {
            addCriterion("UPDATE_OPER_ID =", value, "updateOperId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdNotEqualTo(Long value) {
            addCriterion("UPDATE_OPER_ID <>", value, "updateOperId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdGreaterThan(Long value) {
            addCriterion("UPDATE_OPER_ID >", value, "updateOperId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdGreaterThanOrEqualTo(Long value) {
            addCriterion("UPDATE_OPER_ID >=", value, "updateOperId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdLessThan(Long value) {
            addCriterion("UPDATE_OPER_ID <", value, "updateOperId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdLessThanOrEqualTo(Long value) {
            addCriterion("UPDATE_OPER_ID <=", value, "updateOperId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdIn(List<Long> values) {
            addCriterion("UPDATE_OPER_ID in", values, "updateOperId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdNotIn(List<Long> values) {
            addCriterion("UPDATE_OPER_ID not in", values, "updateOperId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdBetween(Long value1, Long value2) {
            addCriterion("UPDATE_OPER_ID between", value1, value2, "updateOperId");
            return (Criteria) this;
        }

        public Criteria andUpdateOperIdNotBetween(Long value1, Long value2) {
            addCriterion("UPDATE_OPER_ID not between", value1, value2, "updateOperId");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNull() {
            addCriterion("CONTRACT_ID is null");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNotNull() {
            addCriterion("CONTRACT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdEqualTo(String value) {
            addCriterion("CONTRACT_ID =", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotEqualTo(String value) {
            addCriterion("CONTRACT_ID <>", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThan(String value) {
            addCriterion("CONTRACT_ID >", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_ID >=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThan(String value) {
            addCriterion("CONTRACT_ID <", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_ID <=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLike(String value) {
            addCriterion("CONTRACT_ID like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotLike(String value) {
            addCriterion("CONTRACT_ID not like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdIn(List<String> values) {
            addCriterion("CONTRACT_ID in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotIn(List<String> values) {
            addCriterion("CONTRACT_ID not in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdBetween(String value1, String value2) {
            addCriterion("CONTRACT_ID between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_ID not between", value1, value2, "contractId");
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