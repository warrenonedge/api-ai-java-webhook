package com.railinc.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages={"com.railinc"})
//@EntityScan(basePackages={"com.railinc.entities"})
//@EnableJpaRepositories(basePackages={"com.railinc"})
public class RailIncOnCallConfiguration {

	public static void main(String[] args) {
		SpringApplication.run(RailIncOnCallConfiguration.class, args);
	}
}
