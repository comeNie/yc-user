package com.ai.yc.user.api.usercompany.param;

import java.sql.Timestamp;

public class UsrCompanyInfo {
	/**
	 * 企业编号
	 */
    private String companyId;
    /**
     * 企业名称
     */
    private String companyName;
    /**
     * 营业执照
     */
    private String licenseAttacid;
    /**
     * 地址
     */
    private String address;

    private String companyEmail;
    /**
     * 座机
     */
    private String telephone;
    /**
     * 联系人
     */
    private String linkman;
    /**
     * 联系手机号
     */
    private String mobilephone;

    private String entpAttacid;
    /**
     * 企业简介
     */
    private String content;
    
    private String proposerId;

    private String proposerName;
    /**
     * 审核状态
     */
    private Integer state;
    
    private Timestamp createTime;

    private Timestamp modifyTime;

    private String cnCity;

    private String province;

    private String country;

    private String timeZone;

    private String auditor;

    private Timestamp checkTime;

    private String remark;

    private Integer isInitalData;

    private Long accountId;

    private String adminUserId;

    private String usersource;
    
    private String nickName;
    
    private String firstname;
    
    private String lastname;
    /**
     * 成员数量
     */
    private int membersCount;
    /**
     * 折扣
     */
    private String corporateDiscount;
    /**
     * 结算方式
     */
    private String settlingAccounts;
    /**
     * 企业账户
     */
    private int companyAccount;
    
    
    /**
     * 企业用户昵称
     */
    private String companyUserNickName;
    /**
     * 企业用户名称
     */
    private String companyUserUserName;
    /**
     * 企业成员用户级别
     */
    private String companyUserLevel;
    /**
     * 企业成员用户加入时间
     */
    private Timestamp companyJoinTime;
    /**
     * 企业成员用户余额
     */
    private int companyUserBalance;
    /**
     * 企业成员用户下单数
     */
    private int companySingularNumber;
    
    /**
	 * 企业角色
	 */
	private int isManagment;
    
	private String fullName;
	
	private String stateName;
	
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getLicenseAttacid() {
        return licenseAttacid;
    }

    public void setLicenseAttacid(String licenseAttacid) {
        this.licenseAttacid = licenseAttacid == null ? null : licenseAttacid.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail == null ? null : companyEmail.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
    }

    public String getEntpAttacid() {
        return entpAttacid;
    }

    public void setEntpAttacid(String entpAttacid) {
        this.entpAttacid = entpAttacid == null ? null : entpAttacid.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getProposerId() {
        return proposerId;
    }

    public void setProposerId(String proposerId) {
        this.proposerId = proposerId == null ? null : proposerId.trim();
    }

    public String getProposerName() {
        return proposerName;
    }

    public void setProposerName(String proposerName) {
        this.proposerName = proposerName == null ? null : proposerName.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getCnCity() {
        return cnCity;
    }

    public void setCnCity(String cnCity) {
        this.cnCity = cnCity == null ? null : cnCity.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone == null ? null : timeZone.trim();
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    public Timestamp getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Timestamp checkTime) {
        this.checkTime = checkTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getIsInitalData() {
        return isInitalData;
    }

    public void setIsInitalData(Integer isInitalData) {
        this.isInitalData = isInitalData;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getAdminUserId() {
        return adminUserId;
    }

    public void setAdminUserId(String adminUserId) {
        this.adminUserId = adminUserId == null ? null : adminUserId.trim();
    }

	public String getUsersource() {
		return usersource;
	}

	public void setUsersource(String usersource) {
		this.usersource = usersource;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getMembersCount() {
		return membersCount;
	}

	public void setMembersCount(int membersCount) {
		this.membersCount = membersCount;
	}

	public String getCorporateDiscount() {
		return corporateDiscount;
	}

	public void setCorporateDiscount(String corporateDiscount) {
		this.corporateDiscount = corporateDiscount;
	}

	public String getSettlingAccounts() {
		return settlingAccounts;
	}

	public void setSettlingAccounts(String settlingAccounts) {
		this.settlingAccounts = settlingAccounts;
	}

	public int getCompanyAccount() {
		return companyAccount;
	}

	public void setCompanyAccount(int companyAccount) {
		this.companyAccount = companyAccount;
	}

	public String getCompanyUserNickName() {
		return companyUserNickName;
	}

	public void setCompanyUserNickName(String companyUserNickName) {
		this.companyUserNickName = companyUserNickName;
	}

	public String getCompanyUserUserName() {
		return companyUserUserName;
	}

	public void setCompanyUserUserName(String companyUserUserName) {
		this.companyUserUserName = companyUserUserName;
	}

	public String getCompanyUserLevel() {
		return companyUserLevel;
	}

	public void setCompanyUserLevel(String companyUserLevel) {
		this.companyUserLevel = companyUserLevel;
	}

	public Timestamp getCompanyJoinTime() {
		return companyJoinTime;
	}

	public void setCompanyJoinTime(Timestamp companyJoinTime) {
		this.companyJoinTime = companyJoinTime;
	}

	public int getCompanyUserBalance() {
		return companyUserBalance;
	}

	public void setCompanyUserBalance(int companyUserBalance) {
		this.companyUserBalance = companyUserBalance;
	}

	public int getCompanySingularNumber() {
		return companySingularNumber;
	}

	public void setCompanySingularNumber(int companySingularNumber) {
		this.companySingularNumber = companySingularNumber;
	}

	public int getIsManagment() {
		return isManagment;
	}

	public void setIsManagment(int isManagment) {
		this.isManagment = isManagment;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	
}