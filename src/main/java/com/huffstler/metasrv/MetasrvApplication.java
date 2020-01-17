package com.huffstler.metasrv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.huffstler.persistence.repo")
@EntityScan("com.huffstler.persistence.model")
@SpringBootApplication
public class MetasrvApplication {
	public static void main(String[] args) {
		SpringApplication.run(MetasrvApplication.class, args);
	}
}
