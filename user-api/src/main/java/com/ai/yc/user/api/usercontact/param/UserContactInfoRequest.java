package com.ai.yc.user.api.usercontact.param;

import java.io.Serializable;
import java.sql.Timestamp;

public class UserContactInfoRequest implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 联系人id,主键
	 */
	private String contactId;

	/**
	 * 国家编号
	 * 必填
	 */
    private Integer gnCountryId;
	
	/**
	 * 联系人姓名
	 */
	private String userName;
	
	/**
	 * 手机
	 */
	private String mobilePhone;
	
	/**
	 * 邮箱
	 */
	private String email;
	
	/**
	 * 是否默认   0 非默认  1 默认
	 */

	private int isDefault;	
	/**
	 * 创建时间
	 */
	private Timestamp createTime;
	/**
	 * 用户id
	 */
	private String userId;
	
	public String getContactId() {
		return contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public Integer getGnCountryId() {
		return gnCountryId;
	}

	public void setGnCountryId(Integer gnCountryId) {
		this.gnCountryId = gnCountryId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(int isDefault) {
		this.isDefault = isDefault;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
}
