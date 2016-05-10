package com.ai.slp.user.service.business.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.slp.user.api.login.param.LoginRequest;
import com.ai.slp.user.api.login.param.LoginResponse;
import com.ai.slp.user.dao.mapper.bo.UcUser;
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

        UcUserCriteria example = new UcUserCriteria();
        UcUserCriteria.Criteria criteria = example.createCriteria();
        criteria.andTenantIdEqualTo(loginRequest.getTenantId());
        criteria.andUserTypeEqualTo(loginRequest.getUserType());
        ResponseHeader responseHeader = null;
        LoginResponse response = new LoginResponse();
        List<UcUser> userList = loginAtomSV.selectByExample(example);

        if (!StringUtil.isBlank(loginRequest.getUserLoginName())) {
            criteria.andUserLoginNameEqualTo(loginRequest.getUserLoginName());
            userList = loginAtomSV.selectByExample(example);
            if (userList.isEmpty()) {
                responseHeader = new ResponseHeader(false, "fail", "用户名不存在");
            } else {
                responseHeader = new ResponseHeader(true, "success", "查询成功");
                response.setUserLoginName(loginRequest.getUserLoginName());
                response.setUserLoginPwd(userList.get(0).getUserLoginPwd());
            }
        }
        if (!StringUtil.isBlank(loginRequest.getUserEmail())) {
            criteria.andUserEmailEqualTo(loginRequest.getUserEmail());
            criteria.andEmailValidateFlagEqualTo("11");
            userList = loginAtomSV.selectByExample(example);
            if (userList.isEmpty()) {
                responseHeader = new ResponseHeader(false, "fail", "邮箱未验证");
            } else {
                responseHeader = new ResponseHeader(true, "success", "查询成功");
                response.setUserEmail(loginRequest.getUserEmail());
                response.setUserLoginPwd(loginRequest.getUserLoginPwd());
            }
        }
        if (!StringUtil.isBlank(loginRequest.getUserMp())) {
            criteria.andUserMpEqualTo(loginRequest.getUserMp());
            userList = loginAtomSV.selectByExample(example);
            if (userList.isEmpty()) {
                responseHeader = new ResponseHeader(false, "fail", "手机号未注册");
            } else {
                responseHeader = new ResponseHeader(true, "success", "查询成功");
                response.setUserMp(loginRequest.getUserMp());
                response.setUserLoginPwd(userList.get(0).getUserLoginPwd());
            }
        }
        response.setResponseHeader(responseHeader);
        return response;
    }
}
