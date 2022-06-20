package com.test.uyiban;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) //暂时不配置数据源
public class UyibanApplication {
	public static void main(String[] args) {
		SpringApplication.run(UyibanApplication.class, args);
	}
}
