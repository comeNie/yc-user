package com.ai.yc.user.api.userservice.impl;


import java.lang.reflect.Type;
import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.DateUtil;
import com.ai.yc.user.api.userservice.interfaces.IYCUserServiceSV;
import com.ai.yc.user.api.userservice.param.CompleteUserInfoRequest;
import com.ai.yc.user.api.userservice.param.InsertYCContactRequest;
import com.ai.yc.user.api.userservice.param.InsertYCUserRequest;
import com.ai.yc.user.api.userservice.param.SearchYCContactRequest;
import com.ai.yc.user.api.userservice.param.SearchYCUserRequest;
import com.ai.yc.user.api.userservice.param.UpdateYCUserRequest;
import com.ai.yc.user.api.userservice.param.UsrContactMessage;
import com.ai.yc.user.api.userservice.param.YCContactInfoResponse;
import com.ai.yc.user.api.userservice.param.YCInsertContactResponse;
import com.ai.yc.user.api.userservice.param.YCInsertUserResponse;
import com.ai.yc.user.api.userservice.param.YCUpdateUserResponse;
import com.ai.yc.user.api.userservice.param.YCUserInfoResponse;
import com.ai.yc.user.constants.ExceptCodeConstants;
import com.ai.yc.user.dao.mapper.bo.UsrContact;
import com.ai.yc.user.dao.mapper.bo.UsrUser;
import com.ai.yc.user.service.business.interfaces.IYCUserServiceBusiSV;
import com.ai.yc.user.util.DataSourceUtil;
import com.alibaba.dubbo.config.annotation.Service;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
@Service
@Component
public class YCUserServiceSVImpl implements IYCUserServiceSV {

	private static final Logger LOGGER = LoggerFactory.getLogger(YCUserServiceSVImpl.class);
    @Autowired
    private IYCUserServiceBusiSV ycUsrServiceBusiSv;

	@Override
	public YCInsertUserResponse insertYCUser(InsertYCUserRequest insertInfo){
		LOGGER.debug("insertYCUser input params:", insertInfo);
		ResponseHeader responseHeader;
		try{
			YCInsertUserResponse response = ycUsrServiceBusiSv.insertUserInfo(insertInfo);
			if(response != null){
				responseHeader = new ResponseHeader(true,ExceptCodeConstants.SUCCESS,"插入成功");
				response.setResponseHeader(responseHeader);
		        return response;
			} else {
				
				response = new YCInsertUserResponse();
				responseHeader = new ResponseHeader(false,ExceptCodeConstants.FAILD,"传入不支持注册类型，注册失败");
				response.setResponseHeader(responseHeader);
		        return response;
			}
		}catch(BusinessException e){
			// 这里不应回滚
			LOGGER.error("插入失败",e);
			YCInsertUserResponse response = new YCInsertUserResponse();
			responseHeader = new ResponseHeader(false,e.getErrorCode(),e.getErrorMessage());
			response.setResponseHeader(responseHeader);
	        return response;
		}
	}

	@Override
	public YCUpdateUserResponse updateYCUserInfo(UpdateYCUserRequest updateUserParams){
		LOGGER.debug("updateYCUserInfo input params:", updateUserParams);
		ResponseHeader responseHeader;
		YCUpdateUserResponse response = new YCUpdateUserResponse();
		try{
			ycUsrServiceBusiSv.updateUserInfo(updateUserParams);
			responseHeader = new ResponseHeader(true,ExceptCodeConstants.SUCCESS,"插入成功");
			response.setResponseCode(ExceptCodeConstants.SUCCESS);
		}catch(BusinessException e){
			LOGGER.error("修改失败",e);
			responseHeader = new ResponseHeader(false,ExceptCodeConstants.FAILD,e.getErrorMessage());
		}
		response.setResponseHeader(responseHeader);
        return response;
	}

	

