package com.ai.yc.user.test;

import java.sql.Timestamp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.yc.user.api.userservice.interfaces.IYCUserServiceSV;
import com.ai.yc.user.api.userservice.param.InsertYCUserRequest;
import com.ai.yc.user.api.userservice.param.SearchYCUserRequest;
import com.ai.yc.user.api.userservice.param.UpdateYCUserRequest;
import com.ai.yc.user.api.userservice.param.YCInsertUserResponse;
import com.ai.yc.user.api.userservice.param.YCUserInfoResponse;

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
		
		InsertYCUserRequest insertu = new InsertYCUserRequest(null, "2", "172.205.192.168", "hb", null, "", "hbhb123", "shit", "b", "h", 0, "13088888888", "", "BJ", "CN", "BJ", "BJ", "FULLNAME");
		YCInsertUserResponse User =  usSV.insertYCUser(insertu);
		String UserID = User.getUserId();
		System.out.println("UserID : " + UserID);
		SearchYCUserRequest sr1 = new SearchYCUserRequest();
		sr1.setUserId(UserID);
		YCUserInfoResponse uir1 = usSV.searchYCUserInfo(sr1);
		System.out.println(uir1);
		UpdateYCUserRequest updateu = new UpdateYCUserRequest(UserID, "hb", "hou", "bin", 0, timestamp, "1031248990", "BJ", "BJ", "BJ", "CN","houbin","hb-X");
		usSV.updateYCUserInfo(updateu);
		SearchYCUserRequest sr2 = new SearchYCUserRequest();
		sr2.setUserId(UserID);
		YCUserInfoResponse uir2 = usSV.searchYCUserInfo(sr2);
		System.out.println(uir2);
	}

}
