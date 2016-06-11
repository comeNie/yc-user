package com.ai.slp.user.api.ucuserphonebooks.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.slp.user.api.ucuserphonebooks.interfaces.IUserPhoneBooksSV;
import com.ai.slp.user.api.ucuserphonebooks.param.UcTelGroup;
import com.ai.slp.user.api.ucuserphonebooks.param.UcTelGroupMantainReq;
import com.ai.slp.user.api.ucuserphonebooks.param.UcTelGroupQueryReq;
import com.ai.slp.user.api.ucuserphonebooks.param.UcTelGroupQueryResp;
import com.ai.slp.user.api.ucuserphonebooks.param.UcUserPhonebooksBatchAddReq;
import com.ai.slp.user.api.ucuserphonebooks.param.UcUserPhonebooksBatchDeleteReq;
import com.ai.slp.user.api.ucuserphonebooks.param.UcUserPhonebooksModifyReq;
import com.ai.slp.user.api.ucuserphonebooks.param.UcUserPhonebooksQueryReq;
import com.ai.slp.user.api.ucuserphonebooks.param.UserPhonebook;
import com.ai.slp.user.constants.ExceptCodeConstants;
import com.ai.slp.user.service.business.interfaces.IUserPhoneBooksBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

@Service(validation = "true")
@Component
public class UserPhoneBooksSVImpl implements IUserPhoneBooksSV {

	@Autowired
	private IUserPhoneBooksBusiSV userPhoneBooksBusiSV;

	@Override
	public BaseResponse addUcTelGroup(UcTelGroupMantainReq req) throws BusinessException, SystemException {
		if (req == null) {
			throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "请求参数不能为空");
		}
		userPhoneBooksBusiSV.addUcTelGroup(req);
		ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "新增成功");
		BaseResponse r = new BaseResponse();
		r.setResponseHeader(responseHeader);
		return r;
	}

	@Override
	public BaseResponse modifyUcTelGroup(UcTelGroupMantainReq req) throws BusinessException, SystemException {
		if (req == null) {
			throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "请求参数不能为空");
		}
		userPhoneBooksBusiSV.modifyUcTelGroup(req);
		ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "修改成功");
		BaseResponse r = new BaseResponse();
		r.setResponseHeader(responseHeader);
		return r;
	}

	@Override
	public BaseResponse deleteUcTelGroup(UcTelGroupMantainReq req) throws BusinessException, SystemException {
		userPhoneBooksBusiSV.deleteUcTelGroup(req);
		ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "删除成功");
		BaseResponse r = new BaseResponse();
		r.setResponseHeader(responseHeader);
		return r;
	}

	@Override
	public UcTelGroupQueryResp getUcTelGroups(UcTelGroupQueryReq req) throws BusinessException, SystemException {
		if (req == null) {
			throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "请求参数不能为空");
		}
		List<UcTelGroup> list = userPhoneBooksBusiSV.getUcTelGroups(req.getUserId());
		ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "查询成功");
		UcTelGroupQueryResp r = new UcTelGroupQueryResp();
		r.setResponseHeader(responseHeader);
		r.setGroups(list);
		return r;
	}

	@Override
	public PageInfo<UserPhonebook> queryUserPhonebooks(UcUserPhonebooksQueryReq req)
			throws BusinessException, SystemException {
		if (req == null) {
			throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "请求参数不能为空");
		}
		return userPhoneBooksBusiSV.queryUserPhonebooks(req);
	}

	@Override
	public BaseResponse modifyUserPhonebook(UcUserPhonebooksModifyReq req) throws BusinessException, SystemException {
		if (req == null) {
			throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "请求参数不能为空");
		}
		userPhoneBooksBusiSV.modifyUserPhonebook(req);
		ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "修改成功");
		BaseResponse r = new BaseResponse();
		r.setResponseHeader(responseHeader);
		return r;
	}

	@Override
	public BaseResponse batchAddUserPhonebooks(UcUserPhonebooksBatchAddReq req)
			throws BusinessException, SystemException {
		if (req == null) {
			throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "请求参数不能为空");
		}
		userPhoneBooksBusiSV.batchAddUserPhonebooks(req.getDatas());
		ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "添加成功");
		BaseResponse r = new BaseResponse();
		r.setResponseHeader(responseHeader);
		return r;
	}

	@Override
	public BaseResponse batchDeleteUserPhonebooks(UcUserPhonebooksBatchDeleteReq req)
			throws BusinessException, SystemException {
		if (req == null) {
			throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "请求参数不能为空");
		}
		if (CollectionUtil.isEmpty(req.getRecordIds())) {
			throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "要删除的通信录记录ID不能为空");
		}
		userPhoneBooksBusiSV.batchDeleteUserPhonebooks(req.getRecordIds());
		ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "删除成功");
		BaseResponse r = new BaseResponse();
		r.setResponseHeader(responseHeader);
		return r;
	}

}
