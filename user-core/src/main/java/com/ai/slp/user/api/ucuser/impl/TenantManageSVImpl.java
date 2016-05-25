package com.ai.slp.user.api.ucuser.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseInfo;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.DateUtil;
import com.ai.opt.sdk.util.UUIDUtil;
import com.ai.slp.user.api.ucuser.intefaces.ITenantManageSV;
import com.ai.slp.user.api.ucuser.param.TenantInfoRequest;
import com.ai.slp.user.api.ucuser.param.TenantInsertResponse;
import com.ai.slp.user.api.ucuser.param.TenantQueryResponse;
import com.ai.slp.user.constants.ExceptCodeConstants;
import com.ai.slp.user.constants.UcUserConstants.Tenant;
import com.ai.slp.user.dao.mapper.bo.UcUser;
import com.ai.slp.user.dao.mapper.bo.UcUserTenant;
import com.ai.slp.user.service.business.interfaces.ITenantBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

@Service
@Component
public class TenantManageSVImpl implements ITenantManageSV {

	@Autowired
	ITenantBusiSV itenantBusiSV;
	/*@Autowired
	IVoValidateSV iVoValidateSV;*/

	@Override
	public TenantQueryResponse queryTenantInfo(BaseInfo tenantRequest) throws BusinessException,SystemException {
		// 检查参数
		//iVoValidateSV.validateQueryTenantInfo(tenantRequest);
		// 查询数据
		String tenantId = tenantRequest.getTenantId();
		UcUserTenant gnTenant = itenantBusiSV.queryByTenantId(tenantId);
		// 整理返回对象
		TenantQueryResponse tenantQueryResponse = new TenantQueryResponse();
		if (gnTenant != null) {
			BeanUtils.copyProperties(tenantQueryResponse, gnTenant);
		}
		ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "查询成功");
		tenantQueryResponse.setResponseHeader(responseHeader);
		return tenantQueryResponse;
	}

	@Override
	public TenantInsertResponse insertTenantInfo(TenantInfoRequest tenantInfoRequest) throws BusinessException,SystemException {
		/*// 参数检查
		iVoValidateSV.validateInsertTenant(tenantInfoRequest);*/
		// 设置入参值 默认值
		UcUserTenant gnTenant = new UcUserTenant();
		BeanUtils.copyProperties(gnTenant, tenantInfoRequest);
		String tenantId = UUIDUtil.genId32();
		gnTenant.setTenantId(tenantId);
		gnTenant.setState(Tenant.STATE_NOTSIGNED);
		gnTenant.setCreateAccountId(tenantInfoRequest.getUpdateAccountId());
		gnTenant.setCreateTime(DateUtil.getSysDate());
		UcUser gnAccount = new UcUser();
		gnAccount.setUserId(tenantInfoRequest.getAccountId());
		gnAccount.setTenantId(tenantId);
		//gnAccount.setUpdateAccountId(tenantInfoRequest.getUpdateAccountId());
		// 设置返回对象
		boolean isSuccess = itenantBusiSV.insertTenantAndSyncAccount(gnTenant, gnAccount);
		ResponseHeader responseHeader = new ResponseHeader();
		TenantInsertResponse tenantResponse = new TenantInsertResponse();
		if (isSuccess) {
			responseHeader.setIsSuccess(true);
			responseHeader.setResultCode(ExceptCodeConstants.SUCCESS);
			responseHeader.setResultMessage("数据库操作成功");
			tenantResponse.setTenantId(tenantId);
		} else {
			responseHeader.setIsSuccess(false);
			responseHeader.setResultCode(ExceptCodeConstants.FAILD);
			responseHeader.setResultMessage("数据库操作失败");
			tenantResponse.setTenantId(null);
		}
		tenantResponse.setResponseHeader(responseHeader);
		return tenantResponse;
	}

}
