package com.ai.yc.user.test;

import java.sql.Timestamp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.yc.user.api.userservice.interfaces.IYCUserServiceSV;
import com.ai.yc.user.api.userservice.param.InsertYCUserRequest;
import com.ai.yc.user.api.userservice.param.SearchYCTranslatorSkillListRequest;
import com.ai.yc.user.api.userservice.param.SearchYCUserRequest;
import com.ai.yc.user.api.userservice.param.UpdateYCUserRequest;
import com.ai.yc.user.api.userservice.param.YCInsertUserResponse;
import com.ai.yc.user.api.userservice.param.YCLSPInfoReponse;
import com.ai.yc.user.api.userservice.param.YCTranslatorSkillListResponse;
import com.ai.yc.user.api.userservice.param.YCUserInfoResponse;
import com.ai.yc.user.api.userservice.param.searchYCLSPInfoRequest;
import com.alibaba.fastjson.JSON;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月4日 上午10:17:52 
 * @version 
 * @since  
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class testusrservice {

	@Autowired
	private IYCUserServiceSV usSV;
	
	@Test
	public void test() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis()); 
//		String UserID = "000000000000003121";
//		
		InsertYCUserRequest insertu = new InsertYCUserRequest(null, "1", "172.245.12.168", "ee77711312", null, "234322489093@qq.com", "h83233", "sh33", "b", "h", 0, "13622223883", "1031329334", "BJ", "CN", "BJ", "BJ", "FULLNAME");
		YCInsertUserResponse User =  usSV.insertYCUser(insertu);
		String UserID = User.getUserId();
		System.out.println("UserID : " + UserID);
		System.out.println("ResultMessage : "+User.getResponseHeader().getResultMessage()+" ; IsSuccess : " + User.getResponseHeader().getIsSuccess());
		SearchYCUserRequest sr1 = new SearchYCUserRequest();
		sr1.setUserId(UserID);
		YCUserInfoResponse uir1 = usSV.searchYCUserInfo(sr1);
		System.out.println(uir1);
		UpdateYCUserRequest updateu = new UpdateYCUserRequest(UserID, "hb", "hhhhhh", "bbbbbb", 0, timestamp, "1031248990", "BJ", "BJ", "BJ", "CN","houbin","fff");
		usSV.updateYCUserInfo(updateu);
		SearchYCUserRequest sr2 = new SearchYCUserRequest();
		sr2.setUserId(UserID);
		YCUserInfoResponse uir2 = usSV.searchYCUserInfo(sr2);
		System.out.println(uir2);
	}

	@Test
	public void testSearchNickName() {
		String nickName = "tom";
		YCUserInfoResponse response = usSV.searchUserInfoByNickName(nickName);
		System.out.println(JSON.toJSONString(response));
	}
	@Test
	public void testSearchSkill() {
		SearchYCTranslatorSkillListRequest a = new SearchYCTranslatorSkillListRequest();
		a.setUserId("000000000000003161");
		YCTranslatorSkillListResponse response = usSV.getTranslatorSkillList(a);
		System.out.println(JSON.toJSONString(response));
	}
	@Test
	public void testSearchLsp() {
		searchYCLSPInfoRequest a = new searchYCLSPInfoRequest();
//		a.setUserId("000000000000003161");
//		a.setLspId("2");
		a.setLspName("am"); 
		YCLSPInfoReponse response = usSV.searchLSPInfo(a);
		System.out.println(JSON.toJSONString(response));
	}
}
