package springbootproject2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class EmployeeMain  //main class name
{
	private static ApplicationContext context;
	

	public static void main(String[] args) //main method
	{
		
		context = new ClassPathXmlApplicationContext("confg2.xml");
		
		  Employee ee1=(Employee)context.getBean("e1"); 

	      ee1.display();
	}
}