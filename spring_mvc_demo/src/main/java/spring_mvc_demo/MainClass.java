package spring_mvc_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainClass {
	
	@RequestMapping("Hello")
	public void hello() {
		System.out.println("Hello");
	}
	@RequestMapping("bye")
	public void bye() {
		System.out.println("byeee");
	}


}
