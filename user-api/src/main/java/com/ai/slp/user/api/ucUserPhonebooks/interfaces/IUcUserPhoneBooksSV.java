package com.ai.slp.user.api.ucUserPhonebooks.interfaces;


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
	public BaseResponse phoneBooksManuallyInfo(UcPhoneBooksParamsRequest contactsGroup);
	
	
	@interface PhoneBooksImportCvsInfo{}
	
	/**
	 * 
	 * 通讯录导入   </br>
	 * @param filePath
	 * @return
	 * @author zhangyuehong
	 * @ApiDocMethod
	 */
	public BaseResponse phoneBooksImportCvsInfo(String filePath);
	
    @interface PhoneBooksImportXlsInfo{}
        
        /**
         * 
         * 通讯录导入   </br>
         * @param filePath
         * @return
         * @author zhangyuehong
         * @ApiDocMethod
         */
    public BaseResponse phoneBooksImportXlsInfo(String filePath);
        
    @interface PhoneBooksImportXlsxInfo{}
    
    /**
     * 
     * 通讯录导入   </br>
     * @param filePath
     * @return
     * @author zhangyuehong
     * @ApiDocMethod
     */
    public BaseResponse phoneBooksImportXlsxInfo(String filePath);
    
	
	@interface UpdatePhoneBooksInfo{}
	
	/**
	 * 
	 * 通讯录修改  </br>
	 * @param contactsGroup
	 * @return
	 * @author zhangyuehong
	 * @ApiDocMethod
	 */
	public BaseResponse updatePhoneBooksInfo(UcPhoneBooksParamsRequest contactsGroup);

	@interface DeleteContactsInfo{}
	
	/**
	 * 
	 * 删除通讯录信息  </br>
	 * @param telNo
	 * @return
	 * @author zhangyuehong
	 * @ApiDocMethod
	 */
	public BaseResponse deletePhoneBooksInfo(String telNo);
	
	@interface ExportContacts{}; 
	
	/**
	 * 
	 *  导出联系人  </br>
	 * @param filepath
	 * @return
	 * @author zhangyuehong
	 * @ApiDocMethod
	 */
	
	public BaseResponse exportPhoneBooks(String filepath);
	
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
	public UcPhoneBooksParamsResponse getPhoneBooksInfo(UcPhoneBooksParamsRequest telGroup,int startPage,int limit);
	
	
	@interface GetAllPhoneBooksInfo{}
	/**
	 * 显示某个通讯录组中的所有联系人
	 * @param contactsGroupId
	 * @return
	 * @author zhangyh7
	 * @ApiDocMethod
	 */
	
	UcPhoneBooksParamsResponse GetAllPhoneBooksInfo(UcPhoneBooksParamsRequest phoneBookId);
	
	
	@interface DownloadPhoneBooksTemplate{}
	
	BaseResponse DownloadPhoneBooksTemplate(String path);
}
