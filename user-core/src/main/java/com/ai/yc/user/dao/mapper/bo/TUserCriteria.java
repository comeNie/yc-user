package com.ai.yc.user.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class TUserCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public TUserCriteria() {
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

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andLastnameIsNull() {
            addCriterion("lastname is null");
            return (Criteria) this;
        }

        public Criteria andLastnameIsNotNull() {
            addCriterion("lastname is not null");
            return (Criteria) this;
        }

        public Criteria andLastnameEqualTo(String value) {
            addCriterion("lastname =", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotEqualTo(String value) {
            addCriterion("lastname <>", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameGreaterThan(String value) {
            addCriterion("lastname >", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameGreaterThanOrEqualTo(String value) {
            addCriterion("lastname >=", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLessThan(String value) {
            addCriterion("lastname <", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLessThanOrEqualTo(String value) {
            addCriterion("lastname <=", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLike(String value) {
            addCriterion("lastname like", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotLike(String value) {
            addCriterion("lastname not like", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameIn(List<String> values) {
            addCriterion("lastname in", values, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotIn(List<String> values) {
            addCriterion("lastname not in", values, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameBetween(String value1, String value2) {
            addCriterion("lastname between", value1, value2, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotBetween(String value1, String value2) {
            addCriterion("lastname not between", value1, value2, "lastname");
            return (Criteria) this;
        }

        public Criteria andFirstnameIsNull() {
            addCriterion("firstname is null");
            return (Criteria) this;
        }

        public Criteria andFirstnameIsNotNull() {
            addCriterion("firstname is not null");
            return (Criteria) this;
        }

        public Criteria andFirstnameEqualTo(String value) {
            addCriterion("firstname =", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotEqualTo(String value) {
            addCriterion("firstname <>", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameGreaterThan(String value) {
            addCriterion("firstname >", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameGreaterThanOrEqualTo(String value) {
            addCriterion("firstname >=", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLessThan(String value) {
            addCriterion("firstname <", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLessThanOrEqualTo(String value) {
            addCriterion("firstname <=", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLike(String value) {
            addCriterion("firstname like", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotLike(String value) {
            addCriterion("firstname not like", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameIn(List<String> values) {
            addCriterion("firstname in", values, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotIn(List<String> values) {
            addCriterion("firstname not in", values, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameBetween(String value1, String value2) {
            addCriterion("firstname between", value1, value2, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotBetween(String value1, String value2) {
            addCriterion("firstname not between", value1, value2, "firstname");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andYearsWorkIsNull() {
            addCriterion("years_work is null");
            return (Criteria) this;
        }

        public Criteria andYearsWorkIsNotNull() {
            addCriterion("years_work is not null");
            return (Criteria) this;
        }

        public Criteria andYearsWorkEqualTo(Integer value) {
            addCriterion("years_work =", value, "yearsWork");
            return (Criteria) this;
        }

        public Criteria andYearsWorkNotEqualTo(Integer value) {
            addCriterion("years_work <>", value, "yearsWork");
            return (Criteria) this;
        }

        public Criteria andYearsWorkGreaterThan(Integer value) {
            addCriterion("years_work >", value, "yearsWork");
            return (Criteria) this;
        }

        public Criteria andYearsWorkGreaterThanOrEqualTo(Integer value) {
            addCriterion("years_work >=", value, "yearsWork");
            return (Criteria) this;
        }

        public Criteria andYearsWorkLessThan(Integer value) {
            addCriterion("years_work <", value, "yearsWork");
            return (Criteria) this;
        }

        public Criteria andYearsWorkLessThanOrEqualTo(Integer value) {
            addCriterion("years_work <=", value, "yearsWork");
            return (Criteria) this;
        }

        public Criteria andYearsWorkIn(List<Integer> values) {
            addCriterion("years_work in", values, "yearsWork");
            return (Criteria) this;
        }

        public Criteria andYearsWorkNotIn(List<Integer> values) {
            addCriterion("years_work not in", values, "yearsWork");
            return (Criteria) this;
        }

        public Criteria andYearsWorkBetween(Integer value1, Integer value2) {
            addCriterion("years_work between", value1, value2, "yearsWork");
            return (Criteria) this;
        }

        public Criteria andYearsWorkNotBetween(Integer value1, Integer value2) {
            addCriterion("years_work not between", value1, value2, "yearsWork");
            return (Criteria) this;
        }

        public Criteria andNativeLangIsNull() {
            addCriterion("native_lang is null");
            return (Criteria) this;
        }

        public Criteria andNativeLangIsNotNull() {
            addCriterion("native_lang is not null");
            return (Criteria) this;
        }

        public Criteria andNativeLangEqualTo(String value) {
            addCriterion("native_lang =", value, "nativeLang");
            return (Criteria) this;
        }

        public Criteria andNativeLangNotEqualTo(String value) {
            addCriterion("native_lang <>", value, "nativeLang");
            return (Criteria) this;
        }

        public Criteria andNativeLangGreaterThan(String value) {
            addCriterion("native_lang >", value, "nativeLang");
            return (Criteria) this;
        }

        public Criteria andNativeLangGreaterThanOrEqualTo(String value) {
            addCriterion("native_lang >=", value, "nativeLang");
            return (Criteria) this;
        }

        public Criteria andNativeLangLessThan(String value) {
            addCriterion("native_lang <", value, "nativeLang");
            return (Criteria) this;
        }

        public Criteria andNativeLangLessThanOrEqualTo(String value) {
            addCriterion("native_lang <=", value, "nativeLang");
            return (Criteria) this;
        }

        public Criteria andNativeLangLike(String value) {
            addCriterion("native_lang like", value, "nativeLang");
            return (Criteria) this;
        }

        public Criteria andNativeLangNotLike(String value) {
            addCriterion("native_lang not like", value, "nativeLang");
            return (Criteria) this;
        }

        public Criteria andNativeLangIn(List<String> values) {
            addCriterion("native_lang in", values, "nativeLang");
            return (Criteria) this;
        }

        public Criteria andNativeLangNotIn(List<String> values) {
            addCriterion("native_lang not in", values, "nativeLang");
            return (Criteria) this;
        }

        public Criteria andNativeLangBetween(String value1, String value2) {
            addCriterion("native_lang between", value1, value2, "nativeLang");
            return (Criteria) this;
        }

        public Criteria andNativeLangNotBetween(String value1, String value2) {
            addCriterion("native_lang not between", value1, value2, "nativeLang");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("TELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("TELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("TELEPHONE =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("TELEPHONE <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("TELEPHONE >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("TELEPHONE >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("TELEPHONE <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("TELEPHONE <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("TELEPHONE like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("TELEPHONE not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("TELEPHONE in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("TELEPHONE not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("TELEPHONE between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("TELEPHONE not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNull() {
            addCriterion("MOBILE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNotNull() {
            addCriterion("MOBILE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneEqualTo(String value) {
            addCriterion("MOBILE_PHONE =", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotEqualTo(String value) {
            addCriterion("MOBILE_PHONE <>", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThan(String value) {
            addCriterion("MOBILE_PHONE >", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE_PHONE >=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThan(String value) {
            addCriterion("MOBILE_PHONE <", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThanOrEqualTo(String value) {
            addCriterion("MOBILE_PHONE <=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLike(String value) {
            addCriterion("MOBILE_PHONE like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotLike(String value) {
            addCriterion("MOBILE_PHONE not like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIn(List<String> values) {
            addCriterion("MOBILE_PHONE in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotIn(List<String> values) {
            addCriterion("MOBILE_PHONE not in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneBetween(String value1, String value2) {
            addCriterion("MOBILE_PHONE between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotBetween(String value1, String value2) {
            addCriterion("MOBILE_PHONE not between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("CITY is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("CITY =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("CITY <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("CITY >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("CITY >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("CITY <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("CITY <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("CITY like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("CITY not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("CITY in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("CITY not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("CITY between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("CITY not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCnCityIsNull() {
            addCriterion("CN_CITY is null");
            return (Criteria) this;
        }

        public Criteria andCnCityIsNotNull() {
            addCriterion("CN_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCnCityEqualTo(String value) {
            addCriterion("CN_CITY =", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityNotEqualTo(String value) {
            addCriterion("CN_CITY <>", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityGreaterThan(String value) {
            addCriterion("CN_CITY >", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityGreaterThanOrEqualTo(String value) {
            addCriterion("CN_CITY >=", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityLessThan(String value) {
            addCriterion("CN_CITY <", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityLessThanOrEqualTo(String value) {
            addCriterion("CN_CITY <=", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityLike(String value) {
            addCriterion("CN_CITY like", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityNotLike(String value) {
            addCriterion("CN_CITY not like", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityIn(List<String> values) {
            addCriterion("CN_CITY in", values, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityNotIn(List<String> values) {
            addCriterion("CN_CITY not in", values, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityBetween(String value1, String value2) {
            addCriterion("CN_CITY between", value1, value2, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityNotBetween(String value1, String value2) {
            addCriterion("CN_CITY not between", value1, value2, "cnCity");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("PROVINCE =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("PROVINCE <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("PROVINCE >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("PROVINCE <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("PROVINCE like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("PROVINCE not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("PROVINCE in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("PROVINCE not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("PROVINCE between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("PROVINCE not between", value1, value2, "province");
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

        public Criteria andTimeZoneIsNull() {
            addCriterion("TIME_ZONE is null");
            return (Criteria) this;
        }

        public Criteria andTimeZoneIsNotNull() {
            addCriterion("TIME_ZONE is not null");
            return (Criteria) this;
        }

        public Criteria andTimeZoneEqualTo(String value) {
            addCriterion("TIME_ZONE =", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneNotEqualTo(String value) {
            addCriterion("TIME_ZONE <>", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneGreaterThan(String value) {
            addCriterion("TIME_ZONE >", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneGreaterThanOrEqualTo(String value) {
            addCriterion("TIME_ZONE >=", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneLessThan(String value) {
            addCriterion("TIME_ZONE <", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneLessThanOrEqualTo(String value) {
            addCriterion("TIME_ZONE <=", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneLike(String value) {
            addCriterion("TIME_ZONE like", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneNotLike(String value) {
            addCriterion("TIME_ZONE not like", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneIn(List<String> values) {
            addCriterion("TIME_ZONE in", values, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneNotIn(List<String> values) {
            addCriterion("TIME_ZONE not in", values, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneBetween(String value1, String value2) {
            addCriterion("TIME_ZONE between", value1, value2, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneNotBetween(String value1, String value2) {
            addCriterion("TIME_ZONE not between", value1, value2, "timeZone");
            return (Criteria) this;
        }

        public Criteria andIsRanslatorIsNull() {
            addCriterion("IS_RANSLATOR is null");
            return (Criteria) this;
        }

        public Criteria andIsRanslatorIsNotNull() {
            addCriterion("IS_RANSLATOR is not null");
            return (Criteria) this;
        }

        public Criteria andIsRanslatorEqualTo(Integer value) {
            addCriterion("IS_RANSLATOR =", value, "isRanslator");
            return (Criteria) this;
        }

        public Criteria andIsRanslatorNotEqualTo(Integer value) {
            addCriterion("IS_RANSLATOR <>", value, "isRanslator");
            return (Criteria) this;
        }

        public Criteria andIsRanslatorGreaterThan(Integer value) {
            addCriterion("IS_RANSLATOR >", value, "isRanslator");
            return (Criteria) this;
        }

        public Criteria andIsRanslatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_RANSLATOR >=", value, "isRanslator");
            return (Criteria) this;
        }

        public Criteria andIsRanslatorLessThan(Integer value) {
            addCriterion("IS_RANSLATOR <", value, "isRanslator");
            return (Criteria) this;
        }

        public Criteria andIsRanslatorLessThanOrEqualTo(Integer value) {
            addCriterion("IS_RANSLATOR <=", value, "isRanslator");
            return (Criteria) this;
        }

        public Criteria andIsRanslatorIn(List<Integer> values) {
            addCriterion("IS_RANSLATOR in", values, "isRanslator");
            return (Criteria) this;
        }

        public Criteria andIsRanslatorNotIn(List<Integer> values) {
            addCriterion("IS_RANSLATOR not in", values, "isRanslator");
            return (Criteria) this;
        }

        public Criteria andIsRanslatorBetween(Integer value1, Integer value2) {
            addCriterion("IS_RANSLATOR between", value1, value2, "isRanslator");
            return (Criteria) this;
        }

        public Criteria andIsRanslatorNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_RANSLATOR not between", value1, value2, "isRanslator");
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

        public Criteria andLspIdIsNull() {
            addCriterion("LSP_ID is null");
            return (Criteria) this;
        }

        public Criteria andLspIdIsNotNull() {
            addCriterion("LSP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLspIdEqualTo(Long value) {
            addCriterion("LSP_ID =", value, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdNotEqualTo(Long value) {
            addCriterion("LSP_ID <>", value, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdGreaterThan(Long value) {
            addCriterion("LSP_ID >", value, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LSP_ID >=", value, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdLessThan(Long value) {
            addCriterion("LSP_ID <", value, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdLessThanOrEqualTo(Long value) {
            addCriterion("LSP_ID <=", value, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdIn(List<Long> values) {
            addCriterion("LSP_ID in", values, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdNotIn(List<Long> values) {
            addCriterion("LSP_ID not in", values, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdBetween(Long value1, Long value2) {
            addCriterion("LSP_ID between", value1, value2, "lspId");
            return (Criteria) this;
        }

        public Criteria andLspIdNotBetween(Long value1, Long value2) {
            addCriterion("LSP_ID not between", value1, value2, "lspId");
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

        public Criteria andRegistTimeIsNull() {
            addCriterion("REGIST_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRegistTimeIsNotNull() {
            addCriterion("REGIST_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRegistTimeEqualTo(Timestamp value) {
            addCriterion("REGIST_TIME =", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeNotEqualTo(Timestamp value) {
            addCriterion("REGIST_TIME <>", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeGreaterThan(Timestamp value) {
            addCriterion("REGIST_TIME >", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("REGIST_TIME >=", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeLessThan(Timestamp value) {
            addCriterion("REGIST_TIME <", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("REGIST_TIME <=", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeIn(List<Timestamp> values) {
            addCriterion("REGIST_TIME in", values, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeNotIn(List<Timestamp> values) {
            addCriterion("REGIST_TIME not in", values, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("REGIST_TIME between", value1, value2, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("REGIST_TIME not between", value1, value2, "registTime");
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

        public Criteria andOccupationIsNull() {
            addCriterion("OCCUPATION is null");
            return (Criteria) this;
        }

        public Criteria andOccupationIsNotNull() {
            addCriterion("OCCUPATION is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationEqualTo(Integer value) {
            addCriterion("OCCUPATION =", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotEqualTo(Integer value) {
            addCriterion("OCCUPATION <>", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationGreaterThan(Integer value) {
            addCriterion("OCCUPATION >", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationGreaterThanOrEqualTo(Integer value) {
            addCriterion("OCCUPATION >=", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLessThan(Integer value) {
            addCriterion("OCCUPATION <", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLessThanOrEqualTo(Integer value) {
            addCriterion("OCCUPATION <=", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationIn(List<Integer> values) {
            addCriterion("OCCUPATION in", values, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotIn(List<Integer> values) {
            addCriterion("OCCUPATION not in", values, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationBetween(Integer value1, Integer value2) {
            addCriterion("OCCUPATION between", value1, value2, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotBetween(Integer value1, Integer value2) {
            addCriterion("OCCUPATION not between", value1, value2, "occupation");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(Integer value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(Integer value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(Integer value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(Integer value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(Integer value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(Integer value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<Integer> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<Integer> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(Integer value1, Integer value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(Integer value1, Integer value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andUsersourceIsNull() {
            addCriterion("USERSOURCE is null");
            return (Criteria) this;
        }

        public Criteria andUsersourceIsNotNull() {
            addCriterion("USERSOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andUsersourceEqualTo(String value) {
            addCriterion("USERSOURCE =", value, "usersource");
            return (Criteria) this;
        }

        public Criteria andUsersourceNotEqualTo(String value) {
            addCriterion("USERSOURCE <>", value, "usersource");
            return (Criteria) this;
        }

        public Criteria andUsersourceGreaterThan(String value) {
            addCriterion("USERSOURCE >", value, "usersource");
            return (Criteria) this;
        }

        public Criteria andUsersourceGreaterThanOrEqualTo(String value) {
            addCriterion("USERSOURCE >=", value, "usersource");
            return (Criteria) this;
        }

        public Criteria andUsersourceLessThan(String value) {
            addCriterion("USERSOURCE <", value, "usersource");
            return (Criteria) this;
        }

        public Criteria andUsersourceLessThanOrEqualTo(String value) {
            addCriterion("USERSOURCE <=", value, "usersource");
            return (Criteria) this;
        }

        public Criteria andUsersourceLike(String value) {
            addCriterion("USERSOURCE like", value, "usersource");
            return (Criteria) this;
        }

        public Criteria andUsersourceNotLike(String value) {
            addCriterion("USERSOURCE not like", value, "usersource");
            return (Criteria) this;
        }

        public Criteria andUsersourceIn(List<String> values) {
            addCriterion("USERSOURCE in", values, "usersource");
            return (Criteria) this;
        }

        public Criteria andUsersourceNotIn(List<String> values) {
            addCriterion("USERSOURCE not in", values, "usersource");
            return (Criteria) this;
        }

        public Criteria andUsersourceBetween(String value1, String value2) {
            addCriterion("USERSOURCE between", value1, value2, "usersource");
            return (Criteria) this;
        }

        public Criteria andUsersourceNotBetween(String value1, String value2) {
            addCriterion("USERSOURCE not between", value1, value2, "usersource");
            return (Criteria) this;
        }

        public Criteria andThirduidIsNull() {
            addCriterion("THIRDUID is null");
            return (Criteria) this;
        }

        public Criteria andThirduidIsNotNull() {
            addCriterion("THIRDUID is not null");
            return (Criteria) this;
        }

        public Criteria andThirduidEqualTo(String value) {
            addCriterion("THIRDUID =", value, "thirduid");
            return (Criteria) this;
        }

        public Criteria andThirduidNotEqualTo(String value) {
            addCriterion("THIRDUID <>", value, "thirduid");
            return (Criteria) this;
        }

        public Criteria andThirduidGreaterThan(String value) {
            addCriterion("THIRDUID >", value, "thirduid");
            return (Criteria) this;
        }

        public Criteria andThirduidGreaterThanOrEqualTo(String value) {
            addCriterion("THIRDUID >=", value, "thirduid");
            return (Criteria) this;
        }

        public Criteria andThirduidLessThan(String value) {
            addCriterion("THIRDUID <", value, "thirduid");
            return (Criteria) this;
        }

        public Criteria andThirduidLessThanOrEqualTo(String value) {
            addCriterion("THIRDUID <=", value, "thirduid");
            return (Criteria) this;
        }

        public Criteria andThirduidLike(String value) {
            addCriterion("THIRDUID like", value, "thirduid");
            return (Criteria) this;
        }

        public Criteria andThirduidNotLike(String value) {
            addCriterion("THIRDUID not like", value, "thirduid");
            return (Criteria) this;
        }

        public Criteria andThirduidIn(List<String> values) {
            addCriterion("THIRDUID in", values, "thirduid");
            return (Criteria) this;
        }

        public Criteria andThirduidNotIn(List<String> values) {
            addCriterion("THIRDUID not in", values, "thirduid");
            return (Criteria) this;
        }

        public Criteria andThirduidBetween(String value1, String value2) {
            addCriterion("THIRDUID between", value1, value2, "thirduid");
            return (Criteria) this;
        }

        public Criteria andThirduidNotBetween(String value1, String value2) {
            addCriterion("THIRDUID not between", value1, value2, "thirduid");
            return (Criteria) this;
        }

        public Criteria andPersonsignIsNull() {
            addCriterion("PERSONSIGN is null");
            return (Criteria) this;
        }

        public Criteria andPersonsignIsNotNull() {
            addCriterion("PERSONSIGN is not null");
            return (Criteria) this;
        }

        public Criteria andPersonsignEqualTo(String value) {
            addCriterion("PERSONSIGN =", value, "personsign");
            return (Criteria) this;
        }

        public Criteria andPersonsignNotEqualTo(String value) {
            addCriterion("PERSONSIGN <>", value, "personsign");
            return (Criteria) this;
        }

        public Criteria andPersonsignGreaterThan(String value) {
            addCriterion("PERSONSIGN >", value, "personsign");
            return (Criteria) this;
        }

        public Criteria andPersonsignGreaterThanOrEqualTo(String value) {
            addCriterion("PERSONSIGN >=", value, "personsign");
            return (Criteria) this;
        }

        public Criteria andPersonsignLessThan(String value) {
            addCriterion("PERSONSIGN <", value, "personsign");
            return (Criteria) this;
        }

        public Criteria andPersonsignLessThanOrEqualTo(String value) {
            addCriterion("PERSONSIGN <=", value, "personsign");
            return (Criteria) this;
        }

        public Criteria andPersonsignLike(String value) {
            addCriterion("PERSONSIGN like", value, "personsign");
            return (Criteria) this;
        }

        public Criteria andPersonsignNotLike(String value) {
            addCriterion("PERSONSIGN not like", value, "personsign");
            return (Criteria) this;
        }

        public Criteria andPersonsignIn(List<String> values) {
            addCriterion("PERSONSIGN in", values, "personsign");
            return (Criteria) this;
        }

        public Criteria andPersonsignNotIn(List<String> values) {
            addCriterion("PERSONSIGN not in", values, "personsign");
            return (Criteria) this;
        }

        public Criteria andPersonsignBetween(String value1, String value2) {
            addCriterion("PERSONSIGN between", value1, value2, "personsign");
            return (Criteria) this;
        }

        public Criteria andPersonsignNotBetween(String value1, String value2) {
            addCriterion("PERSONSIGN not between", value1, value2, "personsign");
            return (Criteria) this;
        }

        public Criteria andIsBusinessIsNull() {
            addCriterion("IS_BUSINESS is null");
            return (Criteria) this;
        }

        public Criteria andIsBusinessIsNotNull() {
            addCriterion("IS_BUSINESS is not null");
            return (Criteria) this;
        }

        public Criteria andIsBusinessEqualTo(Integer value) {
            addCriterion("IS_BUSINESS =", value, "isBusiness");
            return (Criteria) this;
        }

        public Criteria andIsBusinessNotEqualTo(Integer value) {
            addCriterion("IS_BUSINESS <>", value, "isBusiness");
            return (Criteria) this;
        }

        public Criteria andIsBusinessGreaterThan(Integer value) {
            addCriterion("IS_BUSINESS >", value, "isBusiness");
            return (Criteria) this;
        }

        public Criteria andIsBusinessGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_BUSINESS >=", value, "isBusiness");
            return (Criteria) this;
        }

        public Criteria andIsBusinessLessThan(Integer value) {
            addCriterion("IS_BUSINESS <", value, "isBusiness");
            return (Criteria) this;
        }

        public Criteria andIsBusinessLessThanOrEqualTo(Integer value) {
            addCriterion("IS_BUSINESS <=", value, "isBusiness");
            return (Criteria) this;
        }

        public Criteria andIsBusinessIn(List<Integer> values) {
            addCriterion("IS_BUSINESS in", values, "isBusiness");
            return (Criteria) this;
        }

        public Criteria andIsBusinessNotIn(List<Integer> values) {
            addCriterion("IS_BUSINESS not in", values, "isBusiness");
            return (Criteria) this;
        }

        public Criteria andIsBusinessBetween(Integer value1, Integer value2) {
            addCriterion("IS_BUSINESS between", value1, value2, "isBusiness");
            return (Criteria) this;
        }

        public Criteria andIsBusinessNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_BUSINESS not between", value1, value2, "isBusiness");
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

        public Criteria andEmailValidateFlagIsNull() {
            addCriterion("EMAIL_VALIDATE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andEmailValidateFlagIsNotNull() {
            addCriterion("EMAIL_VALIDATE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andEmailValidateFlagEqualTo(String value) {
            addCriterion("EMAIL_VALIDATE_FLAG =", value, "emailValidateFlag");
            return (Criteria) this;
        }

        public Criteria andEmailValidateFlagNotEqualTo(String value) {
            addCriterion("EMAIL_VALIDATE_FLAG <>", value, "emailValidateFlag");
            return (Criteria) this;
        }

        public Criteria andEmailValidateFlagGreaterThan(String value) {
            addCriterion("EMAIL_VALIDATE_FLAG >", value, "emailValidateFlag");
            return (Criteria) this;
        }

        public Criteria andEmailValidateFlagGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL_VALIDATE_FLAG >=", value, "emailValidateFlag");
            return (Criteria) this;
        }

        public Criteria andEmailValidateFlagLessThan(String value) {
            addCriterion("EMAIL_VALIDATE_FLAG <", value, "emailValidateFlag");
            return (Criteria) this;
        }

        public Criteria andEmailValidateFlagLessThanOrEqualTo(String value) {
            addCriterion("EMAIL_VALIDATE_FLAG <=", value, "emailValidateFlag");
            return (Criteria) this;
        }

        public Criteria andEmailValidateFlagLike(String value) {
            addCriterion("EMAIL_VALIDATE_FLAG like", value, "emailValidateFlag");
            return (Criteria) this;
        }

        public Criteria andEmailValidateFlagNotLike(String value) {
            addCriterion("EMAIL_VALIDATE_FLAG not like", value, "emailValidateFlag");
            return (Criteria) this;
        }

        public Criteria andEmailValidateFlagIn(List<String> values) {
            addCriterion("EMAIL_VALIDATE_FLAG in", values, "emailValidateFlag");
            return (Criteria) this;
        }

        public Criteria andEmailValidateFlagNotIn(List<String> values) {
            addCriterion("EMAIL_VALIDATE_FLAG not in", values, "emailValidateFlag");
            return (Criteria) this;
        }

        public Criteria andEmailValidateFlagBetween(String value1, String value2) {
            addCriterion("EMAIL_VALIDATE_FLAG between", value1, value2, "emailValidateFlag");
            return (Criteria) this;
        }

        public Criteria andEmailValidateFlagNotBetween(String value1, String value2) {
            addCriterion("EMAIL_VALIDATE_FLAG not between", value1, value2, "emailValidateFlag");
            return (Criteria) this;
        }

        public Criteria andVipLevelIsNull() {
            addCriterion("vip_level is null");
            return (Criteria) this;
        }

        public Criteria andVipLevelIsNotNull() {
            addCriterion("vip_level is not null");
            return (Criteria) this;
        }

        public Criteria andVipLevelEqualTo(String value) {
            addCriterion("vip_level =", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotEqualTo(String value) {
            addCriterion("vip_level <>", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelGreaterThan(String value) {
            addCriterion("vip_level >", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelGreaterThanOrEqualTo(String value) {
            addCriterion("vip_level >=", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelLessThan(String value) {
            addCriterion("vip_level <", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelLessThanOrEqualTo(String value) {
            addCriterion("vip_level <=", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelLike(String value) {
            addCriterion("vip_level like", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotLike(String value) {
            addCriterion("vip_level not like", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelIn(List<String> values) {
            addCriterion("vip_level in", values, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotIn(List<String> values) {
            addCriterion("vip_level not in", values, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelBetween(String value1, String value2) {
            addCriterion("vip_level between", value1, value2, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotBetween(String value1, String value2) {
            addCriterion("vip_level not between", value1, value2, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andSafetyLevelIsNull() {
            addCriterion("SAFETY_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andSafetyLevelIsNotNull() {
            addCriterion("SAFETY_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andSafetyLevelEqualTo(String value) {
            addCriterion("SAFETY_LEVEL =", value, "safetyLevel");
            return (Criteria) this;
        }

        public Criteria andSafetyLevelNotEqualTo(String value) {
            addCriterion("SAFETY_LEVEL <>", value, "safetyLevel");
            return (Criteria) this;
        }

        public Criteria andSafetyLevelGreaterThan(String value) {
            addCriterion("SAFETY_LEVEL >", value, "safetyLevel");
            return (Criteria) this;
        }

        public Criteria andSafetyLevelGreaterThanOrEqualTo(String value) {
            addCriterion("SAFETY_LEVEL >=", value, "safetyLevel");
            return (Criteria) this;
        }

        public Criteria andSafetyLevelLessThan(String value) {
            addCriterion("SAFETY_LEVEL <", value, "safetyLevel");
            return (Criteria) this;
        }

        public Criteria andSafetyLevelLessThanOrEqualTo(String value) {
            addCriterion("SAFETY_LEVEL <=", value, "safetyLevel");
            return (Criteria) this;
        }

        public Criteria andSafetyLevelLike(String value) {
            addCriterion("SAFETY_LEVEL like", value, "safetyLevel");
            return (Criteria) this;
        }

        public Criteria andSafetyLevelNotLike(String value) {
            addCriterion("SAFETY_LEVEL not like", value, "safetyLevel");
            return (Criteria) this;
        }

        public Criteria andSafetyLevelIn(List<String> values) {
            addCriterion("SAFETY_LEVEL in", values, "safetyLevel");
            return (Criteria) this;
        }

        public Criteria andSafetyLevelNotIn(List<String> values) {
            addCriterion("SAFETY_LEVEL not in", values, "safetyLevel");
            return (Criteria) this;
        }

        public Criteria andSafetyLevelBetween(String value1, String value2) {
            addCriterion("SAFETY_LEVEL between", value1, value2, "safetyLevel");
            return (Criteria) this;
        }

        public Criteria andSafetyLevelNotBetween(String value1, String value2) {
            addCriterion("SAFETY_LEVEL not between", value1, value2, "safetyLevel");
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

        public Criteria andInterpreterLanguageIsNull() {
            addCriterion("interpreter_language is null");
            return (Criteria) this;
        }

        public Criteria andInterpreterLanguageIsNotNull() {
            addCriterion("interpreter_language is not null");
            return (Criteria) this;
        }

        public Criteria andInterpreterLanguageEqualTo(String value) {
            addCriterion("interpreter_language =", value, "interpreterLanguage");
            return (Criteria) this;
        }

        public Criteria andInterpreterLanguageNotEqualTo(String value) {
            addCriterion("interpreter_language <>", value, "interpreterLanguage");
            return (Criteria) this;
        }

        public Criteria andInterpreterLanguageGreaterThan(String value) {
            addCriterion("interpreter_language >", value, "interpreterLanguage");
            return (Criteria) this;
        }

        public Criteria andInterpreterLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("interpreter_language >=", value, "interpreterLanguage");
            return (Criteria) this;
        }

        public Criteria andInterpreterLanguageLessThan(String value) {
            addCriterion("interpreter_language <", value, "interpreterLanguage");
            return (Criteria) this;
        }

        public Criteria andInterpreterLanguageLessThanOrEqualTo(String value) {
            addCriterion("interpreter_language <=", value, "interpreterLanguage");
            return (Criteria) this;
        }

        public Criteria andInterpreterLanguageLike(String value) {
            addCriterion("interpreter_language like", value, "interpreterLanguage");
            return (Criteria) this;
        }

        public Criteria andInterpreterLanguageNotLike(String value) {
            addCriterion("interpreter_language not like", value, "interpreterLanguage");
            return (Criteria) this;
        }

        public Criteria andInterpreterLanguageIn(List<String> values) {
            addCriterion("interpreter_language in", values, "interpreterLanguage");
            return (Criteria) this;
        }

        public Criteria andInterpreterLanguageNotIn(List<String> values) {
            addCriterion("interpreter_language not in", values, "interpreterLanguage");
            return (Criteria) this;
        }

        public Criteria andInterpreterLanguageBetween(String value1, String value2) {
            addCriterion("interpreter_language between", value1, value2, "interpreterLanguage");
            return (Criteria) this;
        }

        public Criteria andInterpreterLanguageNotBetween(String value1, String value2) {
            addCriterion("interpreter_language not between", value1, value2, "interpreterLanguage");
            return (Criteria) this;
        }

        public Criteria andTranslationTypeIsNull() {
            addCriterion("translation_type is null");
            return (Criteria) this;
        }

        public Criteria andTranslationTypeIsNotNull() {
            addCriterion("translation_type is not null");
            return (Criteria) this;
        }

        public Criteria andTranslationTypeEqualTo(String value) {
            addCriterion("translation_type =", value, "translationType");
            return (Criteria) this;
        }

        public Criteria andTranslationTypeNotEqualTo(String value) {
            addCriterion("translation_type <>", value, "translationType");
            return (Criteria) this;
        }

        public Criteria andTranslationTypeGreaterThan(String value) {
            addCriterion("translation_type >", value, "translationType");
            return (Criteria) this;
        }

        public Criteria andTranslationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("translation_type >=", value, "translationType");
            return (Criteria) this;
        }

        public Criteria andTranslationTypeLessThan(String value) {
            addCriterion("translation_type <", value, "translationType");
            return (Criteria) this;
        }

        public Criteria andTranslationTypeLessThanOrEqualTo(String value) {
            addCriterion("translation_type <=", value, "translationType");
            return (Criteria) this;
        }

        public Criteria andTranslationTypeLike(String value) {
            addCriterion("translation_type like", value, "translationType");
            return (Criteria) this;
        }

        public Criteria andTranslationTypeNotLike(String value) {
            addCriterion("translation_type not like", value, "translationType");
            return (Criteria) this;
        }

        public Criteria andTranslationTypeIn(List<String> values) {
            addCriterion("translation_type in", values, "translationType");
            return (Criteria) this;
        }

        public Criteria andTranslationTypeNotIn(List<String> values) {
            addCriterion("translation_type not in", values, "translationType");
            return (Criteria) this;
        }

        public Criteria andTranslationTypeBetween(String value1, String value2) {
            addCriterion("translation_type between", value1, value2, "translationType");
            return (Criteria) this;
        }

        public Criteria andTranslationTypeNotBetween(String value1, String value2) {
            addCriterion("translation_type not between", value1, value2, "translationType");
            return (Criteria) this;
        }

        public Criteria andReferencePriceIsNull() {
            addCriterion("reference_price is null");
            return (Criteria) this;
        }

        public Criteria andReferencePriceIsNotNull() {
            addCriterion("reference_price is not null");
            return (Criteria) this;
        }

        public Criteria andReferencePriceEqualTo(String value) {
            addCriterion("reference_price =", value, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceNotEqualTo(String value) {
            addCriterion("reference_price <>", value, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceGreaterThan(String value) {
            addCriterion("reference_price >", value, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceGreaterThanOrEqualTo(String value) {
            addCriterion("reference_price >=", value, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceLessThan(String value) {
            addCriterion("reference_price <", value, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceLessThanOrEqualTo(String value) {
            addCriterion("reference_price <=", value, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceLike(String value) {
            addCriterion("reference_price like", value, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceNotLike(String value) {
            addCriterion("reference_price not like", value, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceIn(List<String> values) {
            addCriterion("reference_price in", values, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceNotIn(List<String> values) {
            addCriterion("reference_price not in", values, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceBetween(String value1, String value2) {
            addCriterion("reference_price between", value1, value2, "referencePrice");
            return (Criteria) this;
        }

        public Criteria andReferencePriceNotBetween(String value1, String value2) {
            addCriterion("reference_price not between", value1, value2, "referencePrice");
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

        public Criteria andIsAdminIsNull() {
            addCriterion("IS_ADMIN is null");
            return (Criteria) this;
        }

        public Criteria andIsAdminIsNotNull() {
            addCriterion("IS_ADMIN is not null");
            return (Criteria) this;
        }

        public Criteria andIsAdminEqualTo(Integer value) {
            addCriterion("IS_ADMIN =", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminNotEqualTo(Integer value) {
            addCriterion("IS_ADMIN <>", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminGreaterThan(Integer value) {
            addCriterion("IS_ADMIN >", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_ADMIN >=", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminLessThan(Integer value) {
            addCriterion("IS_ADMIN <", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminLessThanOrEqualTo(Integer value) {
            addCriterion("IS_ADMIN <=", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminIn(List<Integer> values) {
            addCriterion("IS_ADMIN in", values, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminNotIn(List<Integer> values) {
            addCriterion("IS_ADMIN not in", values, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminBetween(Integer value1, Integer value2) {
            addCriterion("IS_ADMIN between", value1, value2, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_ADMIN not between", value1, value2, "isAdmin");
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