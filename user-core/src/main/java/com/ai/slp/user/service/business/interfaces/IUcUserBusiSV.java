package com.ai.slp.user.service.business.interfaces;

import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.user.api.register.param.SearchUcUserParams;
import com.ai.slp.user.api.register.param.UcUserParams;

/**
 * 用户信息 Date: 2016年4月29日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhaogw
 */
public interface IUcUserBusiSV {
    PageInfo<SearchUcUserParams> searchUserInfo(UcUserParams ucUser);
}
