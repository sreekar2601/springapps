package com.springapps_springcore.locations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springapps_springcore.map.Customer;

public class TestLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/springapps_springcore/locations/config.xml");
		locations loc = (locations) context.getBean("locations");
		System.out.println(loc);
	}

}
