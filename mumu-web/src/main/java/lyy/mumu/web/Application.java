package lyy.mumu.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("springmvc.xml");
		TestBean testBean = context.getBean("testBean", TestBean.class);
		testBean.print();
	}

}
