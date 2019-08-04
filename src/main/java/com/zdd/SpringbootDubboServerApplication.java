package com.zdd;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@Configuration
@EnableDubbo(scanBasePackages = "com.zdd.dubbo.imp")
@PropertySource("classpath:/spring/dubbo-provider.properties")
public class SpringbootDubboServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDubboServerApplication.class, args);

	}


}
