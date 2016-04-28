package com.ai.slp.user.api.ucLoginLog.interfaces;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.user.api.ucLoginLog.param.UcLoginLogParamsRequest;
import com.ai.slp.user.api.ucLoginLog.param.UcLoginLogResponse;

public interface IUcLoginLogInfoSV {
   
    @interface InsertUserLoginLog{};
    /**
     * 
     * 新增登录日志   </br>
     * @param contactsGroup
     * @return
     * @author zhangyuehong
     * @ApiDocMethod
     */
    BaseResponse insertUserLoginLog(UcLoginLogParamsRequest userLoginParam);
    
    public PageInfo<UcLoginLogResponse> getUcLoginLogInfo(UcLoginLogParamsRequest ucLoginLogParam,int limitStart,int limitEnd);
}
