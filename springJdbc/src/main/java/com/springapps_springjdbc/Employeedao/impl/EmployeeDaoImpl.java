package com.springapps_springjdbc.Employeedao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springapps_springjdbc.Employeedao.EmployeeDAO;
import com.springapps_springjdbc.Employeedao.rowmapper.EmployeeRowMapper;
import com.springapps_springjdbc.employee.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDAO{

	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values (?, ?, ?)";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstname(),employee.getLastname());
		return result;
	}
	
	@Override
	public int update(Employee employee) {
		String sql="update employee set firstname=? , lastname=? where id=?";
		int res=jdbcTemplate.update(sql,employee.getFirstname(),employee.getLastname(),employee.getId());
		return res;
	}
	
	@Override
	public int delete(Employee employee) {
		String sql="delete from employee where id=?";
		int res=jdbcTemplate.update(sql,employee.getId());
		return res;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Employee read(int id) {
		String sql="select * from employee where id=?";
		EmployeeRowMapper rowmapper=new EmployeeRowMapper();
		Employee employee=jdbcTemplate.queryForObject(sql, rowmapper, id);
		return employee;
	}

}