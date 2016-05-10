package com.ai.slp.user.api.login.test;

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

    @Autowired
    private ILoginSV loginSV;
    
    @Test
    public void loginTest(){
        LoginRequest loginRequest=new LoginRequest();
        loginRequest.setTenantId("test111");
        // loginRequest.setUserLoginName("test");
        loginRequest.setUserEmail("123@123.com");
        loginRequest.setUserType("01");
        loginRequest.setUserLoginPwd("123456");
        LoginResponse loginResponse = loginSV.login(loginRequest);
        System.out.println(loginResponse.getResponseHeader().getResultMessage());
        System.out.println(loginResponse.getUserLoginPwd());
    }
}
