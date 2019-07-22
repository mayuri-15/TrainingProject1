import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDao {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("mapBean.xml");
	
	BusinessClass bc=(BusinessClass) context.getBean("daoBean1");
	
	bc.insertRow();
	bc.findRecord();
	
	System.out.println("All Records");
	bc.displayAll();
	}

}