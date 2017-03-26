package com.ai.yc.user.api.userservice.param;

import java.io.Serializable;
import java.sql.Timestamp;

public class QueryUserRequest implements Serializable{
	
	private static final long serialVersionUID = 214121453974015547L;
	/**
	 * 昵称
	 */
	private String nickname;
	/**
	 * 手机
	 */
	private String mobilePhone;
	
	/**
	 * 第三方登录
	 */
	private String usersource;
	/**
	 * 注册来源
	 */
	private String registSource;
	/**
	 * 会员等级
	 */
	private String safetyLevel;
	/**
	 * 账户状态
	 */
	private Integer state;
	/**
	 * 是否是译员
	 */
	private Integer isTranslator;
	/**
	 * 是否是企业
	 */
	private Integer isCompany;
	/**
	 * 注册时间开始
	 */
	private Timestamp registTimeStart;
	/**
	 * 注册时间结束
	 */
	private Timestamp registTimeEnd;
	/**
	 * 最后登录时间开始
	 */
	private Timestamp lastLoginTimeStart;
	/**
	 * 最后登录时间结束
	 */
	private Timestamp lastLoginTimeEnd;

	private Integer pageNo = 1;

	private Integer pageSize = 20;

	public String getNickname() {
		return nickname;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public String getUsersource() {
		return usersource;
	}

	public String getRegistSource() {
		return registSource;
	}

	public String getSafetyLevel() {
		return safetyLevel;
	}

	public Integer getState() {
		return state;
	}

	public Integer getIsTranslator() {
		return isTranslator;
	}

	public Integer getIsCompany() {
		return isCompany;
	}

	public Timestamp getRegistTimeStart() {
		return registTimeStart;
	}

	public Timestamp getRegistTimeEnd() {
		return registTimeEnd;
	}

	public Timestamp getLastLoginTimeStart() {
		return lastLoginTimeStart;
	}

	public Timestamp getLastLoginTimeEnd() {
		return lastLoginTimeEnd;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public void setUsersource(String usersource) {
		this.usersource = usersource;
	}

	public void setRegistSource(String registSource) {
		this.registSource = registSource;
	}

	public void setSafetyLevel(String safetyLevel) {
		this.safetyLevel = safetyLevel;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public void setIsTranslator(Integer isTranslator) {
		this.isTranslator = isTranslator;
	}

	public void setIsCompany(Integer isCompany) {
		this.isCompany = isCompany;
	}

	public void setRegistTimeStart(Timestamp registTimeStart) {
		this.registTimeStart = registTimeStart;
	}

	public void setRegistTimeEnd(Timestamp registTimeEnd) {
		this.registTimeEnd = registTimeEnd;
	}

	public void setLastLoginTimeStart(Timestamp lastLoginTimeStart) {
		this.lastLoginTimeStart = lastLoginTimeStart;
	}

	public void setLastLoginTimeEnd(Timestamp lastLoginTimeEnd) {
		this.lastLoginTimeEnd = lastLoginTimeEnd;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}


	
}
