package com.dynamic.jasper.DynamicJasper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DynamicJasperApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DynamicJasperApplication.class, args);
		SpringApplicationBuilder builder = new SpringApplicationBuilder(DynamicJasperApplication.class);
		builder.headless(false);
		ConfigurableApplicationContext context = builder.run(args);
	}
}
