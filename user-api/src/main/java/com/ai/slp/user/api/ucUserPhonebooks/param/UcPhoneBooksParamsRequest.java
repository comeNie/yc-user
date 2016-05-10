package com.ai.slp.user.api.ucUserPhonebooks.param;

import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.ai.opt.base.vo.BaseInfo;
import com.ai.slp.user.api.ucUserPhonebooks.interfaces.IUcUserPhoneBooksSV;

public class UcPhoneBooksParamsRequest extends BaseInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 租户ID
     */
    @NotNull(message = "租户ID不能为空", groups = { IUcUserPhoneBooksSV.PhoneBooksManuallyInfo.class,
            IUcUserPhoneBooksSV.UpdatePhoneBooksInfo.class })
    @Size(max = 32, groups = { IUcUserPhoneBooksSV.PhoneBooksManuallyInfo.class,
            IUcUserPhoneBooksSV.UpdatePhoneBooksInfo.class })
    private String tenantId;

    /**
     * 用户ID
     */
    @NotNull(message = "用户ID不能为空", groups = { IUcUserPhoneBooksSV.PhoneBooksManuallyInfo.class,
            IUcUserPhoneBooksSV.UpdatePhoneBooksInfo.class })
    @Size(max = 18, groups = { IUcUserPhoneBooksSV.PhoneBooksManuallyInfo.class,
            IUcUserPhoneBooksSV.UpdatePhoneBooksInfo.class })
    private String userId;

    /**
     * 通讯录组ID
     */
    @NotNull(message = "通讯录组ID不能为空", groups = { IUcUserPhoneBooksSV.PhoneBooksManuallyInfo.class,
            IUcUserPhoneBooksSV.UpdatePhoneBooksInfo.class })
    @Size(max = 32, groups = { IUcUserPhoneBooksSV.PhoneBooksManuallyInfo.class,
            IUcUserPhoneBooksSV.UpdatePhoneBooksInfo.class })
    private String telGroupId;

    /**
     * 通讯录ID
     */
    @NotNull(message = "通讯录ID不能为空", groups = { IUcUserPhoneBooksSV.PhoneBooksManuallyInfo.class,
            IUcUserPhoneBooksSV.UpdatePhoneBooksInfo.class })
    @Size(max = 32, groups = { IUcUserPhoneBooksSV.PhoneBooksManuallyInfo.class,
            IUcUserPhoneBooksSV.UpdatePhoneBooksInfo.class })
    private String telNo;

    /**
     * 序号
     */
    @Size(max = 10, groups = { IUcUserPhoneBooksSV.PhoneBooksManuallyInfo.class,
            IUcUserPhoneBooksSV.UpdatePhoneBooksInfo.class })
    private long seq;

    /**
     * 联系人
     */
    @Size(max = 64, groups = { IUcUserPhoneBooksSV.PhoneBooksManuallyInfo.class,
            IUcUserPhoneBooksSV.UpdatePhoneBooksInfo.class })
    private String telName;

    /**
     * 通讯录名称
     */
    @NotNull(message = "通讯录名称不能为空", groups = { IUcUserPhoneBooksSV.PhoneBooksManuallyInfo.class,
            IUcUserPhoneBooksSV.UpdatePhoneBooksInfo.class })
    @Size(max = 128, groups = { IUcUserPhoneBooksSV.PhoneBooksManuallyInfo.class,
            IUcUserPhoneBooksSV.UpdatePhoneBooksInfo.class })
    private String telGroupName;

    /**
     * 联系手机
     */
    @NotNull(message = "手机号不能为空", groups = { IUcUserPhoneBooksSV.PhoneBooksManuallyInfo.class,
            IUcUserPhoneBooksSV.UpdatePhoneBooksInfo.class })
    @Size(max = 16, groups = { IUcUserPhoneBooksSV.PhoneBooksManuallyInfo.class,
            IUcUserPhoneBooksSV.UpdatePhoneBooksInfo.class })
    private String telMp;

    /**
     * 归属省
     */
    @Size(max = 6, groups = { IUcUserPhoneBooksSV.PhoneBooksManuallyInfo.class,
            IUcUserPhoneBooksSV.UpdatePhoneBooksInfo.class })
    private String provinceCode;

    /**
     * 归属地市
     */
    @Size(max = 6, groups = { IUcUserPhoneBooksSV.PhoneBooksManuallyInfo.class,
            IUcUserPhoneBooksSV.UpdatePhoneBooksInfo.class })
    private String cityCode;

    /**
     * 基础运营商
     */
    @Size(max = 2, groups = { IUcUserPhoneBooksSV.PhoneBooksManuallyInfo.class,
            IUcUserPhoneBooksSV.UpdatePhoneBooksInfo.class })
    private String basicBasicOrgId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建渠道
     */
    @Size(max = 7, groups = { IUcUserPhoneBooksSV.PhoneBooksManuallyInfo.class,
            IUcUserPhoneBooksSV.UpdatePhoneBooksInfo.class })
    private String createChlId;

    /**
     * 创建员工
     */
    @Size(max = 10, groups = { IUcUserPhoneBooksSV.PhoneBooksManuallyInfo.class,
            IUcUserPhoneBooksSV.UpdatePhoneBooksInfo.class })
    private long createOperId;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 创建渠道
     */
    @Size(max = 7, groups = { IUcUserPhoneBooksSV.PhoneBooksManuallyInfo.class,
            IUcUserPhoneBooksSV.UpdatePhoneBooksInfo.class })
    private String updateChlId;

    /**
     * 创建员工
     */
    @Size(max = 10, groups = { IUcUserPhoneBooksSV.PhoneBooksManuallyInfo.class,
            IUcUserPhoneBooksSV.UpdatePhoneBooksInfo.class })
    private long updateOperId;

    private String telPhoneOrTelName;

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
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

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public long getSeq() {
        return seq;
    }

    public void setSeq(long seq) {
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

    public long getCreateOperId() {
        return createOperId;
    }

    public void setCreateOperId(long createOperId) {
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

    public long getUpdateOperId() {
        return updateOperId;
    }

    public void setUpdateOperId(long updateOperId) {
        this.updateOperId = updateOperId;
    }

    public String getTelPhoneOrTelName() {
        return telPhoneOrTelName;
    }

    public void setTelPhoneOrTelName(String telPhoneOrTelName) {
        this.telPhoneOrTelName = telPhoneOrTelName;
    }

}
