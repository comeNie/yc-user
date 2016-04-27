package com.ai.slp.user.service.business.interfaces;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.slp.user.api.ucStateChg.param.UcStateChgParamsRequest;

public interface IUcStateChgBusiSV {
   
    public BaseResponse insertUcStateChgBusiInfo(UcStateChgParamsRequest ucStateChgParam);
    public BaseResponse updateUcStateChgBusiInfo(UcStateChgParamsRequest ucStateChgParam);
}
