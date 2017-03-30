package com.ai.yc.user.service.business.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.components.sequence.util.SeqUtil;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.DateUtil;
import com.ai.paas.ipaas.util.StringUtil;
import com.ai.yc.user.api.usercollectiontranslation.param.UserCollectionInfo;
import com.ai.yc.user.api.usercompany.param.UserCompanyInfoDetailResponse;
import com.ai.yc.user.api.usercompany.param.UserCompanyInfoListResponse;
import com.ai.yc.user.api.usercompany.param.UserCompanyInfoRequest;
import com.ai.yc.user.api.usercompany.param.UserCompanyInfoResponse;
import com.ai.yc.user.api.usercompany.param.UserCompanyPageInfo;
import com.ai.yc.user.api.usercompany.param.UserCompanyPageInfoRequest;
import com.ai.yc.user.api.usercompany.param.UsrCompanyInfo;
import com.ai.yc.user.constants.ExceptCodeConstants;
import com.ai.yc.user.dao.mapper.bo.UsrCollectionTranslation;
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
		
		if(StringUtil.isBlank(userInfoRequest.getUserId())){
			throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "用户Id不能为空");
		}
		try{
			response = ycUserCompanyAtomSV.queryCompanyInfoByUserId(userInfoRequest.getUserId());
			if(StringUtil.isBlank(response.getAdminUserId())){
				header = new ResponseHeader(true,ExceptCodeConstants.NO_RESULT,"无结果");
			}
			response.setResponseHeader(header);
		}catch(Exception e){
			e.printStackTrace();
			header = new ResponseHeader(true,ExceptCodeConstants.FAILD,"查询失败");
		}
		
		return response;
	}

	@Override
	public BaseResponse checkCompanyInfo(
			UserCompanyInfoRequest userInfoRequest) {
		List<UsrCompany> companyInfoList = null;
		UsrCompanyCriteria companyExample = new UsrCompanyCriteria();
		UsrCompanyCriteria.Criteria companyCriteria = companyExample.createCriteria();
		BaseResponse response = new BaseResponse();
		ResponseHeader header = null;
		try{
			if(!"".equals(userInfoRequest.getCompanyName())&&!StringUtil.isBlank(userInfoRequest.getCompanyName())){
				companyCriteria.andCompanyNameEqualTo(userInfoRequest.getCompanyName());
			}
			companyInfoList = ycUserCompanyAtomSV.queryCompanyInfo(companyExample);
			if(companyInfoList!=null&&companyInfoList.size()>0){
				header = new ResponseHeader(true, ExceptCodeConstants.Company.COMPANY_NAME_EXIST, "企业名称已存在");
			}else{
				header = new ResponseHeader(true, ExceptCodeConstants.Company.COMPANY_NAME_NO_EXIST, "企业名称不存在");
			}
		}catch(Exception e){
			header = new ResponseHeader(false, ExceptCodeConstants.FAILD, "校验企业名称失败");
		}
		response.setResponseHeader(header);
		return response;
	}

	@Override
	public UserCompanyInfoListResponse queryPageInfoCompanyInfo(
			UserCompanyPageInfoRequest pageInfoRequest) {
		UserCompanyInfoListResponse response = new UserCompanyInfoListResponse();
		List<UserCompanyPageInfo> companyInfoList = null;
		PageInfo<UsrCompanyInfo> companyInfoPageInfo = new PageInfo<UsrCompanyInfo>();
		List<UsrCompanyInfo> list = new ArrayList<UsrCompanyInfo>();
		ResponseHeader header = null;
		try{
			int count = ycUserCompanyAtomSV.getCompanyListCount(pageInfoRequest);
			int pageCount = count / pageInfoRequest.getPageNo() + (count % pageInfoRequest.getPageSize() > 0 ? 1 : 0);
			companyInfoList = ycUserCompanyAtomSV.queryCompanyInfoList(pageInfoRequest);
			if(companyInfoList!=null){
				for(int i=0;i<companyInfoList.size();i++){
					UsrCompanyInfo usrCompanyInfo = new UsrCompanyInfo();
					UserCompanyPageInfo usrCompany = companyInfoList.get(i);
					BeanUtils.copyProperties(usrCompanyInfo, usrCompany);
					list.add(usrCompanyInfo);
				}
			}
			companyInfoPageInfo.setResult(list);
			companyInfoPageInfo.setPageNo(pageInfoRequest.getPageNo());
			companyInfoPageInfo.setPageSize(pageInfoRequest.getPageSize());
			companyInfoPageInfo.setCount(count);
			companyInfoPageInfo.setPageCount(pageCount);
			response.setCompanyList(companyInfoPageInfo);
			header = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "查询企业信息成功");
		}catch(Exception e){
			header = new ResponseHeader(false, ExceptCodeConstants.FAILD, "查询企业信息失败");
			e.printStackTrace();
		}
		response.setResponseHeader(header);
		return response;
	}

	@Override
	public UserCompanyInfoDetailResponse queryCompanyInfoDetail(
			UserCompanyInfoRequest userInfoRequest) {
		List<UsrCompany> companyInfoList = null;
		UsrCompanyCriteria companyExample = new UsrCompanyCriteria();
		UsrCompanyCriteria.Criteria companyCriteria = companyExample.createCriteria();
		UserCompanyInfoDetailResponse response = new UserCompanyInfoDetailResponse();
		ResponseHeader header = null;
		try{
			if(!"".equals(userInfoRequest.getUserId())&&!StringUtil.isBlank(userInfoRequest.getUserId())){
				companyCriteria.andAdminUserIdEqualTo(userInfoRequest.getUserId());
			}
			companyInfoList = ycUserCompanyAtomSV.queryCompanyInfo(companyExample);
			if(companyInfoList!=null&&companyInfoList.size()>0){
				UsrCompany usercompany= companyInfoList.get(0);
				BeanUtils.copyProperties(response, usercompany);
			}
		}catch(Exception e){
			header = new ResponseHeader(false, ExceptCodeConstants.FAILD, "查询企业详情失败");
		}
		response.setResponseHeader(header);
		return response;
	}
}
