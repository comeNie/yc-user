package com.ai.yc.user.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.opt.sdk.dubbo.util.DubboConsumerFactory;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.UUIDUtil;
import com.ai.slp.balance.api.accountmaintain.interfaces.IAccountMaintainSV;
import com.ai.slp.balance.api.accountmaintain.param.RegAccReq;
import com.ai.yc.user.api.userservice.interfaces.IYCUserServiceSV;
import com.ai.yc.user.api.userservice.param.UpdateYCUserRequest;
import com.ai.yc.user.api.userservice.param.YCUserInfoResponse;
import com.alibaba.dubbo.registry.dubbo.DubboRegistryFactory;
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class TestMigrationData {
	@Autowired
	private IYCUserServiceSV usSV;
	@Test
	public void testsearchuser(){
		
		List<YCUserInfoResponse> list = usSV.getAllUserInfo();
		for(int i=0;i<list.size();i++){
			YCUserInfoResponse response = list.get(i);
			response.setIsChange("1");
			IAccountMaintainSV iAccountMaintainSV = DubboConsumerFactory.getService(IAccountMaintainSV.class);
			RegAccReq vo = new RegAccReq();
			vo.setExternalId(UUIDUtil.genId32());// 外部流水号ID
			vo.setSystemId("Cloud-UAC_WEB");// 系统ID
			vo.setTenantId("yeecloud");// 租户ID
			vo.setRegCustomerId(response.getUserId());
			vo.setAcctName("迁移数据");
			vo.setAcctType("1");//1预付费
	        try {
	        	UpdateYCUserRequest request = new UpdateYCUserRequest();
	        	System.out.println("================"+JSON.toJSONString(request));
	        	long accountId = iAccountMaintainSV.createAccount(vo);
	            response.setAccountId(accountId);
	            BeanUtils.copyProperties(request,response);
	            usSV.updateYCUserInfo(request);
	            System.out.println("param:"+JSON.toJSONString(vo));
	            System.out.println("账户ID:"+accountId);
	        } catch (Exception e) {
	            e.printStackTrace();
	            System.out.println("出错：" + e.getMessage());
	        }
			System.out.println(JSON.toJSONString(response));
		}
	}
}
