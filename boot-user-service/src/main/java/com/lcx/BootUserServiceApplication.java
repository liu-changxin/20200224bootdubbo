package com.lcx;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lcx.mapper")
//@EnableDubbo(scanBasePackages = "com.lcx.service.impl.MemberBaseinfoServiceImpl")
@EnableDubbo
public class BootUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootUserServiceApplication.class, args);
	}

}
