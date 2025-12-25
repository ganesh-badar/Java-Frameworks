package mypack;
import java.io.IOException;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BookMain {

	public static void main(String[] args) throws IOException {
		Resource resource=new ClassPathResource("beans.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		BookDao b1=(BookDao)factory.getBean("bdao");
		
		Scanner s=new Scanner(System.in);
		
		char choice;
		int id,p;
		String nm;
		int ch;
		int status;
		do
		{
		System.out.println("1.Add Book\n2.Update Book Info\n3.Delete Book \n4.Dispaly\n");
		System.out.println("Enter your choice : ");
		
		ch=s.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter book id,book name and price : ");
			id=s.nextInt();
			nm=s.next();
			p=s.nextInt();
			status=b1.insertRec(new Book(id,nm,p));
			System.out.println("Success "+status);
			break;
		
		case 2:
			System.out.println("Enter book id,book name and price : ");
			id=s.nextInt();
			nm=s.next();
			p=s.nextInt();
			status=b1.updateRec(new Book(id,nm,p));
			System.out.println("Success "+status);
			break;
		case 3:
			System.out.println("Enter Book id=");
			id=s.nextInt();
			status=b1.deleteRec(new Book(id,"c",0));
			System.out.print("Success "+status);
			break;
		case 4:
			b1.show();
		}
		System.out.println("Do you want to continue(y/n) ");
		choice = s.next().charAt(0);

		}while(choice!='n');
	}

}