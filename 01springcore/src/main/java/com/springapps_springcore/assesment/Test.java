package com.springapps_springcore.assesment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springapps_springcore.reftypes.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springapps_springcore/assesment/config.xml");

		// get the hospital bean from the container
		ShoppingCart shop = (ShoppingCart) context.getBean("Shopping");
		
		// print the bean
		System.out.println(shop);

	}

}
