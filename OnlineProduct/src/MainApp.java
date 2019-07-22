
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
       public static void main(String[] args) throws Exception {
              ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
              Product aaa = (Product) context.getBean("aaa");
              Product cdrw = (Product) context.getBean("cdrw");
              System.out.println(aaa);
              System.out.println(cdrw);
              }
}

