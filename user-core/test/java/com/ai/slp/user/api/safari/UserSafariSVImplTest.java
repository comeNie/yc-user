package com.ai.slp.user.api.safari;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.user.api.safari.param.CreateUserSafariRequest;
import com.ai.slp.user.api.safari.param.CreateUserSafariResponse;
import com.ai.slp.user.api.safari.param.DeleteSafariRequest;
import com.ai.slp.user.api.safari.param.UserSafariInfoRequest;
import com.ai.slp.user.api.safari.param.UserSafariInfoResponse;
import com.ai.slp.user.service.business.interfaces.IUserSafariBusiSV;
import com.ai.slp.user.util.DateUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class UserSafariSVImplTest {

    @Autowired
    private IUserSafariBusiSV iUserSafariBusiSV;
    
    //@Test
    public void insertSafariTest(){
        CreateUserSafariRequest request = new CreateUserSafariRequest();
        request.setUserId(111);
        request.setTenantId("test111");
        request.setTenantPwd("123456");
        request.setProdId("111");
       CreateUserSafariResponse response = iUserSafariBusiSV.insertUserSafari(request);
       System.out.println(response.getResponseId());
    }
    
    //@Test
    public void querySafariTest(){
       UserSafariInfoRequest request = new UserSafariInfoRequest();
       request.setPageNo(11);
       request.setPageSize(11);
       //request.setSafariTime(DateUtils.currTimeStamp());
       request.setTenantId("test111");
       request.setTenantPwd("123456");
       request.setUserId(111);
       PageInfo<UserSafariInfoResponse> response = iUserSafariBusiSV.queryUserSafari(request);
       System.out.println(response.getCount());
       System.out.println(response.getResult().size());
    }
    
    @Test
    public void deleteSafariTest(){
        DeleteSafariRequest request = new DeleteSafariRequest();
        request.setUserId(111);
        request.setTenantId("test111");
        request.setTenantPwd("123456");
        request.setProdId("111");
        iUserSafariBusiSV.deleteUserSafari(request);
    }
}
