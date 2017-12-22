package de.codecentric.gcp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("de.codecentric.gcp")
public class SbGcpApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbGcpApplication.class, args);
	}
}
