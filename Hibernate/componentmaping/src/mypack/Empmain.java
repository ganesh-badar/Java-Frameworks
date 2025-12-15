package mypack;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Empmain {

	public static void main(String[] args) {
		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
		
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction t = s.beginTransaction();
		
		Address a  = new Address();
		a.setCity("pune");
		a.setPincode(411052);
		a.setState("maharastra");
		
		
		Employee e = new Employee();
		e.setEmpname("raghav");
		e.setEmpid(1);
		e.setEmpadd(a);
		
		s.save(e);
		t.commit();
		s.close();
	}

}
