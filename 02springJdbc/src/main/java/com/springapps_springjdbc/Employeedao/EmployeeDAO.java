package com.springapps_springjdbc.Employeedao;

import com.springapps_springjdbc.employee.dto.Employee;

public interface EmployeeDAO {
	
	int create(Employee employee);
	
	int update(Employee employee);
	
	int delete(Employee employee);
	
	Employee read(int id);

}
