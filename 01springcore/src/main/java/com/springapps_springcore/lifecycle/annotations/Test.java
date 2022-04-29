package com.springapps_springcore.lifecycle.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springapps_springcore/lifecycle/annotations/config.xml");
		context.registerShutdownHook();

		// get the hospital bean from the container
		Patient patient = (Patient) context.getBean("patient");
		
		// print the bean
		System.out.println(patient);
	}

}
