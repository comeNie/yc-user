package com.ai.slp.user.api.ucuser.intefaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseInfo;
import com.ai.slp.user.api.ucuser.param.TenantInfoRequest;
import com.ai.slp.user.api.ucuser.param.TenantInsertResponse;
import com.ai.slp.user.api.ucuser.param.TenantQueryResponse;

public interface ITenantManageSV {
	
	/**
	 * 查询租户信息
	 * @param tenantReaponse
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author 
     * @ApiDocMethod
     * @ApiCode 
	 */
	TenantQueryResponse queryTenantInfo(BaseInfo tenantRequest) throws BusinessException,SystemException;
	
	/**
	 * 设置租户信息(新增)
	 * @param tenantInfoRequest
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author jiaxs
     * @ApiDocMethod
     * @ApiCode UAC_0006
	 */
	TenantInsertResponse insertTenantInfo(TenantInfoRequest tenantInfoRequest) throws BusinessException,SystemException;
}
