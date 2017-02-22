package com.ai.yc.user.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.opt.sdk.util.DateUtil;
import com.ai.yc.user.api.usercollectiontranslation.interfaces.IYCUserCollectionSV;
import com.ai.yc.user.api.usercollectiontranslation.param.UserCollectionInfoRequest;
import com.ai.yc.user.api.usercontact.interfaces.IYCUserContactSV;
import com.ai.yc.user.api.usercontact.param.UserContactInfoRequest;

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
		userInfoRequest.setOriginal("我爱你");
		userInfoRequest.setTranslation("I love you");
		usSV.insertCollectionInfo(userInfoRequest);
	}
	
	@Test
	public void testUpdateContactInfo() {
		UserCollectionInfoRequest contactInfo = new UserCollectionInfoRequest();
		contactInfo.setCollectionId("00000002");
		contactInfo.setOriginal("我你他");
		contactInfo.setTranslation("meyouit");
		usSV.updateCollectionInfo(contactInfo);
	}
}
