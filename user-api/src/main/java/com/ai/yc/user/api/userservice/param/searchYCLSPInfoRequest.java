package com.ai.yc.user.api.userservice.param;

import com.ai.opt.base.vo.BaseResponse;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年11月8日 下午5:57:39 
 * @version 
 * @since  
 */
public class searchYCLSPInfoRequest extends BaseResponse {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2505239242530571547L;

	private String lspId;

    private String lspName;

	public String getLspId() {
		return lspId;
	}

	public void setLspId(String lspId) {
		this.lspId = lspId;
	}

	public String getLspName() {
		return lspName;
	}

	public void setLspName(String lspName) {
		this.lspName = lspName;
	}

}
