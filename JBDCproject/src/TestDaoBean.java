

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDaoBean {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("NewFile.xml");
	
	BusinessClass bc=(BusinessClass) context.getBean("daoBean");
	
	bc.insertRow();
	}

}
