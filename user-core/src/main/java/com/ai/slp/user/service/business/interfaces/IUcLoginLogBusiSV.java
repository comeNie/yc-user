package com.ai.slp.user.service.business.interfaces;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.user.api.ucLoginLog.param.UcLoginLogParamsRequest;
import com.ai.slp.user.api.ucLoginLog.param.UcLoginLogResponse;

public interface IUcLoginLogBusiSV {
    public BaseResponse insertUcLoginLogInfo(UcLoginLogParamsRequest ucLoginLogParam);
    public PageInfo<UcLoginLogResponse> getUcLoginLogInfo(UcLoginLogParamsRequest ucLoginLogParam,int limitStart,int limitEnd);
}
