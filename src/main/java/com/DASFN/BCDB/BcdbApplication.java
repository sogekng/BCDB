package com.DASFN.BCDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class BcdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(BcdbApplication.class, args);
	}

}
