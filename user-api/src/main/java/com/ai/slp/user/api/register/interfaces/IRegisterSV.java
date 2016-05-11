package com.ai.slp.user.api.register.interfaces;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.slp.user.api.register.param.RegisterParamsResponse;
import com.ai.slp.user.api.register.param.UcContactInfoParams;
import com.ai.slp.user.api.register.param.UcUserAgreeParams;
import com.ai.slp.user.api.register.param.UcUserParams;
import com.ai.slp.user.api.register.param.UserParams;
import com.ai.slp.user.api.register.param.UserResponse;

/**
 * 用户注册 <br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhaogw
 */
public interface IRegisterSV {

    /**
     * 注册用户账户 </br>
     * @param request
     * @author zhaogw
     * @REG_0001
     */
    @interface InsertUcUser{}
    BaseResponse insertUcUser( UcUserParams ucUser, UcUserAgreeParams agreeInfo,UcContactInfoParams contactInfo);
    
    /**
     * 更新用户信息
     * Date: 2016年4月20日 <br>
     * Copyright (c) 2016 asiainfo.com <br>
     * 
     * @author zhaogw
     * @REG_0002
     */
    BaseResponse updateUserInfo(UserParams updateUserParams);
    
    /**
     * 查询单个用户信息</br> 
     *   
     * @param ucUser
     * @return
     * @author zhaogw
     * @REG_0003
     */
    UserResponse searchUserInfo(UcUserParams ucUser);
    
}
