package com.ai.yc.user.api.userservice.param;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.ai.opt.base.vo.BaseResponse;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月3日 下午7:06:04 
 * @version 
 * @since  
 */
public class YCTranslatorInfoResponse extends BaseResponse {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9068009364796285584L;
	
	private String userId;

    private String lspId;

    private String lspRole;

    private Integer workingLife;

    private String motherTongue;

    private String translationType;

    private BigDecimal interpretPrice;

    private String introduction;

    private Integer isLsp;

    private String vipLevel;

    private String legalCertNum;
	
	
	
	private String responseCode;
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
}
