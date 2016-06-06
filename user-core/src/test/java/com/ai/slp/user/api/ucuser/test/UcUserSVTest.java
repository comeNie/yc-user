package com.ai.slp.user.api.ucuser.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.slp.user.api.ucuser.intefaces.IUcUserSV;
import com.ai.slp.user.api.ucuser.param.SearchUserRequest;
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class UcUserSVTest {

    @Autowired
    private IUcUserSV ucUserListSV;

    @Test
    public void searchUserTest() {
        SearchUserRequest request = new SearchUserRequest();
        //request.setTenantId("test111");
        request.setUserId("000000000000000202");
        //request.setBeginTime("2016-4-27 00:00:00");
       //request.setEndTime("2016-4-30 00:00:00");
        
        System.out.println(ucUserListSV.queryBaseInfo(request).getUserId());
    }
}
