package com.ai.slp.user.api.ucuserphonebooks.param;

import com.ai.opt.base.vo.BaseInfo;

public class UcUserPhonebooksModifyReq extends BaseInfo {

    private static final long serialVersionUID = 1L;

    /**
     * 记录标识
     */
    private String recordId;

    /**
     * 通讯录分组标识
     */
    private String telGroupId;

    /**
     * 电话号码
     */
    private String telNo;

    /**
     * 姓名
     */
    private String telName;

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
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

    public String getTelName() {
        return telName;
    }

    public void setTelName(String telName) {
        this.telName = telName;
    }

}
