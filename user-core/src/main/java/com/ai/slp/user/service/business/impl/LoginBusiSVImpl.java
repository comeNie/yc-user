package com.ai.slp.user.service.business.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.slp.user.api.login.param.LoginRequest;
import com.ai.slp.user.api.login.param.LoginResponse;
import com.ai.slp.user.dao.mapper.bo.UcUserCriteria;
import com.ai.slp.user.service.atom.interfaces.ILoginAtomSV;
import com.ai.slp.user.service.business.interfaces.ILoginBusiSV;

/**
 * 登录服务 Date: 2016年4月22日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangqiang7
 */
@Service
@Transactional
public class LoginBusiSVImpl implements ILoginBusiSV {

    static final Log LOG = LogFactory.getLog(LoginBusiSVImpl.class);

    @Autowired
    private ILoginAtomSV loginAtomSV;

    @Override
    public LoginResponse login(LoginRequest loginRequest) {

        UcUserCriteria ucUserCriteria = new UcUserCriteria();

        UcUserCriteria.Criteria criteria = ucUserCriteria.createCriteria();
        if (!StringUtil.isBlank(loginRequest.getUserLoginName())) {
            criteria.andUserLoginNameEqualTo(loginRequest.getUserLoginName());
        }
        if (!StringUtil.isBlank(loginRequest.getTenantId())) {
            criteria.andTenantIdEqualTo(loginRequest.getTenantId());
        }
        if (!StringUtil.isBlank(loginRequest.getUserEmail())) {
            criteria.andUserEmailEqualTo(loginRequest.getUserEmail());
        }
        if (!StringUtil.isBlank(loginRequest.getUserMp())) {
            criteria.andUserMpEqualTo(loginRequest.getUserMp());
        }
        criteria.andUserTypeEqualTo(loginRequest.getUserType());
        criteria.andUserLoginPwdEqualTo(loginRequest.getUserLoginPwd());
        int count = 0;
        ResponseHeader responseHeader;
        try {
            count = loginAtomSV.countByExample(ucUserCriteria);
            responseHeader = new ResponseHeader(true, "success", "查询成功");
        } catch (SystemException e) {
            LOG.error("查询失败", e);
            responseHeader = new ResponseHeader(false, "fail", "查询成功");
        }
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setCount(count);
        loginResponse.setResponseHeader(responseHeader);
        return loginResponse;
    }

}
