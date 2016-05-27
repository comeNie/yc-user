package com.ai.slp.user.api.ucuserphonebooks.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.user.api.ucuserphonebooks.param.UcTelGroupMantainReq;
import com.ai.slp.user.api.ucuserphonebooks.param.UcTelGroupQueryReq;
import com.ai.slp.user.api.ucuserphonebooks.param.UcTelGroupQueryResp;
import com.ai.slp.user.api.ucuserphonebooks.param.UcUserPhonebooksBatchAddReq;
import com.ai.slp.user.api.ucuserphonebooks.param.UcUserPhonebooksBatchDeleteReq;
import com.ai.slp.user.api.ucuserphonebooks.param.UcUserPhonebooksModifyReq;
import com.ai.slp.user.api.ucuserphonebooks.param.UcUserPhonebooksQueryReq;
import com.ai.slp.user.api.ucuserphonebooks.param.UserPhonebook;

public interface IUserPhoneBooksSV {

    @interface AddUcTelGroup {
    }

    @interface ModifyUcTelGroup {
    }

    @interface DeleteUcTelGroup {
    }

    @interface GetUcTelGroups {

    }

    /**
     * 增加通信录分组
     * 
     * @param req
     * @throws BusinessException
     * @throws SystemException
     * @author zhangchao
     */
    BaseResponse addUcTelGroup(UcTelGroupMantainReq req) throws BusinessException, SystemException;

    /**
     * 修改通信录分组
     * 
     * @param req
     * @throws BusinessException
     * @throws SystemException
     * @author zhangchao
     */
    BaseResponse modifyUcTelGroup(UcTelGroupMantainReq req) throws BusinessException,
            SystemException;

    /**
     * 修改通信录分组
     * 
     * @param req
     * @throws BusinessException
     * @throws SystemException
     * @author zhangchao
     */
    BaseResponse deleteUcTelGroup(UcTelGroupMantainReq req) throws BusinessException,
            SystemException;

    /**
     * 获取用户通信录列表
     * 
     * @param req
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangchao
     */
    UcTelGroupQueryResp getUcTelGroups(UcTelGroupQueryReq req) throws BusinessException,
            SystemException;

    /**
     * 获取通信录分页信息
     * 
     * @param req
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangchao
     */
    PageInfo<UserPhonebook> queryUserPhonebooks(UcUserPhonebooksQueryReq req)
            throws BusinessException, SystemException;

    /**
     * 修改单个用户通信录记录
     * 
     * @param req
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangchao
     */
    BaseResponse modifyUserPhonebook(UcUserPhonebooksModifyReq req) throws BusinessException,
            SystemException;

    /**
     * 批量添加或导入用户通信录
     * 
     * @param req
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangchao
     */
    BaseResponse batchAddUserPhonebooks(UcUserPhonebooksBatchAddReq req) throws BusinessException,
            SystemException;

    /**
     * 批量删除用户通信录记录
     * 
     * @param req
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhangchao
     */
    BaseResponse batchDeleteUserPhonebooks(UcUserPhonebooksBatchDeleteReq req)
            throws BusinessException, SystemException;

}
