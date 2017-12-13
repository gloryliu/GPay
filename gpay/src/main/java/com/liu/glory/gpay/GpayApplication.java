package com.liu.glory.gpay;

import ch.qos.logback.classic.Logger;
import com.liu.glory.gpay.app.ijpay.config.StartupRunner;
import com.liu.glory.gpay.app.ijpay.config.TaskRunner;
import com.liu.glory.gpay.app.ijpay.entity.AliPayBean;
import com.liu.glory.gpay.app.ijpay.entity.WxPayBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties({AliPayBean.class, WxPayBean.class})
public class GpayApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(GpayApplication.class);
	}

	public static void main(String[] args) {
		System.out.println("程序已经启动。。。。。。。。。。");
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
