package Inherit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args)
	{
      ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        Employee emp=(Employee) context.getBean("empBean");
        System.out.println("Name : "+emp.getName());
        System.out.println("Age : "+emp.getAge());
        System.out.println("Address : "+emp.getAddress());
        System.out.println("Company Name : "+emp.getCname());
        System.out.println("Salary : "+emp.getSalary());
        System.out.println("Profile : "+emp.getProfile());

}
}