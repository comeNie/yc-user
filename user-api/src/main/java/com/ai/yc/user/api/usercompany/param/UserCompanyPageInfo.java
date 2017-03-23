package com.ai.yc.user.api.usercompany.param;

import java.sql.Timestamp;

public class UserCompanyPageInfo {
	/**
	 * 用户Id
	 */
	private String adminUserId;
	/**
	 * 用户来源
	 */
	private String usersource;
	/**
	 * 企业名称
	 */
	private String companyName;
	/**
	 * 昵称
	 */
	private String nickName;
	/**
	 * 座机
	 */
	private String telephone;
	/**
	 * 联系人
	 */
	private String linkman;
	/**
	 * 创建时间
	 */
	private Timestamp createTime;
	/**
	 * 审核状态
	 */
	private Integer state;
	
	private String lastname;
	
	private String firstname;
	
	public String getAdminUserId() {
		return adminUserId;
	}
	public void setAdminUserId(String adminUserId) {
		this.adminUserId = adminUserId;
	}
	public String getUsersource() {
		return usersource;
	}
	public void setUsersource(String usersource) {
		this.usersource = usersource;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getLinkman() {
		return linkman;
	}
	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
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
}
