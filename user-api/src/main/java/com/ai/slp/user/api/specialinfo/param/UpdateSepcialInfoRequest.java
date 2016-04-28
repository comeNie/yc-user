package com.ai.slp.user.api.specialinfo.param;

import java.sql.Timestamp;

import javax.validation.constraints.NotNull;

import com.ai.opt.base.vo.BaseInfo;
import com.ai.slp.user.api.specialinfo.interfaces.IUcSpecialInfoSV;

/**
 * 更新个性化信息入参 Date: 2016年4月28日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class UpdateSepcialInfoRequest extends BaseInfo {

    private static final long serialVersionUID = 1L;

    @NotNull(message = "userID不能为空", groups = { IUcSpecialInfoSV.QuerySpecialInfo.class })
    private Long userId;

    @NotNull(message = "infoSpecialId不能为空", groups = { IUcSpecialInfoSV.QuerySpecialInfo.class })
    private Long infoSpecialId;

    private String infoType;

    private String infoItem;

    private String state;

    private String attrId;

    private String attrValue;

    private Timestamp createTime;

    private String createChlId;

    private Long createOperId;

    private Timestamp updateTime;

    private String updateChlId;

    private Long updateOperId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getInfoSpecialId() {
        return infoSpecialId;
    }

    public void setInfoSpecialId(Long infoSpecialId) {
        this.infoSpecialId = infoSpecialId;
    }

    public String getInfoType() {
        return infoType;
    }

    public void setInfoType(String infoType) {
        this.infoType = infoType;
    }

    public String getInfoItem() {
        return infoItem;
    }

    public void setInfoItem(String infoItem) {
        this.infoItem = infoItem;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAttrId() {
        return attrId;
    }

    public void setAttrId(String attrId) {
        this.attrId = attrId;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getCreateChlId() {
        return createChlId;
    }

    public void setCreateChlId(String createChlId) {
        this.createChlId = createChlId;
    }

    public Long getCreateOperId() {
        return createOperId;
    }

    public void setCreateOperId(Long createOperId) {
        this.createOperId = createOperId;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
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
