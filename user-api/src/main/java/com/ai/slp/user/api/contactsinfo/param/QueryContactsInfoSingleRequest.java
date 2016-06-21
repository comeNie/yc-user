package com.ai.slp.user.api.contactsinfo.param;

import com.ai.opt.base.vo.BaseInfo;

public class QueryContactsInfoSingleRequest extends BaseInfo {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
