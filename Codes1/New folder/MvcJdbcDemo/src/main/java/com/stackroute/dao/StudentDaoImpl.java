package com.stackroute.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.stackroute.model.Student;
@Component
public class StudentDaoImpl implements StudentDao{
	
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public StudentDaoImpl(DataSource dataSource) {
		super();
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public int addStudent(Student student) {
		String query="insert into Student values('"+student.getName()+"','"+student.getAge()+"','"+student.getCity()+"','"+student.getEmail()+"')";
		return jdbcTemplate.update(query);
	}

	@Override
	public int updateStudent(Student student) {
//		String query="select * from Student where email=('"+student.getEmail()+"')";
//		int rowAffected=jdbcTemplate.update(query);
//		if(rowAffected!=0) {
		String query1="update Student set name=('"+student.getName()+"'),age=('"+student.getAge()+"'),city=('"+student.getCity()+"'),where email=('"+student.getEmail()+"')";
		return jdbcTemplate.update(query1);
//		}
//		return 0;
	}

	@Override
	public int deleteStudent(String email) {
		String query="delete from Student where email=('"+email+"')";
		
		return jdbcTemplate.update(query);
	}

	@Override
	public List<Student> listAllStudent() {
		String query="select * from student";
		return jdbcTemplate.query(query, new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student student=new Student();
				student.setName(rs.getString(1));
				student.setAge(rs.getInt(2));
				student.setCity(rs.getString(3));
				student.setEmail(rs.getString(4));
				return student;
				
			}
			
		});
	}

	@Override
	public Student getStudentByEmail(String email) {
		String query="Select * from Student where email=('"+email+"')";
		
		return (Student) jdbcTemplate.query(query, new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				
			Student std=new Student();
			std.setName(rs.getString(1));
			std.setAge(rs.getInt(2));
			std.setCity(rs.getString(3));
			std.setEmail(rs.getString(4));
			return std;
			}
			
		});
	}

}
