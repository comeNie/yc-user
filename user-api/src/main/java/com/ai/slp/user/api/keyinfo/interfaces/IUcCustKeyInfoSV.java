package com.ai.slp.user.api.keyinfo.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.slp.user.api.keyinfo.param.InsertCustKeyInfoRequest;
import com.ai.slp.user.api.keyinfo.param.SearchCustKeyInfoRequest;
import com.ai.slp.user.api.keyinfo.param.SearchCustKeyInfoResponse;
import com.ai.slp.user.api.keyinfo.param.UpdateCustKeyInfoRequest;

public interface IUcCustKeyInfoSV {

    @interface insertCustKeyInfo {
    }

    /**
     * 保存个人关键信息
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
     * @param request
     * @return
     * @throws SystemException
     * @throws BusinessException
     * @author zhangqiang7
     * @ApiCode USER_100002
     */
    public SearchCustKeyInfoResponse searchCustKeyInfo(SearchCustKeyInfoRequest request)
            throws SystemException, BusinessException;
}
