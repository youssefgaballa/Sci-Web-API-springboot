package org.sci_web.api_springboot;

import org.sci_web.api_springboot.pages.model.Page;
import org.sci_web.api_springboot.pages.repository.PageRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Set;

@SpringBootApplication
public class ApiSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiSpringbootApplication.class, args);
	}

}
