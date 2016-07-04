package com.ai.slp.user.api.keyinfo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.slp.user.api.keyinfo.interfaces.IUcKeyInfoSV;
import com.ai.slp.user.api.keyinfo.param.CmCustFileExtVo;
import com.ai.slp.user.api.keyinfo.param.InsertCustFileExtRequest;
import com.ai.slp.user.api.keyinfo.param.InsertCustKeyInfoRequest;
import com.ai.slp.user.api.keyinfo.param.InsertGroupKeyInfoRequest;
import com.ai.slp.user.api.keyinfo.param.QueryCustFileExtRequest;
import com.ai.slp.user.api.keyinfo.param.QueryGroupInfoRequest;
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
        CmCustFileExtVo cmCustFileExtVo = new CmCustFileExtVo();
        //re.setTenantId("SLP");
        List<CmCustFileExtVo> list = new ArrayList<CmCustFileExtVo>();
        cmCustFileExtVo.setTenantId("SLP");
        cmCustFileExtVo.setInfoName("123");
        cmCustFileExtVo.setUserId("1234");
        cmCustFileExtVo.setAttrId("1234");
        
        list.add(cmCustFileExtVo);
        re.setList(list);
        sv.insertCustFileExt(re);
    }

    //@Test
    public void query(){
        SearchGroupKeyInfoRequest re = new SearchGroupKeyInfoRequest();
        re.setTenantId("SLP");
        re.setCustName("121212121212");
        System.out.println(JSON.toJSONString(sv.searchGroupKeyInfo(re)));
    }
    
    //@Test
    public void queryCustFile(){
        QueryCustFileExtRequest re = new QueryCustFileExtRequest();
        re.setTenantId("SLP");
        re.setUserId("000000000000000202");
        System.out.println(JSON.toJSONString(sv.queryCustFileExt(re)));
    }
    
  //@Test
    public void queryGroup(){
        QueryGroupInfoRequest re = new QueryGroupInfoRequest();
        re.setTenantId("SLP");
        re.setCustName("国际");
        re.setPageNo(1);
        re.setPageSize(1);
        System.out.println(JSON.toJSONString(sv.queryGroupInfo(re).getPageInfo().getResult()));
    }
    
    
    @Test
    public void testCust(){
        InsertCustKeyInfoRequest re = new InsertCustKeyInfoRequest();
        re.setTenantId("SLP");
        re.setCustName("fsdfgdgdfg");
        re.setUserId("000000000000000842");
        re.setCustProvinceCode("10");
        re.setCustCityCode("102");
        re.setCustCountyCode("102");
        re.setCustSex("0");
        re.setUserType("10");
        re.setIncomeLevel("8000");
        sv.insertCustKeyInfo(re);
    }
    
    @Test
    public void testGroupKeyInfo(){
        SearchGroupKeyInfoRequest re = new SearchGroupKeyInfoRequest();
        re.setCustName("123");
        sv.searchGroupKeyInfo(re);
}
}
