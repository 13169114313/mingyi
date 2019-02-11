package com.mingyi.web.controller.system;

import com.mingyi.system.entity.SysUser;
import com.mingyi.system.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Author: xiacheng
 * Date: 2019/1/18
 * Time: 16:07
 * Description:
 */
@Controller
@RequestMapping("/system/user")
public class SysUserController {

	@Autowired
	SysUserService sysUserService;

	@PostMapping("/addUser")
	@Transactional(rollbackFor = Exception.class)
	public Object addUser(@RequestBody SysUser user) {

		Map returnMap = sysUserService.addUser(user);

		return returnMap;
	}


	//@RequestMapping(method = RequestMethod.POST, path = "/login")
	//public Object login(@RequestBody Map paramsMap, HttpServletResponse response) {
	//	Map returnMap = userService.login(paramsMap,response);
	//	return returnMap;
	//}
	//
	//
	//@RequestMapping(method = RequestMethod.GET, path = "/getUserList")
	//public Object getUserList(@RequestParam("params") String params) {
	//	Map returnMap = userService.getUserList(params);
	//	return returnMap;
	//}

}
