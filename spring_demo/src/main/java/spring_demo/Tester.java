package spring_demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Tester {
	public static void main(String[] args) {
		//ClassPathResource resource=new ClassPathResource("/spring_demo/MyConfigFile.xml");
		//BeanFactory beanFactory=new XmlBeanFactory(resource);
		
		//Bike bike=(Bike)beanFactory.getBean("x");
		//System.out.println(bike);
		Car car=new Car();
		car.setBrand("Audi");
		car.setColor("Black");
		car.setPrice(23456789);
		System.out.println(car);
	}

}
