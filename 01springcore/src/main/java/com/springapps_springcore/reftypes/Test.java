package com.springapps_springcore.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springapps_springcore/reftypes/config.xml");

		// get the hospital bean from the container
		Student student = (Student) context.getBean("student");
		
		// print the bean
		System.out.println(student);

	}

}
