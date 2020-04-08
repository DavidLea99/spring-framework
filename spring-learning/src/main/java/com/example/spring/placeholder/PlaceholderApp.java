package com.example.spring.placeholder;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by Lea on 2020/3/11.
 */
@ComponentScan
public class PlaceholderApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(PlaceholderApp.class);

		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
		configurer.setLocation(new ClassPathResource("application.properties"));
		context.addBeanFactoryPostProcessor(configurer);

		context.refresh();

		System.out.println(context.getBean(PlaceholderService.class).getName());
	}
}
