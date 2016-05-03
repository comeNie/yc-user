package com.ai.slp.user.service.business.interfaces;

import com.ai.slp.user.api.ucuser.param.SearchUserInfoRequest;
import com.ai.slp.user.api.ucuser.param.SearchUserInfoResponse;

/**
 * 用户信息 Date: 2016年4月29日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhaogw
 */
public interface IUcUserBusiSV {
    SearchUserInfoResponse searchUserInfo(SearchUserInfoRequest userInfoRequest);
}
