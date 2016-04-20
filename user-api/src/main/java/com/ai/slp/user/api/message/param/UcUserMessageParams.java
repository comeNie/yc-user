package com.ai.slp.user.api.message.param;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.ai.opt.base.vo.BaseInfo;
import com.ai.slp.user.api.message.interfaces.IUserMessageSV;

/**
 * 用户消息表
 * Date: 2016年4月20日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class UcUserMessageParams extends BaseInfo {

    private static final long serialVersionUID = 1L;
    /**
     * 用户消息ID NOT NULL
     */
    @NotNull(message = "用户消息Id不能为空", groups = { IUserMessageSV.UpdateUserMessage.class })
    private String infoSeqId;
    /**
     * 用户ID NOT NULL
     */
    @NotNull(message = "用户Id不能为空", groups = { IUserMessageSV.UpdateUserMessage.class })
    private String userId;
    /**
     * 消息类型
     */
    private String infoType;
    /**
     * 消息读取状态
     */
    private String readFlag;
    /**
     * 消息读取时间
     */
    private Date readTime;
    /**
     * 消息标题
     */
    private String infoHeadline;
    /**
     * 消息内容
     */
    private String infoMessage;
    /**
     * 消息状态
     */
    private String state;
    /**
     * 生效时间
     */
    private String activeTime;
    /**
     * 失效时间
     */
    private String inactiveTime;
    /**
     * 状态变更时间
     */
    private Date stateUpdateTime;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 创建渠道
     */
    private String createChlId;
    /**
     * 创建员工
     */
    private String createOperId;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 修改渠道
     */
    private String updateChlId;
    /**
     * 修改员工
     */
    private String updateOperId;
    /**
     * 备注
     */
    private String remark;
    public String getInfoSeqId() {
        return infoSeqId;
    }
    public void setInfoSeqId(String infoSeqId) {
        this.infoSeqId = infoSeqId;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getInfoType() {
        return infoType;
    }
    public void setInfoType(String infoType) {
        this.infoType = infoType;
    }
    public String getReadFlag() {
        return readFlag;
    }
    public void setReadFlag(String readFlag) {
        this.readFlag = readFlag;
    }
    public Date getReadTime() {
        return readTime;
    }
    public void setReadTime(Date readTime) {
        this.readTime = readTime;
    }
    public String getInfoHeadline() {
        return infoHeadline;
    }
    public void setInfoHeadline(String infoHeadline) {
        this.infoHeadline = infoHeadline;
    }
    public String getInfoMessage() {
        return infoMessage;
    }
    public void setInfoMessage(String infoMessage) {
        this.infoMessage = infoMessage;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getActiveTime() {
        return activeTime;
    }
    public void setActiveTime(String activeTime) {
        this.activeTime = activeTime;
    }
    public String getInactiveTime() {
        return inactiveTime;
    }
    public void setInactiveTime(String inactiveTime) {
        this.inactiveTime = inactiveTime;
    }
    public Date getStateUpdateTime() {
        return stateUpdateTime;
    }
    public void setStateUpdateTime(Date stateUpdateTime) {
        this.stateUpdateTime = stateUpdateTime;
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
    public String getCreateOperId() {
        return createOperId;
    }
    public void setCreateOperId(String createOperId) {
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
    public String getUpdateOperId() {
        return updateOperId;
    }
    public void setUpdateOperId(String updateOperId) {
        this.updateOperId = updateOperId;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    
    
}
