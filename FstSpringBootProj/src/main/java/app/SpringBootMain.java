package app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan("app")
@ComponentScan("controller")
@ComponentScan("service")
@ComponentScan("filter")
public class SpringBootMain {
	
	

	public static void main(String[] args) {	
		System.out.println("Starting SpringBootMain");
		SpringApplication.run(SpringBootMain.class, args);
		System.out.println("End SpringBootMain");
	}
	
	
	
	 
}
