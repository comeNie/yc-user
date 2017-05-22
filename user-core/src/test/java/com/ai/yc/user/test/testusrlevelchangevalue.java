package com.ai.yc.user.test;

import com.ai.opt.sdk.util.DateUtil;
import com.ai.yc.user.api.usergriwthvalue.interfaces.IYCUserGriwthValueSV;
import com.ai.yc.user.api.usergriwthvalue.param.UsrGriwthValuePageInfoRequest;
import com.ai.yc.user.api.usergriwthvalue.param.UsrGriwthValueRequest;
import com.ai.yc.user.api.userlevelchange.interfaces.IYCUserLevelChangeSV;
import com.ai.yc.user.api.userlevelchange.param.LevelInfoResponse;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月4日 上午10:17:52 
 * @version 
 * @since  
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class testusrlevelchangevalue {

	@Autowired
	private IYCUserLevelChangeSV levelChangeSV;
	
	@Test
	public void testQueryGriwthValueInfo() {

		LevelInfoResponse levelInfoResponse = levelChangeSV.queryLevelInfo("1234");
		System.err.print(levelInfoResponse);
	}
}
