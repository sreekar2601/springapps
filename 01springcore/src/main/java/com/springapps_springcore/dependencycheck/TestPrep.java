package com.springapps_springcore.dependencycheck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPrep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springapps_springcore/dependencycheck/config.xml");
		context.registerShutdownHook();

		// get the hospital bean from the container
		Prescription patient = (Prescription) context.getBean("prescription");
		
		// print the bean
		System.out.println(patient);

	}

}
