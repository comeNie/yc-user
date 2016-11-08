package com.ai.yc.user.api.userservice.param;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.ai.opt.base.vo.BaseResponse;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月7日 下午5:47:37 
 * @version 
 * @since  
 */
public class InsertYCTranslatorRequest extends BaseResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1192887801222567330L;
	
	private String userId;

    private String lspId;

    private String lspRole;

    private Integer workingLife;

    private String motherTongue;

    private Integer state;

    private String translationType;

    private BigDecimal interpretPrice;

    private Timestamp createTime;

    private Timestamp lastModifyTime;

    private String introduction;

    private Integer isLsp;

    private String vipLevel;

    private String legalCertNum;

}
