package com.ai.yc.user.dao.mapper.bo;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class UsrTranslator {
    private String userId;

    private String lspId;

    /**
     * 10、译员
     * 11、项目经理
     * 12、超级管理员
     */
    private String lspRole;

    private Integer workingLife;

    private String motherTongue;

    private Integer state;

    private String translationType;

    private BigDecimal interpretPrice;

    private Timestamp createTime;

    private Timestamp lastModifyTime;

    private String introduction;

    private Integer isLsp;

    private String vipLevel;

    private String legalCertNum;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getLspId() {
        return lspId;
    }

    public void setLspId(String lspId) {
        this.lspId = lspId == null ? null : lspId.trim();
    }

    public String getLspRole() {
        return lspRole;
    }

    public void setLspRole(String lspRole) {
        this.lspRole = lspRole == null ? null : lspRole.trim();
    }

    public Integer getWorkingLife() {
        return workingLife;
    }

    public void setWorkingLife(Integer workingLife) {
        this.workingLife = workingLife;
    }

    public String getMotherTongue() {
        return motherTongue;
    }

    public void setMotherTongue(String motherTongue) {
        this.motherTongue = motherTongue == null ? null : motherTongue.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getTranslationType() {
        return translationType;
    }

    public void setTranslationType(String translationType) {
        this.translationType = translationType == null ? null : translationType.trim();
    }

    public BigDecimal getInterpretPrice() {
        return interpretPrice;
    }

    public void setInterpretPrice(BigDecimal interpretPrice) {
        this.interpretPrice = interpretPrice;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Timestamp lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public Integer getIsLsp() {
        return isLsp;
    }

    public void setIsLsp(Integer isLsp) {
        this.isLsp = isLsp;
    }

    public String getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(String vipLevel) {
        this.vipLevel = vipLevel == null ? null : vipLevel.trim();
    }

    public String getLegalCertNum() {
        return legalCertNum;
    }

    public void setLegalCertNum(String legalCertNum) {
        this.legalCertNum = legalCertNum == null ? null : legalCertNum.trim();
    }
}