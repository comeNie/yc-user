package com.ai.yc.user.service.business.interfaces;

import com.ai.opt.base.vo.BaseResponse;
import com.ai.yc.user.api.usergriwthvalue.param.UserGriwthValueListResponse;
import com.ai.yc.user.api.usergriwthvalue.param.UsrGriwthValuePageInfoRequest;
import com.ai.yc.user.dao.mapper.bo.UsrGriwthValue;

public interface IYCUserGriwthValueBusiSV {

	public BaseResponse insertGriwthValueInfo(UsrGriwthValue contactInfo);
	public BaseResponse updateGriwthValueInfo(UsrGriwthValue contactInfo);
	public UserGriwthValueListResponse queryGriwthValueInfo(UsrGriwthValuePageInfoRequest request);
}
