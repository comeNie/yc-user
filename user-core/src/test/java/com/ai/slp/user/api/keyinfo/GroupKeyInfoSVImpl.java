package com.ai.slp.user.api.keyinfo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.slp.user.api.keyinfo.interfaces.IUcKeyInfoSV;
import com.ai.slp.user.api.keyinfo.param.InsertCustFileExtRequest;
import com.ai.slp.user.api.keyinfo.param.InsertGroupKeyInfoRequest;
import com.ai.slp.user.api.keyinfo.param.SearchGroupKeyInfoRequest;
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class GroupKeyInfoSVImpl  {

    @Autowired
    private IUcKeyInfoSV sv;
    
    //@Test
    public void insert(){
        InsertGroupKeyInfoRequest req = new InsertGroupKeyInfoRequest();
        req.setTenantId("SLP");
        req.setUserId("000000000000000167");
        req.setCertAddr("111");
        req.setCertNum("111");
        sv.insertGroupKeyInfo(req);
    }
    //@Test
    public void insertFileExt(){
        InsertCustFileExtRequest re = new InsertCustFileExtRequest();
        re.setTenantId("SLP");
        re.setInfoName("123");
        re.setUserId("1234");
        re.setAttrId("1234");
        sv.insertCustFileExt(re);
    }

    @Test
    public void query(){
        SearchGroupKeyInfoRequest re = new SearchGroupKeyInfoRequest();
        re.setTenantId("SLP");
        re.setUserId("000000000000000202");
        System.out.println(JSON.toJSONString(sv.searchGroupKeyInfo(re)));
    }
}
