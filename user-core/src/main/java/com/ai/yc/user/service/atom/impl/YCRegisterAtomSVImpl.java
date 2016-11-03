package com.ai.yc.user.service.atom.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.yc.user.dao.mapper.bo.UcContactsInfo;
import com.ai.yc.user.dao.mapper.bo.UcContactsInfoCriteria;
import com.ai.yc.user.dao.mapper.bo.UcCustKeyInfo;
import com.ai.yc.user.dao.mapper.bo.UcCustKeyInfoCriteria;
import com.ai.yc.user.dao.mapper.bo.UcGroupKeyInfo;
import com.ai.yc.user.dao.mapper.bo.UcGroupKeyInfoCriteria;
import com.ai.yc.user.dao.mapper.bo.UcUser;
import com.ai.yc.user.dao.mapper.bo.UcUserCriteria;
import com.ai.yc.user.dao.mapper.bo.UsrUser;
import com.ai.yc.user.dao.mapper.bo.UsrUserCriteria;
import com.ai.yc.user.dao.mapper.interfaces.UcContactsInfoMapper;
import com.ai.yc.user.dao.mapper.interfaces.UcCustKeyInfoMapper;
import com.ai.yc.user.dao.mapper.interfaces.UcUserMapper;
import com.ai.yc.user.dao.mapper.interfaces.UsrUserMapper;
import com.ai.yc.user.service.atom.interfaces.IRegisterAtomSV;
import com.ai.yc.user.service.atom.interfaces.IYCRegisterAtomSV;


@Component
public class YCRegisterAtomSVImpl implements IYCRegisterAtomSV {

	@Autowired
	private transient UsrUserMapper tUserMapper;

	@Override
	public List<UsrUser> getUserInfo(UcUserCriteria criteria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateUserInfo(UsrUser record, UsrUserCriteria example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UsrUser getUserInfo(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertUserInfo(UsrUser user) {
		// TODO Auto-generated method stub
		return 0;
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
