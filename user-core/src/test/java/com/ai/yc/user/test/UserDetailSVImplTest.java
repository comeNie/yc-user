package com.ai.yc.user.test;

import java.sql.Timestamp;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.yc.user.api.userservice.interfaces.IYCUserServiceSV;
import com.ai.yc.user.api.userservice.param.QueryUserDetailRequest;
import com.ai.yc.user.api.userservice.param.QueryUserDetailRespones;
import com.ai.yc.user.api.userservice.param.UsrContactMessage;
import com.ai.yc.user.api.userservice.param.UsrGriwthValueInfo;
import com.ai.yc.user.api.userservice.param.YCUsrUserVO;
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class UserDetailSVImplTest {
	@Autowired
	private IYCUserServiceSV IUserDetailSV;

	@Test
	public void queryUserDetail() {
		QueryUserDetailRequest request = new QueryUserDetailRequest();

		request.setUserId("525335");
		QueryUserDetailRespones queryUserDetail = IUserDetailSV.queryUserDetail(request);
				
		YCUsrUserVO usrUser = queryUserDetail.getUsrUser();
		List<UsrContactMessage> usrContact = queryUserDetail.getUsrContact();
		List<UsrGriwthValueInfo> usrGriwthValueList = queryUserDetail.getUsrGriwthValueList();
		
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println(JSON.toJSONString(usrUser));
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println(JSON.toJSONString(usrContact));
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println(JSON.toJSONString(usrGriwthValueList));
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++");
	}
}
