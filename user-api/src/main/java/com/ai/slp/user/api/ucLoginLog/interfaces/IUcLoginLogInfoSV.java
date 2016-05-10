package com.ai.slp.user.api.ucLoginLog.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
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
    BaseResponse insertUserLoginLog(UcLoginLogParamsRequest userLoginParam) throws BusinessException, SystemException;
    /**
     * 登录日志查询
     * @param ucLoginLogParam
     * @param limitStart
     * @param limitEnd
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangyh7
     * @ApiDocMethod
     */
    public PageInfo<UcLoginLogResponse> getUcLoginLogInfo(UcLoginLogParamsRequest ucLoginLogParam,int limitStart,int limitEnd) throws BusinessException, SystemException;
}
