package com.ai.yc.user.service.atom.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.yc.user.dao.mapper.bo.UsrContact;
import com.ai.yc.user.dao.mapper.bo.UsrTranslator;
import com.ai.yc.user.dao.mapper.bo.UsrUser;
import com.ai.yc.user.dao.mapper.bo.UsrUserCriteria;
import com.ai.yc.user.dao.mapper.interfaces.UsrContactMapper;
import com.ai.yc.user.dao.mapper.interfaces.UsrTranslatorMapper;
import com.ai.yc.user.dao.mapper.interfaces.UsrUserMapper;
import com.ai.yc.user.service.atom.interfaces.IYCUserServiceAtomSV;


@Component
public class YCUserServiceAtomSVImpl implements IYCUserServiceAtomSV {

	@Autowired
	private transient UsrUserMapper tUserMapper;
	
	@Autowired
	private transient UsrTranslatorMapper uTranslatorMapper;

	@Autowired
	private transient UsrContactMapper uContactMapper;
	
	@Override
	public int updateUserInfo(UsrUser record, UsrUserCriteria example) {
		return tUserMapper.updateByExampleSelective(record, example);
	}

	@Override
	public UsrUser getUserInfo(String userId) {
		System.out.println("getUserInfo-userId" + userId);
		return tUserMapper.selectByPrimaryKey(userId);
	}

	@Override
	public int insertUserInfo(UsrUser user) {
		return tUserMapper.insert(user);
	}

	@Override
	public UsrTranslator getUsrTranslatorInfo(String userId) {
		return uTranslatorMapper.selectByPrimaryKey(userId);
	}

	@Override
	public UsrContact getUsrContactInfo(String userId) {
		return uContactMapper.selectByPrimaryKey(userId);
	}

//    @Autowired
//    private transient UcUserMapper ucUserMapper;
//
//
//    @Autowired
//    private transient UcContactsInfoMapper contactsInfoMapper;
//
//   
//
//    @Autowired
//    private transient UcCustKeyInfoMapper custKeyInfoMapper;
//
//    @Autowired
//    private transient UcUserMapper userMapper;
//
//
//    @Override
//    public int insertUserInfo(UcUser user) {
//        return ucUserMapper.insert(user);
//    }
//
//    @Override
//    public List<UcUser> getUserInfo(UcUserCriteria criteria) {
//        return ucUserMapper.selectByExample(criteria);
//    }
//
//
//
//    @Override
//    public int insertUcContactsInfo(UcContactsInfo ucContactsInfo) {
//
//        return contactsInfoMapper.insert(ucContactsInfo);
//    }
//
//
//    @Override
//    public int insertUcCustKeyInfo(UcCustKeyInfo ucContactsInfo) {
//        return custKeyInfoMapper.insert(ucContactsInfo);
//    }
//
//    @Override
//    public int updateUserInfo(UcUser record, UcUserCriteria example) {
//        return userMapper.updateByExample(record, example);
//    }
//
//    
//
//    @Override
//    public int updateCustKeyInfo(UcCustKeyInfo record, UcCustKeyInfoCriteria example) {
//        return custKeyInfoMapper.updateByExample(record, example);
//    }
//
//    @Override
//    public List<UcCustKeyInfo> getUcCustKeyInfo(UcCustKeyInfoCriteria criteria) {
//        return custKeyInfoMapper.selectByExample(criteria);
//    }
//
//    @Override
//    public List<UcContactsInfo> getUcContactsInfo(UcContactsInfoCriteria criteria) {
//        return contactsInfoMapper.selectByExample(criteria);
//    }
//
//	@Override
//	public int insertUcGroupKeyInfo(UcGroupKeyInfo ucGroupKey) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public List<UcGroupKeyInfo> getUcGroupKeyInfo(
//			UcGroupKeyInfoCriteria criteria) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public int updateGroupKeyInfo(@Param("record") UcGroupKeyInfo record,
//			@Param("example") UcGroupKeyInfoCriteria example) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
