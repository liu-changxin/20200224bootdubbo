package com.lcx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.lcx.mapper"})
public class BootUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootUserServiceApplication.class, args);
	}

}
