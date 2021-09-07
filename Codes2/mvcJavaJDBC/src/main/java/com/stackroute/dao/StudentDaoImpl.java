package com.stackroute.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
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
//		student.getLocalDateTime();
		String query="insert into Student values('"+student.getName()+"','"+student.getAge()+"','"+student.getCity()+"','"+student.getEmail()+"','"+LocalDateTime.now()+"')";
		return jdbcTemplate.update(query);
	}

	@Override
	public int updateStudent(Student student) {
//		String query="select * from Student where email=('"+student.getEmail()+"')";
//		int rowAffected=jdbcTemplate.update(query);
//		if(rowAffected!=0) {
//		student.getLocalDateTime();
		String query1="update Student set name=('"+student.getName()+"'),age=('"+student.getAge()+"'),city=('"+student.getCity()+"') where email=('"+student.getEmail()+"')";
		return jdbcTemplate.update(query1);
//		}
//		return 0;
	}

	@Override
	public int deleteStudent(String email) {
		String query="delete from Student where email=('"+email+"')";
		
		return jdbcTemplate.update(query);
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Student> listAllStudent() {
		String query="select * from Student";
		return jdbcTemplate.query(query,new Object[] {}, new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student student=new Student();
				student.setName(rs.getString(1));
				student.setAge(rs.getInt(2));
				student.setCity(rs.getString(3));
				student.setEmail(rs.getString(4));
//				student.setLocalDateTime(LocalDateTime.now());
				return student;
				
			}
			
		});
	}

	@SuppressWarnings("deprecation")
	@Override
	public Student getStudentByEmail(String email) {
		final String query="Select * from Student where email=('"+email+"')";
		
		return (Student) jdbcTemplate.queryForObject(query,new Object[] {email}, new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				
			Student std=new Student();
			std.setName(rs.getString(1));
			std.setAge(rs.getInt(2));
			std.setCity(rs.getString(3));
			std.setEmail(rs.getString(4));
//			std.setLocalDateTime(LocalDateTime.now());
			return std;
			}
			
		});
	}

}
