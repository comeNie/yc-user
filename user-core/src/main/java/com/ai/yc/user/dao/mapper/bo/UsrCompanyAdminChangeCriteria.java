package com.ai.yc.user.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class UsrCompanyAdminChangeCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public UsrCompanyAdminChangeCriteria() {
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

        public Criteria andAdminChangeIdIsNull() {
            addCriterion("ADMIN_CHANGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdminChangeIdIsNotNull() {
            addCriterion("ADMIN_CHANGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdminChangeIdEqualTo(String value) {
            addCriterion("ADMIN_CHANGE_ID =", value, "adminChangeId");
            return (Criteria) this;
        }

        public Criteria andAdminChangeIdNotEqualTo(String value) {
            addCriterion("ADMIN_CHANGE_ID <>", value, "adminChangeId");
            return (Criteria) this;
        }

        public Criteria andAdminChangeIdGreaterThan(String value) {
            addCriterion("ADMIN_CHANGE_ID >", value, "adminChangeId");
            return (Criteria) this;
        }

        public Criteria andAdminChangeIdGreaterThanOrEqualTo(String value) {
            addCriterion("ADMIN_CHANGE_ID >=", value, "adminChangeId");
            return (Criteria) this;
        }

        public Criteria andAdminChangeIdLessThan(String value) {
            addCriterion("ADMIN_CHANGE_ID <", value, "adminChangeId");
            return (Criteria) this;
        }

        public Criteria andAdminChangeIdLessThanOrEqualTo(String value) {
            addCriterion("ADMIN_CHANGE_ID <=", value, "adminChangeId");
            return (Criteria) this;
        }

        public Criteria andAdminChangeIdLike(String value) {
            addCriterion("ADMIN_CHANGE_ID like", value, "adminChangeId");
            return (Criteria) this;
        }

        public Criteria andAdminChangeIdNotLike(String value) {
            addCriterion("ADMIN_CHANGE_ID not like", value, "adminChangeId");
            return (Criteria) this;
        }

        public Criteria andAdminChangeIdIn(List<String> values) {
            addCriterion("ADMIN_CHANGE_ID in", values, "adminChangeId");
            return (Criteria) this;
        }

        public Criteria andAdminChangeIdNotIn(List<String> values) {
            addCriterion("ADMIN_CHANGE_ID not in", values, "adminChangeId");
            return (Criteria) this;
        }

        public Criteria andAdminChangeIdBetween(String value1, String value2) {
            addCriterion("ADMIN_CHANGE_ID between", value1, value2, "adminChangeId");
            return (Criteria) this;
        }

        public Criteria andAdminChangeIdNotBetween(String value1, String value2) {
            addCriterion("ADMIN_CHANGE_ID not between", value1, value2, "adminChangeId");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNull() {
            addCriterion("CUST_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("CUST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(String value) {
            addCriterion("CUST_ID =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(String value) {
            addCriterion("CUST_ID <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(String value) {
            addCriterion("CUST_ID >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_ID >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(String value) {
            addCriterion("CUST_ID <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(String value) {
            addCriterion("CUST_ID <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLike(String value) {
            addCriterion("CUST_ID like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotLike(String value) {
            addCriterion("CUST_ID not like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<String> values) {
            addCriterion("CUST_ID in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<String> values) {
            addCriterion("CUST_ID not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(String value1, String value2) {
            addCriterion("CUST_ID between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(String value1, String value2) {
            addCriterion("CUST_ID not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andSourceAdminIdIsNull() {
            addCriterion("SOURCE_ADMIN_ID is null");
            return (Criteria) this;
        }

        public Criteria andSourceAdminIdIsNotNull() {
            addCriterion("SOURCE_ADMIN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSourceAdminIdEqualTo(String value) {
            addCriterion("SOURCE_ADMIN_ID =", value, "sourceAdminId");
            return (Criteria) this;
        }

        public Criteria andSourceAdminIdNotEqualTo(String value) {
            addCriterion("SOURCE_ADMIN_ID <>", value, "sourceAdminId");
            return (Criteria) this;
        }

        public Criteria andSourceAdminIdGreaterThan(String value) {
            addCriterion("SOURCE_ADMIN_ID >", value, "sourceAdminId");
            return (Criteria) this;
        }

        public Criteria andSourceAdminIdGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_ADMIN_ID >=", value, "sourceAdminId");
            return (Criteria) this;
        }

        public Criteria andSourceAdminIdLessThan(String value) {
            addCriterion("SOURCE_ADMIN_ID <", value, "sourceAdminId");
            return (Criteria) this;
        }

        public Criteria andSourceAdminIdLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_ADMIN_ID <=", value, "sourceAdminId");
            return (Criteria) this;
        }

        public Criteria andSourceAdminIdLike(String value) {
            addCriterion("SOURCE_ADMIN_ID like", value, "sourceAdminId");
            return (Criteria) this;
        }

        public Criteria andSourceAdminIdNotLike(String value) {
            addCriterion("SOURCE_ADMIN_ID not like", value, "sourceAdminId");
            return (Criteria) this;
        }

        public Criteria andSourceAdminIdIn(List<String> values) {
            addCriterion("SOURCE_ADMIN_ID in", values, "sourceAdminId");
            return (Criteria) this;
        }

        public Criteria andSourceAdminIdNotIn(List<String> values) {
            addCriterion("SOURCE_ADMIN_ID not in", values, "sourceAdminId");
            return (Criteria) this;
        }

        public Criteria andSourceAdminIdBetween(String value1, String value2) {
            addCriterion("SOURCE_ADMIN_ID between", value1, value2, "sourceAdminId");
            return (Criteria) this;
        }

        public Criteria andSourceAdminIdNotBetween(String value1, String value2) {
            addCriterion("SOURCE_ADMIN_ID not between", value1, value2, "sourceAdminId");
            return (Criteria) this;
        }

        public Criteria andSourceAdminNameIsNull() {
            addCriterion("SOURCE_ADMIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSourceAdminNameIsNotNull() {
            addCriterion("SOURCE_ADMIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSourceAdminNameEqualTo(String value) {
            addCriterion("SOURCE_ADMIN_NAME =", value, "sourceAdminName");
            return (Criteria) this;
        }

        public Criteria andSourceAdminNameNotEqualTo(String value) {
            addCriterion("SOURCE_ADMIN_NAME <>", value, "sourceAdminName");
            return (Criteria) this;
        }

        public Criteria andSourceAdminNameGreaterThan(String value) {
            addCriterion("SOURCE_ADMIN_NAME >", value, "sourceAdminName");
            return (Criteria) this;
        }

        public Criteria andSourceAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_ADMIN_NAME >=", value, "sourceAdminName");
            return (Criteria) this;
        }

        public Criteria andSourceAdminNameLessThan(String value) {
            addCriterion("SOURCE_ADMIN_NAME <", value, "sourceAdminName");
            return (Criteria) this;
        }

        public Criteria andSourceAdminNameLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_ADMIN_NAME <=", value, "sourceAdminName");
            return (Criteria) this;
        }

        public Criteria andSourceAdminNameLike(String value) {
            addCriterion("SOURCE_ADMIN_NAME like", value, "sourceAdminName");
            return (Criteria) this;
        }

        public Criteria andSourceAdminNameNotLike(String value) {
            addCriterion("SOURCE_ADMIN_NAME not like", value, "sourceAdminName");
            return (Criteria) this;
        }

        public Criteria andSourceAdminNameIn(List<String> values) {
            addCriterion("SOURCE_ADMIN_NAME in", values, "sourceAdminName");
            return (Criteria) this;
        }

        public Criteria andSourceAdminNameNotIn(List<String> values) {
            addCriterion("SOURCE_ADMIN_NAME not in", values, "sourceAdminName");
            return (Criteria) this;
        }

        public Criteria andSourceAdminNameBetween(String value1, String value2) {
            addCriterion("SOURCE_ADMIN_NAME between", value1, value2, "sourceAdminName");
            return (Criteria) this;
        }

        public Criteria andSourceAdminNameNotBetween(String value1, String value2) {
            addCriterion("SOURCE_ADMIN_NAME not between", value1, value2, "sourceAdminName");
            return (Criteria) this;
        }

        public Criteria andTargetAdminIdIsNull() {
            addCriterion("TARGET_ADMIN_ID is null");
            return (Criteria) this;
        }

        public Criteria andTargetAdminIdIsNotNull() {
            addCriterion("TARGET_ADMIN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTargetAdminIdEqualTo(String value) {
            addCriterion("TARGET_ADMIN_ID =", value, "targetAdminId");
            return (Criteria) this;
        }

        public Criteria andTargetAdminIdNotEqualTo(String value) {
            addCriterion("TARGET_ADMIN_ID <>", value, "targetAdminId");
            return (Criteria) this;
        }

        public Criteria andTargetAdminIdGreaterThan(String value) {
            addCriterion("TARGET_ADMIN_ID >", value, "targetAdminId");
            return (Criteria) this;
        }

        public Criteria andTargetAdminIdGreaterThanOrEqualTo(String value) {
            addCriterion("TARGET_ADMIN_ID >=", value, "targetAdminId");
            return (Criteria) this;
        }

        public Criteria andTargetAdminIdLessThan(String value) {
            addCriterion("TARGET_ADMIN_ID <", value, "targetAdminId");
            return (Criteria) this;
        }

        public Criteria andTargetAdminIdLessThanOrEqualTo(String value) {
            addCriterion("TARGET_ADMIN_ID <=", value, "targetAdminId");
            return (Criteria) this;
        }

        public Criteria andTargetAdminIdLike(String value) {
            addCriterion("TARGET_ADMIN_ID like", value, "targetAdminId");
            return (Criteria) this;
        }

        public Criteria andTargetAdminIdNotLike(String value) {
            addCriterion("TARGET_ADMIN_ID not like", value, "targetAdminId");
            return (Criteria) this;
        }

        public Criteria andTargetAdminIdIn(List<String> values) {
            addCriterion("TARGET_ADMIN_ID in", values, "targetAdminId");
            return (Criteria) this;
        }

        public Criteria andTargetAdminIdNotIn(List<String> values) {
            addCriterion("TARGET_ADMIN_ID not in", values, "targetAdminId");
            return (Criteria) this;
        }

        public Criteria andTargetAdminIdBetween(String value1, String value2) {
            addCriterion("TARGET_ADMIN_ID between", value1, value2, "targetAdminId");
            return (Criteria) this;
        }

        public Criteria andTargetAdminIdNotBetween(String value1, String value2) {
            addCriterion("TARGET_ADMIN_ID not between", value1, value2, "targetAdminId");
            return (Criteria) this;
        }

        public Criteria andTargetAdminNameIsNull() {
            addCriterion("TARGET_ADMIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTargetAdminNameIsNotNull() {
            addCriterion("TARGET_ADMIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTargetAdminNameEqualTo(String value) {
            addCriterion("TARGET_ADMIN_NAME =", value, "targetAdminName");
            return (Criteria) this;
        }

        public Criteria andTargetAdminNameNotEqualTo(String value) {
            addCriterion("TARGET_ADMIN_NAME <>", value, "targetAdminName");
            return (Criteria) this;
        }

        public Criteria andTargetAdminNameGreaterThan(String value) {
            addCriterion("TARGET_ADMIN_NAME >", value, "targetAdminName");
            return (Criteria) this;
        }

        public Criteria andTargetAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("TARGET_ADMIN_NAME >=", value, "targetAdminName");
            return (Criteria) this;
        }

        public Criteria andTargetAdminNameLessThan(String value) {
            addCriterion("TARGET_ADMIN_NAME <", value, "targetAdminName");
            return (Criteria) this;
        }

        public Criteria andTargetAdminNameLessThanOrEqualTo(String value) {
            addCriterion("TARGET_ADMIN_NAME <=", value, "targetAdminName");
            return (Criteria) this;
        }

        public Criteria andTargetAdminNameLike(String value) {
            addCriterion("TARGET_ADMIN_NAME like", value, "targetAdminName");
            return (Criteria) this;
        }

        public Criteria andTargetAdminNameNotLike(String value) {
            addCriterion("TARGET_ADMIN_NAME not like", value, "targetAdminName");
            return (Criteria) this;
        }

        public Criteria andTargetAdminNameIn(List<String> values) {
            addCriterion("TARGET_ADMIN_NAME in", values, "targetAdminName");
            return (Criteria) this;
        }

        public Criteria andTargetAdminNameNotIn(List<String> values) {
            addCriterion("TARGET_ADMIN_NAME not in", values, "targetAdminName");
            return (Criteria) this;
        }

        public Criteria andTargetAdminNameBetween(String value1, String value2) {
            addCriterion("TARGET_ADMIN_NAME between", value1, value2, "targetAdminName");
            return (Criteria) this;
        }

        public Criteria andTargetAdminNameNotBetween(String value1, String value2) {
            addCriterion("TARGET_ADMIN_NAME not between", value1, value2, "targetAdminName");
            return (Criteria) this;
        }

        public Criteria andIsAccessIsNull() {
            addCriterion("IS_ACCESS is null");
            return (Criteria) this;
        }

        public Criteria andIsAccessIsNotNull() {
            addCriterion("IS_ACCESS is not null");
            return (Criteria) this;
        }

        public Criteria andIsAccessEqualTo(Integer value) {
            addCriterion("IS_ACCESS =", value, "isAccess");
            return (Criteria) this;
        }

        public Criteria andIsAccessNotEqualTo(Integer value) {
            addCriterion("IS_ACCESS <>", value, "isAccess");
            return (Criteria) this;
        }

        public Criteria andIsAccessGreaterThan(Integer value) {
            addCriterion("IS_ACCESS >", value, "isAccess");
            return (Criteria) this;
        }

        public Criteria andIsAccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_ACCESS >=", value, "isAccess");
            return (Criteria) this;
        }

        public Criteria andIsAccessLessThan(Integer value) {
            addCriterion("IS_ACCESS <", value, "isAccess");
            return (Criteria) this;
        }

        public Criteria andIsAccessLessThanOrEqualTo(Integer value) {
            addCriterion("IS_ACCESS <=", value, "isAccess");
            return (Criteria) this;
        }

        public Criteria andIsAccessIn(List<Integer> values) {
            addCriterion("IS_ACCESS in", values, "isAccess");
            return (Criteria) this;
        }

        public Criteria andIsAccessNotIn(List<Integer> values) {
            addCriterion("IS_ACCESS not in", values, "isAccess");
            return (Criteria) this;
        }

        public Criteria andIsAccessBetween(Integer value1, Integer value2) {
            addCriterion("IS_ACCESS between", value1, value2, "isAccess");
            return (Criteria) this;
        }

        public Criteria andIsAccessNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_ACCESS not between", value1, value2, "isAccess");
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

        public Criteria andAccessRejectTimeIsNull() {
            addCriterion("ACCESS_REJECT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAccessRejectTimeIsNotNull() {
            addCriterion("ACCESS_REJECT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAccessRejectTimeEqualTo(Timestamp value) {
            addCriterion("ACCESS_REJECT_TIME =", value, "accessRejectTime");
            return (Criteria) this;
        }

        public Criteria andAccessRejectTimeNotEqualTo(Timestamp value) {
            addCriterion("ACCESS_REJECT_TIME <>", value, "accessRejectTime");
            return (Criteria) this;
        }

        public Criteria andAccessRejectTimeGreaterThan(Timestamp value) {
            addCriterion("ACCESS_REJECT_TIME >", value, "accessRejectTime");
            return (Criteria) this;
        }

        public Criteria andAccessRejectTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("ACCESS_REJECT_TIME >=", value, "accessRejectTime");
            return (Criteria) this;
        }

        public Criteria andAccessRejectTimeLessThan(Timestamp value) {
            addCriterion("ACCESS_REJECT_TIME <", value, "accessRejectTime");
            return (Criteria) this;
        }

        public Criteria andAccessRejectTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("ACCESS_REJECT_TIME <=", value, "accessRejectTime");
            return (Criteria) this;
        }

        public Criteria andAccessRejectTimeIn(List<Timestamp> values) {
            addCriterion("ACCESS_REJECT_TIME in", values, "accessRejectTime");
            return (Criteria) this;
        }

        public Criteria andAccessRejectTimeNotIn(List<Timestamp> values) {
            addCriterion("ACCESS_REJECT_TIME not in", values, "accessRejectTime");
            return (Criteria) this;
        }

        public Criteria andAccessRejectTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("ACCESS_REJECT_TIME between", value1, value2, "accessRejectTime");
            return (Criteria) this;
        }

        public Criteria andAccessRejectTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("ACCESS_REJECT_TIME not between", value1, value2, "accessRejectTime");
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