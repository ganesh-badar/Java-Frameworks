package mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpMain {

	public static void main(String[] args) {
		
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		
		SessionFactory sf = c.buildSessionFactory();
		Session session = sf.openSession();
		
		
		Transaction t = session.beginTransaction();
		
		
		Employee e = new Employee();
		e.setEname("hari");
		
		Address a = new Address();
		a.setCity("pune");
		a.setState("maharastra");
		
		e.setAddress(a);
		a.setEmployee(e);
		
		
	
		session.persist(a);
		session.persist(e);
		t.commit();
		session.close();
		

	}

}
