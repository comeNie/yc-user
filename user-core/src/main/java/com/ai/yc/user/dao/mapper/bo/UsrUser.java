package com.ai.yc.user.dao.mapper.bo;

import java.lang.reflect.Field;
import java.sql.Timestamp;

import com.ai.yc.user.api.userservice.param.InsertYCUserParams;
import com.ai.yc.user.api.userservice.param.UpdateYCUserParams;

public class UsrUser {
    private String userId;

    private String nickname;

    private Integer state;

    private String lastname;

    private String firstname;

    private Integer sex;

    private Timestamp birthday;

    private String telephone;

    private String mobilePhone;

    private String qq;

    private String address;

    private String safetyLevel;

    private String cnCity;

    private String province;

    private String country;

    private String timeZone;

    private Integer isRanslator;

    private Timestamp registTime;

    private Timestamp lastModifyTime;

    private Integer occupation;

    private Integer title;

    private String usersource;

    private String thirduid;

    private String personsign;

    private String zipCode;

    private Integer isAdmin;

    public UsrUser() {
		super();
	}

	public UsrUser(String userId, String nickname, Integer state, String lastname, String firstname, Integer sex,
			Timestamp birthday, String telephone, String mobilePhone, String qq, String address, String safetyLevel,
			String cnCity, String province, String country, String timeZone, Integer isRanslator, Timestamp registTime,
			Timestamp lastModifyTime, Integer occupation, Integer title, String usersource, String thirduid,
			String personsign, String zipCode, Integer isAdmin) {
		super();
		this.userId = userId;
		this.nickname = nickname;
		this.state = state;
		this.lastname = lastname;
		this.firstname = firstname;
		this.sex = sex;
		this.birthday = birthday;
		this.telephone = telephone;
		this.mobilePhone = mobilePhone;
		this.qq = qq;
		this.address = address;
		this.safetyLevel = safetyLevel;
		this.cnCity = cnCity;
		this.province = province;
		this.country = country;
		this.timeZone = timeZone;
		this.isRanslator = isRanslator;
		this.registTime = registTime;
		this.lastModifyTime = lastModifyTime;
		this.occupation = occupation;
		this.title = title;
		this.usersource = usersource;
		this.thirduid = thirduid;
		this.personsign = personsign;
		this.zipCode = zipCode;
		this.isAdmin = isAdmin;
	}

	public UsrUser(String nickname, Integer state, String lastname, String firstname, Integer sex, Timestamp birthday,
			String telephone, String mobilePhone, String qq, String address, String safetyLevel, String cnCity,
			String province, String country, String timeZone, Integer isRanslator, Timestamp registTime,
			Timestamp lastModifyTime, Integer occupation, Integer title, String usersource, String thirduid,
			String personsign, String zipCode, Integer isAdmin) {
		super();
		this.nickname = nickname;
		this.state = state;
		this.lastname = lastname;
		this.firstname = firstname;
		this.sex = sex;
		this.birthday = birthday;
		this.telephone = telephone;
		this.mobilePhone = mobilePhone;
		this.qq = qq;
		this.address = address;
		this.safetyLevel = safetyLevel;
		this.cnCity = cnCity;
		this.province = province;
		this.country = country;
		this.timeZone = timeZone;
		this.isRanslator = isRanslator;
		this.registTime = registTime;
		this.lastModifyTime = lastModifyTime;
		this.occupation = occupation;
		this.title = title;
		this.usersource = usersource;
		this.thirduid = thirduid;
		this.personsign = personsign;
		this.zipCode = zipCode;
		this.isAdmin = isAdmin;
	}

	@Override
	public String toString() {
		return "UsrUser [userId=" + userId + ", nickname=" + nickname + ", state=" + state + ", lastname=" + lastname
				+ ", firstname=" + firstname + ", sex=" + sex + ", birthday=" + birthday + ", telephone=" + telephone
				+ ", mobilePhone=" + mobilePhone + ", qq=" + qq + ", address=" + address + ", safetyLevel="
				+ safetyLevel + ", cnCity=" + cnCity + ", province=" + province + ", country=" + country + ", timeZone="
				+ timeZone + ", isRanslator=" + isRanslator + ", registTime=" + registTime + ", lastModifyTime="
				+ lastModifyTime + ", occupation=" + occupation + ", title=" + title + ", usersource=" + usersource
				+ ", thirduid=" + thirduid + ", personsign=" + personsign + ", zipCode=" + zipCode + ", isAdmin="
				+ isAdmin + "]";
	}
	public static UsrUser getUsrUserByUpparam(UpdateYCUserParams userparam) {
		try{
			Class<?> usrUserClass = Class.forName(UsrUser.class.getName());
			Object usrUserObj = usrUserClass.newInstance();
			Object insertInfoObj = userparam;
			Field[] usrFields = UsrUser.class.getDeclaredFields();
			Field[] insertfields = InsertYCUserParams.class.getDeclaredFields();
			for(int i = 0; i < insertfields.length; i++){
				for(int j = 0; j < usrFields.length; j++){
					if(insertfields[i].getName().equals(usrFields[j].getName())){
						usrFields[j].setAccessible(true);
						insertfields[i].setAccessible(true);
						if(usrFields[j].getGenericType() == insertfields[i].getGenericType())
							usrFields[j].set(usrUserObj, insertfields[i].get(insertInfoObj));
						System.out.println(usrUserObj);
					}
				}
			}
			UsrUser usrUser = (UsrUser) usrUserObj;
			return usrUser;
		} catch ( InstantiationException| IllegalAccessException| ClassNotFoundException  e){
			e.printStackTrace();
		}
		return null;
	}
	public static UsrUser getUsrUserByInsertReq(InsertYCUserParams insertinfo){
		try{
			Class<?> usrUserClass = Class.forName(UsrUser.class.getName());
			Object usrUserObj = usrUserClass.newInstance();
			Object insertInfoObj = insertinfo;
			Field[] usrFields = UsrUser.class.getDeclaredFields();
			Field[] insertfields = InsertYCUserParams.class.getDeclaredFields();
			for(int i = 0; i < insertfields.length; i++){
				for(int j = 0; j < usrFields.length; j++){
					if(insertfields[i].getName().equals(usrFields[j].getName())){
						usrFields[j].setAccessible(true);
						insertfields[i].setAccessible(true);
						if(usrFields[j].getGenericType() == insertfields[i].getGenericType())
							usrFields[j].set(usrUserObj, insertfields[i].get(insertInfoObj));
						System.out.println(usrUserObj);
					}
				}
			}
			UsrUser usrUser = (UsrUser) usrUserObj;
			return usrUser;
		} catch ( InstantiationException| IllegalAccessException| ClassNotFoundException  e){
			e.printStackTrace();
		}
		return null;
	}
	
	

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

    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
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

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getSafetyLevel() {
        return safetyLevel;
    }

    public void setSafetyLevel(String safetyLevel) {
        this.safetyLevel = safetyLevel == null ? null : safetyLevel.trim();
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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    public Integer getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Integer isAdmin) {
        this.isAdmin = isAdmin;
    }
}