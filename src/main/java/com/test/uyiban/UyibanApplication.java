package com.test.uyiban;

import com.test.uyiban.freshman.model.TestModel;
import com.test.uyiban.freshman.service.TTestService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) //暂时不配置数据源
@RestController
@ComponentScan("com.test.uyiban.freshman.dao")
public class UyibanApplication {

	private final TTestService tTestService;

	public UyibanApplication(TTestService tTestService) {
		this.tTestService = tTestService;
	}

	public static void main(String[] args) {
		SpringApplication.run(UyibanApplication.class, args);
	}
	@RequestMapping("/hello")
	public List<TestModel> select() throws Exception {
		return tTestService.getAll();
	}
}
