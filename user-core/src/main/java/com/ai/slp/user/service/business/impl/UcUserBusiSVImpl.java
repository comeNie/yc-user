package com.ai.slp.user.service.business.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.sdk.util.StringUtil;
import com.ai.slp.user.api.login.param.LoginRequest;
import com.ai.slp.user.api.login.param.LoginResponse;
import com.ai.slp.user.api.register.param.RegisterParamsResponse;
import com.ai.slp.user.api.register.param.UcUserParams;
import com.ai.slp.user.dao.mapper.bo.UcUserCriteria;
import com.ai.slp.user.service.atom.interfaces.ILoginAtomSV;
import com.ai.slp.user.service.business.interfaces.ILoginBusiSV;
import com.ai.slp.user.service.business.interfaces.IUcUserBusiSV;

/**
 * 登录服务 Date: 2016年4月22日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
@Service
@Transactional
public class UcUserBusiSVImpl implements IUcUserBusiSV {

    static final Log LOG = LogFactory.getLog(UcUserBusiSVImpl.class);

    @Autowired
    private ILoginAtomSV loginAtomSV;

    @Override
    public RegisterParamsResponse searchUserInfo(UcUserParams ucUser) {

        UcUserCriteria ucUserCriteria = new UcUserCriteria();

        
        return null;
    }

}
