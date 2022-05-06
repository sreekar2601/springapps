package com.springapps_springjdbc.employee.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springapps_springjdbc.Employeedao.EmployeeDAO;
import com.springapps_springjdbc.employee.dto.Employee;

public class SpringJdbcApp {
	
	
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springapps_springjdbc/employee/config/config.xml");
		EmployeeDAO employeedao=(EmployeeDAO) context.getBean("employeedao");
		//create(employeedao);
		//update(employeedao);
		//delete(employeedao);
		read(employeedao);
	}
	private static void read(EmployeeDAO employeedao) {
		
		Employee emp=employeedao.read(3);
		System.out.println(emp);
	}
	static Employee emp=new Employee();
	private static void create(EmployeeDAO employeedao) {
		
		
		emp.setId(3);
		emp.setFirstname("kammadhanam");
		emp.setLastname("sai pranav");
		int res=employeedao.create(emp);
		
		System.out.println("Records inserted are: "+res);
	}

	private static void update(EmployeeDAO employeedao) {
		
		emp.setFirstname("palavai");
		emp.setLastname("snikitha");
		emp.setId(3);
		int res=employeedao.update(emp);
		System.out.println("Records inserted are: "+res);
		
	}
	private static void delete(EmployeeDAO employeedao) {
		
		emp.setId(1);
		
		int res=employeedao.delete(emp);
		
		System.out.println("Records inserted are: "+res);
		
	}

	

	

}
