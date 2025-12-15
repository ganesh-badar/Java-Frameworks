package mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Studentmain {

	public static void main(String[] args) {
			Configuration c = new Configuration();
			c.configure("hibernate.cfg.xml");
			
			SessionFactory s = c.buildSessionFactory();
			Session se1 = s.openSession();
			
			Transaction t = se1.beginTransaction();
			
			Student s1 = new Student();
			
			s1.setRollno(1);
			s1.setSname("ganesh");
			s1.setCity("pune");
			
			
			se1.save(s1);
			t.commit();
			se1.close();

			
			
			System.out.println("Done...");

	}

}
