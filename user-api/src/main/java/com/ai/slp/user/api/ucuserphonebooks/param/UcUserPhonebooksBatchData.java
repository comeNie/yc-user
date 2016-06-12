package com.ai.slp.user.api.ucuserphonebooks.param;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

import com.ai.opt.validator.constraints.MobilePhone;
import com.ai.slp.user.api.ucuserphonebooks.interfaces.IUserPhoneBooksSV;

public class UcUserPhonebooksBatchData implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 电话号码
	 */
	@NotBlank(message = "手机号码不能为空", groups = { IUserPhoneBooksSV.BatchAddUserPhonebooks.class })
	@MobilePhone(message = "手机号码格式不正确", groups = { IUserPhoneBooksSV.BatchAddUserPhonebooks.class })
	private String telMp;

	/**
	 * 姓名
	 */
	private String telName;

	/**
	 * 归属用户
	 */
	@NotBlank(message = "归属用户不能为空", groups = { IUserPhoneBooksSV.BatchAddUserPhonebooks.class })
	private String userId;

	/**
	 * 通讯录分组标识
	 */
	@NotBlank(message = "通信录分组标识不能为空", groups = { IUserPhoneBooksSV.BatchAddUserPhonebooks.class })
	private String telGroupId;

	/**
	 * 租户标识
	 */
	private String tenantId;

	/**
	 * 记录索引号
	 */
	private transient int indexNo;

	public String getTelMp() {
		return telMp;
	}

	public void setTelMp(String telMp) {
		this.telMp = telMp;
	}

	public String getTelName() {
		return telName;
	}

	public void setTelName(String telName) {
		this.telName = telName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTelGroupId() {
		return telGroupId;
	}

	public void setTelGroupId(String telGroupId) {
		this.telGroupId = telGroupId;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public int getIndexNo() {
		return indexNo;
	}

	public void setIndexNo(int indexNo) {
		this.indexNo = indexNo;
	}

}
