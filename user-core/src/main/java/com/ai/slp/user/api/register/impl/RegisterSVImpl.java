package com.ai.slp.user.api.register.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.slp.user.api.register.interfaces.IRegisterSV;
import com.ai.slp.user.api.register.param.UcContactInfoParams;
import com.ai.slp.user.api.register.param.UcUserAgreeParams;
import com.ai.slp.user.api.register.param.UcUserParams;
import com.ai.slp.user.api.register.param.UserParams;
import com.ai.slp.user.api.register.param.UserResponse;
import com.ai.slp.user.service.business.interfaces.IRegisterBusiSV;

@Service
public class RegisterSVImpl implements IRegisterSV {

    @Autowired
    public IRegisterBusiSV registerBusiSv;
    
    @Override
    public BaseResponse insertUcUser(UcUserParams ucUser, UcUserAgreeParams agreeInfo,
            UcContactInfoParams contactInfo) {
        return registerBusiSv.insertUserInfo(ucUser,agreeInfo,contactInfo);
    }

    @Override
    public BaseResponse updateUserInfo(UserParams updateUserParams) {
        return registerBusiSv.updateUserInfo(updateUserParams);
    }

    @Override
    public UserResponse searchUserInfo(UcUserParams ucUser) {
        return registerBusiSv.searchUserInfo(ucUser);
    }

}
