package com.ai.yc.user.api.register.param;

import java.sql.Timestamp;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月2日 上午11:17:36 
 * @version 
 * @since  
 */
public class InsertYCUserRequest {

	private String phone;
	
	private String email;
	
	private String password;
	
	// ......
	
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

	@Override
	public String toString() {
		return "InsertYCUserRequest [phone=" + phone + ", email=" + email + ", password=" + password + ", nickname="
				+ nickname + ", state=" + state + ", lastname=" + lastname + ", firstname=" + firstname + ", sex=" + sex
				+ ", birthday=" + birthday + ", telephone=" + telephone + ", mobilePhone=" + mobilePhone + ", qq=" + qq
				+ ", address=" + address + ", safetyLevel=" + safetyLevel + ", cnCity=" + cnCity + ", province="
				+ province + ", country=" + country + ", timeZone=" + timeZone + ", isRanslator=" + isRanslator
				+ ", registTime=" + registTime + ", lastModifyTime=" + lastModifyTime + ", occupation=" + occupation
				+ ", title=" + title + ", usersource=" + usersource + ", thirduid=" + thirduid + ", personsign="
				+ personsign + ", zipCode=" + zipCode + ", isAdmin=" + isAdmin + "]";
	}

	public InsertYCUserRequest(String phone, String email, String password, String nickname, Integer state,
			String lastname, String firstname, Integer sex, Timestamp birthday, String telephone, String mobilePhone,
			String qq, String address, String safetyLevel, String cnCity, String province, String country,
			String timeZone, Integer isRanslator, Timestamp registTime, Timestamp lastModifyTime, Integer occupation,
			Integer title, String usersource, String thirduid, String personsign, String zipCode, Integer isAdmin) {
		super();
		this.phone = phone;
		this.email = email;
		this.password = password;
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

	public InsertYCUserRequest() {
		super();
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
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
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
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
		this.telephone = telephone;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSafetyLevel() {
		return safetyLevel;
	}

	public void setSafetyLevel(String safetyLevel) {
		this.safetyLevel = safetyLevel;
	}

	public String getCnCity() {
		return cnCity;
	}

	public void setCnCity(String cnCity) {
		this.cnCity = cnCity;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
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
		this.usersource = usersource;
	}

	public String getThirduid() {
		return thirduid;
	}

	public void setThirduid(String thirduid) {
		this.thirduid = thirduid;
	}

	public String getPersonsign() {
		return personsign;
	}

	public void setPersonsign(String personsign) {
		this.personsign = personsign;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Integer getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Integer isAdmin) {
		this.isAdmin = isAdmin;
	}

	
    
}
