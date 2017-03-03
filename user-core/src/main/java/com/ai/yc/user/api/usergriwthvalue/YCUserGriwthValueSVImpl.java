package com.ai.yc.user.api.usergriwthvalue;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.sdk.components.sequence.util.SeqUtil;
import com.ai.opt.sdk.util.BeanUtils;
import com.ai.yc.user.api.usergriwthvalue.interfaces.IYCUserGriwthValueSV;
import com.ai.yc.user.api.usergriwthvalue.param.UserGriwthValueListResponse;
import com.ai.yc.user.api.usergriwthvalue.param.UsrGriwthValuePageInfoRequest;
import com.ai.yc.user.api.usergriwthvalue.param.UsrGriwthValueRequest;
import com.ai.yc.user.dao.mapper.bo.UsrGriwthValue;
import com.ai.yc.user.service.business.interfaces.IYCUserGriwthValueBusiSV;
import com.alibaba.dubbo.config.annotation.Service;

@Service
@Component
public class YCUserGriwthValueSVImpl implements IYCUserGriwthValueSV{

	@Autowired
	private IYCUserGriwthValueBusiSV ycUserGriwthValueBusiSV;
	
	@Override
	@POST
	@Path("/insertGriwthValueInfo")
	public BaseResponse insertGriwthValueInfo(UsrGriwthValueRequest griwthValueInfo)
			throws BusinessException, SystemException {
		UsrGriwthValue griwthValue = new UsrGriwthValue();
		BeanUtils.copyProperties(griwthValue, griwthValueInfo);
		String griwthValueId = SeqUtil.getNewId("YC_USER$GRIWTH_VALUE_ID$SEQ", 10);
		griwthValue.setRecordId(griwthValueId);
		return ycUserGriwthValueBusiSV.insertGriwthValueInfo(griwthValue);
	}

	@Override
	@POST
	@Path("/updateGriwthValueInfo")
	public BaseResponse updateGriwthValueInfo(UsrGriwthValueRequest griwthValueInfo)
			throws BusinessException, SystemException {
		UsrGriwthValue griwthValue = new UsrGriwthValue();
		BeanUtils.copyProperties(griwthValue, griwthValueInfo);
		return ycUserGriwthValueBusiSV.updateGriwthValueInfo(griwthValue);
	}

	@Override
	@POST
	@Path("/queryGriwthValueInfo")
	public UserGriwthValueListResponse queryGriwthValueInfo(
			UsrGriwthValuePageInfoRequest request)
			throws BusinessException, SystemException {
		return ycUserGriwthValueBusiSV.queryGriwthValueInfo(request);
	}

}
