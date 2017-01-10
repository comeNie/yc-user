package com.ai.yc.user.api.userservice.param;

import java.sql.Timestamp;
import java.util.Date;

public class CompleteUserInfoRequest {
	/**
	 * 手机注册时userId需要有值
	 */
	private String userId;
	/**
     * 手机号
     */
    private String mobilePhone;
    /**
     * 登录名
     */
    private String loginName;
    /**
     * 名
     */
    private String lastname;
    /**
     * 姓
     */
    private String firstname;
     /**
      * 性别
      */
    private int sex;
    /**
     * 生日
     */
    private Timestamp birthday;
    /**
     * qq
     */
    private String qq;
    /**
     * 国家
     */
    private String country;
    /**
     * 省
     */
    private String province;
    /**
     * 市
     */
    private String city;
    
    private String cnCity;
    /**
     * 地址
     */
    private String address;
    /**
     * 座机
     */
    private String telephone;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 注册时间
     */
    private Timestamp registTime;
    /**
     * 修改时间
     */
    private Timestamp lastModifyTime;
    
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
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
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Timestamp getRegistTime() {
		return registTime;
	}
	public void setRegistTime(Timestamp registTime) {
		this.registTime = registTime;
	}
	public void setLastModifyTime(Timestamp lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public Timestamp getBirthday() {
		return birthday;
	}
	public void setBirthday(Timestamp birthday) {
		this.birthday = birthday;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCnCity() {
		return cnCity;
	}
	public void setCnCity(String cnCity) {
		this.cnCity = cnCity;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public Date getLastModifyTime() {
		return lastModifyTime;
	}
}
