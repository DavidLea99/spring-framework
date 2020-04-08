package com.example.spring.supplier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

/**
 * Created by Lea on 2020/3/6.
 */
public class SupplierDemo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		//此时会通过AbstractAutowireCapableBeanFactory中的createBeanInstance()中的obtainFromSupplier(instanceSupplier, beanName)
		//获取这个bean实例
		context.registerBean("supplierService", SupplierService.class, SupplierService::new);
		context.refresh();
		System.out.println(context.getBean("supplierService"));

		//相当于提供了一个构造器回调
		Supplier<SupplierService> supplier = SupplierService::new;
		System.out.println(supplier.get());
	}
}
