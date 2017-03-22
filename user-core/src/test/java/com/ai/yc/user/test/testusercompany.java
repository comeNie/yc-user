package com.ai.yc.user.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.yc.user.api.usercompany.interfaces.IYCUserCompanySV;
import com.ai.yc.user.api.usercompany.param.UserCompanyInfoListResponse;
import com.ai.yc.user.api.usercompany.param.UserCompanyInfoRequest;
import com.ai.yc.user.api.usercompany.param.UserCompanyInfoResponse;
import com.ai.yc.user.api.usercompany.param.UserCompanyPageInfoRequest;
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
		request.setUserId("2323");
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
		request.setUserId("2323");
		userCompanySV.updateCompanyInfo(request);
	}
	
	@Test
	public void queryCompanyInfo(){
		UserCompanyInfoRequest userInfoRequest = new UserCompanyInfoRequest();
		userInfoRequest.setUserId("2323");
		UserCompanyInfoResponse response = userCompanySV.queryCompanyInfo(userInfoRequest);
		System.out.println(JSON.toJSONString(response));
	}
	
	@Test
	public void checkCompanyInfo(){
		UserCompanyInfoRequest request = new UserCompanyInfoRequest();
		request.setCompanyName("1212121");
		BaseResponse response = userCompanySV.checkCompanyName(request);
		System.out.println("============="+JSON.toJSONString(response));
	}
	
	@Test
	public void queryCompanyInfoList(){
		UserCompanyPageInfoRequest userInfoRequest = new UserCompanyPageInfoRequest();
		userInfoRequest.setState(0);
		userInfoRequest.setCompanyName("1212");
		userInfoRequest.setPageNo(1);
		userInfoRequest.setPageSize(10);
		UserCompanyInfoListResponse response = userCompanySV.queryPageInfoCompanyInfo(userInfoRequest);
		System.out.println(JSON.toJSONString(response));
	}
}
