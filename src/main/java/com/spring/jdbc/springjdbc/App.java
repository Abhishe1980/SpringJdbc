package com.spring.jdbc.springjdbc;

import org.springframework.context.ApplicationContext;
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
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/springjdbc/config.xml");
      
     StudentDao studentDao = context.getBean("studentDao" ,StudentDao.class);
     
		/* Insert
		 * 
		 * Student student =new Student(); student.setId(675);
		 * student.setName("GUNJAN"); student.setCity("Kanpur");
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
     
     int result = studentDao.delete(134);
     System.out.println("deteted" +result);
     
     
    }
}
