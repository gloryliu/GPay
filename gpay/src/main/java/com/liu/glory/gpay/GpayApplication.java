package com.liu.glory.gpay;

import com.liu.glory.gpay.app.ijpay.config.StartupRunner;
import com.liu.glory.gpay.app.ijpay.config.TaskRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GpayApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(GpayApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(GpayApplication.class, args);
	}

	@Bean
	public StartupRunner startupRunner(){
		return new StartupRunner();
	}

	@Bean
	public TaskRunner taskRunner(){
		return new TaskRunner();
	}
}
