package com.mingyi.web;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Author: xiacheng
 * Date: 2019/1/18
 * Time: 14:17
 * Description: Web容器中进行部署
 */
public class MingYiServerInitializer extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MingYiApplication.class);
	}
}
