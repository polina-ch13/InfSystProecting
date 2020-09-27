package ua.hpi.archit.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Executor {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloConfig.class);
		IHello hello = (IHello)ctx.getBean("hello");
		hello.sayHello();
	}

}