package com.ai.slp.user.api.sms.interfaces;

import com.ai.slp.user.api.sms.param.SMDataInfoNotify;



//@Path("/sms/services")
//@Consumes({ MediaType.APPLICATION_JSON })
//@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
 
/**
 * 
 * Date: 2015年12月4日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author KAI
 */
public interface ISmsServicesSV {

//	@POST
//	@Path("/dataInput") 
    
    /**
     * 
     * @param param
     * @return
     * @throws CallerException
     * @author KAI
     * @ApiDocMethod
     */
	String dataInput(String param);
	
	/**
	 * 短信数据信息通知接口
	 * 
     * @param param
     * @return
     * @throws CallerException
     * @author KAI
     * @ApiDocMethod
	 * 
	 */
	String dataInput(SMDataInfoNotify paramInfo);
}
