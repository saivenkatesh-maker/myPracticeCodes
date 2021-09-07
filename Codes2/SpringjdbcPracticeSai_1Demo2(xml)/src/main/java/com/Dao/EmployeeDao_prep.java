package com.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDao_prep {

	private JdbcTemplate jdbcTemplate;
	
	public EmployeeDao_prep(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	
	public Boolean saveEmployee(final Employee emp) {
		String query= "insert into emp1 values(?,?,?)";
		return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>(){

			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(1,emp.getId());
				ps.setString(2, emp.getName());
				ps.setFloat(3, emp.getSalary());
				return ps.execute();
			}
			
		});
	}
	
	public int updateEmployee(Employee emp) {
		return 1;
	}
	
	public int deleteEmployee(Employee emp) {
		return 1;
	}
	
//	public List<Employee> getAllemployee(){
//		return jdbcTemplate.query("select * from emp1", new ResultSetExtractor<List<Employee>>() {
//
//			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
//				List<Employee> list = new ArrayList<Employee>();
//				while(rs.next()) {
//					Employee e= new Employee();
//					e.setId(rs.getInt(1));
//					e.setName(rs.getString(2));
//					e.setSalary(rs.getFloat(3));
//					list.add(e);
//				}
//				return list;
//			}
//			
//		});
//		
//	}
	
	public List<Employee> getAllemployee(){
		return jdbcTemplate.query("select * from emp1", new RowMapper<Employee>() {

			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee e=new Employee();
			e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setSalary(rs.getFloat(3));
			
				return e;
			}

			
				
			
		});
		
	}
}
