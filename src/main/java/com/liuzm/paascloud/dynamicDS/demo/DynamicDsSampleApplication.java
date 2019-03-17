package com.liuzm.paascloud.dynamicDS.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.liuzm.paascloud.dynamicds.EnableDynamicDS;

@SpringBootApplication
@EnableDynamicDS
public class DynamicDsSampleApplication {
	public static void main(String[] args) {
		SpringApplication.run(DynamicDsSampleApplication.class, args);
	}
}

