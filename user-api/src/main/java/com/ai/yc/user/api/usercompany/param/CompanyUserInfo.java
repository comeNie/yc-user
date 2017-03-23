package com.ai.yc.user.api.usercompany.param;

import java.sql.Timestamp;

public class CompanyUserInfo {

		private static final long serialVersionUID = -2997865058532181384L;
		/**
		 * ucenter获取的用户名
		 */
		private String username;
		/**
		 * 用户Id
		 */
	    private String userId;
	    /**
	     * 昵称
	     */
	    private String nickname;
	    
	    private String lastname;

	    private String firstname;

	    /**
	     * 性别
	     */
	    private Integer sex;
	    /**
	     * 手机
	     */
	    private String mobilePhone;
	    /**
	     * qq 
	     */
	    private String qq;
	    /**
	     * 是否译员
	     */
	    private Integer isTranslator;
	    
	    private Integer isAdmin;
	    /**
	     * 姓名
	     */
	    private String fullName;
	    /**
	     * 个人账户id
	     */
	    private Long accountId;
	    /**
	     * 会员等级中文
	     */
	    private String griwthLevelZH;
	    
	    /**
	     * 会员等级英文
	     */
	    private String griwthLevelEN;
	    
	    /**
	     * 经验值
	     */
	    private Integer griwthValue;
	    /**
	     * 用户来源
	     */
	    private String usersource;
	    /**
	     * 创建时间
	     */
	    private Timestamp createTime;
	    /**
	     * 译员级别
	     */
	    private String vipLevel;
	    /**
	     * 邮箱
	     */
	    private String email;
	    
	    

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

		public Integer getIsAdmin() {
			return isAdmin;
		}

		public void setIsAdmin(Integer isAdmin) {
			this.isAdmin = isAdmin;
		}

		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public Long getAccountId() {
			return accountId;
		}

		public void setAccountId(Long accountId) {
			this.accountId = accountId;
		}

		public Integer getIsTranslator() {
			return isTranslator;
		}

		public void setIsTranslator(Integer isTranslator) {
			this.isTranslator = isTranslator;
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


		public String getGriwthLevelZH() {
			return griwthLevelZH;
		}

		public void setGriwthLevelZH(String griwthLevelZH) {
			this.griwthLevelZH = griwthLevelZH;
		}

		public String getGriwthLevelEN() {
			return griwthLevelEN;
		}

		public void setGriwthLevelEN(String griwthLevelEN) {
			this.griwthLevelEN = griwthLevelEN;
		}

		public Integer getGriwthValue() {
			return griwthValue;
		}

		public void setGriwthValue(Integer griwthValue) {
			this.griwthValue = griwthValue;
		}

		public String getUsersource() {
			return usersource;
		}

		public void setUsersource(String usersource) {
			this.usersource = usersource;
		}

		public Timestamp getCreateTime() {
			return createTime;
		}

		public void setCreateTime(Timestamp createTime) {
			this.createTime = createTime;
		}

		public String getVipLevel() {
			return vipLevel;
		}

		public void setVipLevel(String vipLevel) {
			this.vipLevel = vipLevel;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
}
