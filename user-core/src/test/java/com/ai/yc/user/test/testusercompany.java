package com.ai.yc.user.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.yc.user.api.userCompany.interfaces.IYCUserCompanySV;
import com.ai.yc.user.api.userCompany.param.UserCompanyInfoRequest;
import com.ai.yc.user.api.userCompany.param.UserCompanyInfoResponse;
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class testusercompany {
	
	@Autowired
	private IYCUserCompanySV userCompanySV;
	
	@Test
	public void insertCompanyInfo(){
		UserCompanyInfoRequest request = new UserCompanyInfoRequest();
		request.setCompanyName("test2");
		request.setLicenseAttacid("3");
		request.setTelephone("13718");
		request.setLinkman("zyh");
		request.setAddress("4444");
		request.setMobilephone("44544");
		request.setAdminUserId("2323");
		userCompanySV.insertCompanyInfo(request);
	}
	
	@Test
	public void updateCompanyInfo(){
		UserCompanyInfoRequest request = new UserCompanyInfoRequest();
		request.setCompanyId("00000000");
		request.setCompanyName("11111");
		request.setLicenseAttacid("232");
		request.setTelephone("1371");
		request.setLinkman("zyh");
		request.setAddress("4444");
		request.setMobilephone("44544");
		request.setAdminUserId("2323");
		userCompanySV.updateCompanyInfo(request);
	}
	
	@Test
	public void queryCompanyInfo(){
		UserCompanyInfoRequest userInfoRequest = new UserCompanyInfoRequest();
		userInfoRequest.setAdminUserId("2323");
		UserCompanyInfoResponse response = userCompanySV.queryCompanyInfo(userInfoRequest);
		System.out.println(JSON.toJSONString(response));
	}
}
