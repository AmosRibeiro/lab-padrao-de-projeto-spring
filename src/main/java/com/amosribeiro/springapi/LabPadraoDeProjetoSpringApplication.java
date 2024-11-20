package com.amosribeiro.springapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class LabPadraoDeProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadraoDeProjetoSpringApplication.class, args);
	}

}
