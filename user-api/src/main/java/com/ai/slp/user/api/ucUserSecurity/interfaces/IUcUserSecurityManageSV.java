package com.ai.slp.user.api.ucUserSecurity.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.slp.user.api.ucUserSecurity.param.UcUserEmailRequest;
import com.ai.slp.user.api.ucUserSecurity.param.UcUserPasswordRequest;
import com.ai.slp.user.api.ucUserSecurity.param.UcUserPhoneRequest;
import com.ai.slp.user.api.ucUserSecurity.param.UpdatePasswordRequest;

public interface IUcUserSecurityManageSV {

    /**
     * 设置邮箱
     * 
     * @param emailModifyRequest
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author jiaxs
     * @ApiDocMethod
     * @ApiCode UAC_0007
     */
    BaseResponse setEmailData(UcUserEmailRequest emailModifyRequest)
            throws BusinessException, SystemException;

    /**
     * 设置密码
     * 
     * @param emailModifyRequest
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author jiaxs
     * @ApiDocMethod
     * @ApiCode UAC_0008
     */
    BaseResponse setPasswordData(UcUserPasswordRequest passwordModifyRequest)
            throws BusinessException, SystemException;

    /**
     * 根据账户信息更新密码
     * 
     * @param updatePasswordRequest
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangqiang7
     * @ApiCode UAC_0011
     */
    BaseResponse updatePassword(UpdatePasswordRequest updatePasswordRequest)
            throws BusinessException, SystemException;

    /**
     * 设置手机号
     * 
     * @param phoneModifyRequest
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author jiaxs
     * @ApiDocMethod
     * @ApiCode UAC_0009
     */
    BaseResponse setPhoneData(UcUserPhoneRequest phoneModifyRequest)
            throws BusinessException, SystemException;
}
