package com.ai.slp.user.api.safari.param;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.ai.opt.base.vo.BaseInfo;
import com.ai.slp.user.api.safari.interfaces.IUserSafariSV;

/**
 * 删除浏览历史表入参 Date: 2016年4月27日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class DeleteSafariHisRequest extends BaseInfo {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID NOT NULL
     */
    @NotNull(message = "用户Id不能为空", groups = { IUserSafariSV.DeleteUserSafariHis.class })
    private String userId;

    /**
     * 浏览ID列表
     */
    @NotNull(message = "浏览Id列表不能为空", groups = { IUserSafariSV.DeleteUserSafariHis.class })
    private List<String> safariHisIdList;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<String> getSafariHisIdList() {
        return safariHisIdList;
    }

    public void setSafariHisIdList(List<String> safariHisIdList) {
        this.safariHisIdList = safariHisIdList;
    }

}
