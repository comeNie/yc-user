package com.ai.yc.user.api.user.levelchange.impl;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.components.sequence.util.SeqUtil;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.yc.user.api.usergriwthvalue.interfaces.IYCUserGriwthValueSV;
import com.ai.yc.user.api.usergriwthvalue.param.UserGriwthValueListResponse;
import com.ai.yc.user.api.usergriwthvalue.param.UsrGriwthValuePageInfoRequest;
import com.ai.yc.user.api.usergriwthvalue.param.UsrGriwthValueRequest;
import com.ai.yc.user.api.userlevelchange.interfaces.IYCUserLevelChangeSV;
import com.ai.yc.user.api.userlevelchange.param.LevelInfo;
import com.ai.yc.user.api.userlevelchange.param.LevelInfoResponse;
import com.ai.yc.user.dao.mapper.bo.UserLevelChanage;
import com.ai.yc.user.dao.mapper.bo.UsrGriwthValue;
import com.ai.yc.user.service.business.interfaces.IYCUserGriwthValueBusiSV;
import com.ai.yc.user.service.business.interfaces.IYCUserLevelChangeBusiSV;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.List;

@Service
@Component
public class YCUserLevelChangeSVImpl implements IYCUserLevelChangeSV{
	private static final Logger log = LogManager.getLogger(YCUserLevelChangeSVImpl.class);
	@Autowired
	private IYCUserLevelChangeBusiSV levelBusiSV;
	@Override
	public LevelInfoResponse queryLevelInfo(String userId) throws BusinessException, SystemException {
		log.debug("按用户id查询级别开始");
		LevelInfoResponse levelInfoResponse = new LevelInfoResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try{
			List<UserLevelChanage> levelChanages = levelBusiSV.queryLevelInfo(userId);
			log.debug("级别查询结束");
			if(CollectionUtil.isEmpty(levelChanages)){
				responseHeader.setResultCode("0001");
				responseHeader.setResultMessage("级别信息不存在!");
				levelInfoResponse.setResponseHeader(responseHeader);
			}else{
				log.info("拷贝查询列表到返回报文体开始=====查询列表levelChanages="+ JSON.toJSONString(levelChanages));
				ArrayList<LevelInfo> levelInfos = new ArrayList<>();
				for (UserLevelChanage levelChange : levelChanages){
					LevelInfo levelInfo = new LevelInfo();
					BeanUtils.copyProperties(levelInfo,levelChange);
					levelInfos.add(levelInfo);
				}
				log.info("拷贝查询列表到返回报文体结束=====目的报文体levelInfos:"+ JSON.toJSONString(levelInfos));
				levelInfoResponse.setLevelInfos(levelInfos);
				responseHeader.setResultCode("0000");
				responseHeader.setResultMessage("成功");
				responseHeader.setIsSuccess(true);
				levelInfoResponse.setResponseHeader(responseHeader);
			}
			return levelInfoResponse;
		}catch(Exception e){
			responseHeader.setResultCode("0002");
			responseHeader.setResultMessage("查询资料失败");
			levelInfoResponse.setResponseHeader(responseHeader);
			return levelInfoResponse;
		}
	}
}
