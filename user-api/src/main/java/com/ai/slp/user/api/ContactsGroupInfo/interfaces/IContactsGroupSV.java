package com.ai.slp.user.api.ContactsGroupInfo.interfaces;

import java.util.List;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.slp.user.api.ContactsGroupInfo.param.ContactsGroupParamsRequest;

public interface IContactsGroupSV {
	 
	@interface InsertContactsGroupInfo{}
	/**
	 * 
	 * 通讯录组新增</br>
	 * @param contactsGroup
	 * @return
	 * @author zhangyuehong
	 * @ApiDocMethod
	 */
	 
	public BaseResponse insertcontactsGroupInfo(ContactsGroupParamsRequest contactsGroup);
	
	@interface UpdateGroupInfo{}
	/**
	 * 
	 * 通讯录组修改   </br>
	 * @param contactsGroup
	 * @return
	 * @author zhangyuehong
	 * @ApiDocMethod
	 */
	public BaseResponse updateGroupInfo(ContactsGroupParamsRequest contactsGroup);
	
	@interface DeleteGroupInfo{}
	/**
	 * 
	 * 通讯录组删除   </br>
	 * @param contactsGroup
	 * @return
	 * @author zhangyuehong
	 * @ApiDocMethod
	 */
	public BaseResponse deleteGroupInfo(ContactsGroupParamsRequest contactsGroup);

	@interface GetContactsGroupInfo{}
	/**
	 * 通讯录组查询
	 */
	public List<ContactsGroupParamsRequest> getContactsGroupInfo();
}
