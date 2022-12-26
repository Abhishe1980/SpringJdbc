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
     
     
     Student student =new Student();
     student.setId(675);
     student.setName("GUNJAN");
     student.setCity("Kanpur");
        
     int result = studentDao.insert(student);
     System.out.println("Student added" +result);
    
    }
}
