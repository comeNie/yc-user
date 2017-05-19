package com.ai.yc.user.api.usercompanyrelation.impl;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.constants.ExceptCodeConstants;
import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.yc.user.api.usercompanyrelation.param.ManagerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.yc.user.api.usercompany.param.UserCompanyInfoRequest;
import com.ai.yc.user.api.usercompanyrelation.interfaces.IYCUserCompanyRelationSV;
import com.ai.yc.user.api.usercompanyrelation.param.CompanyRelationResponse;
import com.ai.yc.user.api.usercompanyrelation.param.UserCompanyRelationPageInfoRequest;
import com.ai.yc.user.dao.mapper.bo.UsrCompanyRelation;
import com.ai.yc.user.service.business.interfaces.IYCUserCompanyRelationBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

import java.util.List;

@Service
@Component
public class YCUserCompanyRelationSVImpl implements IYCUserCompanyRelationSV{

	@Autowired
	private IYCUserCompanyRelationBusiSV ycUserCompanyBusiSV;

	@Override
	public BaseResponse insertCompanyRelationInfo(
			UserCompanyInfoRequest userInfoRequest) throws BusinessException,
			SystemException {
		UsrCompanyRelation companyRelation = new UsrCompanyRelation();
		BeanUtils.copyProperties(companyRelation, userInfoRequest);
		return ycUserCompanyBusiSV.insertCompanyRelationInfo(companyRelation);
	}

	@Override
	public BaseResponse updateCompanyRelationInfo(UserCompanyInfoRequest userInfoRequest)
			throws BusinessException, SystemException {
		UsrCompanyRelation companyRelation = new UsrCompanyRelation();
		BeanUtils.copyProperties(companyRelation, userInfoRequest);
		return ycUserCompanyBusiSV.updateCompanyRelationInfo(companyRelation);
	}

	@Override
	@POST
	@Path("/getCompanyUsers")
	public CompanyRelationResponse getCompanyUsers(UserCompanyRelationPageInfoRequest pageInfoRequest) {
		return ycUserCompanyBusiSV.getCompanyUser(pageInfoRequest);
	}

	@Override
	public ManagerResponse getUserIsManager(String userID) {
		ManagerResponse managerResponse = new ManagerResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try{
			if (StringUtil.isBlank(userID)) {
				throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:用户ID不能为空");
			}

			List<UsrCompanyRelation> usrLsps = ycUserCompanyBusiSV.getusrCompanyRelationInfo(userID);
			if(CollectionUtil.isEmpty(usrLsps)){
				responseHeader.setResultCode("0001");
				responseHeader.setResultMessage("客户不是企业管理员");
				managerResponse.setResponseHeader(responseHeader);
			}else{
				BeanUtils.copyProperties(managerResponse,usrLsps.get(0));
				responseHeader.setResultCode("0000");
				responseHeader.setResultMessage("成功");
				responseHeader.setIsSuccess(true);
				managerResponse.setResponseHeader(responseHeader);
			}
			return managerResponse;
		}catch(Exception e){
			responseHeader.setResultCode("0002");
			responseHeader.setResultMessage("查询资料失败");
			managerResponse.setResponseHeader(responseHeader);
			return managerResponse;
		}
	}
}
