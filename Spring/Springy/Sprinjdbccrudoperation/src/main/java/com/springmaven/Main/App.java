package com.springmaven.Main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.beans.Student;
import com.mappers.StudentRowMapper;
import com.resource.SprinConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(SprinConfig.class);
       JdbcTemplate jdbcTemplate =context.getBean(JdbcTemplate.class);
      
       //-------INSERT OPERATION-----------
        
//   	int std_rollno=104;
//   	String std_name ="Amit";
//   	float   std_marks = 75.5f;
//       String insert_sql_Querry = "INSERT INTO student VALUE(?,?,?)";
//      int count = jdbcTemplate.update(insert_sql_Querry,std_rollno,std_name,std_marks);
//    
//      if(count>0) {
//    	  System.out.println("insertion success");
//      }
//      else {
//    	  System.out.println("insertion failed");
//      }
//      
      //--------UPDATE OPERATION-------------
//       float marks = 98.3f;
//       int  roll=101;
//        String update_sql_query="UPDATE student SET std_marks=? WHERE std_roll=?";
//    int count=  jdbcTemplate.update(update_sql_query,marks,roll);
//      if(count>0) {
//    	  System.out.println("update success");
//      }
//      else {
//    	  System.out.println("update failed");
//      }
       
       
       //-----DELETE OPERATION-------------
//       int roll = 102;
//       String delete_sql_query = "DELETE FROM student WHERE std_roll=?";
//       int count=jdbcTemplate.update(delete_sql_query,roll);
//       if (count>0) {
//    	   System.out.println("deletion success");
//       }
//       else {
//    	   System.out.println("deletion failed");
//       }
       
       //------SELECT OPERATION 1--------
//       String select_sql_query = "SELECT * FROM student";
//       List<Student>std_list =jdbcTemplate.query(select_sql_query,new StudentRowMapper());
//       for(Student std : std_list) {
//    	   
//    	   System.out.println("Rollno :"+std.getRollno());
//    	   System.out.println("Name :"+std.getName());
//    	   System.out.println("Marks:"+std.getMarks());
     //  System.out.println("---------------------------------");
        int rollno=101;
       String select_sql_query = "SELECT * FROM student WHERE std_roll=?";
       List<Student>std_list =jdbcTemplate.query(select_sql_query,new StudentRowMapper(),rollno);
       for(Student std : std_list) {
    	   
    	   System.out.println("Rollno :"+std.getRollno());
    	   System.out.println("Name :"+std.getName());
    	   System.out.println("Marks:"+std.getMarks());
       }
    }
}
