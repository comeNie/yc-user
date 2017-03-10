package com.ai.yc.user.service.business.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.components.sequence.util.SeqUtil;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.DateUtil;
import com.ai.paas.ipaas.util.StringUtil;
import com.ai.yc.user.api.usercompany.param.UserCompanyInfoRequest;
import com.ai.yc.user.api.usercompany.param.UserCompanyInfoResponse;
import com.ai.yc.user.constants.ExceptCodeConstants;
import com.ai.yc.user.dao.mapper.bo.UsrCompany;
import com.ai.yc.user.dao.mapper.bo.UsrCompanyCriteria;
import com.ai.yc.user.dao.mapper.bo.UsrCompanyRelation;
import com.ai.yc.user.dao.mapper.bo.UsrCompanyRelationCriteria;
import com.ai.yc.user.service.atom.interfaces.IYCUserCompanyAtomSV;
import com.ai.yc.user.service.atom.interfaces.IYCUserCompanyRelationAtomSV;
import com.ai.yc.user.service.business.interfaces.IYCUserCompanyBusiSV;

@Service
@Transactional
public class YCUserCompanyBusiSVImpl implements IYCUserCompanyBusiSV {

	@Autowired
	private IYCUserCompanyAtomSV ycUserCompanyAtomSV;
	@Autowired
	private IYCUserCompanyRelationAtomSV yCUserCompanyRelationAtomSV;
	@Override
	public BaseResponse insertCompanyInfo(UsrCompany companyInfo) {
		BaseResponse response = new BaseResponse();
		ResponseHeader header = null;
		if(StringUtil.isBlank(companyInfo.getCompanyName())){
			throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "企业名称不能为空");
		}
		if(StringUtil.isBlank(companyInfo.getLicenseAttacid())){
			throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "营业执照不能为空");
		}
		if(StringUtil.isBlank(companyInfo.getAddress())){
			throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "企业地址不能为空");
		}
		if(StringUtil.isBlank(companyInfo.getTelephone())){
			throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "企业座机不能为空");
		}
		if(StringUtil.isBlank(companyInfo.getLinkman())){
			throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "联系人不能为空");
		}
		try{
			ycUserCompanyAtomSV.insertCompanyInfo(companyInfo);
			UsrCompanyRelation companyRelation = new UsrCompanyRelation();
			companyRelation.setCompanyId(companyInfo.getCompanyId());
			companyRelation.setUserId(companyInfo.getAdminUserId());
			companyRelation.setStatus("0");
			String relationId = SeqUtil.getNewId("YC_USER$COMPANY_ID$SEQ", 8);
			companyRelation.setRelationId(relationId);
			companyRelation.setIsManagement(1);
			companyRelation.setJoinTime(DateUtil.getTimestamp(new Date().getTime()));
			yCUserCompanyRelationAtomSV.insertRelationInfo(companyRelation);
			header = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "新增企业信息成功");
		}catch(Exception e){
			header = new ResponseHeader(false, ExceptCodeConstants.FAILD, "新增企业信息失败");
			e.printStackTrace();
		}
		response.setResponseHeader(header);
		return response;
	}

	@Override
	public BaseResponse updateCompanyInfo(UsrCompany companyInfo) {
		BaseResponse response = new BaseResponse();
		ResponseHeader header = null;
		try{
			if(StringUtil.isBlank(companyInfo.getCompanyName())){
				throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "企业名称不能为空");
			}
			if(StringUtil.isBlank(companyInfo.getLicenseAttacid())){
				throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "营业执照不能为空");
			}
			if(StringUtil.isBlank(companyInfo.getAddress())){
				throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "企业地址不能为空");
			}
			if(StringUtil.isBlank(companyInfo.getTelephone())){
				throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "企业座机不能为空");
			}
			if(StringUtil.isBlank(companyInfo.getLinkman())){
				throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "联系人不能为空");
			}
			ycUserCompanyAtomSV.updateCompanyInfo(companyInfo);
			header = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "更新企业信息成功");
		}catch(Exception e){
			header = new ResponseHeader(false, ExceptCodeConstants.FAILD, "更新企业信息失败");
			e.printStackTrace();
		}
		response.setResponseHeader(header);
		return response;
	}

	@Override
	public UserCompanyInfoResponse queryCompanyInfo(UserCompanyInfoRequest userInfoRequest) {
		UserCompanyInfoResponse response = new UserCompanyInfoResponse();
		ResponseHeader header = null;
		UsrCompanyRelationCriteria relationExample = new UsrCompanyRelationCriteria();
		UsrCompanyRelationCriteria.Criteria relationCriteria = relationExample.createCriteria();
		if(StringUtil.isBlank(userInfoRequest.getAdminUserId())){
			throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "用户Id不能为空");
		}
		relationCriteria.andStatusEqualTo("1");
		relationCriteria.andUserIdEqualTo(userInfoRequest.getAdminUserId());
		List<UsrCompanyRelation> relationList = yCUserCompanyRelationAtomSV.queryRelationInfo(relationExample);
		List<UsrCompany> companyInfoList = null;
		if(relationList!=null&&relationList.size()==0){
			header = new ResponseHeader(true,ExceptCodeConstants.NO_RESULT,"此用户不是企业用户");
		}else{
			UsrCompanyCriteria companyExample = new UsrCompanyCriteria();
			UsrCompanyCriteria.Criteria companyCriteria = companyExample.createCriteria();
			UsrCompanyRelation relation = relationList.get(0);
			companyCriteria.andCompanyIdEqualTo(relation.getCompanyId());
			companyInfoList = ycUserCompanyAtomSV.queryCompanyInfo(companyExample);
		}
		response.setResponseHeader(header);
		if(companyInfoList!=null){
			BeanUtils.copyProperties(response, companyInfoList.get(0));
		}
		return response;
	}

}
