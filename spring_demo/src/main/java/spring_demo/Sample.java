package spring_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sample {
	public static void main(String[] args) {
		ApplicationContext Context=new ClassPathXmlApplicationContext("/spring_demo/MyConfigFile.xml");
		//Bike bike=(Bike) Context.getBean("x");
		//System.out.println(bike);
		Car car=(Car) Context.getBean("car");
		System.out.println(car);
		
		Bike bike=(Bike) Context.getBean("bike");
		System.out.println(bike);
		
		JblMusicSystem system=(JblMusicSystem) Context.getBean("music");
		System.out.println(system);
	}

}
