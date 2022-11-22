package com.accolite.au.demo;

import com.accolite.au.demo.config.Config;
import com.accolite.au.demo.controller.Employee.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(DemoApplication.class, args);
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(Config.class);
		Controller controller = con.getBean(Controller.class);
		controller.getIT();
	}

}
