package com.ai.yc.user.api.userservice.param;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月2日 上午11:17:36 
 * @version 
 * @since  
 */
public class InsertYCUserRequest {
	
	/**
	 * 用户名 默认手机号或者是邮箱地址 +随机数
	 * 必填
	 */
	private String userName;
	/**
	 * 座机电话
	 */
	private String telephone; 
	/**
	 * 邮箱地址
	 */
	private String email; 
	/**
	 * 密码
	 */
	private String password; 
	
	/**
	 * 昵称 注册默认译粉+随机数
	 * 必填
	 */
	private String nickname; 
	
    private String lastname;

    private String firstname;
    /**
     * 性别 0、女， 1、男
     */
    private Integer sex;
    /**
     * 手机号
     */
    private String mobilePhone;
    /**
     * QQ
     */
    private String qq;
    /**
     * 地址
     */
    private String address;
    
    /**
     * 国家
     */
    private String country;
    /**
     * 城市
     */
    private String cnCity;
    /**
     * 省份
     */
    private String province;
    /**
     * 姓名
     */
    private String fullName;
    

	public String getTelephone() {
		return telephone;
	}



	public void setTelephone(String telephone) {
		this.telephone = telephone;
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


	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
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



	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}
}
