package com.ai.slp.user.api.login.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.slp.user.api.login.interfaces.ILoginSV;
import com.ai.slp.user.api.login.param.LoginRequest;
import com.ai.slp.user.api.login.param.LoginResponse;
import com.ai.slp.user.service.business.interfaces.ILoginBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * 登录服务实现 Date: 2016年4月22日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
@Service(validation = "true")
// @Service
public class LoginSVImpl implements ILoginSV {

    @Autowired
    private ILoginBusiSV loginBusiSV;

    @Override
    public LoginResponse login(LoginRequest loginRequest)
            throws BusinessException, SystemException {
        LoginResponse response = new LoginResponse();
        ResponseHeader responseHeader = null;
        response = loginBusiSV.login(loginRequest);
        if(null==response.getUserId()||"".equals(response.getUserId().trim()))
            responseHeader = new ResponseHeader(true, "success", "查询成功");
        else
            responseHeader = new ResponseHeader(false, "fail", "查询失败");
        response.setResponseHeader(responseHeader);
        return response;
    }

}
