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
import com.ai.opt.sdk.util.DateUtil;
import com.ai.yc.user.api.usergriwthvalue.param.UserGriwthValueListResponse;
import com.ai.yc.user.api.usergriwthvalue.param.UsrGriwthValueInfo;
import com.ai.yc.user.api.usergriwthvalue.param.UsrGriwthValuePageInfoRequest;
import com.ai.yc.user.constants.ExceptCodeConstants;
import com.ai.yc.user.dao.mapper.bo.UsrGriwthValue;
import com.ai.yc.user.dao.mapper.bo.UsrGriwthValueCriteria;
import com.ai.yc.user.dao.mapper.bo.UsrUser;
import com.ai.yc.user.dao.mapper.bo.UsrUserCriteria;
import com.ai.yc.user.service.atom.interfaces.IYCUserGriwthValueAtomSV;
import com.ai.yc.user.service.atom.interfaces.IYCUserServiceAtomSV;
import com.ai.yc.user.service.business.interfaces.IYCUserGriwthValueBusiSV;

@Service
@Transactional
public class YCUserGriwthValueBusiSVImpl implements IYCUserGriwthValueBusiSV{

	@Autowired
	private IYCUserGriwthValueAtomSV userGriwthValueAtomSV;
	
	@Autowired
	private IYCUserServiceAtomSV userServiceAtomSV;
	
	@Override
	public BaseResponse insertGriwthValueInfo(UsrGriwthValue griwthValueInfo) {
		BaseResponse response = new BaseResponse();
		ResponseHeader header = null;
		try{
			griwthValueInfo.setCreateTime(DateUtil.getSysDate());
			/**
			 * 新增成长值
			 */
			userGriwthValueAtomSV.insertGriwthValueInfo(griwthValueInfo);
			/**
			 * 获取该用户总成长值
			 */
			int sum = userGriwthValueAtomSV.getUsrGriwthValueSum(griwthValueInfo.getUserId());
			/**
			 * 更新usr_user表中该用户的成长值
			 */
			UsrUser usrUser = new UsrUser();
			usrUser.setGriwthValue(sum);
			UsrUserCriteria example = new UsrUserCriteria();
			UsrUserCriteria.Criteria usrCriteria = example.createCriteria();
			usrCriteria.andUserIdEqualTo(griwthValueInfo.getUserId());
			userServiceAtomSV.updateUserInfo(usrUser, example);
			
			header = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "新增成长记录成功");
		}catch(Exception e){
			e.printStackTrace();
			header = new ResponseHeader(false, ExceptCodeConstants.FAILD, "新增成长记录失败");
		}
		response.setResponseHeader(header);
		return response;
	}

	@Override
	public BaseResponse updateGriwthValueInfo(UsrGriwthValue griwthValueInfo) {
		BaseResponse response = new BaseResponse();
		ResponseHeader header = null;
		try{
			userGriwthValueAtomSV.insertGriwthValueInfo(griwthValueInfo);
			header = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "修改成长记录成功");
		}catch(Exception e){
			e.printStackTrace();
			header = new ResponseHeader(false, ExceptCodeConstants.FAILD, "修改成长记录失败");
		}
		response.setResponseHeader(header);
		return response;
	}

	@Override
	public UserGriwthValueListResponse queryGriwthValueInfo(
			UsrGriwthValuePageInfoRequest request) {
		UserGriwthValueListResponse response = new UserGriwthValueListResponse();
		ResponseHeader header = null;
		List<UsrGriwthValue> list = null;
		List<UsrGriwthValueInfo> resultList = new ArrayList<UsrGriwthValueInfo>();
		int count = 0;
		try{
			UsrGriwthValueCriteria example = new UsrGriwthValueCriteria();
			UsrGriwthValueCriteria.Criteria criteria = example.createCriteria();
			criteria.andUserIdEqualTo(request.getUserId());
			list = userGriwthValueAtomSV.queryGriwthValueInfo(example);
			header = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "修改成长记录成功");
			count = userGriwthValueAtomSV.getUsrGriwthValueCount(example);
		}catch(Exception e){
			e.printStackTrace();
			header = new ResponseHeader(false, ExceptCodeConstants.FAILD, "修改成长记录失败");
		}
		for(int i=0;i<list.size();i++){
			UsrGriwthValue griwthValue = list.get(i);
			UsrGriwthValueInfo griwthValueInfo = new UsrGriwthValueInfo();
			BeanUtils.copyProperties(griwthValueInfo, griwthValue);
			resultList.add(griwthValueInfo);
		}
		
		PageInfo<UsrGriwthValueInfo>  pageInfo = new PageInfo<UsrGriwthValueInfo>();
		pageInfo.setResult(resultList);
		response.setGetCollectionListByPage(pageInfo);
		response.setResponseHeader(header);
		pageInfo.setCount(count);
		pageInfo.setPageSize(request.getPageSize());
		return response;
	}

}
