package com.mingyi.system.service.impl;

import com.mingyi.system.entity.SysUser;
import com.mingyi.system.mapper.SysUserMapper;
import com.mingyi.system.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: xiacheng
 * Date: 2019/1/19
 * Time: 10:35
 * Description:
 */
@Service
public class SysUserServiceImpl implements SysUserService {

	@Autowired
	SysUserMapper sysUserMapper;

	@Override
	public Map addUser(SysUser user) {

		//新增用户
		sysUserMapper.addUser(user);


		Map returnMap = new HashMap();
		returnMap.put("msg","插入用户成功");
		return returnMap;
	}
}
