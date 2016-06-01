package com.ai.slp.user.api.ucuser.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.slp.user.api.ucUserSecurity.interfaces.IUcUserSecurityManageSV;
import com.ai.slp.user.api.ucUserSecurity.param.UcUserPasswordRequest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class UcSecurityTest {

    @Autowired
    IUcUserSecurityManageSV ic;
    @Test
    public void test(){
        
        UcUserPasswordRequest re = new UcUserPasswordRequest();
        re.setTenantId("0");
        re.setAccountId("000000000000000157");
        re.setAccountPassword("111111");
        ic.setPasswordData(re);
    }
}
