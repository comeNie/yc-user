package com.ai.yc.user.api.usercompany.param;

import java.sql.Timestamp;

public class UserCompanyPageInfo {
	/**
	 * 企业编号
	 */
	private String companyId;
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
	/**
	 * 审核时间
	 */
	private Timestamp checkTime;
	
	private String lastname;
	
	private String firstname;
	
	private String content;
	
	private String remark;
	/**
	 * 成员数量
	 */
	private int membersCount;
	/**
	 * 是否译员
	 */
	private int isTranslator;
	/**
	 * 企业账户Id
	 */
	private long companyAccount;
	
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public int getMembersCount() {
		return membersCount;
	}
	public void setMembersCount(int membersCount) {
		this.membersCount = membersCount;
	}
	public Timestamp getCheckTime() {
		return checkTime;
	}
	public void setCheckTime(Timestamp checkTime) {
		this.checkTime = checkTime;
	}
	public int getIsTranslator() {
		return isTranslator;
	}
	public void setIsTranslator(int isTranslator) {
		this.isTranslator = isTranslator;
	}
	public long getCompanyAccount() {
		return companyAccount;
	}
	public void setCompanyAccount(long companyAccount) {
		this.companyAccount = companyAccount;
	}
	
}
