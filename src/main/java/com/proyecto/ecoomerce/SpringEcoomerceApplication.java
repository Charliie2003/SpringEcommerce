package com.proyecto.ecoomerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringEcoomerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEcoomerceApplication.class, args);
	}

}
