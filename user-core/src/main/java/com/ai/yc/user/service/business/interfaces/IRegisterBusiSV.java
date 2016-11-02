package com.ai.yc.user.service.business.interfaces;


import com.ai.yc.user.api.register.param.RegisterParamsRequest;
import com.ai.yc.user.api.register.param.UcGroupKeyInfoParams;
import com.ai.yc.user.api.register.param.UcUserParams;

public interface IRegisterBusiSV {
    
    public String insertUserInfo(RegisterParamsRequest registerParamsRequest);
    
    public void insertCompanyInfoAttest(RegisterParamsRequest registerParamsRequest);
    
    public boolean checkUserExist(UcUserParams userParams);
    
    public boolean checkUcGroupKeyExist(UcGroupKeyInfoParams ucGroupKeyInfoParams);
    

}
