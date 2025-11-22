package org.mendez.wsf.ia;

import org.mendez.wsf.ia.entity.EmployeeContext;
import org.mendez.wsf.ia.service.EmployeeContextService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WsfApiIaApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsfApiIaApplication.class, args);
	}


}
