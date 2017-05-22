package com.ai.yc.user.api.userlevelchange.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.yc.user.api.userlevelchange.param.LevelInfoResponse;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ycuserlevelchange")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IYCUserLevelChangeSV {
	/**
	 * 查询客户级别
	 * @param userId
	 * @return
	 * @ApiCode USR_0022
     * @RestRelativeURL ycuserlevelchange/queryLevelInfo
	 */
	@POST
	@Path("/queryLevelInfo")
	public LevelInfoResponse queryLevelInfo(String userId)throws BusinessException,SystemException;
}
