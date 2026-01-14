package com.springmaven.NamedParameterJDBCTemplate;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.resource.SpringConfigFile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext  context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
          NamedParameterJdbcTemplate npjdnctemplate = (NamedParameterJdbcTemplate)context.getBean("npjdnctemplate");
        
          Map<String,Object> map = new HashMap<String,Object>();
          map.put("key_roll", 105);
          map.put("key_name", "Nikhil");
          map.put("key_mark", 85);
          
         String  insert_sql_query = "INSERT INTO student (std_roll, std_name, std_marks) VALUES (:key_roll, :key_name, :key_mark)";

          
           int count = npjdnctemplate.update(insert_sql_query,map);
           if(count>0) {
        	   System.out.println("Inserted");
           }
           else {
        	   System.out.println("Failed");
           }
    
    
    }
}
