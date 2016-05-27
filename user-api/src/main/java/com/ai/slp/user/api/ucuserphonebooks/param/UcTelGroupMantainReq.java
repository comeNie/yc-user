package com.ai.slp.user.api.ucuserphonebooks.param;

import org.hibernate.validator.constraints.NotBlank;

import com.ai.opt.base.vo.BaseInfo;
import com.ai.slp.user.api.ucuserphonebooks.interfaces.IUserPhoneBooksSV;

/**
 * 通讯录管理请求 Date: 2016年5月27日 <br>
 * Copyright (c) 2016 <br>
 * 
 * @author zhangchao
 */
public class UcTelGroupMantainReq extends BaseInfo {

    private static final long serialVersionUID = 1L;

    /**
     * 用户
     */
    @NotBlank(message = "用户不能为空", groups = { IUserPhoneBooksSV.AddUcTelGroup.class,
            IUserPhoneBooksSV.ModifyUcTelGroup.class, IUserPhoneBooksSV.DeleteUcTelGroup.class })
    private String userId;

    /**
     * 分组ID,如果是新增组，可以为空;修改或删除组必须传入
     */
    @NotBlank(message = "通信录分组标识不能为空", groups = { IUserPhoneBooksSV.ModifyUcTelGroup.class,
            IUserPhoneBooksSV.DeleteUcTelGroup.class })
    private String telGroupId;

    /**
     * 分组名称
     */
    @NotBlank(message = "通信录分组名称不能为空", groups = { IUserPhoneBooksSV.ModifyUcTelGroup.class,
            IUserPhoneBooksSV.AddUcTelGroup.class })
    private String telGroupName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

}
