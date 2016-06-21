package com.ai.slp.user.service.business.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.user.api.keyinfo.param.InsertCustFileExtRequest;
import com.ai.slp.user.api.keyinfo.param.InsertGroupKeyInfoRequest;
import com.ai.slp.user.api.keyinfo.param.QueryCustFileExtRequest;
import com.ai.slp.user.api.keyinfo.param.QueryCustFileExtResponse;
import com.ai.slp.user.api.keyinfo.param.SearchGroupKeyInfoRequest;
import com.ai.slp.user.api.keyinfo.param.SearchGroupKeyInfoResponse;
import com.ai.slp.user.api.keyinfo.param.UpdateGroupKeyInfoRequest;

public interface IUcGroupKeyInfoBusiSV {

    public int insertGroupKeyInfo(InsertGroupKeyInfoRequest request)
            throws SystemException, BusinessException;
    
    public int updateGroupKeyInfo(UpdateGroupKeyInfoRequest request)
            throws SystemException, BusinessException;
    
    public SearchGroupKeyInfoResponse searchGroupKeyInfo(SearchGroupKeyInfoRequest request)
            throws SystemException, BusinessException;
    
    public int insertCustFileExt(InsertCustFileExtRequest request)
            throws SystemException, BusinessException;
    
    QueryCustFileExtResponse QueryCustFileExt(QueryCustFileExtRequest request)
            throws SystemException, BusinessException;
}