	@Override
	public YCUserInfoResponse searchYCUserInfo(SearchYCUserRequest userId){
		LOGGER.debug("searchYCUserInfo input params:", userId);
		ResponseHeader responseHeader;
		YCUserInfoResponse result = new YCUserInfoResponse() ;
		try{
			result = ycUsrServiceBusiSv.searchUserInfo(userId.getUserId());
			responseHeader = new ResponseHeader(true,ExceptCodeConstants.SUCCESS,"查询成功");
		}catch(BusinessException e){
			LOGGER.error("修改失败",e);
			responseHeader = new ResponseHeader(false,ExceptCodeConstants.FAILD,e.getErrorMessage());
		}

		result.setResponseHeader(responseHeader);
        return result;
	}

	@Override
	public YCContactInfoResponse searchYCContactInfo(SearchYCContactRequest cUsrId) {
		LOGGER.debug("searchYCContactInfo input params:", cUsrId);
		
		List<UsrContact> usrContact = null;
		ResponseHeader responseHeader;
		YCContactInfoResponse result = new YCContactInfoResponse();
		try{
			usrContact = ycUsrServiceBusiSv.searchUsrContactInfo(cUsrId.getUserId());
			responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "查询成功");
			result.setUsrContactList(changUsrContactToUsrContactMessage(usrContact));
			result.setResponseCode(ExceptCodeConstants.SUCCESS);
		}catch(BusinessException e){
			LOGGER.error("修改失败",e);
			responseHeader = new ResponseHeader(false,ExceptCodeConstants.FAILD,e.getErrorMessage());
		}
		
