package com.ai.yc.user.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.opt.sdk.util.DateUtil;
import com.ai.yc.user.api.usercollectiontranslation.interfaces.IYCUserCollectionSV;
import com.ai.yc.user.api.usercollectiontranslation.param.UserCollectionInfoListResponse;
import com.ai.yc.user.api.usercollectiontranslation.param.UserCollectionInfoRequest;
import com.ai.yc.user.api.usercollectiontranslation.param.UserCollectionInfoResponse;
import com.ai.yc.user.api.usercollectiontranslation.param.UserCollectionPageInfoRequest;
import com.ai.yc.user.api.usercontact.interfaces.IYCUserContactSV;
import com.ai.yc.user.api.usercontact.param.UserContactInfoRequest;
import com.ai.yc.user.api.usergriwthvalue.interfaces.IYCUserGriwthValueSV;
import com.ai.yc.user.api.usergriwthvalue.param.UsrGriwthValuePageInfoRequest;
import com.ai.yc.user.api.usergriwthvalue.param.UsrGriwthValueRequest;
import com.alibaba.fastjson.JSON;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月4日 上午10:17:52 
 * @version 
 * @since  
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class testusrgriwthvalue {

	@Autowired
	private IYCUserGriwthValueSV griwthValueSV;
	
	@Test
	public void testInsertGriwthValueInfo() {
		UsrGriwthValueRequest request = new UsrGriwthValueRequest();
		request.setUserId("2323");
		request.setGriwthResource("登录详情121");
		request.setGriwthValue(50);
		request.setResourceDetail("2015-06-09 登录");
		request.setResourceTime(DateUtil.getTimestamp(new Date().getTime()));
		griwthValueSV.insertGriwthValueInfo(request);
	}
	
	@Test
	public void testUpdateGriwthValueInfo() {
		UsrGriwthValueRequest request = new UsrGriwthValueRequest();
		request.setUserId("2323");
		request.setGriwthResource("登录详情121");
		request.setGriwthValue(50);
		request.setResourceDetail("2015-06-09 登录");
		request.setResourceTime(DateUtil.getTimestamp(new Date().getTime()));
		griwthValueSV.updateGriwthValueInfo(request);
	}
	
	@Test
	public void testQueryGriwthValueInfo() {
		UsrGriwthValuePageInfoRequest request = new UsrGriwthValuePageInfoRequest();
		request.setUserId("2323");
		request.setPageNo(1);
		request.setPageSize(2);
		System.out.println(JSON.toJSONString(griwthValueSV.queryGriwthValueInfo(request)));
	}
}
