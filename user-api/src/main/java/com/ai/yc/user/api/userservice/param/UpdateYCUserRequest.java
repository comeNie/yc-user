package com.ai.yc.user.api.userservice.param;

import java.sql.Timestamp;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月2日 上午11:18:47 
 * @version 
 * @since  
 */
public class UpdateYCUserRequest {
	/**
	 * 必填
	 * 用户ID
	 */
	private String userId; 
	/**
	 * 必填
	 * 昵称
	 */
    private String nickname;

    private String lastname;
	
    private String firstname;
	/**
	 * 必填
	 * 性别
	 * 0、女，1、男
	 */
    private Integer sex;
	/**
	 * 必填
	 * 生日
	 */
    private Timestamp birthday;
	/**
	 * 必填
	 * QQ
	 */
    private String qq;
	/**
	 * 必填
	 * 地址
	 */
    private String address;
	/**
	 * 必填
	 * 市
	 */
    private String cnCity;
	/**
	 * 必填
	 * 省
	 */
    private String province;
	/**
	 * 必填
	 * 国家
	 */
    private String country;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
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
    

}
