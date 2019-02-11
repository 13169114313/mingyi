package com.mingyi.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Author: xiacheng
 * Date: 2019/1/18
 * Time: 14:14
 * Description:启动类
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = {"com.mingyi"})
@MapperScan("com.mingyi.*.mapper")
public class MingYiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MingYiApplication.class,args);


		//TODO 1.用户登录权限和状态控制（密码登录）shiro
		//TODO 2.定时任务模块 quartz
		//TODO 3.全局异常处理
		//TODO 4.标准返回信息
		//TODO 5.监控服务器信息
		//TODO 6.监控数据库信息
		//TODO 7.功能模块编写
			//TODO 7.1 用户模块(注册，登录，编辑，删除)
			//TODO 7.2 角色模块(添加，编辑，删除)
			//TODO 7.3 学员模块(添加，编辑，删除，课程信息)
			//TODO 7.3 约课模块(约课，销课)
			//TODO 7.4 统计模块(统计图表，excel导出)
		//TODO 8.加入https证书
		//TODO 9.跨域处理
		//TODO 10.CAS单点登录
		//TODO 11.swagger自动化接口文档
		//TODO 12.第三方登录，如qq，微信，手机验证码登录，手机验证码注册
	}

}
