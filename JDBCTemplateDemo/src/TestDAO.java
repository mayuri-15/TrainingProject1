import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDAO {
	
	public static void main(String[] args)
	{
		ApplicationContext ct=new ClassPathXmlApplicationContext("NewFile.xml");
	    BusinessClass bc=(BusinessClass) ct.getBean("daoBean");
	    
	    bc.insertRow();
	}

}
