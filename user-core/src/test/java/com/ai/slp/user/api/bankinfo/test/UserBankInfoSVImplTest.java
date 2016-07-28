package com.ai.slp.user.api.bankinfo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.slp.user.api.bankinfo.interfaces.IUcBankInfoSV;
import com.ai.slp.user.api.bankinfo.param.InsertBankInfoRequest;
import com.ai.slp.user.api.bankinfo.param.QueryBankInfoSingleRequest;
import com.ai.slp.user.api.keyinfo.interfaces.IUcKeyInfoSV;
import com.ai.slp.user.api.keyinfo.param.SearchGroupKeyInfoRequest;
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class UserBankInfoSVImplTest {

    @Autowired
    private IUcBankInfoSV userBankInfoBusiSV;
    @Autowired
    private IUcKeyInfoSV u;
    
    @Test
    public void insertBankInfoTest(){
        InsertBankInfoRequest request = new InsertBankInfoRequest();
        request.setUserId("");
        request.setTenantId("");
        request.setAcctName("");
        request.setBankName("");
        request.setBankNo("");
        request.setAcctNo("");
        userBankInfoBusiSV.insertBankInfo(request);
    }
    

    @Test
    public void queryBankInfoTest(){
        QueryBankInfoSingleRequest request = new QueryBankInfoSingleRequest();
        request.setTenantId("SLP");
        request.setUserId("000000000000000202");
        System.out.println(JSON.toJSONString(userBankInfoBusiSV.queryBankInfoSingle(request)));
    }
    
    @Test
    public  void insertTest(){
        InsertBankInfoRequest re = new InsertBankInfoRequest();
        re.setTenantId("SLP");
        re.setAcctNo("234325345");
        re.setBankName("vfxvgx");
        re.setSubBranchName("dfhgfdfsd");;
        re.setUserId("000000000000000202");
        System.out.println(userBankInfoBusiSV.insertBankInfo(re));
    }
    
    
    @Test
    public void searchGroup(){
    	SearchGroupKeyInfoRequest re = new SearchGroupKeyInfoRequest();
    	re.setTenantId("SLP");
    	re.setAuditState("11");
    	re.setCustName("wwwq11");
    	re.setUserType("11");
    	System.out.println(JSON.toJSONString(u.searchGroupKeyInfo(re)));
    }
}
