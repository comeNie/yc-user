package com.ai.slp.user.api.ucuser.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.DateUtil;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.slp.user.api.ucuser.intefaces.IUcUserSV;
import com.ai.slp.user.api.ucuser.param.QueryBaseInfoRequest;
import com.ai.slp.user.api.ucuser.param.SearchUserListResponse;
import com.ai.slp.user.api.ucuser.param.SearchUserRequest;
import com.ai.slp.user.api.ucuser.param.SearchUserResponse;
import com.ai.slp.user.api.ucuser.param.UpdateUserInfoRequest;
import com.ai.slp.user.constants.ExceptCodeConstants;
import com.ai.slp.user.dao.mapper.bo.UcUser;
import com.ai.slp.user.dao.mapper.bo.UcUserCriteria;
import com.ai.slp.user.service.business.interfaces.IUcUserBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

@Component
@Service
public class UcUserSVImpl implements IUcUserSV {

    @Autowired
    private IUcUserBusiSV ucUserBusiSV;

    @Override
    public SearchUserListResponse searchUserList(SearchUserRequest userListRequest)
            throws BusinessException, SystemException {
        return ucUserBusiSV.searchUserList(userListRequest);
    }

    @Override
    public SearchUserResponse queryByPhone(SearchUserRequest request) throws BusinessException,
            SystemException {
        
        UcUser ucuser = ucUserBusiSV.queryByPhone(request);
        // 整理返回对象
        SearchUserResponse response = new SearchUserResponse();
        ResponseHeader responseHeader = new ResponseHeader();
        if (ucuser != null) {
            BeanUtils.copyProperties(response, ucuser);
            responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "数据查询成功");
        }else{
            responseHeader = new ResponseHeader(true, ExceptCodeConstants.NO_RESULT, "数据不存在");
        }
        response.setResponseHeader(responseHeader);
        return response;
    }

    @Override
    public SearchUserResponse queryByEmail(SearchUserRequest request) throws BusinessException,
            SystemException {
        
        UcUser ucUser = ucUserBusiSV.queryByEmail(request.getUserEmail());
        SearchUserResponse searchResponse = new SearchUserResponse();
        // 整理返回对象
        ResponseHeader responseHeader = new ResponseHeader();
        if(ucUser!=null){
            BeanUtils.copyProperties(searchResponse, ucUser);
            responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "查询成功");
        }else{
            responseHeader = new ResponseHeader(false, ExceptCodeConstants.NO_RESULT, "数据不存在");
        }
        searchResponse.setResponseHeader(responseHeader);
        return searchResponse;
    }

    @Override
    public SearchUserResponse queryBaseInfo(SearchUserRequest accountQueryRequest)
            throws BusinessException, SystemException {
        UcUserCriteria example = new UcUserCriteria();
        UcUserCriteria.Criteria criteria = example.or();
        if(!StringUtil.isBlank(accountQueryRequest.getUserId())){
            criteria.andUserIdEqualTo(accountQueryRequest.getUserId());
        }
        if(!StringUtil.isBlank(accountQueryRequest.getUserLoginName())){
            criteria.andUserLoginNameEqualTo(accountQueryRequest.getUserLoginName());
        }
        if(!StringUtil.isBlank(accountQueryRequest.getUserType())){
            criteria.andUserTypeEqualTo(accountQueryRequest.getUserType());
        }
        UcUser ucuser = ucUserBusiSV.queryBaseInfo(example);
        // 整理返回对象
        SearchUserResponse response = new SearchUserResponse();
        ResponseHeader responseHeader = new ResponseHeader();
        if (ucuser != null) {
            BeanUtils.copyProperties(response, ucuser);
            responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "数据查询成功");
        }else{
            responseHeader = new ResponseHeader(true, ExceptCodeConstants.NO_RESULT, "数据不存在");
        }
        response.setResponseHeader(responseHeader);
        return response;
    }

    @Override
    public BaseResponse updateBaseInfo(UpdateUserInfoRequest request)
            throws BusinessException, SystemException {
            UcUserCriteria example = new UcUserCriteria();
            UcUserCriteria.Criteria criteria = example.createCriteria();
            criteria.andTenantIdEqualTo(request.getTenantId());
            criteria.andUserIdEqualTo(request.getUserId());
            // 数据库操作
            UcUser gnAccount = new UcUser();
            BeanUtils.copyProperties(gnAccount, request);
            gnAccount.setUpdateTime(DateUtil.getSysDate());
            int updateCount = ucUserBusiSV.updateByAccountId(gnAccount,example);
            // 整理返回对象
            ResponseHeader responseHeader = new ResponseHeader();
            if (updateCount > 0) {
                responseHeader.setIsSuccess(true);
                responseHeader.setResultCode(ExceptCodeConstants.SUCCESS);
                responseHeader.setResultMessage("数据更新成功");
            } else {
                responseHeader.setIsSuccess(false);
                responseHeader.setResultCode(ExceptCodeConstants.FAILD);
                responseHeader.setResultMessage("数据更新失败");
            }
            BaseResponse baseResponse = new BaseResponse();
            baseResponse.setResponseHeader(responseHeader);
            return baseResponse;
    }

    @Override
    public SearchUserResponse queryByBaseInfo(QueryBaseInfoRequest request)
            throws BusinessException, SystemException {
        UcUser gnAcount = new UcUser();
        BeanUtils.copyProperties(gnAcount,request);
        SearchUserResponse response = new SearchUserResponse();
        UcUser ucUser = new UcUser();  
        ucUser = ucUserBusiSV.queryByBaseInfo(gnAcount);
        
        BeanUtils.copyProperties(response, ucUser);
        return response;
    }
}
