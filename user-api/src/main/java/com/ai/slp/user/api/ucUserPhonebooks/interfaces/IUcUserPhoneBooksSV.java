package com.ai.slp.user.api.ucUserPhonebooks.interfaces;


import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.user.api.ucUserPhonebooks.param.UcPhoneBooksParamsRequest;
import com.ai.slp.user.api.ucUserPhonebooks.param.UcPhoneBooksParamsResponse;

public interface IUcUserPhoneBooksSV {
	
	@interface PhoneBooksManuallyInfo{}
	/**
	 * 
	 * 通讯录手动新增  </br>
	 * @param contacts
	 * @return
	 * @author zhangyuehong
	 * @ApiDocMethod
	 */
	public BaseResponse phoneBooksManuallyInfo(UcPhoneBooksParamsRequest contactsGroup) throws BusinessException, SystemException;
	
	
	@interface PhoneBooksImportCvsInfo{}
	
	/**
	 * 
	 * 通讯录导入   </br>
	 * @param filePath
	 * @return
	 * @author zhangyuehong
	 * @ApiDocMethod
	 */
	public BaseResponse phoneBooksImportCvsInfo(String filePath) throws BusinessException, SystemException;
	
    @interface PhoneBooksImportXlsInfo{}
        
        /**
         * 
         * 通讯录导入   </br>
         * @param filePath
         * @return
         * @author zhangyuehong
         * @ApiDocMethod
         */
    public BaseResponse phoneBooksImportXlsInfo(String filePath) throws BusinessException, SystemException;
        
    @interface PhoneBooksImportXlsxInfo{}
    
    /**
     * 
     * 通讯录导入   </br>
     * @param filePath
     * @return
     * @author zhangyuehong
     * @ApiDocMethod
     */
    public BaseResponse phoneBooksImportXlsxInfo(String filePath) throws BusinessException, SystemException;
    
	
	@interface UpdatePhoneBooksInfo{}
	
	/**
	 * 
	 * 通讯录修改  </br>
	 * @param contactsGroup
	 * @return
	 * @author zhangyuehong
	 * @ApiDocMethod
	 */
	public BaseResponse updatePhoneBooksInfo(UcPhoneBooksParamsRequest contactsGroup) throws BusinessException, SystemException;

	@interface DeleteContactsInfo{}
	
	/**
	 * 
	 * 删除通讯录信息  </br>
	 * @param telNo
	 * @return
	 * @author zhangyuehong
	 * @ApiDocMethod
	 */
	public BaseResponse deletePhoneBooksInfo(String telNo) throws BusinessException, SystemException;
	
	@interface ExportContacts{}; 
	
	/**
	 * 
	 *  导出联系人  </br>
	 * @param filepath
	 * @return
	 * @author zhangyuehong
	 * @ApiDocMethod
	 */
	
	public BaseResponse exportPhoneBooks(String filepath) throws BusinessException, SystemException;
	
	@interface GetPhoneBooksInfo{}
	
	/**
	 * 
	 * 通讯录查看  </br>   </br>
	 * @param telGroupId
	 * @param provinceCode
	 * @param basicOrgId
	 * @param telNameOrTelMp
	 * @return
	 * @author zhangyuehong
	 * @ApiDocMethod
	 */
	public UcPhoneBooksParamsResponse getPhoneBooksInfo(UcPhoneBooksParamsRequest telGroup,int startPage,int limit) throws BusinessException, SystemException;
	
	
	@interface GetAllPhoneBooksInfo{}
	/**
	 * 显示某个通讯录组中的所有联系人
	 * @param contactsGroupId
	 * @return
	 * @author zhangyh7
	 * @ApiDocMethod
	 */
	
	UcPhoneBooksParamsResponse GetAllPhoneBooksInfo(UcPhoneBooksParamsRequest phoneBookId) throws BusinessException, SystemException;
	
	
	@interface DownloadPhoneBooksTemplate{}
	/**
	 * 下载通讯录模板
	 * @param path
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author zhangyh7
	 * @ApiDocMethod
	 */
	BaseResponse DownloadPhoneBooksTemplate(String path) throws BusinessException, SystemException;
}
