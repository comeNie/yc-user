package com.ai.yc.user.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.yc.user.api.usercompany.param.UserCompanyRelationPageInfo;
import com.ai.yc.user.api.usercompanyrelation.param.CompanyRelationInfo;
import com.ai.yc.user.api.usercompanyrelation.param.CompanyRelationResponse;
import com.ai.yc.user.api.usercompanyrelation.param.UserCompanyRelationPageInfoRequest;
import com.ai.yc.user.constants.ExceptCodeConstants;
import com.ai.yc.user.dao.mapper.bo.UsrCompanyRelation;
import com.ai.yc.user.service.atom.interfaces.IYCUserCompanyRelationAtomSV;
import com.ai.yc.user.service.business.interfaces.IYCUserCompanyRelationBusiSV;

@Service
@Transactional
public class YCUserCompanyRelationBusiSVImpl implements IYCUserCompanyRelationBusiSV{
	
	@Autowired
	private IYCUserCompanyRelationAtomSV ycUserCompanyAtomSV;
	
	@Override
	public BaseResponse insertCompanyRelationInfo(
			UsrCompanyRelation companyRelationInfo) {
		
		BaseResponse response = new BaseResponse();
		ResponseHeader header = null;
		try{
			ycUserCompanyAtomSV.insertRelationInfo(companyRelationInfo);
			header = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "新增企业联系信息成功");
		}catch(Exception e){
			header = new ResponseHeader(false, ExceptCodeConstants.FAILD, "新增企业联系信息失败");
			e.printStackTrace();
		}
		response.setResponseHeader(header);
		return response;
	}

	@Override
	public BaseResponse updateCompanyRelationInfo(
			UsrCompanyRelation companyRelationInfo) {
		BaseResponse response = new BaseResponse();
		ResponseHeader header = null;
		try{
			ycUserCompanyAtomSV.updateRelationInfo(companyRelationInfo);
			header = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "更新企业联系信息成功");
		}catch(Exception e){
			header = new ResponseHeader(false, ExceptCodeConstants.FAILD, "更新企业联系信息失败");
			e.printStackTrace();
		}
		response.setResponseHeader(header);
		return response;
	}

	@Override
	public CompanyRelationResponse getCompanyUser(UserCompanyRelationPageInfoRequest pageInfoRequest) {
		CompanyRelationResponse response = new CompanyRelationResponse();
		List<UserCompanyRelationPageInfo> list = null;
		List<CompanyRelationInfo> relationInfoList = new ArrayList<CompanyRelationInfo>();
		ResponseHeader header = null;
		PageInfo<CompanyRelationInfo> companyRelationPageInfo = new PageInfo<CompanyRelationInfo>();
		int count = 0;
		int pageCount=0;
		try{
			int limitStart = (pageInfoRequest.getPageNo()-1)*pageInfoRequest.getPageSize();
			int limitEnd = pageInfoRequest.getPageSize(); 
			count = ycUserCompanyAtomSV.getCompanyUserCount(pageInfoRequest.getCompanyId());
			pageCount = count / pageInfoRequest.getPageNo() + (count % pageInfoRequest.getPageSize() > 0 ? 1 : 0);
		    list = ycUserCompanyAtomSV.getCompanyUser(pageInfoRequest.getCompanyId(),limitStart,limitEnd);
		    for(UserCompanyRelationPageInfo relationPageInfo:list){
		    	CompanyRelationInfo companyRelationInfo = new CompanyRelationInfo();
		    	BeanUtils.copyProperties(companyRelationInfo, relationPageInfo);
		    	relationInfoList.add(companyRelationInfo);
		    }
			header = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "获取企业成员");
		}catch(Exception e){
			header = new ResponseHeader(false, ExceptCodeConstants.FAILD, "获取企业成员失败");
			e.printStackTrace();
		}
		companyRelationPageInfo.setCount(count);
		companyRelationPageInfo.setPageNo(pageInfoRequest.getPageNo());
		companyRelationPageInfo.setPageSize(pageInfoRequest.getPageSize());
		companyRelationPageInfo.setPageCount(pageCount);
		companyRelationPageInfo.setResult(relationInfoList);
		response.setList(companyRelationPageInfo);
		response.setResponseHeader(header);
		return response;
	}

}
