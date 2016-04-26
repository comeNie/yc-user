package com.ai.slp.user.api.ucUserPhonebooks.param;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;

public class UcPhoneBooksParamsResponse extends BaseResponse{
   
    private static final long serialVersionUID = 1L;
    
    private long seq;
    
    private String telName;
    
    private String telMp;
    
    private String citypCode;
    
    private String basicOrgId;
    
    private PageInfo<UcPhoneBooksParamsResponse> pageInfo;
   
    
    
    public long getSeq() {
        return seq;
    }
    public void setSeq(long seq) {
        this.seq = seq;
    }
    public String getTelName() {
        return telName;
    }
    public void setTelName(String telName) {
        this.telName = telName;
    }
    public String getTelMp() {
        return telMp;
    }
    public void setTelMp(String telMp) {
        this.telMp = telMp;
    }
    public String getCitypCode() {
        return citypCode;
    }
    public void setCitypCode(String citypCode) {
        this.citypCode = citypCode;
    }
    public String getBasicOrgId() {
        return basicOrgId;
    }
    public void setBasicOrgId(String basicOrgId) {
        this.basicOrgId = basicOrgId;
    }
    public PageInfo<UcPhoneBooksParamsResponse> getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfo<UcPhoneBooksParamsResponse> pageInfo) {
        this.pageInfo = pageInfo;
    }
    
    
}
