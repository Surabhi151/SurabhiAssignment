package com.sample.customer_statement_validator;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class CustomerStatementValidatorApplication {
	public static void main(String[] args) {
		SpringApplication.run(CustomerStatementValidatorApplication.class, args);
		log.info(" Spring boot application page");
	}

}
