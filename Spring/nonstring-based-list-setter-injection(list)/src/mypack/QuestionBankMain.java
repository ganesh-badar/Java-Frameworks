package mypack;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class QuestionBankMain {


	public static void main(String[] args) {
		Resource resource = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		        Question q1 =(Question) factory.getBean("a1");
		        System.out.println(q1);
	}

}
