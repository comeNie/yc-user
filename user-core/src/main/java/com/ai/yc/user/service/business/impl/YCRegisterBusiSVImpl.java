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
import com.ai.yc.user.constants.ExceptCodeConstants;
import com.ai.yc.user.constants.UcUserConstants.Account;
import com.ai.yc.user.dao.mapper.bo.UsrUser;
import com.ai.yc.user.dao.mapper.bo.UcContactsInfo;
import com.ai.yc.user.dao.mapper.bo.UcGroupKeyInfo;
import com.ai.yc.user.dao.mapper.bo.UcGroupKeyInfoCriteria;
import com.ai.yc.user.dao.mapper.bo.UcUser;
import com.ai.yc.user.dao.mapper.bo.UcUserCriteria;
import com.ai.yc.user.service.atom.interfaces.IRegisterAtomSV;
import com.ai.yc.user.service.atom.interfaces.IUcContactsInfoAtomSV;
import com.ai.yc.user.service.atom.interfaces.IYCRegisterAtomSV;
import com.ai.yc.user.service.business.interfaces.IRegisterBusiSV;
import com.ai.yc.user.service.business.interfaces.IYCRegisterBusiSV;
import com.ai.yc.user.util.SequenceUtil;
import com.alibaba.fastjson.JSON;

@Service
@Transactional
public class YCRegisterBusiSVImpl implements IYCRegisterBusiSV {

    private static final Log LOG = LogFactory.getLog(YCRegisterBusiSVImpl.class);

    @Autowired
    public IYCRegisterAtomSV ycRegisterAtomSV;
    
	@Override
	public String insertUserInfo(InsertYCUserRequest insertinfo) {
		// 孟博接口
		
		// 插入数据
		UsrUser tUser =  UsrUser.getUsrUserByInsertReq(insertinfo);
		ycRegisterAtomSV.insertUserInfo(tUser);
		// 支付信息
		
		
		return null;
	}

	@Override
	public boolean checkUserExist(String userID) {
		return false;
	}

	@Override
	public boolean updateUserInfo(UsrUser user) {
		return false;
	}

	@Override
	public UsrUser searchUserInfo(String userID) {
		return null;
	}

}
