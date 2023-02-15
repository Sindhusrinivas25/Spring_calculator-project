package spring_dependency;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("spring_dependency")
public class Xml {
	@Bean
	public Sim getSim() {
		return new Jio();
	}

}
