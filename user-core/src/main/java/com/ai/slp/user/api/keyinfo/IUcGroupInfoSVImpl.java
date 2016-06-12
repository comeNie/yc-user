package com.ai.slp.user.api.keyinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.constants.ExceptCodeConstants;
import com.ai.slp.user.api.keyinfo.interfaces.IUcGroupKeyInfoSV;
import com.ai.slp.user.api.keyinfo.param.InsertGroupKeyInfoRequest;
import com.ai.slp.user.api.keyinfo.param.SearchGroupKeyInfoRequest;
import com.ai.slp.user.api.keyinfo.param.SearchGroupKeyInfoResponse;
import com.ai.slp.user.api.keyinfo.param.UpdateGroupKeyInfoRequest;
import com.ai.slp.user.service.business.interfaces.IUcGroupKeyInfoBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

@Service
@Component
public class IUcGroupInfoSVImpl implements IUcGroupKeyInfoSV {

    @Autowired
    private IUcGroupKeyInfoBusiSV ucGroupKeyInfoBusiSV;
    
    @Override
    public BaseResponse insertGroupKeyInfo(InsertGroupKeyInfoRequest request)
            throws SystemException, BusinessException {
        BaseResponse response = new BaseResponse();
        ResponseHeader responseHeader = null;
        try{
        ucGroupKeyInfoBusiSV.insertGroupKeyInfo(request);
        responseHeader = new ResponseHeader(true, ExceptCodeConstants.Special.SUCCESS, "操作成功");
        }catch(Exception e){
            responseHeader = new ResponseHeader(false, ExceptCodeConstants.Special.SYSTEM_ERROR, "操作失败");
        }
        response.setResponseHeader(responseHeader);
        return response;
        
    }

    @Override
    public BaseResponse updateGroupKeyInfo(UpdateGroupKeyInfoRequest request)
            throws SystemException, BusinessException {
        BaseResponse response = new BaseResponse();
        ResponseHeader responseHeader =null;
        try{
        ucGroupKeyInfoBusiSV.updateGroupKeyInfo(request);
        responseHeader = new ResponseHeader(true, ExceptCodeConstants.Special.SUCCESS, "操作成功");
        }catch(Exception e){
            responseHeader = new ResponseHeader(false, ExceptCodeConstants.Special.SYSTEM_ERROR, "操作失败");
        }
        response.setResponseHeader(responseHeader);
        return response;
    }

    @Override
    public SearchGroupKeyInfoResponse searchGroupKeyInfo(SearchGroupKeyInfoRequest request)
            throws SystemException, BusinessException {
        ResponseHeader responseHeader =null;
        SearchGroupKeyInfoResponse response = new SearchGroupKeyInfoResponse();
        try{
            ucGroupKeyInfoBusiSV.searchGroupKeyInfo(request);
            responseHeader = new ResponseHeader(true, ExceptCodeConstants.Special.SUCCESS, "操作成功");
        }catch(Exception e){
            responseHeader = new ResponseHeader(false, ExceptCodeConstants.Special.SYSTEM_ERROR, "操作失败");
        }
        response.setResponseHeader(responseHeader);
        return response;
    }

}
