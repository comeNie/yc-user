package com.ai.slp.user.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.opt.sdk.util.DateUtil;
import com.ai.slp.user.api.ucuserphonebooks.param.UcTelGroupMantainReq;
import com.ai.slp.user.api.ucuserphonebooks.param.UcUserPhonebooksBatchData;
import com.ai.slp.user.api.ucuserphonebooks.param.UcUserPhonebooksModifyReq;
import com.ai.slp.user.dao.mapper.bo.UcTelGroup;
import com.ai.slp.user.dao.mapper.bo.UcTelGroupCriteria;
import com.ai.slp.user.dao.mapper.bo.UcUserPhonebooks;
import com.ai.slp.user.dao.mapper.bo.UcUserPhonebooksCriteria;
import com.ai.slp.user.dao.mapper.interfaces.UcTelGroupMapper;
import com.ai.slp.user.dao.mapper.interfaces.UcUserPhonebooksMapper;
import com.ai.slp.user.service.business.interfaces.IUserPhoneBooksBusiSV;
import com.ai.slp.user.util.SequenceUtil;

@Service
@Transactional
public class UserPhoneBooksBusiSVImpl implements IUserPhoneBooksBusiSV {

	@Autowired
	private UcUserPhonebooksMapper ucUserPhonebooksMapper;

	@Autowired
	private UcTelGroupMapper ucTelGroupMapper;

	@Override
	public void addUcTelGroup(UcTelGroupMantainReq req) {
		UcTelGroup record = new UcTelGroup();
		record.setTelGroupId(SequenceUtil.createTelGroupId());
		record.setTelGroupName(req.getTelGroupName());
		record.setTenantId(req.getTenantId());
		record.setSeq(1);
		record.setCreateTime(DateUtil.getSysDate());
		record.setUserId(req.getUserId());
		ucTelGroupMapper.insert(record);
	}

	@Override
	public void modifyUcTelGroup(UcTelGroupMantainReq req) {
		UcTelGroup record = new UcTelGroup();
		record.setTelGroupName(req.getTelGroupName());
		record.setUpdateTime(DateUtil.getSysDate());
		UcTelGroupCriteria sql = new UcTelGroupCriteria();
		sql.or().andTelGroupIdEqualTo(req.getTelGroupId());
		ucTelGroupMapper.updateByExampleSelective(record, sql);
	}

	@Override
	public void deleteUcTelGroup(UcTelGroupMantainReq req) {
		UcTelGroupCriteria sql = new UcTelGroupCriteria();
		sql.or().andTelGroupIdEqualTo(req.getTelGroupId());
		ucTelGroupMapper.deleteByExample(sql);
	}

	@Override
	public List<com.ai.slp.user.api.ucuserphonebooks.param.UcTelGroup> getUcTelGroups(String userId) {
		UcTelGroupCriteria sql = new UcTelGroupCriteria();
		sql.or().andUserIdEqualTo(userId);
		List<UcTelGroup> list = ucTelGroupMapper.selectByExample(sql);
		List<com.ai.slp.user.api.ucuserphonebooks.param.UcTelGroup> l = new ArrayList<com.ai.slp.user.api.ucuserphonebooks.param.UcTelGroup>();
		if (!CollectionUtil.isEmpty(list)) {
			for (UcTelGroup g : list) {
				com.ai.slp.user.api.ucuserphonebooks.param.UcTelGroup b = new com.ai.slp.user.api.ucuserphonebooks.param.UcTelGroup();
				BeanUtils.copyProperties(g, b);
				int count = this.getTelGroupPhoneBookCount(g.getTelGroupId());
				b.setCount(count);
				l.add(b);
			}
		}
		return l;
	}

	private int getTelGroupPhoneBookCount(String telGroupId) {
		UcUserPhonebooksCriteria sql = new UcUserPhonebooksCriteria();
		sql.or().andTelGroupIdEqualTo(telGroupId);
		int count = ucUserPhonebooksMapper.countByExample(sql);
		return count;
	}

	@Override
	public void batchDeleteUserPhonebooks(List<String> recordIds) {
		for (String recordId : recordIds) {
			ucUserPhonebooksMapper.deleteByPrimaryKey(recordId);
		}
	}

	@Override
	public void batchAddUserPhonebooks(List<UcUserPhonebooksBatchData> datas) {
	}

	@Override
	public void modifyUserPhonebook(UcUserPhonebooksModifyReq req) {
		UcUserPhonebooks record = new UcUserPhonebooks();
		record.setTelGroupId(req.getTelGroupId());
		record.setTelName(req.getTelName());
		record.setTelMp(req.getTelMp());
		record.setUpdateTime(DateUtil.getSysDate());
		UcUserPhonebooksCriteria sql = new UcUserPhonebooksCriteria();
		sql.or().andTelNoEqualTo(req.getTelNo());
		ucUserPhonebooksMapper.updateByExampleSelective(record, sql);
	}
}
