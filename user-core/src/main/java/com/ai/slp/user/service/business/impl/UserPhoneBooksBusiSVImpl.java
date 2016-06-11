package com.ai.slp.user.service.business.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.opt.sdk.util.DateUtil;
import com.ai.paas.ipaas.util.StringUtil;
import com.ai.slp.user.api.ucuserphonebooks.param.UcTelGroupMantainReq;
import com.ai.slp.user.api.ucuserphonebooks.param.UcUserPhonebooksBatchData;
import com.ai.slp.user.api.ucuserphonebooks.param.UcUserPhonebooksModifyReq;
import com.ai.slp.user.api.ucuserphonebooks.param.UcUserPhonebooksQueryReq;
import com.ai.slp.user.api.ucuserphonebooks.param.UserPhonebook;
import com.ai.slp.user.dao.mapper.bo.UcTelGroup;
import com.ai.slp.user.dao.mapper.bo.UcTelGroupCriteria;
import com.ai.slp.user.dao.mapper.bo.UcUserPhonebooks;
import com.ai.slp.user.dao.mapper.bo.UcUserPhonebooksCriteria;
import com.ai.slp.user.dao.mapper.bo.UcUserPhonebooksCriteria.Criteria;
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
		int count = this.getTelGroupsCount(req.getUserId());
		if (count > 10) {
			throw new BusinessException("1000", "您最多只能添加10个通讯录组");
		}
		int exists = this.getTelGroupsByName(req.getUserId(), req.getTelGroupName());
		if (exists > 0) {
			throw new BusinessException("1000", "该用户下已经存在同名分组，请更换分组名称");
		}
		UcTelGroup record = new UcTelGroup();
		record.setTelGroupId(SequenceUtil.createTelGroupId());
		record.setTelGroupName(req.getTelGroupName());
		record.setTenantId(req.getTenantId());
		record.setSeq(1);
		record.setCreateTime(DateUtil.getSysDate());
		record.setUpdateTime(DateUtil.getSysDate());
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
		int count = this.getTelGroupPhoneBookCount(req.getTelGroupId());
		if (count > 0) {
			throw new BusinessException("1000", "该分组下存在通信录记录，不能删除");
		}
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
				b.setCreateTimeStr(DateUtil.getDateString(g.getCreateTime(), DateUtil.DATETIME_FORMAT));
				b.setUpdateTimeStr(DateUtil.getDateString(g.getUpdateTime(), DateUtil.DATETIME_FORMAT));
				int count = this.getTelGroupPhoneBookCount(g.getTelGroupId());
				b.setCount(count);
				l.add(b);
			}
		}
		return l;
	}

	private int getTelGroupsCount(String userId) {
		UcTelGroupCriteria sql = new UcTelGroupCriteria();
		sql.or().andUserIdEqualTo(userId);
		return ucTelGroupMapper.countByExample(sql);
	}

	private int getTelGroupsByName(String userId, String telGroupName) {
		UcTelGroupCriteria sql = new UcTelGroupCriteria();
		sql.or().andUserIdEqualTo(userId).andTelGroupNameEqualTo(telGroupName);
		return ucTelGroupMapper.countByExample(sql);
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
		if (CollectionUtil.isEmpty(datas)) {
			return;
		}
		Timestamp time = DateUtil.getSysDate();
		for (UcUserPhonebooksBatchData d : datas) {
			UcUserPhonebooks record = new UcUserPhonebooks();
			record.setTelNo(SequenceUtil.createTelNo());
			record.setBasicOrgId("1");
			record.setProvinceCode("11");
			record.setCityCode("110");
			record.setTelGroupId(d.getTelGroupId());
			record.setCreateTime(time);
			record.setTelMp(d.getTelMp());
			record.setTelName(d.getTelName());
			record.setUserId(d.getUserId());
			record.setTenantId(d.getTenantId());
			ucUserPhonebooksMapper.insertSelective(record);
		}
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

	@Override
	public PageInfo<UserPhonebook> queryUserPhonebooks(UcUserPhonebooksQueryReq req) {
		UcUserPhonebooksCriteria ucUserPhonebooksCriteria = new UcUserPhonebooksCriteria();
		Criteria sql = ucUserPhonebooksCriteria.or();
		if (!StringUtil.isBlank(req.getBasicOrgId())) {
			sql.andBasicOrgIdEqualTo(req.getBasicOrgId());
		}
		if (!StringUtil.isBlank(req.getTelMp())) {
			sql.andTelMpEqualTo(req.getTelMp());
		}
		if (!StringUtil.isBlank(req.getProvinceCode())) {
			sql.andProvinceCodeEqualTo(req.getProvinceCode());
		}
		if (!StringUtil.isBlank(req.getTelName())) {
			sql.andTelNameLike(req.getTelName());
		}
		if (!StringUtil.isBlank(req.getTelGroupId())) {
			sql.andTelGroupIdEqualTo(req.getTelGroupId());
		}
		int count = ucUserPhonebooksMapper.countByExample(ucUserPhonebooksCriteria);

		ucUserPhonebooksCriteria.setLimitStart((req.getPageNo() - 1) * req.getPageSize());
		ucUserPhonebooksCriteria.setLimitEnd(req.getPageSize());

		List<UserPhonebook> l = new ArrayList<UserPhonebook>();
		List<UcUserPhonebooks> list = ucUserPhonebooksMapper.selectByExample(ucUserPhonebooksCriteria);
		if (!CollectionUtil.isEmpty(list)) {
			for (UcUserPhonebooks b : list) {
				UserPhonebook t = new UserPhonebook();
				BeanUtils.copyProperties(b, t);
				l.add(t);
			}
		}
		PageInfo<UserPhonebook> pageInfo = new PageInfo<UserPhonebook>();
		pageInfo.setResult(l);
		pageInfo.setCount(count);
		return pageInfo;
	}
}
