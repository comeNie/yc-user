package com.ai.slp.user.api.ucTelGroupInfo.param;

import java.util.Date;
import java.util.Map;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;

public class UcTelGroupResponse extends BaseResponse {

    private static final long serialVersionUID = 1L;
    
    private long seq;
    
    private String telGroupId;
    
    private String telGroupName;
    
    private long phoneCount;
    
    private Date updateTime;
    
    PageInfo<Map<String,Object>> pageInfo;

    public long getSeq() {
        return seq;
    }

    public void setSeq(long seq) {
        this.seq = seq;
    }

    public String getTelGroupId() {
        return telGroupId;
    }

    public void setTelGroupId(String telGroupId) {
        this.telGroupId = telGroupId;
    }

    public String getTelGroupName() {
        return telGroupName;
    }

    public void setTelGroupName(String telGroupName) {
        this.telGroupName = telGroupName;
    }

    public long getPhoneCount() {
        return phoneCount;
    }

    public void setPhoneCount(long phoneCount) {
        this.phoneCount = phoneCount;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public PageInfo<Map<String,Object>> getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo<Map<String,Object>> pageInfo) {
        this.pageInfo = pageInfo;
    }
    
    
    
}
