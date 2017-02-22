package com.ai.yc.user.service.business.impl;

import java.util.LinkedList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.paas.ipaas.util.StringUtil;
import com.ai.yc.user.api.usercontact.param.UserContactInfo;
import com.ai.yc.user.api.usercontact.param.UserContactInfoRespose;
import com.ai.yc.user.constants.ExceptCodeConstants;
import com.ai.yc.user.dao.mapper.bo.UsrContact;
import com.ai.yc.user.dao.mapper.bo.UsrContactCriteria;
import com.ai.yc.user.service.atom.interfaces.IYCUserContactAtomSV;
import com.ai.yc.user.service.business.interfaces.IYCUserContactBusiSV;
@Service
@Transactional
public class YCUserContactBusiSVImpl implements IYCUserContactBusiSV{

	@Autowired
	private IYCUserContactAtomSV ycUSContactAtomSV;
	
	private static final Log LOG = LogFactory.getLog(YCUserContactBusiSVImpl.class);
	
	@Override
	public BaseResponse insertContactInfo(UsrContact contactInfo) {
		BaseResponse response = new BaseResponse();
		ResponseHeader header = null;
		try{
			if(StringUtil.isBlank(contactInfo.getUserId())){
				throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "用户Id不能为空");
			}
			if(StringUtil.isBlank(contactInfo.getUserName())){
				throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "姓名不能为空");
			}
			if(StringUtil.isBlank(contactInfo.getMobilePhone())){
				throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "手机不能为空");
			}
			if(StringUtil.isBlank(contactInfo.getEmail())){
				throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "邮箱不能为空");
			}
			UsrContactCriteria example = new UsrContactCriteria();
			UsrContactCriteria.Criteria criteria = example.createCriteria();
			criteria.andUserIdEqualTo(contactInfo.getUserId());
			int count = ycUSContactAtomSV.getContactCount(example);
			if(count>5){
				header = new ResponseHeader(true,ExceptCodeConstants.Contact.INSERT_ERROR,"绑定的联系方式超过5个");
			}else{
				ycUSContactAtomSV.insertContactInfo(contactInfo);
				header = new ResponseHeader(true,ExceptCodeConstants.SUCCESS,"联系方式新增成功");
			}
		
		}catch(Exception e){
			e.printStackTrace();
			LOG.error(e);
			header = new ResponseHeader(false,ExceptCodeConstants.FAILD,"联系方式新增失败");
		}
		response.setResponseHeader(header);
		return response;
	}

	@Override
	public BaseResponse updateContactInfo(UsrContact contactInfo) {
		BaseResponse response = new BaseResponse();
		ResponseHeader header = null;
		try{
			ycUSContactAtomSV.updateContactInfo(contactInfo);
			header = new ResponseHeader(true,ExceptCodeConstants.SUCCESS,"联系方式修改成功");
		}catch(Exception e){
			header = new ResponseHeader(false,ExceptCodeConstants.FAILD,"联系方式修改失败");
		}
		response.setResponseHeader(header);
		return response;
	}

	@Override
	public BaseResponse deleteContactInfo(String contactId) {
		BaseResponse response = new BaseResponse();
		ResponseHeader header = null;
		try{
			ycUSContactAtomSV.deleteContactInfo(contactId);
			header = new ResponseHeader(true,ExceptCodeConstants.SUCCESS,"联系方式删除成功");
		}catch(Exception e){
			header = new ResponseHeader(false,ExceptCodeConstants.FAILD,"联系方式删除失败");
		}
		response.setResponseHeader(header);
		return response;
	}

	@Override
	public UserContactInfoRespose queryContactInfo(String userId) {
		UserContactInfoRespose response = new UserContactInfoRespose();
		UsrContactCriteria example = new UsrContactCriteria();
		UsrContactCriteria.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		LinkedList<UserContactInfo> returnList = new LinkedList<UserContactInfo>();
		ResponseHeader header = null;
		try{
			List<UsrContact> list = ycUSContactAtomSV.queryContactInfo(example);
			for(int i=0;i<list.size();i++){
				UserContactInfo contactInfo = new UserContactInfo();
				UsrContact usrContact = list.get(i);
				BeanUtils.copyProperties(contactInfo, usrContact);
				if(contactInfo.getIsDefault()==1){
					returnList.addFirst(contactInfo);
				}else{
					returnList.add(contactInfo);
				}
			}
			header = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "查询成功");
		}catch(Exception e){
			header = new ResponseHeader(true, ExceptCodeConstants.FAILD, "查询失败");
			LOG.error("查询失败", e);
		}
		response.setUsrContactList(returnList);
		response.setResponseHeader(header);
		return response;
	}

	@Override
	public BaseResponse updateContactDefaultMode(UsrContact contactInfo) {
		BaseResponse response = new BaseResponse();
		ResponseHeader header = null;
		try{
			ycUSContactAtomSV.updateContactInfo(contactInfo);
			header = new ResponseHeader(true,ExceptCodeConstants.SUCCESS,"联系默认方式设置成功");
		}catch(Exception e){
			header = new ResponseHeader(false,ExceptCodeConstants.FAILD,"联系默认方式设置失败");
		}
		response.setResponseHeader(header);
		return response;
	}

}
