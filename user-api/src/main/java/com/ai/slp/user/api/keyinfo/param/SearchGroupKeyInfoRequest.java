package com.ai.slp.user.api.keyinfo.param;

import com.ai.opt.base.vo.BaseInfo;

public class SearchGroupKeyInfoRequest extends BaseInfo {

    private static final long serialVersionUID = 1L;
    /**
     * 企业名称
     */
    private String custName;
    /**
     * 用户ID
     */
    private String userId;

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
