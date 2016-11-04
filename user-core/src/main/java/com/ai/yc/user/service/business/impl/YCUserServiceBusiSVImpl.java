package com.ai.yc.user.service.business.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.components.sequence.util.SeqUtil;
import com.ai.opt.sdk.dubbo.util.DubboConsumerFactory;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.opt.sdk.util.UUIDUtil;
import com.ai.slp.balance.api.accountmaintain.interfaces.IAccountMaintainSV;
import com.ai.slp.balance.api.accountmaintain.param.RegAccReq;
import com.ai.yc.user.api.register.param.InsertYCUserRequest;
import com.ai.yc.user.api.register.param.RegisterParamsRequest;
import com.ai.yc.user.api.register.param.UcContactInfoParams;
import com.ai.yc.user.api.register.param.UcGroupKeyInfoParams;
import com.ai.yc.user.api.register.param.UcUserParams;
import com.ai.yc.user.api.register.param.UpdateYCUserParams;
import com.ai.yc.user.constants.ExceptCodeConstants;
import com.ai.yc.user.constants.SequenceCodeConstants.UserSequenceCode;
import com.ai.yc.user.constants.UcUserConstants.Account;
import com.ai.yc.user.dao.mapper.bo.UsrUser;
import com.ai.yc.user.dao.mapper.bo.UsrUserCriteria;
import com.ai.yc.user.service.atom.interfaces.IYCUserServiceAtomSV;
import com.ai.yc.user.service.business.interfaces.IYCUserServiceBusiSV;

@Service
@Transactional
public class YCUserServiceBusiSVImpl implements IYCUserServiceBusiSV {

    private static final Log LOG = LogFactory.getLog(YCUserServiceBusiSVImpl.class);

    @Autowired
    public IYCUserServiceAtomSV ycUSAtomSV;
    
    /**
     * resultCode
     * 0 fail
     * 1 success
     */
	@Override
	public String insertUserInfo(InsertYCUserRequest insertinfo)  {
		// 孟博接口
		
		// 插入数据
		System.out.println("$$$$$$$$$$$"+insertinfo);
		UsrUser tUser = new UsrUser();
//		UsrUser tUser =  UsrUser.getUsrUserByInsertReq(insertinfo);
		// 从右到左
		BeanUtils.copyProperties(tUser, insertinfo);
		System.out.println("$$$$$$$$$$$"+tUser);
		String UserId = SeqUtil.getNewId(UserSequenceCode.CM_CUST_FILE_EXT$INFO_EXT$ID,18);
		tUser.setUserId(UserId);
		ycUSAtomSV.insertUserInfo(tUser);
		// 支付信息
		
		
		return UserId;
	}

	@Override
	public boolean updateUserInfo(UpdateYCUserParams userparam) {
		UsrUser user = UsrUser.getUsrUserByUpparam(userparam);
		UsrUserCriteria example = new UsrUserCriteria();
		UsrUserCriteria.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(user.getUserId());
        int result = ycUSAtomSV.updateUserInfo(user, example);
		
		return true;
	}

	@Override
	public UsrUser searchUserInfo(String userID) {
		UsrUser usrUser = ycUSAtomSV.getUserInfo(userID);
		return usrUser;
	}

}
