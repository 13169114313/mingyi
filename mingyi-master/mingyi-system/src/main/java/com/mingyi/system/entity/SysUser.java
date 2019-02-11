package com.mingyi.system.entity;

import com.mingyi.common.base.BaseEntity;

/**
 * Author: xiacheng
 * Date: 2019/1/19
 * Time: 10:29
 * Description:
 */
public class SysUser extends BaseEntity{

	private static final long serialVersionUID = 1L;

	private String userId;

	private String password;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
