package com.ai.slp.user.api.ucuserphonebooks.param;

import org.hibernate.validator.constraints.NotBlank;

import com.ai.opt.base.vo.BaseInfo;
import com.ai.slp.user.api.ucuserphonebooks.interfaces.IUserPhoneBooksSV;

public class UcTelGroupQueryReq extends BaseInfo {

    private static final long serialVersionUID = 1L;

    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
