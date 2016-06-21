package com.ai.slp.user.api.keyinfo.param;

import javax.validation.constraints.NotNull;

import com.ai.opt.base.vo.BaseInfo;
import com.ai.slp.user.api.keyinfo.interfaces.IUcKeyInfoSV;

public class SearchGroupKeyInfoRequest extends BaseInfo {

    private static final long serialVersionUID = 1L;

    @NotNull(message = "公司名不能为空", groups = { IUcKeyInfoSV.SearchGroupKeyInfo.class })
    private String custName;

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
