package com.uncovid.help;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.uncovid.help.repository")
//@EnableEurekaClient
public class HelpApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelpApplication.class, args);
	}

}
