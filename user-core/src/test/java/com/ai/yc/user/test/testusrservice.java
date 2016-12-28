package com.ai.yc.user.test;

import java.sql.Timestamp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.opt.sdk.dubbo.util.DubboConsumerFactory;
import com.ai.yc.ucenter.api.members.interfaces.IUcMembersOperationSV;
import com.ai.yc.ucenter.api.members.param.opera.UcMembersGetOperationcodeRequest;
import com.ai.yc.ucenter.api.members.param.opera.UcMembersGetOperationcodeResponse;
import com.ai.yc.user.api.userservice.interfaces.IYCUserServiceSV;
import com.ai.yc.user.api.userservice.param.CompleteUserInfoRequest;
import com.ai.yc.user.api.userservice.param.InsertYCContactRequest;
import com.ai.yc.user.api.userservice.param.InsertYCUserRequest;
import com.ai.yc.user.api.userservice.param.SearchYCContactRequest;
import com.ai.yc.user.api.userservice.param.SearchYCUserRequest;
import com.ai.yc.user.api.userservice.param.UpdateYCUserRequest;
import com.ai.yc.user.api.userservice.param.YCContactInfoResponse;
import com.ai.yc.user.api.userservice.param.YCInsertContactResponse;
import com.ai.yc.user.api.userservice.param.YCInsertUserResponse;
import com.ai.yc.user.api.userservice.param.YCUserInfoResponse;
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
	public void testRegister() {
		String PhoneNum = "13512926354";
		String Email = "yhniausv4@qq.com";
		String Password = "hbhb123";
		
		IUcMembersOperationSV iUcMembersOperationSV = DubboConsumerFactory.getService(IUcMembersOperationSV.class);
		UcMembersGetOperationcodeRequest ucMembersGetOperationcodeRequest = new UcMembersGetOperationcodeRequest();
		ucMembersGetOperationcodeRequest.setUserinfo(PhoneNum);
		ucMembersGetOperationcodeRequest.setOperationtype("1");
		UcMembersGetOperationcodeResponse umgor = iUcMembersOperationSV.ucGetOperationcode(ucMembersGetOperationcodeRequest);
		
		InsertYCUserRequest insertu = new InsertYCUserRequest(umgor.getDate().get("uid").toString(),umgor.getDate().get("operationcode").toString().substring(1) + "1", "2", "172.245.32.172", "hbhb123", null, Email, Password, null, null, null, 0, PhoneNum, null, null, null, null, null, null,null);
		YCInsertUserResponse User =  usSV.insertYCUser(insertu);
		String UserID = User.getUserId();
		System.out.println("UserID : " + UserID);
		System.out.println("ResultMessage : "+User.getResponseHeader().getResultMessage()+" ; IsSuccess : " + User.getResponseHeader().getIsSuccess());
		
		SearchYCUserRequest sr1 = new SearchYCUserRequest();
		sr1.setUserId(UserID);
		YCUserInfoResponse uir1 = usSV.searchYCUserInfo(sr1);
		System.out.println(JSON.toJSONString(uir1));
		
		
		InsertYCUserRequest insertu1 = new InsertYCUserRequest(umgor.getDate().get("uid").toString(),umgor.getDate().get("operationcode").toString(), "2", "172.245.32.172", "hbhb123", null, Email, Password, null, null, null, 0, PhoneNum, null, null, null, null, null, null,null);
		YCInsertUserResponse User1 =  usSV.insertYCUser(insertu1);
		UserID = User1.getUserId();
		
		SearchYCUserRequest sr2 = new SearchYCUserRequest();
		sr1.setUserId(UserID);
		YCUserInfoResponse uir2 = usSV.searchYCUserInfo(sr2);
		System.out.println(JSON.toJSONString(uir2));
	}
	
	@Test
	public void testupdateusruser(){
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		String UserID = "4444314";
		UpdateYCUserRequest updateu = new UpdateYCUserRequest(UserID, "hb", "hhhhhh", "bbbbbb", 0, timestamp, "1031248990", "BJ", "BJ", "BJ", "CN","houbin","fff");
		usSV.updateYCUserInfo(updateu);
		SearchYCUserRequest sr2 = new SearchYCUserRequest();
		sr2.setUserId(UserID);
		YCUserInfoResponse uir2 = usSV.searchYCUserInfo(sr2);
		System.out.println(JSON.toJSONString(uir2));
	}
	
	@Test
	public void testsearchuser(){
		
		SearchYCUserRequest sr1 = new SearchYCUserRequest();
		sr1.setUserId("4444608");
		YCUserInfoResponse uir1 = usSV.searchYCUserInfo(sr1);
		System.out.println(JSON.toJSONString(uir1));
	}

	@Test
	public void testSearchNickName() {
		String nickName = "hb";
		YCUserInfoResponse response = usSV.searchUserInfoByNickName(nickName);
		System.out.println(JSON.toJSONString(response));
		
	}
	
	
//	@Test
//	public void testTranslator() {
//		SearchYCTranslatorRequest s = new SearchYCTranslatorRequest();
////		s.setUserId("4444314");
//		s.setTranslatorId("1");
//		YCTranslatorInfoResponse r = usSV.searchYCTranslatorInfo(s);
//		System.out.println(JSON.toJSONString(r));
//	}
//	
//	@Test
//	public void testSearchSkill() {
//		SearchYCTranslatorSkillListRequest a = new SearchYCTranslatorSkillListRequest();
//		a.setUserId("4444314");
//		YCTranslatorSkillListResponse response = usSV.getTranslatorSkillList(a);
//		System.out.println(JSON.toJSONString(response));
//	}
//	@Test
//	public void testSearchLsp() {
//		searchYCLSPInfoRequest a = new searchYCLSPInfoRequest();
//		a.setLspId("1");
//		YCLSPInfoReponse response = usSV.searchLSPInfo(a);
//		System.out.println(JSON.toJSONString(response));
//	}
	
	@Test
	public void testSearchContact() {
		SearchYCContactRequest a = new SearchYCContactRequest();
		a.setUserId("4444314");
		YCContactInfoResponse response = usSV.searchYCContactInfo(a);
		System.out.println(JSON.toJSONString(response));
	}
	
	@Test
	public void testInsertContact() {
		String email = "111@qq.com";
		String newEmail = email.substring(0,1)+"*****"+email.substring(email.indexOf("@")-1,email.length());
		System.out.println(newEmail);
		/*InsertYCContactRequest a = new InsertYCContactRequest();
		a.setUserId("4444314");
		a.setEmail("106542@qq.com");
		a.setMobilePhone("13007426666");
		a.setGnCountryId(1);
//		a.setContactId("2");
		YCInsertContactResponse response = usSV.insertYCContact(a);
		System.out.println(JSON.toJSONString(response));*/
	}
	
	@Test
	public void testInsertCompleteUserInfo(){
		CompleteUserInfoRequest request = new CompleteUserInfoRequest();
		request.setUserId("1234567");
		request.setLoginName("test");
		request.setMobilePhone("16799999999");
		usSV.completeUserInfo(request);
	}
}
