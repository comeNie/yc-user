package com.ai.yc.user.service.business.impl;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.PageInfo;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.DateUtil;
import com.ai.yc.user.api.usergriwthvalue.param.UserGriwthValueListResponse;
import com.ai.yc.user.api.usergriwthvalue.param.UsrGriwthValueInfo;
import com.ai.yc.user.api.usergriwthvalue.param.UsrGriwthValuePageInfoRequest;
import com.ai.yc.user.api.userlevelchange.param.LevelInfoResponse;
import com.ai.yc.user.constants.ExceptCodeConstants;
import com.ai.yc.user.dao.mapper.bo.*;
import com.ai.yc.user.service.atom.interfaces.IYCUserGriwthValueAtomSV;
import com.ai.yc.user.service.atom.interfaces.IYCUserLevelChangeAtomSV;
import com.ai.yc.user.service.atom.interfaces.IYCUserServiceAtomSV;
import com.ai.yc.user.service.business.interfaces.IYCUserGriwthValueBusiSV;
import com.ai.yc.user.service.business.interfaces.IYCUserLevelChangeBusiSV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class YCUserLevelChangeBusiSVImpl implements IYCUserLevelChangeBusiSV{
	@Autowired
	private IYCUserLevelChangeAtomSV iycUserLevelChangeAtomSV;
	@Override
	public List<UserLevelChanage> queryLevelInfo(String userId) {
		List<UserLevelChanage> levelChanages = iycUserLevelChangeAtomSV.queryLevelInfo(userId);
		return levelChanages;
	}
}
