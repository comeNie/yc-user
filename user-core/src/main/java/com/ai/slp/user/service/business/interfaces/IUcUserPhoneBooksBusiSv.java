package com.ai.slp.user.service.business.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.slp.user.api.ucUserPhonebooks.param.UcPhoneBooksParamsRequest;
import com.ai.slp.user.api.ucUserPhonebooks.param.UcPhoneBooksParamsResponse;

public interface IUcUserPhoneBooksBusiSv {
    
    public BaseResponse phoneBooksManuallyInfo(UcPhoneBooksParamsRequest contactsGroup)throws BusinessException, SystemException;
    
    public BaseResponse phoneBooksImportCvsInfo(String filePath)throws BusinessException, SystemException;
    
    public BaseResponse phoneBooksImportXlsInfo(String filePath)throws BusinessException, SystemException;
    
    public BaseResponse phoneBooksImportXlsxInfo(String filePath)throws BusinessException, SystemException;
    
    public BaseResponse updatePhoneBooksInfo(UcPhoneBooksParamsRequest contactsGroup)throws BusinessException, SystemException;
    
    public BaseResponse deletePhoneBooksInfo(String telNo)throws BusinessException, SystemException;
    
    public BaseResponse exportPhoneBooks(String filepath)throws BusinessException, SystemException;
    
    public UcPhoneBooksParamsResponse getPhoneBooksInfo(UcPhoneBooksParamsRequest telGroup,int startPage,int limit)throws BusinessException, SystemException;
    
    BaseResponse DownloadPhoneBooksTemplate(String path)throws BusinessException, SystemException;
    
    public UcPhoneBooksParamsResponse GetAllPhoneBooksInfo(String contactsGroupId)throws BusinessException, SystemException;
    
    public UcPhoneBooksParamsResponse getAllPhoneBooksInfo(UcPhoneBooksParamsRequest telGroup)throws BusinessException, SystemException;
}
