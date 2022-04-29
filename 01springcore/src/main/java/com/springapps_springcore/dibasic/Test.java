package com.springapps_springcore.dibasic;
import java.security.DomainCombiner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[])
	{
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("com/springapps_springcore/dibasic/config.xml");
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp);
	}
}
