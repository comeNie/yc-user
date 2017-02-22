package com.ai.yc.user.test;

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
import com.alibaba.fastjson.JSON;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月4日 上午10:17:52 
 * @version 
 * @since  
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class testusrcollection {

	@Autowired
	private IYCUserCollectionSV usSV;
	
	@Test
	public void testInsertContactInfo() {
		UserCollectionInfoRequest userInfoRequest = new UserCollectionInfoRequest();
		userInfoRequest.setOriginal("我爱w");
		userInfoRequest.setTranslation("I love you");
		userInfoRequest.setUserId("2");
		UserCollectionInfoResponse response = usSV.insertCollectionInfo(userInfoRequest);
		System.out.println(response.getCollectionId());
	}
	
	@Test
	public void testUpdateContactInfo() {
		UserCollectionInfoRequest contactInfo = new UserCollectionInfoRequest();
		contactInfo.setCollectionId("00000002");
		contactInfo.setOriginal("我你他");
		contactInfo.setTranslation("meyouit");
		usSV.updateCollectionInfo(contactInfo);
	}
	
	@Test
	public void testQueryContactInfo() {
		UserCollectionPageInfoRequest contactInfo = new UserCollectionPageInfoRequest();
		contactInfo.setUserId("2");
		contactInfo.setPageNo(1);
		contactInfo.setPageSize(2);
		UserCollectionInfoListResponse response = usSV.queryCollectionInfo(contactInfo);
		System.out.println(JSON.toJSONString(response));
	}
	
}
