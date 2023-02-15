package spring_dependency;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


public class Jio implements Sim {
	
	public void getSimdetails() {
		System.out.println("This is jio sim");
		
	}
	

}
