package com.ai.slp.user.service.business.interfaces;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.user.api.ucUserPhonebooks.param.UcPhoneBooksParamsRequest;
import com.ai.slp.user.api.ucUserPhonebooks.param.UcPhoneBooksParamsResponse;

public interface IUcUserPhoneBooksBusiSv {
    
    public BaseResponse phoneBooksManuallyInfo(UcPhoneBooksParamsRequest contactsGroup);
    
    public BaseResponse phoneBooksImportCvsInfo(String filePath);
    
    public BaseResponse phoneBooksImportXlsInfo(String filePath);
    
    public BaseResponse phoneBooksImportXlsxInfo(String filePath);
    
    public BaseResponse updatePhoneBooksInfo(UcPhoneBooksParamsRequest contactsGroup);
    
    public BaseResponse deletePhoneBooksInfo(String telNo);
    
    public BaseResponse exportPhoneBooks(String filepath);
    
    public UcPhoneBooksParamsResponse getPhoneBooksInfo(UcPhoneBooksParamsRequest telGroup,int startPage,int limit);
    
    BaseResponse DownloadPhoneBooksTemplate(String path);
    
    public UcPhoneBooksParamsResponse GetAllPhoneBooksInfo(String contactsGroupId);
    
    public UcPhoneBooksParamsResponse getAllPhoneBooksInfo(UcPhoneBooksParamsRequest telGroup);
}
