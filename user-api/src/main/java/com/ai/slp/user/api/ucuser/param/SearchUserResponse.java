package com.ai.slp.user.api.ucuser.param;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;

public class SearchUserResponse  extends BaseResponse{
    private static final long serialVersionUID = 1L;
    public String userId;
    public String userMp;
    public String userEmail;
    public String nickName;
    public String tenantId;
    public String getUserMp() {
        return userMp;
    }
    public void setUserMp(String userMp) {
        this.userMp = userMp;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public void setResponseHeader(ResponseHeader responseHeader) {
    }
    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    
}
