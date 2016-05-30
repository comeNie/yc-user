package com.ai.slp.user.api.ucuser.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.DateUtil;
import com.ai.slp.user.api.ucuser.intefaces.IUcUserSV;
import com.ai.slp.user.api.ucuser.param.SearchUserListResponse;
import com.ai.slp.user.api.ucuser.param.SearchUserRequest;
import com.ai.slp.user.api.ucuser.param.SearchUserResponse;
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
        
        UcUser ucuser = ucUserBusiSV.queryByPhone(request.getUserMp());
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
        
        UcUser ucuser = ucUserBusiSV.queryByEmail(request.getUserEmail());
        // 整理返回对象
        SearchUserResponse response = new SearchUserResponse();
        ResponseHeader responseHeader = new ResponseHeader();
        if (ucuser != null) {
            BeanUtils.copyProperties(response, ucuser);
            responseHeader = new ResponseHeader(true, ExceptCodeConstants.SUCCESS, "数据查询成功");
        }else{
            responseHeader = new ResponseHeader(false, ExceptCodeConstants.NO_RESULT, "数据不存在");
        }
        response.setResponseHeader(responseHeader);
        return response;
    }

    @Override
    public SearchUserResponse queryBaseInfo(SearchUserRequest accountQueryRequest)
            throws BusinessException, SystemException {
        UcUser ucuser = ucUserBusiSV.queryBaseInfo(accountQueryRequest.getUserId());
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
    public BaseResponse updateBaseInfo(SearchUserRequest accountQueryRequest)
            throws BusinessException, SystemException {
        
        
            UcUserCriteria criteria = new UcUserCriteria();
            criteria.or().andUserIdEqualTo(accountQueryRequest.getUserId());
            // 数据库操作
            UcUser gnAccount = new UcUser();
            BeanUtils.copyProperties(gnAccount, accountQueryRequest);
            gnAccount.setUpdateTime(DateUtil.getSysDate());
            int updateCount = ucUserBusiSV.updateByAccountId(gnAccount,criteria);
            // 整理返回对象
            ResponseHeader responseHeader = new ResponseHeader();
            if (updateCount > 0) {
                responseHeader.setIsSuccess(true);
                responseHeader.setResultCode(ExceptCodeConstants.SUCCESS);
                responseHeader.setResultMessage("数据更新成功");
            } else {
                responseHeader.setIsSuccess(false);
                responseHeader.setResultCode(ExceptCodeConstants.FAILD);
                responseHeader.setResultMessage("数据库查询失败");
            }
            BaseResponse baseResponse = new BaseResponse();
            baseResponse.setResponseHeader(responseHeader);
            return baseResponse;
    }
}
