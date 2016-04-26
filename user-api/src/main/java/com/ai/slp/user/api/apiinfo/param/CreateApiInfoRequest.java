package com.ai.slp.user.api.apiinfo.param;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.ai.opt.base.vo.BaseInfo;
import com.ai.slp.user.api.apiinfo.interfaces.IApiInfoSV;

/**
 * 企业、代理商申请API创建服务请求 <br>
 * Date: 2016年4月19日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class CreateApiInfoRequest extends BaseInfo {
    private static final long serialVersionUID = 1L;

    /**
     * 用户Id NOT NULL
     */
    @NotNull(message = "用户Id不能为空", groups = { IApiInfoSV.InsertApiInfo.class })
    private Integer userId;

    /**
     * API ID
     */
    private String apiSeqId;

    /**
     * API名称
     */
    private String apiName;

    /**
     * API类型
     */
    private String apiType;

    /**
     * API场景描述
     */
    private String apiInfo;

    /**
     * 网站地址
     */
    private String webAddr;

    /**
     * IP白名单
     */
    private String ipAddr;

    /**
     * 开通服务串
     */
    private String operService;

    /**
     * 联系人姓名
     */
    private String contactName;

    /**
     * 联系人手机号码
     */
    private String contactMp;

    /**
     * 联系人EMAIL
     */
    private String contactEmail;

    /**
     * 备注
     */
    private String remark;

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

    public Integer getUserId() {
        return userId;
    }

    public String getApiSeqId() {
        return apiSeqId;
    }

    public void setApiSeqId(String apiSeqId) {
        this.apiSeqId = apiSeqId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public String getApiType() {
        return apiType;
    }

    public void setApiType(String apiType) {
        this.apiType = apiType;
    }

    public String getApiInfo() {
        return apiInfo;
    }

    public void setApiInfo(String apiInfo) {
        this.apiInfo = apiInfo;
    }

    public String getWebAddr() {
        return webAddr;
    }

    public void setWebAddr(String webAddr) {
        this.webAddr = webAddr;
    }

    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    public String getOperService() {
        return operService;
    }

    public void setOperService(String operService) {
        this.operService = operService;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactMp() {
        return contactMp;
    }

    public void setContactMp(String contactMp) {
        this.contactMp = contactMp;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

}
