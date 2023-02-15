package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestingClass {
	public static void main(String[] args) {
		ApplicationContext Context=new AnnotationConfigApplicationContext(Applicationabc.class);
		Animal animal=(Animal) Context.getBean("animal");
		System.out.println(animal);
		
		Cat cat=(Cat) Context.getBean("cat");
		System.out.println(cat);
		
		Dog dog=(Dog) Context.getBean("dog");
		System.out.println(dog);
		
	}

}
