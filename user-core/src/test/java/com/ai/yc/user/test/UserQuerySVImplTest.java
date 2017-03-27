package com.ai.yc.user.test;

import java.sql.Timestamp;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.opt.base.vo.PageInfo;
import com.alibaba.fastjson.JSON;
import com.ai.yc.user.api.userservice.interfaces.IYCUserServiceSV;
import com.ai.yc.user.api.userservice.param.QueryUserRequest;
import com.ai.yc.user.api.userservice.param.QueryUserResponse;
import com.ai.yc.user.api.userservice.param.YCUsrUserVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class UserQuerySVImplTest {

	@Autowired
	private IYCUserServiceSV IYCUserServiceSV;

	@Test
	public void queryUser() {
		QueryUserRequest request = new QueryUserRequest();
//		request.setNickname("%译粉%");
//		request.setMobilePhone("18900020002");
		request.setPageSize(2);
		request.setPageNo(1);
//		Timestamp ts = Timestamp.valueOf("2016-01-14 12:47:12");
//		Timestamp es = Timestamp.valueOf("2017-11-14 20:20:12");
//		request.setRegistTimeStart(ts);
//		request.setRegistTimeEnd(es);
		request.setSafetyLevel("2");
		QueryUserResponse queryUserPage = IYCUserServiceSV.queryUserPage(request);
		PageInfo<YCUsrUserVO> pageInfo = queryUserPage.getPageInfo();
		List<YCUsrUserVO> result = pageInfo.getResult();
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println(JSON.toJSONString(result));
		System.out.println(result.size());
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++");
	}
}
