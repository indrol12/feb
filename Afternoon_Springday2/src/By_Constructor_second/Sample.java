package By_Constructor_second;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import By_constructor.Fortune;

public class Sample {

	public static void main(String[] args) 
	{
		
		ApplicationContext ac= new ClassPathXmlApplicationContext("Configure.xml");
		
		Fortune f1=(Fortune) ac.getBean("t1");
		f1.disp();
		
		
		
	}

}
