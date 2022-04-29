package com.springapps_springcore.map;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springapps_springcore.map.Customer;

public class TestCustomer {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/springapps_springcore/map/config.xml");
		Customer cust = (Customer) context.getBean("customer");
		System.out.println(cust);
	}

}
