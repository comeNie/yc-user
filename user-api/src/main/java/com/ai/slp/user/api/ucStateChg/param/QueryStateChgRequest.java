package com.ai.slp.user.api.ucStateChg.param;

import javax.validation.constraints.NotNull;

import com.ai.opt.base.vo.BaseInfo;
import com.ai.slp.user.api.ucStateChg.interfaces.IUcStateChgSV;

public class QueryStateChgRequest extends BaseInfo {

    private static final long serialVersionUID = 1L;

    @NotNull(message = "userId不能为空", groups = { IUcStateChgSV.InsertUcStateChgInfo.class })
    private Long userId;

    private String stateChgId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getStateChgId() {
        return stateChgId;
    }

    public void setStateChgId(String stateChgId) {
        this.stateChgId = stateChgId;
    }
    
    
}