		result.setResponseHeader(responseHeader);
		return result;
	}
	
	private List<UsrContactMessage> changUsrContactToUsrContactMessage(List<UsrContact> usrContactList) {
		Gson g = new Gson();
		Type type = new TypeToken<List<UsrContactMessage>>(){}.getType();
		return g.fromJson(g.toJson(usrContactList), type);
	}

	@Override
	@POST
	@Path("/searchUserInfoByNickName")
	public YCUserInfoResponse searchUserInfoByNickName(String nickName) {
		LOGGER.debug("searchUserInfoByNickName input params:",nickName);
		ResponseHeader responseHeader;
		YCUserInfoResponse result = new YCUserInfoResponse();
		try{
			UsrUser usruser = ycUsrServiceBusiSv.searchuserInfoByNickName(nickName);
			if(null != usruser)
			{
				BeanUtils.copyProperties(result, usruser);
			}
			responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "查询成功");
		}catch(BusinessException e){
			LOGGER.error("查询失败",e);
			responseHeader = new ResponseHeader(false, ExceptCodeConstants.FAILD, e.getErrorMessage());
		}
		result.setResponseHeader(responseHeader);
		return result;
	}

	@Override
	public YCInsertContactResponse insertYCContact(InsertYCContactRequest creq) {
		LOGGER.debug("insertYCContact input params:", creq);
		ResponseHeader responseHeader;
		try{
			YCInsertContactResponse response = ycUsrServiceBusiSv.insertContactInfo(creq);
			if(response != null){
				responseHeader = new ResponseHeader(true,ExceptCodeConstants.SUCCESS,"插入成功");
				response.setResponseHeader(responseHeader);
		        return response;
			} else {
				response = new YCInsertContactResponse();
				responseHeader = new ResponseHeader(false,ExceptCodeConstants.FAILD,"插入失败");
				response.setResponseHeader(responseHeader);
		        return response;
			}
		}catch(BusinessException e){
			LOGGER.error("插入失败",e);
			YCInsertContactResponse response = new YCInsertContactResponse();
			responseHeader = new ResponseHeader(false,ExceptCodeConstants.FAILD,e.getErrorMessage());
			response.setResponseHeader(responseHeader);
	        return response;
		}
	}

	@Override
	@POST
	@Path("/getAllUserInfo")
	public List<YCUserInfoResponse> getAllUserInfo() {
		return ycUsrServiceBusiSv.getAllUserInfo();
	}

	@Override
	@POST
	@Path("/completeUserInfo")
	public BaseResponse completeUserInfo(CompleteUserInfoRequest request) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ResponseHeader responseHeader = null;
		BaseResponse response = new BaseResponse();
		try {
			YCUserInfoResponse userInfoResponse = ycUsrServiceBusiSv.searchUserInfo(request.getUserId());
			conn = DataSourceUtil.getConnection();
			String sql ="";			
			sql="select PK_USER,LASTNAME, FIRSTNAME,SEX, BIRTHDAY,TELEPHONE, MOBILE_PHONE, ADDRESS, CITY,PROVINCE, COUNTRY,REGIST_TIME,LAST_MODIFY_TIME,QQ,NICKNAME  from t_user where PK_USER=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, request.getUserId());
			rs = ps.executeQuery();
			if (rs.next()) {
				String lastname=rs.getString("LASTNAME");	
				String firstname=rs.getString("FIRSTNAME");	
				int sex = rs.getInt("SEX");
				String birthday = rs.getString("BIRTHDAY");
				String telephone = rs.getString("TELEPHONE");
				String mobilePhone = rs.getString("MOBILE_PHONE");
				String address = rs.getString("ADDRESS");
				String city = rs.getString("CITY");
				String province = rs.getString("PROVINCE");
				String country = rs.getString("COUNTRY");
				Timestamp registTime = DateUtil.getTimestamp(DateUtil.getDateString(rs.getDate("REGIST_TIME"), "yyyy-MM-dd HH:mm:ss"));
				Timestamp lastModifyTime = DateUtil.getTimestamp(DateUtil.getDateString(rs.getDate("LAST_MODIFY_TIME"),"yyyy-MM-dd HH:mm:ss"));
				String qq = rs.getString("QQ");
				String nickName = rs.getString("NICKNAME");
				Timestamp dateBirthday = null;
				if(birthday!=""&&birthday!=null&&birthday.contains("-")){
					birthday = birthday+" 00:00:00";
					dateBirthday = DateUtil.getTimestamp(birthday);
					request.setBirthday(dateBirthday);
				}
				request.setAddress(address);
				request.setFirstName(firstname);
				request.setLastName(lastname);
				request.setTelephone(telephone);
				request.setMobilePhone(mobilePhone);
				request.setSex(sex);
				request.setQq(qq);
				request.setNickName(nickName);
				request.setRegisterTime(registTime);
				request.setLastModifyTime(lastModifyTime);
				/**
				 * 如果在译云3.0数据库中存在此数据则更新，不存在则插入
				 */
				if(userInfoResponse!=null&&userInfoResponse.getUserId()!=null&&!"".equals(userInfoResponse.getUserId())){
					UpdateYCUserRequest updateUserRequest = new UpdateYCUserRequest();
					updateUserRequest.setUserId(request.getUserId());
					updateUserRequest.setAddress(address);
					updateUserRequest.setSex(sex);
					updateUserRequest.setAddress(address);
					updateUserRequest.setFirstname(firstname);
					updateUserRequest.setLastname(lastname);
					updateUserRequest.setTelephone(telephone);
					updateUserRequest.setMobilePhone(mobilePhone);
					updateUserRequest.setSex(sex);
					updateUserRequest.setQq(qq);
					updateUserRequest.setNickname(nickName);
					updateUserRequest.setRegisterTime(registTime);
					updateUserRequest.setLastModifyTime(lastModifyTime);
					updateUserRequest.setBirthday(dateBirthday);
					ycUsrServiceBusiSv.updateUserInfo(updateUserRequest);
				}else{
					 ycUsrServiceBusiSv.completeUserInfo(request);
				}
				responseHeader = new ResponseHeader(true,ExceptCodeConstants.SUCCESS,"补全信息成功");
				response.setResponseHeader(responseHeader);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			responseHeader = new ResponseHeader(false,ExceptCodeConstants.FAILD,"补全信息失败");
			response.setResponseHeader(responseHeader);
		}finally {
			DataSourceUtil.free(rs, ps, conn);
		}	
		/**
		 * 如果response中的responseHeader为空表示从t_user表中没有查询到数据
		 */
		return response;
	}

}
