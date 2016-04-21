package com.ai.slp.user.api.contactsInfo.param;

import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.ai.slp.user.api.contactsInfo.interfaces.IContactsSV;


public class ContactsParamsRequest {
	/**
	 * 租户ID
	 */
	@NotNull(message="租户ID不能为空",groups={IContactsSV.ContactsManuallyInfo.class,IContactsSV.ContactExportInfo.class,IContactsSV.UpdateContactsInfo.class})
    @Size(max=32,groups={IContactsSV.ContactsManuallyInfo.class,IContactsSV.ContactExportInfo.class,IContactsSV.UpdateContactsInfo.class})
	private String tenantId;
	
	/**
	 * 用户ID
	 */
	@NotNull(message="用户ID不能为空",groups={IContactsSV.ContactsManuallyInfo.class,IContactsSV.ContactExportInfo.class,IContactsSV.UpdateContactsInfo.class})
    @Size(max=18,groups={IContactsSV.ContactsManuallyInfo.class,IContactsSV.ContactExportInfo.class,IContactsSV.UpdateContactsInfo.class})
	private int userId;
	
	/**
	 * 通讯录组ID
	 */
	@NotNull(message="通讯录组ID不能为空",groups={IContactsSV.ContactsManuallyInfo.class,IContactsSV.ContactExportInfo.class,IContactsSV.UpdateContactsInfo.class})
    @Size(max=32,groups={IContactsSV.ContactsManuallyInfo.class,IContactsSV.ContactExportInfo.class,IContactsSV.UpdateContactsInfo.class})
	private String telGroupId;
	
	/**
	 * 通讯录ID
	 */
	@NotNull(message="通讯录ID不能为空",groups={IContactsSV.ContactsManuallyInfo.class,IContactsSV.ContactExportInfo.class,IContactsSV.UpdateContactsInfo.class})
    @Size(max=32,groups={IContactsSV.ContactsManuallyInfo.class,IContactsSV.ContactExportInfo.class,IContactsSV.UpdateContactsInfo.class})
	private String telId;
	
	
	/**
	 * 序号
	 */
    @Size(max=10,groups={IContactsSV.ContactsManuallyInfo.class,IContactsSV.ContactExportInfo.class,IContactsSV.UpdateContactsInfo.class})
	private int seq;
	
    /**
	 * 联系人
	 */
    @Size(max=64,groups={IContactsSV.ContactsManuallyInfo.class,IContactsSV.ContactExportInfo.class,IContactsSV.UpdateContactsInfo.class})
	private String telName;
    
    
    /**
     * 通讯录名称
     */
    @NotNull(message="通讯录名称不能为空",groups={IContactsSV.ContactsManuallyInfo.class,IContactsSV.ContactExportInfo.class,IContactsSV.UpdateContactsInfo.class})
    @Size(max=128,groups={IContactsSV.ContactsManuallyInfo.class,IContactsSV.ContactExportInfo.class,IContactsSV.UpdateContactsInfo.class})
	private String telGroupName;
    
    /**
     * 联系手机
     */
    @NotNull(message="手机号不能为空",groups={IContactsSV.ContactsManuallyInfo.class,IContactsSV.ContactExportInfo.class,IContactsSV.UpdateContactsInfo.class})
    @Size(max=16,groups={IContactsSV.ContactsManuallyInfo.class,IContactsSV.ContactExportInfo.class,IContactsSV.UpdateContactsInfo.class})
    private String telMp;
    
    /**
     * 归属省
     */
    @Size(max=6,groups={IContactsSV.ContactsManuallyInfo.class,IContactsSV.ContactExportInfo.class,IContactsSV.UpdateContactsInfo.class})
    private String provinceCode;
    
    /**
     * 归属地市
     */
    @Size(max=6,groups={IContactsSV.ContactsManuallyInfo.class,IContactsSV.ContactExportInfo.class,IContactsSV.UpdateContactsInfo.class})
    private String cityCode;
    
    /**
     * 基础运营商
     */
    @Size(max=2,groups={IContactsSV.ContactsManuallyInfo.class,IContactsSV.ContactExportInfo.class,IContactsSV.UpdateContactsInfo.class})
    private String basicBasicOrgId;
    
    /**
     * 创建时间
     */
    private Date createTime;
    
    /**
     * 创建渠道
     */
    @Size(max=7,groups={IContactsSV.ContactsManuallyInfo.class,IContactsSV.ContactExportInfo.class,IContactsSV.UpdateContactsInfo.class})
    private String createChlId;
    
    /**
     * 创建员工
     */
    @Size(max=10,groups={IContactsSV.ContactsManuallyInfo.class,IContactsSV.ContactExportInfo.class,IContactsSV.UpdateContactsInfo.class})
    private int createOperId;
    
    /**
     * 修改时间
     */
    private Date updateTime;
    
    /**
     * 创建渠道
     */
    @Size(max=7,groups={IContactsSV.ContactsManuallyInfo.class,IContactsSV.ContactExportInfo.class,IContactsSV.UpdateContactsInfo.class})
    private String updateChlId;
    
    /**
     * 创建员工
     */
    @Size(max=10,groups={IContactsSV.ContactsManuallyInfo.class,IContactsSV.ContactExportInfo.class,IContactsSV.UpdateContactsInfo.class})
    private int updateOperId;

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTelGroupId() {
        return telGroupId;
    }

    public void setTelGroupId(String telGroupId) {
        this.telGroupId = telGroupId;
    }

    public String getTelId() {
        return telId;
    }

    public void setTelId(String telId) {
        this.telId = telId;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getTelName() {
        return telName;
    }

    public void setTelName(String telName) {
        this.telName = telName;
    }

    public String getTelGroupName() {
        return telGroupName;
    }

    public void setTelGroupName(String telGroupName) {
        this.telGroupName = telGroupName;
    }

    public String getTelMp() {
        return telMp;
    }

    public void setTelMp(String telMp) {
        this.telMp = telMp;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getBasicBasicOrgId() {
        return basicBasicOrgId;
    }

    public void setBasicBasicOrgId(String basicBasicOrgId) {
        this.basicBasicOrgId = basicBasicOrgId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateChlId() {
        return createChlId;
    }

    public void setCreateChlId(String createChlId) {
        this.createChlId = createChlId;
    }

    public int getCreateOperId() {
        return createOperId;
    }

    public void setCreateOperId(int createOperId) {
        this.createOperId = createOperId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateChlId() {
        return updateChlId;
    }

    public void setUpdateChlId(String updateChlId) {
        this.updateChlId = updateChlId;
    }

    public int getUpdateOperId() {
        return updateOperId;
    }

    public void setUpdateOperId(int updateOperId) {
        this.updateOperId = updateOperId;
    }
	
}
