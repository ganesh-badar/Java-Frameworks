package mypack;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestMain {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("beansInfo.xml");
		 BeanFactory  factory = new XmlBeanFactory(resource);
		 
		 Book b1 =(Book) factory.getBean("obj");
		 System.out.println(b1.getBid()+" "+b1.getBname()+" "+b1.getAuthor());

	}

}
