package com.springapps_springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springapps_springcore.list.Hospital;

public class TestCar {
	public static void main(String args[])
	{
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/springapps_springcore/set/config.xml");
		CarDealer deal = (CarDealer) context.getBean("dealer");
		System.out.println(deal);
	}
}
