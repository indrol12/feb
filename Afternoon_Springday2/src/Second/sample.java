package Second;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import First.Doctor;

public class sample 
{

	public static void main(String[] args) 
	{

		ApplicationContext c1=new ClassPathXmlApplicationContext("config.xml");
		Doctor d1=(Doctor) c1.getBean("t1");
		d1.disp();
		
	}

}
