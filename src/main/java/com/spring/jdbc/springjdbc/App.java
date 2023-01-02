package com.spring.jdbc.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program Started.................." );
        // Spring JDBC=>JDBC Templet
        ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
     StudentDao studentDao = context.getBean("studentDao" ,StudentDao.class);
     
		// Insert
		  
		/*
		 * Student student =new Student(); student.setId(6999);
		 * student.setName("Yogesh"); student.setCity("Noida");
		 * 
		 * int result = studentDao.insert(student);
		 * System.out.println("Student added"+result);
		 */
		 
   
     //Update
     
		/*
		 * Student student=new Student(); student.setId(134); student.setName("Mbapae");
		 * student.setCity("France"); int result = studentDao.change(student);
		 * System.out.println("data Change" + result);
		 */
     
    // Delete 
	/*
	 * int result = studentDao.delete(134); System.out.println("deteted" +result);
	 */
     
     
	/*
	 * Student student= studentDao.getStudent(675); System.out.println(student);
	 */
     
   List<Student> students=  studentDao.getAllStudents();
   for(Student s:students) {
	   System.out.println(s);
   }
     
    }
}
