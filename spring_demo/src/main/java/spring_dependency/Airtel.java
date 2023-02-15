package spring_dependency;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;



public class Airtel implements Sim{
	public void getSimdetails() {
		System.out.println( "This is Airtel sim");
		
	}
	
	}


