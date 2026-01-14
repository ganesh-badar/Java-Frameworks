package in.com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.com.Entity.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String config = "/in/com/resource/ApplicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        Student s =context.getBean(Student.class);
         s.display();
        
    }
}
