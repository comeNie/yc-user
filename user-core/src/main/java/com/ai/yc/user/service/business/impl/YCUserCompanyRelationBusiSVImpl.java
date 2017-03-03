package com.ai.yc.user.service.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
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

}
