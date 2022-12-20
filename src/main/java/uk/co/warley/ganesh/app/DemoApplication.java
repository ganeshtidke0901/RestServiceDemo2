package uk.co.warley.ganesh.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import uk.co.warley.ganesh.services.Services;

@SpringBootApplication
@ComponentScan(basePackageClasses = Services.class)

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
