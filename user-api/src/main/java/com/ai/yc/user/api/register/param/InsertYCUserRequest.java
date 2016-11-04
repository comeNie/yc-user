package com.ai.yc.user.api.register.param;

import java.sql.Timestamp;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月2日 上午11:17:36 
 * @version 
 * @since  
 */
public class InsertYCUserRequest {

	private String phone; // 电话
	
	private String email; // 邮箱
	
	private String password; // 密码
	
	// ......
	
	private String nickname; // 昵称

    private String lastname;

    private String firstname;

    private Integer sex;

    private String mobilePhone;

    private String qq;

    private String address;
    
    
    
	public InsertYCUserRequest(String phone, String email, String password, String nickname, String lastname,
			String firstname, Integer sex, String mobilePhone, String qq, String address) {
		super();
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.nickname = nickname;
		this.lastname = lastname;
		this.firstname = firstname;
		this.sex = sex;
		this.mobilePhone = mobilePhone;
		this.qq = qq;
		this.address = address;
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



	@Override
	public String toString() {
		return "InsertYCUserRequest [phone=" + phone + ", email=" + email + ", password=" + password + ", nickname="
				+ nickname + ", lastname=" + lastname + ", firstname=" + firstname + ", sex=" + sex + ", mobilePhone="
				+ mobilePhone + ", qq=" + qq + ", address=" + address + "]";
	}



	public InsertYCUserRequest() {
		super();
	}
	
    
}
