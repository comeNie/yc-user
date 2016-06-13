package com.ai.slp.user.api.keyinfo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.slp.user.api.keyinfo.interfaces.IUcKeyInfoSV;
import com.ai.slp.user.api.keyinfo.param.InsertGroupKeyInfoRequest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class GroupKeyInfoSVImpl  {

    @Autowired
    private IUcKeyInfoSV sv;
    
    @Test
    public void insert(){
        InsertGroupKeyInfoRequest req = new InsertGroupKeyInfoRequest();
        req.setTenantId("SLP");
        req.setUserId("000000000000000167");
        req.setCertAddr("111");
        req.setCertNum("111");
        sv.insertGroupKeyInfo(req);
    }

}
