package com.ai.slp.user.api.ucuserphonebooks.param;

import java.io.Serializable;

public class UcUserPhonebooksBatchData implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 电话号码
     */
    private String telNo;

    /**
     * 姓名
     */
    private String telName;

    /**
     * 归属用户
     */
    private String userId;

    /**
     * 通讯录分组标识
     */
    private String telGroupId;

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getTelName() {
        return telName;
    }

    public void setTelName(String telName) {
        this.telName = telName;
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

}
