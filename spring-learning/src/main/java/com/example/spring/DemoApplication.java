package com.example.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * Created by Lea on 2020/3/6.
 */
public class DemoApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.setAllowCircularReferences(false);
		System.out.println(context);

		BeanFactory beanFactory = new GenericApplicationContext();
		System.out.println(beanFactory);
	}
}
