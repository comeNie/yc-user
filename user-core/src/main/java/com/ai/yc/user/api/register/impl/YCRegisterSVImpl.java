package com.ai.yc.user.api.register.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.yc.user.api.register.interfaces.IRegisterSV;
import com.ai.yc.user.api.register.interfaces.IYCRegisterSV;
import com.ai.yc.user.api.register.param.InsertYCUserRequest;
import com.ai.yc.user.api.register.param.RegisterParamsRequest;
import com.ai.yc.user.api.register.param.RegisterResponse;
import com.ai.yc.user.api.register.param.SearchYCUserParams;
import com.ai.yc.user.api.register.param.UcBankKeyInfoParams;
import com.ai.yc.user.api.register.param.UcContactInfoParams;
import com.ai.yc.user.api.register.param.UcCustKeyInfoParams;
import com.ai.yc.user.api.register.param.UcGroupKeyInfoParams;
import com.ai.yc.user.api.register.param.UcUserFileExtParams;
import com.ai.yc.user.api.register.param.UcUserParams;
import com.ai.yc.user.api.register.param.UpdateYCUserParams;
import com.ai.yc.user.api.register.param.YCInsertUserResponse;
import com.ai.yc.user.api.register.param.YCUpdateUserResponse;
import com.ai.yc.user.api.register.param.YCUserInfo;
import com.ai.yc.user.constants.ExceptCodeConstants;
import com.ai.yc.user.constants.UserRegisterErrorCode;
import com.ai.yc.user.service.business.interfaces.IRegisterBusiSV;
import com.ai.yc.user.service.business.interfaces.IYCRegisterBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

@Service(validation = "true")
@Component
public class YCRegisterSVImpl implements IYCRegisterSV {

    @Autowired
    public IYCRegisterBusiSV ycRegisterBusiSv;

	@Override
	public YCInsertUserResponse insertYCUser(InsertYCUserRequest insertInfo){
		String userId = ycRegisterBusiSv.insertUserInfo(insertInfo);
		YCInsertUserResponse result = new YCInsertUserResponse();
        result.setUserId(userId);
        result.setResponseCode(ExceptCodeConstants.SUCCESS);
        return result;
	}

	@Override
	public YCUpdateUserResponse updateYCUserInfo(UpdateYCUserParams updateUserParams){
		return null;
	}

	@Override
	public YCUserInfo searchYCUserInfo(SearchYCUserParams ucUser){
		return null;
	}
    
   

}
