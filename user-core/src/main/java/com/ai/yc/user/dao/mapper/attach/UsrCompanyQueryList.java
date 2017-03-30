package com.ai.yc.user.dao.mapper.attach;

import com.ai.paas.ipaas.util.StringUtil;
import com.ai.yc.user.api.usercompany.param.UserCompanyPageInfoRequest;

public class UsrCompanyQueryList {
	
	public String queryUserCompany(UserCompanyPageInfoRequest pageInfoRequest){
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("select company.company_id,company.admin_user_id,usr.usersource,company.company_name,usr.nickname,usr.firstname,usr.lastname,company.telephone,company.linkman,company.create_time,company.state,company.content,company.remark,company.members_count,company.check_time from usr_user usr,usr_company company where usr.user_id = company.admin_user_id and ");
		/**
		 * 待审核企业
		 */
		if(pageInfoRequest.getState()!=null){
			stringBuffer.append("company.state = "+pageInfoRequest.getState()+" and ");
		}
		if(pageInfoRequest.getNickName()!=null&&!"".equals(pageInfoRequest.getNickName())){
			stringBuffer.append("usr.nickname like '%"+pageInfoRequest.getNickName()+"%' and ");
		}
		if(pageInfoRequest.getMoblePhone()!=null&&!"".equals(pageInfoRequest.getMoblePhone())){
			stringBuffer.append("usr.mobile_phone = '"+pageInfoRequest.getMoblePhone()+"'  and ");
		}
		if(pageInfoRequest.getCompanyName()!=null&&!"".equals(pageInfoRequest.getCompanyName())){
			stringBuffer.append("company.company_name ='"+pageInfoRequest.getCompanyName()+"' and ") ;
		}
		if(pageInfoRequest.getCheckName()!=null&&!"".equals(pageInfoRequest.getCheckName())){
			stringBuffer.append("company.auditor ='" +pageInfoRequest.getCheckName() +"' and ") ;
		}
		if(!StringUtil.isBlank(pageInfoRequest.getUserSource())){
			stringBuffer.append("usr.usersource =" +pageInfoRequest.getUserSource() +" and ");
		}
		if(pageInfoRequest.getCreateStartTime()!=null&&pageInfoRequest.getCreateEndTime()!=null){
			stringBuffer.append("company.create_time >="+pageInfoRequest.getCreateStartTime() + "and company.create_time <="+pageInfoRequest.getCreateEndTime());
		}
		stringBuffer.append(" 1 = 1") ;
		int limitStart = (pageInfoRequest.getPageNo()-1)*pageInfoRequest.getPageSize();
		int limitEnd = pageInfoRequest.getPageSize();
		stringBuffer.append(" limit "+limitStart+","+limitEnd);
		return stringBuffer.toString();
	}
	
	public String queryUserCompanyCount(UserCompanyPageInfoRequest pageInfoRequest){
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("select count(*) count from usr_user usr,usr_company company where usr.user_id = company.admin_user_id and ");
		/**
		 * 待审核企业
		 */
		if(pageInfoRequest.getState()!=null){
			stringBuffer.append("company.state = "+pageInfoRequest.getState()+" and ");
		}
		if(pageInfoRequest.getNickName()!=null&&!"".equals(pageInfoRequest.getNickName())){
			stringBuffer.append("usr.nickname like '%"+pageInfoRequest.getNickName()+"%' and ");
		}
		if(pageInfoRequest.getMoblePhone()!=null&&!"".equals(pageInfoRequest.getMoblePhone())){
			stringBuffer.append("usr.mobile_phone = '"+pageInfoRequest.getMoblePhone()+"'  and ");
		}
		if(pageInfoRequest.getCompanyName()!=null&&!"".equals(pageInfoRequest.getCompanyName())){
			stringBuffer.append("company.company_name ='"+pageInfoRequest.getCompanyName()+"' and ") ;
		}
		if(pageInfoRequest.getCheckName()!=null&&!"".equals(pageInfoRequest.getCheckName())){
			stringBuffer.append("company.auditor ='" +pageInfoRequest.getCheckName() +"' and ") ;
		}
		if(!StringUtil.isBlank(pageInfoRequest.getUserSource())){
			stringBuffer.append("usr.usersource =" +pageInfoRequest.getUserSource() +" and ");
		}
		if(pageInfoRequest.getCreateStartTime()!=null&&pageInfoRequest.getCreateEndTime()!=null){
			stringBuffer.append("company.create_time >="+pageInfoRequest.getCreateStartTime() + "and company.create_time <="+pageInfoRequest.getCreateEndTime());
		}
		stringBuffer.append(" 1 = 1") ;
		
		return stringBuffer.toString();
	}
}
