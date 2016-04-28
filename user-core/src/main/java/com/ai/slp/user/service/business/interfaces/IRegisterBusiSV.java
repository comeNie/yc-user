package com.ai.slp.user.service.business.interfaces;


import com.ai.opt.base.vo.BaseResponse;
import com.ai.slp.user.api.register.param.UcGroupKeyInfoParams;
import com.ai.slp.user.api.register.param.UcUserParams;

public interface IRegisterBusiSV {
    
    public BaseResponse insertUserInfo(UcUserParams userParams);
    
    public BaseResponse insertUcGroupKeyInfo(UcGroupKeyInfoParams ucGroupKeyInfoParams);
    
    public BaseResponse getUserInfo(UcUserParams userParams);
}
