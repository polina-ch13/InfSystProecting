package ua.hpi.archit.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfig {
	@Bean("hello")
	HelloService helloService() {
		return new HelloService();
	}
}
