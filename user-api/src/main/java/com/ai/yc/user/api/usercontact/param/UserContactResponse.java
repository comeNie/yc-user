package com.ai.yc.user.api.usercontact.param;

import com.ai.opt.base.vo.BaseResponse;

public class UserContactResponse extends BaseResponse{
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
	 * 姓名
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
	 * 是否默认
	 */

	private Integer isDefault;
	
	

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

	public Integer getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Integer isDefault) {
		this.isDefault = isDefault;
	}	
}
