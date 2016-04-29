package com.ai.slp.user.service.business.interfaces;

import com.ai.slp.user.api.login.param.LoginRequest;
import com.ai.slp.user.api.login.param.LoginResponse;
import com.ai.slp.user.api.register.param.RegisterParamsResponse;
import com.ai.slp.user.api.register.param.UcUserParams;

/**
 * 用户信息
 * Date: 2016年4月29日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhaogw
 */
public interface IUcUserBusiSV {
    RegisterParamsResponse searchUserInfo(UcUserParams ucUser);
}
