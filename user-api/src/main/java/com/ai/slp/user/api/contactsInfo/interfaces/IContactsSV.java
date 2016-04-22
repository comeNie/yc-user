package com.ai.slp.user.api.contactsInfo.interfaces;

import java.util.List;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.slp.user.api.ContactsGroupInfo.param.ContactsGroupParamsRequest;
import com.ai.slp.user.api.contactsInfo.param.ContactsParamsRequest;

public interface IContactsSV {
	
	@interface ContactsManuallyInfo{}
	/**
	 * 
	 * 通讯录手动新增  </br>
	 * @param contacts
	 * @return
	 * @author zhangyuehong
	 * @ApiDocMethod
	 */
	public BaseResponse contactsManuallyInfo(ContactsParamsRequest contactsGroup);
	
	
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
	public BaseResponse updateContactsInfo(ContactsParamsRequest contactsGroup);

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
	public List<ContactsParamsRequest> getTelInfo(ContactsParamsRequest contactsGroup,int startPage,int limit);
	
	
	@interface GetAllContactsInfo{}
	/**
	 * 显示某个通讯录组中的所有联系人
	 * @param contactsGroupId
	 * @return
	 * @author zhangyh7
	 * @ApiDocMethod
	 */
	
	public List<ContactsParamsRequest> getAllContactsInfo(String contactsGroupId);
	
	
}
