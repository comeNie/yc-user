package com.ai.yc.user.dao.mapper.bo;

import java.sql.Timestamp;

public class TUser {
    private String userId;

    private String nickname;

    private Integer state;

    private String lastname;

    private String firstname;

    private Integer sex;

    private String birthday;

    private Integer yearsWork;

    private String nativeLang;

    private String telephone;

    private String mobilePhone;

    private String address;

    private String city;

    private String cnCity;

    private String province;

    private String country;

    private String timeZone;

    private Integer isRanslator;

    private Integer isLsp;

    private Long lspId;

    private String introduction;

    private Timestamp registTime;

    private Timestamp lastModifyTime;

    private Integer occupation;

    private Integer title;

    private String usersource;

    private String thirduid;

    private String personsign;

    private Integer isBusiness;

    private String custId;

    private String emailValidateFlag;

    private String vipLevel;

    private String safetyLevel;

    private String legalCertNum;

    private String interpreterLanguage;

    private String translationType;

    private String referencePrice;

    private String lspRole;

    private Integer isAdmin;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname == null ? null : lastname.trim();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname == null ? null : firstname.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public Integer getYearsWork() {
        return yearsWork;
    }

    public void setYearsWork(Integer yearsWork) {
        this.yearsWork = yearsWork;
    }

    public String getNativeLang() {
        return nativeLang;
    }

    public void setNativeLang(String nativeLang) {
        this.nativeLang = nativeLang == null ? null : nativeLang.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCnCity() {
        return cnCity;
    }

    public void setCnCity(String cnCity) {
        this.cnCity = cnCity == null ? null : cnCity.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone == null ? null : timeZone.trim();
    }

    public Integer getIsRanslator() {
        return isRanslator;
    }

    public void setIsRanslator(Integer isRanslator) {
        this.isRanslator = isRanslator;
    }

    public Integer getIsLsp() {
        return isLsp;
    }

    public void setIsLsp(Integer isLsp) {
        this.isLsp = isLsp;
    }

    public Long getLspId() {
        return lspId;
    }

    public void setLspId(Long lspId) {
        this.lspId = lspId;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public Timestamp getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Timestamp registTime) {
        this.registTime = registTime;
    }

    public Timestamp getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Timestamp lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public Integer getOccupation() {
        return occupation;
    }

    public void setOccupation(Integer occupation) {
        this.occupation = occupation;
    }

    public Integer getTitle() {
        return title;
    }

    public void setTitle(Integer title) {
        this.title = title;
    }

    public String getUsersource() {
        return usersource;
    }

    public void setUsersource(String usersource) {
        this.usersource = usersource == null ? null : usersource.trim();
    }

    public String getThirduid() {
        return thirduid;
    }

    public void setThirduid(String thirduid) {
        this.thirduid = thirduid == null ? null : thirduid.trim();
    }

    public String getPersonsign() {
        return personsign;
    }

    public void setPersonsign(String personsign) {
        this.personsign = personsign == null ? null : personsign.trim();
    }

    public Integer getIsBusiness() {
        return isBusiness;
    }

    public void setIsBusiness(Integer isBusiness) {
        this.isBusiness = isBusiness;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId == null ? null : custId.trim();
    }

    public String getEmailValidateFlag() {
        return emailValidateFlag;
    }

    public void setEmailValidateFlag(String emailValidateFlag) {
        this.emailValidateFlag = emailValidateFlag == null ? null : emailValidateFlag.trim();
    }

    public String getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(String vipLevel) {
        this.vipLevel = vipLevel == null ? null : vipLevel.trim();
    }

    public String getSafetyLevel() {
        return safetyLevel;
    }

    public void setSafetyLevel(String safetyLevel) {
        this.safetyLevel = safetyLevel == null ? null : safetyLevel.trim();
    }

    public String getLegalCertNum() {
        return legalCertNum;
    }

    public void setLegalCertNum(String legalCertNum) {
        this.legalCertNum = legalCertNum == null ? null : legalCertNum.trim();
    }

    public String getInterpreterLanguage() {
        return interpreterLanguage;
    }

    public void setInterpreterLanguage(String interpreterLanguage) {
        this.interpreterLanguage = interpreterLanguage == null ? null : interpreterLanguage.trim();
    }

    public String getTranslationType() {
        return translationType;
    }

    public void setTranslationType(String translationType) {
        this.translationType = translationType == null ? null : translationType.trim();
    }

    public String getReferencePrice() {
        return referencePrice;
    }

    public void setReferencePrice(String referencePrice) {
        this.referencePrice = referencePrice == null ? null : referencePrice.trim();
    }

    public String getLspRole() {
        return lspRole;
    }

    public void setLspRole(String lspRole) {
        this.lspRole = lspRole == null ? null : lspRole.trim();
    }

    public Integer getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Integer isAdmin) {
        this.isAdmin = isAdmin;
    }
}