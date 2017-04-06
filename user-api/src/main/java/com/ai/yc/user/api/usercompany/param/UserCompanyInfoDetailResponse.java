package com.ai.yc.user.api.usercompany.param;

import java.sql.Timestamp;

import com.ai.opt.base.vo.BaseResponse;

public class UserCompanyInfoDetailResponse extends BaseResponse{
		
		private static final long serialVersionUID = 1L;
		/**
		 * 企业编号
		 */
	    private String companyId;
	    /**
	     * 企业名称
	     */
	    private String companyName;
	    /**
	     * 营业执照Id
	     */
	    private String licenseAttacid;
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
	     * 企业logo
	     */
	    private String entpAttacid;
	    /**
	     * 企业简介
	     */
	    private String content;
	    /**
	     * 申请人Id
	     */
	    private String proposerId;

	    /**
	     * 申请名称
	     */
	    private String proposerName;
	    /**
	     * 启用状态
	     */
	    private Integer state;
	    /**
	     * 创建时间
	     */
	    private Timestamp createTime;
	    /**
	     * 修改时间
	     */
	    private Timestamp modifyTime;
	    /**
	     * 备注
	     */
	    private String remark;
	    /**
	     * 是否是初始化数据
	     */
	    private Integer isInitalData;
	    /**
	     * 账户Id
	     */
	    private Long accountId;
	    /**
	     * 管理员用户Id
	     */
	    private String adminUserId;
	    /**
	     * 审核人
	     */
	    private String auditor;
	    /**
	     * 审核时间
	     */
	    private Timestamp checkTime;
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
	    private String cnCity;
	    /**
	     * 企业账户余额
	     */
	    private long companyBalance;
	    
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

		public String getAuditor() {
			return auditor;
		}

		public void setAuditor(String auditor) {
			this.auditor = auditor;
		}

		public Timestamp getCheckTime() {
			return checkTime;
		}

		public void setCheckTime(Timestamp checkTime) {
			this.checkTime = checkTime;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getProvince() {
			return province;
		}

		public void setProvince(String province) {
			this.province = province;
		}

		public String getCnCity() {
			return cnCity;
		}

		public void setCnCity(String cnCity) {
			this.cnCity = cnCity;
		}

		public long getCompanyBalance() {
			return companyBalance;
		}

		public void setCompanyBalance(long companyBalance) {
			this.companyBalance = companyBalance;
		}
	    
}
