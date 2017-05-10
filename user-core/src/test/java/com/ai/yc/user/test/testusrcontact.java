package com.ai.yc.user.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.opt.sdk.util.DateUtil;
import com.ai.yc.user.api.usercontact.interfaces.IYCUserContactSV;
import com.ai.yc.user.api.usercontact.param.UserContactInfo;
import com.ai.yc.user.api.usercontact.param.UserContactInfoRequest;
import com.ai.yc.user.api.usercontact.param.UserContactInfoRespose;
import com.alibaba.fastjson.JSON;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月4日 上午10:17:52 
 * @version 
 * @since  
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class testusrcontact {

	@Autowired
	private IYCUserContactSV usSV;
	
	@Test
	public void testInsertContactInfo() {
		UserContactInfoRequest contactInfo = new UserContactInfoRequest();
		contactInfo.setEmail("178070754aaa@qq.com");
		contactInfo.setGnCountryId(2);
		contactInfo.setMobilePhone("13718206604");
		contactInfo.setUserName("张三111111111");
		contactInfo.setIsDefault(1);
		contactInfo.setUserId("444");
		contactInfo.setCreateTime(DateUtil.getTimestamp("2017-09-08 16:00:00"));
		usSV.insertContactInfo(contactInfo);
	}
	
	@Test
	public void testUpdateContactInfo() {
		UserContactInfoRequest contactInfo = new UserContactInfoRequest();
		contactInfo.setContactId("00000029");
		contactInfo.setEmail("123232");
		usSV.updateContactInfo(contactInfo);
	}
	
	
	@Test
	public void testQueryContactInfo() {
		
		UserContactInfoRespose response1 = new UserContactInfoRespose();
		response1.setUserId("525335");
		UserContactInfoRespose response = usSV.queryContactInfo("525335");
		System.out.println("========"+JSON.toJSONString(response.getUsrContactList()));
		/*UserContactInfoRespose response = usSV.queryContactInfo("4444314");
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		response.setList(list);
		System.out.println(JSON.toJSONString(response));*/
		/*List<UserContactInfo> list = response.getUsrContactList();
		for(int i=0;i<list.size();i++){
			UserContactInfo info = list.get(i);
			System.out.println(info.getIsDefault());
		}*/
	}
}
