package com.ibm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ibm.Repo.Repository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext contex =
				SpringApplication.run(Application.class, args);
		Repository bean = contex.getBean(Repository.class);
		
		
		
	}

}
