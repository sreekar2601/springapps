package com.springapps_springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springapps_springcore.dibasic.Employee;

public class TestHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("com/springapps_springcore/list/config.xml");
		Hospital hosp = (Hospital) context.getBean("hosp");
		System.out.println(hosp);

	}

}
