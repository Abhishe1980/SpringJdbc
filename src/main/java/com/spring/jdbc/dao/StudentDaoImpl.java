package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entites.Student;

@Configuration("studentDao")
public  class StudentDaoImpl implements StudentDao {
	
	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {		
		 //insert queary
        String query="insert into student(id,name,city) value(?,?,?)  ";
        int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	
	public int change(Student student) {
		// update Queary
		
		String query="update student set name=? ,city=?  where id=?";
		int r = this.jdbcTemplate.update(query, student.getName(),student.getCity(),student.getId());
		
		return r;
	}
	

	public int delete(int studentID) {
		// Delete Operation
		String query=" delete from student where id=?";
		int r = this.jdbcTemplate.update(query,studentID);
		
		return r;
	}
	

	
	public Student getStudent(int studentId) {
		// Select Single Data Using Rowmaper
		String query="Select *from student where id=?";
		RowMapper<Student> rowMapper=new RowMapperImpl();
		
		Student student = this.jdbcTemplate.queryForObject(query,rowMapper,studentId);
		
		return student ;
	}
	
	
	public List<Student> getAllStudents() {
		// Selecting Multiple Student
		
		String query="Select *from student";
	List<Student> students=	this.jdbcTemplate.query(query,new RowMapperImpl());
		
		return students;
	}

	
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
     @Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	


	

}
