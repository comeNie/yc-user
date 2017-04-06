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
	    /**
	     * 名
	     */
	    private String lastname;
	    /**
	     * 姓
	     */
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
	    /**
	     * 个人账户余额
	     */
	    private long balance;
	    /**
	     * 企业编号
	     */
	    private String companyId;
	    /**
	     * 企业名称
	     */
	    private String companyName;
	    /**
	     * 营业执照url
	     */
	    private String licenseAttacurl;
	    /**
	     * 地址
	     */
	    private String address;
	    /**
	     * 邮件
	     */
	    private String companyEmail;
	    /**
	     * 联系电话(座机)
	     */
	    private String telephone;
	    /**
	     * 联系人
	     */
	    private String linkman;
	    /**
	     * 手机号
	     */
	    private String mobilephone;
	    /**
	     * 企业logo url
	     */
	    private String logoUrl;
	    /**
	     * 创建时间
	     */
	    private Timestamp companyCreateTime;
	   
	    /**
	     * 账户Id
	     */
	    private Long companyAccountId;
	    /**
	     * 国家
	     */
	    private String country;
	    /**
	     * 省
	     */
	    private String province;
	    /**
	     * 城市
	     */
	    private String cncity;
	    /**
	     * 企业简介
	     */
	    private String content;
	    /**
	     * 备注
	     */
	    private String remark;
	    /**
	     * 企业账户
	     */
	    private long companyBalance;
	    
	    /**
	     * 审核人
	     */
	    private String auditor;
	    
	    /**
	     * 审核时间
	     */
	    private Timestamp checkTime;
	    
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

		public long getBalance() {
			return balance;
		}

		public void setBalance(long balance) {
			this.balance = balance;
		}

		public String getCompanyId() {
			return companyId;
		}

		public void setCompanyId(String companyId) {
			this.companyId = companyId;
		}

		public String getCompanyName() {
			return companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}


		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getCompanyEmail() {
			return companyEmail;
		}

		public void setCompanyEmail(String companyEmail) {
			this.companyEmail = companyEmail;
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

		public String getMobilephone() {
			return mobilephone;
		}

		public void setMobilephone(String mobilephone) {
			this.mobilephone = mobilephone;
		}


		public String getLicenseAttacurl() {
			return licenseAttacurl;
		}

		public void setLicenseAttacurl(String licenseAttacurl) {
			this.licenseAttacurl = licenseAttacurl;
		}

		public String getLogoUrl() {
			return logoUrl;
		}

		public void setLogoUrl(String logoUrl) {
			this.logoUrl = logoUrl;
		}

		public Timestamp getCompanyCreateTime() {
			return companyCreateTime;
		}

		public void setCompanyCreateTime(Timestamp companyCreateTime) {
			this.companyCreateTime = companyCreateTime;
		}

		public Long getCompanyAccountId() {
			return companyAccountId;
		}

		public void setCompanyAccountId(Long companyAccountId) {
			this.companyAccountId = companyAccountId;
		}

		public String getProvince() {
			return province;
		}

		public void setProvince(String province) {
			this.province = province;
		}

		public String getCncity() {
			return cncity;
		}

		public void setCncity(String cncity) {
			this.cncity = cncity;
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

		public long getCompanyBalance() {
			return companyBalance;
		}

		public void setCompanyBalance(long companyBalance) {
			this.companyBalance = companyBalance;
		}

		public Timestamp getCheckTime() {
			return checkTime;
		}

		public void setCheckTime(Timestamp checkTime) {
			this.checkTime = checkTime;
		}

		public String getAuditor() {
			return auditor;
		}

		public void setAuditor(String auditor) {
			this.auditor = auditor;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}
		
}
