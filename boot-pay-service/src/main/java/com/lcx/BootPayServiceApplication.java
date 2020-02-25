package com.lcx;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.lcx.mapper")
//@EnableDubbo(scanBasePackages = "com.lcx.service.impl.PayServiceImpl")
@EnableDubbo
@EnableSwagger2
public class BootPayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootPayServiceApplication.class, args);
	}

}
