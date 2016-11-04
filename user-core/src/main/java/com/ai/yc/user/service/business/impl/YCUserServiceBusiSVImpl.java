package com.ai.yc.user.service.business.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.sdk.components.sequence.util.SeqUtil;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.yc.user.api.userservice.param.InsertYCUserRequest;
import com.ai.yc.user.api.userservice.param.UpdateYCUserRequest;
import com.ai.yc.user.constants.SequenceCodeConstants.UserSequenceCode;
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
		UsrUser tUser = new UsrUser();
//		UsrUser tUser =  UsrUser.getUsrUserByInsertReq(insertinfo);
		// 从右到左
		BeanUtils.copyProperties(tUser, insertinfo);
		String UserId = SeqUtil.getNewId(UserSequenceCode.CM_CUST_FILE_EXT$INFO_EXT$ID,18);
		tUser.setUserId(UserId);
		ycUSAtomSV.insertUserInfo(tUser);
		// 支付信息
		
		
		return UserId;
	}

	@Override
	public boolean updateUserInfo(UpdateYCUserRequest userparam) {
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
