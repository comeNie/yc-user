package com.ai.slp.user.api.register.interfaces;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.slp.user.api.register.param.UcUserParams;

/**
 * 用户注册 <br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhaogw
 */
public interface IRegisterSV {

    /**
     * 
     * @param request
     * @author zhaogw
     * @REG_0001
     */
    BaseResponse insertUcUser( UcUserParams ucUser);
    
    
    
    
}
