package com.ai.slp.user.service.business.interfaces;


import com.ai.opt.base.vo.BaseResponse;
import com.ai.slp.user.api.register.param.UcBankKeyInfoParams;
import com.ai.slp.user.api.register.param.UcContactInfoParams;
import com.ai.slp.user.api.register.param.UcGroupKeyInfoParams;
import com.ai.slp.user.api.register.param.UcUserParams;

public interface IRegisterBusiSV {
    
    public BaseResponse insertUserInfo(UcUserParams userParams);
    
    public BaseResponse insertCompanyInfoAttest(UcUserParams userParams,UcGroupKeyInfoParams ucGroupKeyInfoParams,UcContactInfoParams ucContactInfoParams);
    
    public BaseResponse getUserInfo(UcUserParams userParams);
    
    public BaseResponse getUcGroupKeyInfo(UcGroupKeyInfoParams ucGroupKeyInfoParams);
    
    public BaseResponse insertAgentInfoAttest(UcUserParams userParams,UcGroupKeyInfoParams ucGroupKeyInfoParams,UcContactInfoParams ucContactInfoParams,UcBankKeyInfoParams ucBankKeyInfoParam);
}
