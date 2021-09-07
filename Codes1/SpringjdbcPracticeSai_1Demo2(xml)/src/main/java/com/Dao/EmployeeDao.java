package com.Dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class EmployeeDao {

	private JdbcTemplate jdbcTemplate;
	
	public EmployeeDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	
	public int saveEmployee(Employee emp) {
		String query= "insert into emp1 values('"+emp.getId()+"','"+emp.getName()+"','"+emp.getSalary()+"')";
		return jdbcTemplate.update(query);
	}
	
	public int updateEmployee(Employee emp) {
		return 1;
	}
	
	public int deleteEmployee(Employee emp) {
		return 1;
	}
	
	public ResultSetExtractor<List> getEmployees(){
		return null;
	}
}
