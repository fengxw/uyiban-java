/*
 * Copyright (c) 2018-2999 广州市蓝海创新科技有限公司 All rights reserved.
 *
 * https://www.mall4j.com/
 *
 * 未经允许，不可做商业用途！
 *
 * 版权所有，侵权必究！
 */

package com.uyiban.admin;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author lgh
 */
@SpringBootApplication(scanBasePackages = {"com.uyiban"})
@EnableWebMvc
public class AdminApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(AdminApplication.class);
	}

}
