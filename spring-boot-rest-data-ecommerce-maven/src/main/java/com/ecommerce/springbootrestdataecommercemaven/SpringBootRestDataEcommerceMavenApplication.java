package com.ecommerce.springbootrestdataecommercemaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.ecommerce.springbootrestrestecommercemaven.entity")
public class SpringBootRestDataEcommerceMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestDataEcommerceMavenApplication.class, args);
	}

}
