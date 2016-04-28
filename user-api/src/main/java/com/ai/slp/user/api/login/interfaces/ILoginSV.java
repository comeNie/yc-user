package com.ai.slp.user.api.login.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.user.api.login.param.LoginRequest;
import com.ai.slp.user.api.login.param.LoginResponse;

/**
 * 登录服务 Date: 2016年4月20日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
public interface ILoginSV {
    @interface Login {
    }

    /**
     * 用户登录
     * 
     * @param loginRequest
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangqiang7
     * @UCUSER_007
     */
    LoginResponse login(LoginRequest loginRequest) throws BusinessException, SystemException;
}
