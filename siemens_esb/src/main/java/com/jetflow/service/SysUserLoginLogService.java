package com.jetflow.service;


import java.util.List;

import com.inxedu.os.common.entity.PageEntity;
import com.jetflow.entity.SysUserLoginLog;

/**
 * 后台用户登录日志
 * @author www.inxedu.com
 */
public interface SysUserLoginLogService {
	/**
	 * 添加登录日志
	 * @param loginLog
	 * @return 日志ID
	 */
	public int createLoginLog(SysUserLoginLog loginLog);
	
	/**
	 * 查询用户登录日志
	 * @param userId 用户ID
	 * @param page 分页条件
	 * @return List<SysUserLoginLog>
	 */
	public List<SysUserLoginLog> queryUserLogPage(int userId,PageEntity page);
}
