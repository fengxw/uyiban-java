package com.test.uyiban;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) //暂时不配置数据源
@RestController
public class UyibanApplication {

	public static void main(String[] args) {
		SpringApplication.run(UyibanApplication.class, args);
	}
	@RequestMapping("/hello")
	public String hello() {
		return "Hello Spring!";
	}
}
