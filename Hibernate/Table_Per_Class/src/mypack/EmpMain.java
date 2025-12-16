package mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpMain {

	public static void main(String[] args) {
		Configuration  c=new Configuration();
		c.configure("hibernate.cfg.xml");
		
		SessionFactory sf=c.buildSessionFactory();
		Session session =sf.openSession();
		Transaction t=session.beginTransaction();
		
		Employee e=new Employee();
		e.setEname("Sonal");
		
		Regular_Employee re=new Regular_Employee();
		re.setSalary(30000);
		re.setBonus(15000);
		
		Contract_Employee ce=new Contract_Employee();
		ce.setContract_duration(6);
		ce.setRate_per_hour(5000);

		session.save(e);
		session.save(re);
		session.save(ce);
		
		t.commit();
		System.out.println("Done...");

	}

}