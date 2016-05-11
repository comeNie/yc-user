package com.ai.slp.user.service.business.interfaces;


import com.ai.opt.base.vo.BaseResponse;
import com.ai.slp.user.api.register.param.UcBankKeyInfoParams;
import com.ai.slp.user.api.register.param.UcContactInfoParams;
import com.ai.slp.user.api.register.param.UcGroupKeyInfoParams;
import com.ai.slp.user.api.register.param.UcUserAgreeParams;
import com.ai.slp.user.api.register.param.UcUserParams;
import com.ai.slp.user.api.register.param.UserParams;
import com.ai.slp.user.api.register.param.UserResponse;

public interface IRegisterBusiSV {
    
    public BaseResponse insertUserInfo(UcUserParams ucUser, UcUserAgreeParams agreeInfo,
            UcContactInfoParams contactInfo);
    
    public BaseResponse insertCompanyInfoAttest(UcUserParams userParams,UcGroupKeyInfoParams ucGroupKeyInfoParams,UcContactInfoParams ucContactInfoParams);
    
    public BaseResponse getUserInfo(UcUserParams userParams);
    
    public BaseResponse getUcGroupKeyInfo(UcGroupKeyInfoParams ucGroupKeyInfoParams);
    
    public BaseResponse insertAgentInfoAttest(UcUserParams userParams,UcGroupKeyInfoParams ucGroupKeyInfoParams,UcContactInfoParams ucContactInfoParams,UcBankKeyInfoParams ucBankKeyInfoParam);

    public BaseResponse updateUserInfo(UserParams updateUserParams);

    public UserResponse searchUserInfo(UcUserParams ucUser);
    
}
