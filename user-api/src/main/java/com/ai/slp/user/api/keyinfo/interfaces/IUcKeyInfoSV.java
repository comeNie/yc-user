package com.ai.slp.user.api.keyinfo.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.slp.user.api.keyinfo.param.InsertCustFileExtRequest;
import com.ai.slp.user.api.keyinfo.param.InsertCustKeyInfoRequest;
import com.ai.slp.user.api.keyinfo.param.InsertGroupKeyInfoRequest;
import com.ai.slp.user.api.keyinfo.param.QueryCustFileExtRequest;
import com.ai.slp.user.api.keyinfo.param.QueryCustFileExtResponse;
import com.ai.slp.user.api.keyinfo.param.SearchCustKeyInfoRequest;
import com.ai.slp.user.api.keyinfo.param.SearchCustKeyInfoResponse;
import com.ai.slp.user.api.keyinfo.param.SearchGroupKeyInfoRequest;
import com.ai.slp.user.api.keyinfo.param.SearchGroupKeyInfoResponse;
import com.ai.slp.user.api.keyinfo.param.UpdateCustKeyInfoRequest;
import com.ai.slp.user.api.keyinfo.param.UpdateGroupKeyInfoRequest;

public interface IUcKeyInfoSV {

    @interface insertCustKeyInfo {
    }

    /**
     * 保存个人关键信息
     * 
     * @param request
     * @return
     * @throws SystemException
     * @throws BusinessException
     * @author zhangqiang7
     * @ApiCode USER_100001
     */
    public BaseResponse insertCustKeyInfo(InsertCustKeyInfoRequest request)
            throws SystemException, BusinessException;

    @interface UpdateCustKeyInfo {
    }

    /**
     * 更新个人关键信息
     * 
     * @param request
     * @return
     * @throws SystemException
     * @throws BusinessException
     * @author zhangqiang7
     * @ApiCode USER_100002
     */
    public BaseResponse updateCustKeyInfo(UpdateCustKeyInfoRequest request)
            throws SystemException, BusinessException;

    @interface SearchCustKeyInfo {
    }

    /**
     * 更新个人关键信息
     * 
     * @param request
     * @return
     * @throws SystemException
     * @throws BusinessException
     * @author zhangqiang7
     * @ApiCode USER_100002
     */
    public SearchCustKeyInfoResponse searchCustKeyInfo(SearchCustKeyInfoRequest request)
            throws SystemException, BusinessException;

    @interface insertGroupKeyInfo {
    }

    /**
     * 保存企业关键信息
     * 
     * @param request
     * @return
     * @throws SystemException
     * @throws BusinessException
     * @author zhangqiang7
     * @ApiCode USER_100001
     */
    public BaseResponse insertGroupKeyInfo(InsertGroupKeyInfoRequest request)
            throws SystemException, BusinessException;

    @interface UpdateGroupKeyInfo {
    }

    /**
     * 更新企业关键信息
     * 
     * @param request
     * @return
     * @throws SystemException
     * @throws BusinessException
     * @author zhangqiang7
     * @ApiCode USER_100002
     */
    public BaseResponse updateGroupKeyInfo(UpdateGroupKeyInfoRequest request)
            throws SystemException, BusinessException;

    @interface SearchGroupKeyInfo {
    }

    /**
     * 查询企业关键信息
     * 
     * @param request
     * @return
     * @throws SystemException
     * @throws BusinessException
     * @author zhangqiang7
     * @ApiCode USER_100003
     */
    public SearchGroupKeyInfoResponse searchGroupKeyInfo(SearchGroupKeyInfoRequest request)
            throws SystemException, BusinessException;
    
    @interface insertCustFileExt{}
    
    /**
     * 保存用户扩展信息
     * @param request
     * @return
     * @throws SystemException
     * @throws BusinessException
     * @author zhangqiang7
     * @ApiCode USER_100004
     */
    public BaseResponse insertCustFileExt(InsertCustFileExtRequest request)throws SystemException, BusinessException;
    
    
    /**
     * 查询用户扩展信息
     * @param request
     * @return
     * @throws SystemException
     * @throws BusinessException
     * @author zhangqiang7
     * @ApiCode USER_100005
     */
    public QueryCustFileExtResponse QueryCustFileExt(QueryCustFileExtRequest request)throws SystemException, BusinessException;

}
