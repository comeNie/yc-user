package com.ai.slp.user.api.userLoginLog.interfaces;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.slp.user.api.userLoginLog.param.UserLoginLogParamsRequest;

public interface IUserLoginLogInfoSV {
   
    @interface InsertUserLoginLog{};
    /**
     * 
     * 新增登录日志   </br>
     * @param contactsGroup
     * @return
     * @author zhangyuehong
     * @ApiDocMethod
     */
    BaseResponse insertUserLoginLog(UserLoginLogParamsRequest userLoginParam);
    
}
