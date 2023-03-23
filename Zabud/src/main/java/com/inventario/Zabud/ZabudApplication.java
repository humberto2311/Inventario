package com.inventario.Zabud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ZabudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZabudApplication.class, args);
	}

}
