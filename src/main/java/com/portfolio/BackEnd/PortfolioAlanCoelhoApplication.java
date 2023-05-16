package com.portfolio.BackEnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:portfolio.env")
public class PortfolioAlanCoelhoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioAlanCoelhoApplication.class, args);
	}

}
