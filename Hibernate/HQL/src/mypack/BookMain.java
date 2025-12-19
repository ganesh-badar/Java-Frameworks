package mypack;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class BookMain {

	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		
		SessionFactory sf = c.buildSessionFactory();
		Session session = sf.openSession();
		
		
		Transaction t = session.beginTransaction();
		
		
		
		System.out.println("Enter Choice : ");
		System.out.println(" 1)INSERT \n 2)SHOW ALL RECORDS \n 3)RETRIVE SPECIFIC RECORD \n 4)UPDATE RECORD \n 5)DELETE RECORD");
		
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		
		//insert record
		if(a==1) {
		
		Book b1 = new Book();
		System.out.println("Enter Book Name And Price");	
		String bnm = sc.next();
		int p = sc.nextInt();
		
		b1.setBname(bnm);
		b1.setBprice(p);
		
		session.persist(b1);
		t.commit();
		session.close();
		}
		
		
		//printing all record
		else if(a==2)
		{
		Query q1 = session.createQuery("from Book");
		List li = q1.list();
		for(Object temp:li) {
		Book b1=(Book)temp;
		System.out.println(b1.getBid()+" "+b1.getBname()+" "+b1.getBprice());
		}
		session.close();
		}
	
		//Retrive specific data
		else if(a==3) 
		{
			
			
		Query q1 = session.createQuery("from Book");
		q1.setFirstResult(1);
		q1.setMaxResults(2);
		List li = q1.list();
		for(Object temp:li) {
		
		Book b1 = (Book)temp;
		System.out.println(b1.getBid()+" "+ b1.getBname()+" "+b1.getBprice());
		
		}
		session.close();
		}
		
		//UPDATE Query
		
		else if(a==4) {
			
		Query q1 = session.createQuery("update Book set bprice=:p,bname=:n where bid=:id");
		q1.setParameter("p", 1200);
		q1.setParameter("n", "RDBMD");
		q1.setParameter("id", 1);
		
		q1.executeUpdate();
		System.out.println("Updated...");
		session.close();
		}
		
		
		else if(a==5) {
		
		Query q1 = session.createQuery("delete from Book where bid=:id");
		q1.setParameter("id",2);
		q1.executeUpdate();
		System.out.println("Deleted...");
		session.close();
		
		}
		
		else {
			System.out.println("INVALID CHOICE... PLEASE ENTER CHOICE FROM ABOVE OPTION!!!");
		}
}
	
}
