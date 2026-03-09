package com.wrestling.springboot_wrestling_crud_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class SpringbootWrestlingCrudApiApplication {

	public static void main(String[] args) {
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Kathmandu"));
		SpringApplication.run(SpringbootWrestlingCrudApiApplication.class, args);
	}

}
