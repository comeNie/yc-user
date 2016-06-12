package com.ai.slp.user.api.ucuserphonebooks.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.ai.slp.user.api.ucuserphonebooks.param.UcUserPhonebooksBatchAddResp;
import com.ai.slp.user.api.ucuserphonebooks.param.UcUserPhonebooksBatchData;
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
	public UcUserPhonebooksBatchAddResp batchAddUserPhonebooks(UcUserPhonebooksBatchAddReq req)
			throws BusinessException, SystemException {
		if (req == null) {
			throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "请求参数不能为空");
		}
		List<String> repeatErrors = new ArrayList<String>();
		// 去掉号码重复的记录
		Map<String, UcUserPhonebooksBatchData> dataMap = new HashMap<String, UcUserPhonebooksBatchData>();
		if (!CollectionUtil.isEmpty(req.getDatas())) {
			for (UcUserPhonebooksBatchData p : req.getDatas()) {
				int indexNo = req.getDatas().indexOf(p);
				p.setIndexNo(indexNo);
				if (dataMap.containsKey(p.getTelMp())) {
					UcUserPhonebooksBatchData r = dataMap.get(p.getTelMp());
					repeatErrors.add("第" + indexNo + "条的号码与第[" + r.getIndexNo() + "]条重复");
				} else {
					dataMap.put(p.getTelMp(), p);
				}
			}
		}
		List<String> processErrors = userPhoneBooksBusiSV.batchAddUserPhonebooks(dataMap);
		if (!CollectionUtil.isEmpty(processErrors)) {
			repeatErrors.addAll(processErrors);
		}

		int total = CollectionUtil.isEmpty(req.getDatas()) ? 0 : req.getDatas().size();
		ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "添加成功");
		UcUserPhonebooksBatchAddResp r = new UcUserPhonebooksBatchAddResp();
		r.setResponseHeader(responseHeader);
		r.setErrors(repeatErrors);
		r.setResult("一共提交[" + total + "]条，处理失败的[" + repeatErrors.size() + "]条,处理成功[" + (total - repeatErrors.size())
				+ "]条");
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
