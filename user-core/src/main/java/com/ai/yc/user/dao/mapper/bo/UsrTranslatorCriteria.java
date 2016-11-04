package com.ai.yc.user.dao.mapper.bo;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class UsrTranslatorCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public UsrTranslatorCriteria() {
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

        public Criteria andLspRoleIsNull() {
            addCriterion("LSP_ROLE is null");
            return (Criteria) this;
        }

        public Criteria andLspRoleIsNotNull() {
            addCriterion("LSP_ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andLspRoleEqualTo(String value) {
            addCriterion("LSP_ROLE =", value, "lspRole");
            return (Criteria) this;
        }

        public Criteria andLspRoleNotEqualTo(String value) {
            addCriterion("LSP_ROLE <>", value, "lspRole");
            return (Criteria) this;
        }

        public Criteria andLspRoleGreaterThan(String value) {
            addCriterion("LSP_ROLE >", value, "lspRole");
            return (Criteria) this;
        }

        public Criteria andLspRoleGreaterThanOrEqualTo(String value) {
            addCriterion("LSP_ROLE >=", value, "lspRole");
            return (Criteria) this;
        }

        public Criteria andLspRoleLessThan(String value) {
            addCriterion("LSP_ROLE <", value, "lspRole");
            return (Criteria) this;
        }

        public Criteria andLspRoleLessThanOrEqualTo(String value) {
            addCriterion("LSP_ROLE <=", value, "lspRole");
            return (Criteria) this;
        }

        public Criteria andLspRoleLike(String value) {
            addCriterion("LSP_ROLE like", value, "lspRole");
            return (Criteria) this;
        }

        public Criteria andLspRoleNotLike(String value) {
            addCriterion("LSP_ROLE not like", value, "lspRole");
            return (Criteria) this;
        }

        public Criteria andLspRoleIn(List<String> values) {
            addCriterion("LSP_ROLE in", values, "lspRole");
            return (Criteria) this;
        }

        public Criteria andLspRoleNotIn(List<String> values) {
            addCriterion("LSP_ROLE not in", values, "lspRole");
            return (Criteria) this;
        }

        public Criteria andLspRoleBetween(String value1, String value2) {
            addCriterion("LSP_ROLE between", value1, value2, "lspRole");
            return (Criteria) this;
        }

        public Criteria andLspRoleNotBetween(String value1, String value2) {
            addCriterion("LSP_ROLE not between", value1, value2, "lspRole");
            return (Criteria) this;
        }

        public Criteria andWorkingLifeIsNull() {
            addCriterion("WORKING_LIFE is null");
            return (Criteria) this;
        }

        public Criteria andWorkingLifeIsNotNull() {
            addCriterion("WORKING_LIFE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkingLifeEqualTo(Integer value) {
            addCriterion("WORKING_LIFE =", value, "workingLife");
            return (Criteria) this;
        }

        public Criteria andWorkingLifeNotEqualTo(Integer value) {
            addCriterion("WORKING_LIFE <>", value, "workingLife");
            return (Criteria) this;
        }

        public Criteria andWorkingLifeGreaterThan(Integer value) {
            addCriterion("WORKING_LIFE >", value, "workingLife");
            return (Criteria) this;
        }

        public Criteria andWorkingLifeGreaterThanOrEqualTo(Integer value) {
            addCriterion("WORKING_LIFE >=", value, "workingLife");
            return (Criteria) this;
        }

        public Criteria andWorkingLifeLessThan(Integer value) {
            addCriterion("WORKING_LIFE <", value, "workingLife");
            return (Criteria) this;
        }

        public Criteria andWorkingLifeLessThanOrEqualTo(Integer value) {
            addCriterion("WORKING_LIFE <=", value, "workingLife");
            return (Criteria) this;
        }

        public Criteria andWorkingLifeIn(List<Integer> values) {
            addCriterion("WORKING_LIFE in", values, "workingLife");
            return (Criteria) this;
        }

        public Criteria andWorkingLifeNotIn(List<Integer> values) {
            addCriterion("WORKING_LIFE not in", values, "workingLife");
            return (Criteria) this;
        }

        public Criteria andWorkingLifeBetween(Integer value1, Integer value2) {
            addCriterion("WORKING_LIFE between", value1, value2, "workingLife");
            return (Criteria) this;
        }

        public Criteria andWorkingLifeNotBetween(Integer value1, Integer value2) {
            addCriterion("WORKING_LIFE not between", value1, value2, "workingLife");
            return (Criteria) this;
        }

        public Criteria andMotherTongueIsNull() {
            addCriterion("MOTHER_TONGUE is null");
            return (Criteria) this;
        }

        public Criteria andMotherTongueIsNotNull() {
            addCriterion("MOTHER_TONGUE is not null");
            return (Criteria) this;
        }

        public Criteria andMotherTongueEqualTo(String value) {
            addCriterion("MOTHER_TONGUE =", value, "motherTongue");
            return (Criteria) this;
        }

        public Criteria andMotherTongueNotEqualTo(String value) {
            addCriterion("MOTHER_TONGUE <>", value, "motherTongue");
            return (Criteria) this;
        }

        public Criteria andMotherTongueGreaterThan(String value) {
            addCriterion("MOTHER_TONGUE >", value, "motherTongue");
            return (Criteria) this;
        }

        public Criteria andMotherTongueGreaterThanOrEqualTo(String value) {
            addCriterion("MOTHER_TONGUE >=", value, "motherTongue");
            return (Criteria) this;
        }

        public Criteria andMotherTongueLessThan(String value) {
            addCriterion("MOTHER_TONGUE <", value, "motherTongue");
            return (Criteria) this;
        }

        public Criteria andMotherTongueLessThanOrEqualTo(String value) {
            addCriterion("MOTHER_TONGUE <=", value, "motherTongue");
            return (Criteria) this;
        }

        public Criteria andMotherTongueLike(String value) {
            addCriterion("MOTHER_TONGUE like", value, "motherTongue");
            return (Criteria) this;
        }

        public Criteria andMotherTongueNotLike(String value) {
            addCriterion("MOTHER_TONGUE not like", value, "motherTongue");
            return (Criteria) this;
        }

        public Criteria andMotherTongueIn(List<String> values) {
            addCriterion("MOTHER_TONGUE in", values, "motherTongue");
            return (Criteria) this;
        }

        public Criteria andMotherTongueNotIn(List<String> values) {
            addCriterion("MOTHER_TONGUE not in", values, "motherTongue");
            return (Criteria) this;
        }

        public Criteria andMotherTongueBetween(String value1, String value2) {
            addCriterion("MOTHER_TONGUE between", value1, value2, "motherTongue");
            return (Criteria) this;
        }

        public Criteria andMotherTongueNotBetween(String value1, String value2) {
            addCriterion("MOTHER_TONGUE not between", value1, value2, "motherTongue");
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

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andTranslationTypeIsNull() {
            addCriterion("TRANSLATION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTranslationTypeIsNotNull() {
            addCriterion("TRANSLATION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTranslationTypeEqualTo(String value) {
            addCriterion("TRANSLATION_TYPE =", value, "translationType");
            return (Criteria) this;
        }

        public Criteria andTranslationTypeNotEqualTo(String value) {
            addCriterion("TRANSLATION_TYPE <>", value, "translationType");
            return (Criteria) this;
        }

        public Criteria andTranslationTypeGreaterThan(String value) {
            addCriterion("TRANSLATION_TYPE >", value, "translationType");
            return (Criteria) this;
        }

        public Criteria andTranslationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSLATION_TYPE >=", value, "translationType");
            return (Criteria) this;
        }

        public Criteria andTranslationTypeLessThan(String value) {
            addCriterion("TRANSLATION_TYPE <", value, "translationType");
            return (Criteria) this;
        }

        public Criteria andTranslationTypeLessThanOrEqualTo(String value) {
            addCriterion("TRANSLATION_TYPE <=", value, "translationType");
            return (Criteria) this;
        }

        public Criteria andTranslationTypeLike(String value) {
            addCriterion("TRANSLATION_TYPE like", value, "translationType");
            return (Criteria) this;
        }

        public Criteria andTranslationTypeNotLike(String value) {
            addCriterion("TRANSLATION_TYPE not like", value, "translationType");
            return (Criteria) this;
        }

        public Criteria andTranslationTypeIn(List<String> values) {
            addCriterion("TRANSLATION_TYPE in", values, "translationType");
            return (Criteria) this;
        }

        public Criteria andTranslationTypeNotIn(List<String> values) {
            addCriterion("TRANSLATION_TYPE not in", values, "translationType");
            return (Criteria) this;
        }

        public Criteria andTranslationTypeBetween(String value1, String value2) {
            addCriterion("TRANSLATION_TYPE between", value1, value2, "translationType");
            return (Criteria) this;
        }

        public Criteria andTranslationTypeNotBetween(String value1, String value2) {
            addCriterion("TRANSLATION_TYPE not between", value1, value2, "translationType");
            return (Criteria) this;
        }

        public Criteria andInterpretPriceIsNull() {
            addCriterion("INTERPRET_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andInterpretPriceIsNotNull() {
            addCriterion("INTERPRET_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andInterpretPriceEqualTo(BigDecimal value) {
            addCriterion("INTERPRET_PRICE =", value, "interpretPrice");
            return (Criteria) this;
        }

        public Criteria andInterpretPriceNotEqualTo(BigDecimal value) {
            addCriterion("INTERPRET_PRICE <>", value, "interpretPrice");
            return (Criteria) this;
        }

        public Criteria andInterpretPriceGreaterThan(BigDecimal value) {
            addCriterion("INTERPRET_PRICE >", value, "interpretPrice");
            return (Criteria) this;
        }

        public Criteria andInterpretPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INTERPRET_PRICE >=", value, "interpretPrice");
            return (Criteria) this;
        }

        public Criteria andInterpretPriceLessThan(BigDecimal value) {
            addCriterion("INTERPRET_PRICE <", value, "interpretPrice");
            return (Criteria) this;
        }

        public Criteria andInterpretPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INTERPRET_PRICE <=", value, "interpretPrice");
            return (Criteria) this;
        }

        public Criteria andInterpretPriceIn(List<BigDecimal> values) {
            addCriterion("INTERPRET_PRICE in", values, "interpretPrice");
            return (Criteria) this;
        }

        public Criteria andInterpretPriceNotIn(List<BigDecimal> values) {
            addCriterion("INTERPRET_PRICE not in", values, "interpretPrice");
            return (Criteria) this;
        }

        public Criteria andInterpretPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INTERPRET_PRICE between", value1, value2, "interpretPrice");
            return (Criteria) this;
        }

        public Criteria andInterpretPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INTERPRET_PRICE not between", value1, value2, "interpretPrice");
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

        public Criteria andLastModifyTimeIsNull() {
            addCriterion("LAST_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIsNotNull() {
            addCriterion("LAST_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeEqualTo(Timestamp value) {
            addCriterion("LAST_MODIFY_TIME =", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotEqualTo(Timestamp value) {
            addCriterion("LAST_MODIFY_TIME <>", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThan(Timestamp value) {
            addCriterion("LAST_MODIFY_TIME >", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("LAST_MODIFY_TIME >=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThan(Timestamp value) {
            addCriterion("LAST_MODIFY_TIME <", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("LAST_MODIFY_TIME <=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIn(List<Timestamp> values) {
            addCriterion("LAST_MODIFY_TIME in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotIn(List<Timestamp> values) {
            addCriterion("LAST_MODIFY_TIME not in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("LAST_MODIFY_TIME between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("LAST_MODIFY_TIME not between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("INTRODUCTION is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("INTRODUCTION is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("INTRODUCTION =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("INTRODUCTION <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("INTRODUCTION >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("INTRODUCTION >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("INTRODUCTION <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("INTRODUCTION <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("INTRODUCTION like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("INTRODUCTION not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("INTRODUCTION in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("INTRODUCTION not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("INTRODUCTION between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("INTRODUCTION not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIsLspIsNull() {
            addCriterion("IS_LSP is null");
            return (Criteria) this;
        }

        public Criteria andIsLspIsNotNull() {
            addCriterion("IS_LSP is not null");
            return (Criteria) this;
        }

        public Criteria andIsLspEqualTo(Integer value) {
            addCriterion("IS_LSP =", value, "isLsp");
            return (Criteria) this;
        }

        public Criteria andIsLspNotEqualTo(Integer value) {
            addCriterion("IS_LSP <>", value, "isLsp");
            return (Criteria) this;
        }

        public Criteria andIsLspGreaterThan(Integer value) {
            addCriterion("IS_LSP >", value, "isLsp");
            return (Criteria) this;
        }

        public Criteria andIsLspGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_LSP >=", value, "isLsp");
            return (Criteria) this;
        }

        public Criteria andIsLspLessThan(Integer value) {
            addCriterion("IS_LSP <", value, "isLsp");
            return (Criteria) this;
        }

        public Criteria andIsLspLessThanOrEqualTo(Integer value) {
            addCriterion("IS_LSP <=", value, "isLsp");
            return (Criteria) this;
        }

        public Criteria andIsLspIn(List<Integer> values) {
            addCriterion("IS_LSP in", values, "isLsp");
            return (Criteria) this;
        }

        public Criteria andIsLspNotIn(List<Integer> values) {
            addCriterion("IS_LSP not in", values, "isLsp");
            return (Criteria) this;
        }

        public Criteria andIsLspBetween(Integer value1, Integer value2) {
            addCriterion("IS_LSP between", value1, value2, "isLsp");
            return (Criteria) this;
        }

        public Criteria andIsLspNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_LSP not between", value1, value2, "isLsp");
            return (Criteria) this;
        }

        public Criteria andVipLevelIsNull() {
            addCriterion("VIP_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andVipLevelIsNotNull() {
            addCriterion("VIP_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andVipLevelEqualTo(String value) {
            addCriterion("VIP_LEVEL =", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotEqualTo(String value) {
            addCriterion("VIP_LEVEL <>", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelGreaterThan(String value) {
            addCriterion("VIP_LEVEL >", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelGreaterThanOrEqualTo(String value) {
            addCriterion("VIP_LEVEL >=", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelLessThan(String value) {
            addCriterion("VIP_LEVEL <", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelLessThanOrEqualTo(String value) {
            addCriterion("VIP_LEVEL <=", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelLike(String value) {
            addCriterion("VIP_LEVEL like", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotLike(String value) {
            addCriterion("VIP_LEVEL not like", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelIn(List<String> values) {
            addCriterion("VIP_LEVEL in", values, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotIn(List<String> values) {
            addCriterion("VIP_LEVEL not in", values, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelBetween(String value1, String value2) {
            addCriterion("VIP_LEVEL between", value1, value2, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotBetween(String value1, String value2) {
            addCriterion("VIP_LEVEL not between", value1, value2, "vipLevel");
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