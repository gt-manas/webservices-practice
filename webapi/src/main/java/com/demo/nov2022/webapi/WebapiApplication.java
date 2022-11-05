package com.demo.nov2022.webapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
class WebapiApplication {
	public static void main(String[] args) {
		SpringApplication.run(WebapiApplication.class, args);
	}
}
