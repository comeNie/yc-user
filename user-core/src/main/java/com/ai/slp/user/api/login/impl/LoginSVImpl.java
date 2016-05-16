package com.ai.slp.user.api.login.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.slp.user.api.login.interfaces.ILoginSV;
import com.ai.slp.user.api.login.param.LoginRequest;
import com.ai.slp.user.api.login.param.LoginResponse;
import com.ai.slp.user.constants.UserLoginErrorCode;
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
        try {
            response = loginBusiSV.login(loginRequest);
            responseHeader = new ResponseHeader(true, "success", "查询成功");
        } catch (BusinessException e) {
            if (UserLoginErrorCode.USER_ERR_001.equals(e.getErrorCode())) {
                responseHeader = new ResponseHeader(false, "fail", "用户名不存在");
            }
            if (UserLoginErrorCode.USER_ERR_002.equals(e.getErrorCode())) {
                responseHeader = new ResponseHeader(false, "fail", "邮箱未验证");
            }
            if (UserLoginErrorCode.USER_ERR_003.equals(e.getErrorCode())) {
                responseHeader = new ResponseHeader(false, "fail", "手机号未绑定");
            }
        }
        response.setResponseHeader(responseHeader);
        return response;
    }

}
