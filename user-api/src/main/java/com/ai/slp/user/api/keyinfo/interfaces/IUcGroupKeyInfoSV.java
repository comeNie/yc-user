package com.ai.slp.user.api.keyinfo.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.slp.user.api.keyinfo.param.InsertGroupKeyInfoRequest;
import com.ai.slp.user.api.keyinfo.param.SearchGroupKeyInfoRequest;
import com.ai.slp.user.api.keyinfo.param.SearchGroupKeyInfoResponse;
import com.ai.slp.user.api.keyinfo.param.UpdateGroupKeyInfoRequest;

public interface IUcGroupKeyInfoSV {

    @interface insertGroupKeyInfo {
    }

    /**
     * 保存企业关键信息
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
     * 更新企业关键信息
     * @param request
     * @return
     * @throws SystemException
     * @throws BusinessException
     * @author zhangqiang7
     * @ApiCode USER_100002
     */
    public SearchGroupKeyInfoResponse searchGroupKeyInfo(SearchGroupKeyInfoRequest request)
            throws SystemException, BusinessException;
}
