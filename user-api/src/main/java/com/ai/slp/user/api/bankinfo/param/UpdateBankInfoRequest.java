package com.ai.slp.user.api.bankinfo.param;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.ai.opt.base.vo.BaseInfo;
import com.ai.slp.user.api.bankinfo.interfaces.IUcBankInfoSV;

public class UpdateBankInfoRequest extends BaseInfo {

    private static final long serialVersionUID = 1L;

    /**
     * 用户Id NOT NULL
     */
    @NotNull(message = "UserID不能为空", groups = { IUcBankInfoSV.UpdateBankInfo.class })
    @Size(min = 18, max = 18, message = "用户Id长度不是18位", groups = { IUcBankInfoSV.InsertBankInfo.class })
    private String userId;

    /**
     * 唯一标识
     */
    @NotNull(message = "BankSeqId不能为空", groups = { IUcBankInfoSV.UpdateBankInfo.class })
    @Size(min = 18, max = 18, message = "唯一标识长度不是18位", groups = { IUcBankInfoSV.InsertBankInfo.class })
    private String bankSeqId;

    /**
     * 状态
     */
    private String state;

    /**
     * 开户许可证号
     */
    private String licenseNo;

    /**
     * 开户银行编码
     */
    private String bankNo;

    /**
     * 开户省
     */
    private String provinceCode;

    /**
     * 开户地市
     */
    private String cityCode;

    /**
     * 开户银行网点名称
     */
    private String bankName;

    /**
     * 开户账户名称
     */
    private String acctName;

    /**
     * 开户账户密码
     */
    private String acctNo;

    /**
     * 备注
     */
    private String remark;

    /**
     * 更新渠道
     */
    private String updateChlId;

    /**
     * 更新员工
     */
    private Long updateOperId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBankSeqId() {
        return bankSeqId;
    }

    public void setBankSeqId(String bankSeqId) {
        this.bankSeqId = bankSeqId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
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

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getUpdateChlId() {
        return updateChlId;
    }

    public void setUpdateChlId(String updateChlId) {
        this.updateChlId = updateChlId;
    }

    public Long getUpdateOperId() {
        return updateOperId;
    }

    public void setUpdateOperId(Long updateOperId) {
        this.updateOperId = updateOperId;
    }

}
