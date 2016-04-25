package com.ai.slp.user.api.login.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.slp.user.api.login.interfaces.ILoginSV;
import com.ai.slp.user.api.login.param.LoginRequest;
import com.ai.slp.user.api.login.param.LoginResponse;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class LoginSVImplTest {

    private static final Log LOG = LogFactory.getLog(LoginSVImplTest.class);

    @Autowired
    private ILoginSV iLoginSV;
    
    @Test
    public void loginTest(){
        LoginRequest loginRequest=new LoginRequest();
        loginRequest.setTenantId("test111");
        // loginRequest.setUserLoginName("test");
        loginRequest.setUserEmail("11@11.com");
        loginRequest.setUserLoginPwd("123456");
        loginRequest.setUserType("11");
        LoginResponse loginResponse = iLoginSV.login(loginRequest);
        System.out.println(loginResponse.getCount());
    }
}
