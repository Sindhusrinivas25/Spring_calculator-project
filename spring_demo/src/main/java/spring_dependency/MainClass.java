package spring_dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Xml.class);
		
			
		Mobile mobile=(Mobile)context.getBean("mobile");
		//System.out.println(mobile);
		
		//mobile.airtel.getSimdetails();`
		
		mobile.sim.getSimdetails();
		
	}

}
