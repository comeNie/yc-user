package com.ai.yc.user.dao.mapper.bo;

import java.sql.Timestamp;

public class TCertificate {
    private String userId;

    private String certificateType;

    private Integer certificateLevel;

    private String certificateName;

    private String grantingInstitution;

    private String awardedTime;

    private String certificatesDescribe;

    private Timestamp createTime;

    private String certificateId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType == null ? null : certificateType.trim();
    }

    public Integer getCertificateLevel() {
        return certificateLevel;
    }

    public void setCertificateLevel(Integer certificateLevel) {
        this.certificateLevel = certificateLevel;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName == null ? null : certificateName.trim();
    }

    public String getGrantingInstitution() {
        return grantingInstitution;
    }

    public void setGrantingInstitution(String grantingInstitution) {
        this.grantingInstitution = grantingInstitution == null ? null : grantingInstitution.trim();
    }

    public String getAwardedTime() {
        return awardedTime;
    }

    public void setAwardedTime(String awardedTime) {
        this.awardedTime = awardedTime == null ? null : awardedTime.trim();
    }

    public String getCertificatesDescribe() {
        return certificatesDescribe;
    }

    public void setCertificatesDescribe(String certificatesDescribe) {
        this.certificatesDescribe = certificatesDescribe == null ? null : certificatesDescribe.trim();
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId == null ? null : certificateId.trim();
    }
}