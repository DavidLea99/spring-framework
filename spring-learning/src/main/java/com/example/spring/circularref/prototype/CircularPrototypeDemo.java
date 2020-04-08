package com.example.spring.circularref.prototype;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Lea on 2020/3/6.
 */
@ComponentScan
@Configuration
public class CircularPrototypeDemo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CircularPrototypeDemo.class);

		//当bean配置的是prototype时，是不能进行循环依赖注入的
		System.out.println(context.getBean(ServiceA.class));
	}
}
