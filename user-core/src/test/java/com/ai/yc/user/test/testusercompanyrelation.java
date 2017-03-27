package com.ai.yc.user.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.yc.user.api.usercompanyrelation.interfaces.IYCUserCompanyRelationSV;
import com.ai.yc.user.api.usercompanyrelation.param.CompanyRelationResponse;
import com.ai.yc.user.api.usercompanyrelation.param.UserCompanyRelationPageInfoRequest;
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class testusercompanyrelation {
	
	@Autowired
	private IYCUserCompanyRelationSV userCompanySV;
	
	@Test
	public void getCompanyUser(){
		UserCompanyRelationPageInfoRequest relationPage = new UserCompanyRelationPageInfoRequest();
		relationPage.setCompanyId("00000025");
		relationPage.setPageNo(1);
		relationPage.setPageSize(10);
		CompanyRelationResponse relationResponse = userCompanySV.getCompanyUsers(relationPage);
		System.out.println(JSON.toJSONString(relationResponse));
	}
}
