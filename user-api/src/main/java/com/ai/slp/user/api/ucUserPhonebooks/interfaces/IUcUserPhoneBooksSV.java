package com.ai.slp.user.api.ucUserPhonebooks.interfaces;

import java.util.List;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.user.api.ucUserPhonebooks.param.PhoneBooksParamsRequest;

public interface IUcUserPhoneBooksSV {
	
	@interface ContactsManuallyInfo{}
	/**
	 * 
	 * 通讯录手动新增  </br>
	 * @param contacts
	 * @return
	 * @author zhangyuehong
	 * @ApiDocMethod
	 */
	public BaseResponse contactsManuallyInfo(PhoneBooksParamsRequest contactsGroup);
	
	
	@interface ContactExportInfo{}
	
	/**
	 * 
	 * 通讯录导入   </br>
	 * @param filePath
	 * @return
	 * @author zhangyuehong
	 * @ApiDocMethod
	 */
	public BaseResponse contactsImportInfo(String filePath);
	
	
	@interface UpdateContactsInfo{}
	
	/**
	 * 
	 * 通讯录修改  </br>
	 * @param contactsGroup
	 * @return
	 * @author zhangyuehong
	 * @ApiDocMethod
	 */
	public BaseResponse updateContactsInfo(PhoneBooksParamsRequest contactsGroup);

	@interface DeleteContactsInfo{}
	
	/**
	 * 
	 * 删除通讯录信息  </br>
	 * @param telNo
	 * @return
	 * @author zhangyuehong
	 * @ApiDocMethod
	 */
	public BaseResponse deleteContactsInfo(String telNo);
	
	@interface ExportContacts{}; 
	
	/**
	 * 
	 *  导出联系人  </br>
	 * @param filepath
	 * @return
	 * @author zhangyuehong
	 * @ApiDocMethod
	 */
	
	public BaseResponse exportContacts(String filepath);
	
	@interface GetContactsInfo{}
	
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
	public List<PhoneBooksParamsRequest> getTelInfo(PhoneBooksParamsRequest contactsGroup,int startPage,int limit);
	
	
	@interface GetAllContactsInfo{}
	/**
	 * 显示某个通讯录组中的所有联系人
	 * @param contactsGroupId
	 * @return
	 * @author zhangyh7
	 * @ApiDocMethod
	 */
	
	PageInfo<PhoneBooksParamsRequest> getAllContactsInfo(String contactsGroupId);
	
	
}
