package com.ai.slp.user.api.login.impl;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.user.api.login.interfaces.ILoginSV;
import com.ai.slp.user.api.login.param.LoginRequest;
import com.ai.slp.user.api.login.param.LoginResponse;

/**
 * 登录服务实现
 * Date: 2016年4月22日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public class LoginSVImpl implements ILoginSV {

    @Override
    public LoginResponse login(LoginRequest loginRequest)
            throws BusinessException, SystemException {
        return null;
    }

}
