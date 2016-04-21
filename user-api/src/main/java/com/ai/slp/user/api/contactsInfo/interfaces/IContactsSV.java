package com.ai.slp.user.api.contactsInfo.interfaces;

import java.util.List;

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
	public String contactsManuallyInfo(ContactsParamsRequest contactsGroup);
	
	
	@interface ContactExportInfo{}
	
	/**
	 * 
	 * 通讯录导入   </br>
	 * @param filePath
	 * @return
	 * @author zhangyuehong
	 * @ApiDocMethod
	 */
	public String contactsImportInfo(String filePath);
	
	
	@interface UpdateContactsInfo{}
	
	/**
	 * 
	 * 通讯录修改  </br>
	 * @param contactsGroup
	 * @return
	 * @author zhangyuehong
	 * @ApiDocMethod
	 */
	public String updateContactsInfo(ContactsParamsRequest contactsGroup);

	@interface DeleteContactsInfo{}
	
	/**
	 * 
	 * 删除通讯录信息  </br>
	 * @param telNo
	 * @return
	 * @author zhangyuehong
	 * @ApiDocMethod
	 */
	public String deleteContactsInfo(String telNo);
	
	@interface ExportContacts{}; 
	
	/**
	 * 
	 *  导出联系人  </br>
	 * @param filepath
	 * @return
	 * @author zhangyuehong
	 * @ApiDocMethod
	 */
	
	public String exportContacts(String filepath);
	
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
}
