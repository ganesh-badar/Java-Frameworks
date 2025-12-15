package Mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Studentmain {

	public static void main(String[] args) {
		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sf=c.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		
		Student s=new Student();
		s.setRollno(102);
		s.setName("Manoj");
		s.setCity("Pune");
		
		session.persist(s);
		t.commit();
		System.out.println("Object is saved...");
		session.close();
		
		
		
	}

}