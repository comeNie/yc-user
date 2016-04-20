package com.ai.slp.user.api.safari.param;

import java.util.Date;

import com.ai.opt.base.vo.BaseResponse;

public class UserSafariInfoResponse extends BaseResponse {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 浏览信息ID
     */
    private String safariSeqId;
    /**
     * 商品ID
     */
    private String prodId;
    /**
     * 浏览时间
     */
    private Date safariTime;
    /**
     * 状态
     */
    
    private String state;
    public UserSafariInfoResponse(Integer userId, String safariSeqId, String prodId,
            Date safariTime, String state) {
        super();
        this.userId = userId;
        this.safariSeqId = safariSeqId;
        this.prodId = prodId;
        this.safariTime = safariTime;
        this.state = state;
    }
    
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getSafariSeqId() {
        return safariSeqId;
    }
    public void setSafariSeqId(String safariSeqId) {
        this.safariSeqId = safariSeqId;
    }
    public String getProdId() {
        return prodId;
    }
    public void setProdId(String prodId) {
        this.prodId = prodId;
    }
    public Date getSafariTime() {
        return safariTime;
    }
    public void setSafariTime(Date safariTime) {
        this.safariTime = safariTime;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    
    
}
