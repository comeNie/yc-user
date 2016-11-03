package com.ai.yc.user.dao.mapper.bo;

import java.util.ArrayList;
import java.util.List;

public class UsrCompanyRelationCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public UsrCompanyRelationCriteria() {
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

        public Criteria andPkUserIsNull() {
            addCriterion("PK_USER is null");
            return (Criteria) this;
        }

        public Criteria andPkUserIsNotNull() {
            addCriterion("PK_USER is not null");
            return (Criteria) this;
        }

        public Criteria andPkUserEqualTo(Long value) {
            addCriterion("PK_USER =", value, "pkUser");
            return (Criteria) this;
        }

        public Criteria andPkUserNotEqualTo(Long value) {
            addCriterion("PK_USER <>", value, "pkUser");
            return (Criteria) this;
        }

        public Criteria andPkUserGreaterThan(Long value) {
            addCriterion("PK_USER >", value, "pkUser");
            return (Criteria) this;
        }

        public Criteria andPkUserGreaterThanOrEqualTo(Long value) {
            addCriterion("PK_USER >=", value, "pkUser");
            return (Criteria) this;
        }

        public Criteria andPkUserLessThan(Long value) {
            addCriterion("PK_USER <", value, "pkUser");
            return (Criteria) this;
        }

        public Criteria andPkUserLessThanOrEqualTo(Long value) {
            addCriterion("PK_USER <=", value, "pkUser");
            return (Criteria) this;
        }

        public Criteria andPkUserIn(List<Long> values) {
            addCriterion("PK_USER in", values, "pkUser");
            return (Criteria) this;
        }

        public Criteria andPkUserNotIn(List<Long> values) {
            addCriterion("PK_USER not in", values, "pkUser");
            return (Criteria) this;
        }

        public Criteria andPkUserBetween(Long value1, Long value2) {
            addCriterion("PK_USER between", value1, value2, "pkUser");
            return (Criteria) this;
        }

        public Criteria andPkUserNotBetween(Long value1, Long value2) {
            addCriterion("PK_USER not between", value1, value2, "pkUser");
            return (Criteria) this;
        }

        public Criteria andPkLspIsNull() {
            addCriterion("PK_LSP is null");
            return (Criteria) this;
        }

        public Criteria andPkLspIsNotNull() {
            addCriterion("PK_LSP is not null");
            return (Criteria) this;
        }

        public Criteria andPkLspEqualTo(Long value) {
            addCriterion("PK_LSP =", value, "pkLsp");
            return (Criteria) this;
        }

        public Criteria andPkLspNotEqualTo(Long value) {
            addCriterion("PK_LSP <>", value, "pkLsp");
            return (Criteria) this;
        }

        public Criteria andPkLspGreaterThan(Long value) {
            addCriterion("PK_LSP >", value, "pkLsp");
            return (Criteria) this;
        }

        public Criteria andPkLspGreaterThanOrEqualTo(Long value) {
            addCriterion("PK_LSP >=", value, "pkLsp");
            return (Criteria) this;
        }

        public Criteria andPkLspLessThan(Long value) {
            addCriterion("PK_LSP <", value, "pkLsp");
            return (Criteria) this;
        }

        public Criteria andPkLspLessThanOrEqualTo(Long value) {
            addCriterion("PK_LSP <=", value, "pkLsp");
            return (Criteria) this;
        }

        public Criteria andPkLspIn(List<Long> values) {
            addCriterion("PK_LSP in", values, "pkLsp");
            return (Criteria) this;
        }

        public Criteria andPkLspNotIn(List<Long> values) {
            addCriterion("PK_LSP not in", values, "pkLsp");
            return (Criteria) this;
        }

        public Criteria andPkLspBetween(Long value1, Long value2) {
            addCriterion("PK_LSP between", value1, value2, "pkLsp");
            return (Criteria) this;
        }

        public Criteria andPkLspNotBetween(Long value1, Long value2) {
            addCriterion("PK_LSP not between", value1, value2, "pkLsp");
            return (Criteria) this;
        }

        public Criteria andIfManagementIsNull() {
            addCriterion("IF_MANAGEMENT is null");
            return (Criteria) this;
        }

        public Criteria andIfManagementIsNotNull() {
            addCriterion("IF_MANAGEMENT is not null");
            return (Criteria) this;
        }

        public Criteria andIfManagementEqualTo(Integer value) {
            addCriterion("IF_MANAGEMENT =", value, "ifManagement");
            return (Criteria) this;
        }

        public Criteria andIfManagementNotEqualTo(Integer value) {
            addCriterion("IF_MANAGEMENT <>", value, "ifManagement");
            return (Criteria) this;
        }

        public Criteria andIfManagementGreaterThan(Integer value) {
            addCriterion("IF_MANAGEMENT >", value, "ifManagement");
            return (Criteria) this;
        }

        public Criteria andIfManagementGreaterThanOrEqualTo(Integer value) {
            addCriterion("IF_MANAGEMENT >=", value, "ifManagement");
            return (Criteria) this;
        }

        public Criteria andIfManagementLessThan(Integer value) {
            addCriterion("IF_MANAGEMENT <", value, "ifManagement");
            return (Criteria) this;
        }

        public Criteria andIfManagementLessThanOrEqualTo(Integer value) {
            addCriterion("IF_MANAGEMENT <=", value, "ifManagement");
            return (Criteria) this;
        }

        public Criteria andIfManagementIn(List<Integer> values) {
            addCriterion("IF_MANAGEMENT in", values, "ifManagement");
            return (Criteria) this;
        }

        public Criteria andIfManagementNotIn(List<Integer> values) {
            addCriterion("IF_MANAGEMENT not in", values, "ifManagement");
            return (Criteria) this;
        }

        public Criteria andIfManagementBetween(Integer value1, Integer value2) {
            addCriterion("IF_MANAGEMENT between", value1, value2, "ifManagement");
            return (Criteria) this;
        }

        public Criteria andIfManagementNotBetween(Integer value1, Integer value2) {
            addCriterion("IF_MANAGEMENT not between", value1, value2, "ifManagement");
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