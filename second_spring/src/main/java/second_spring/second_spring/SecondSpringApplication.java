package second_spring.second_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class SecondSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondSpringApplication.class, args);
	}

}
