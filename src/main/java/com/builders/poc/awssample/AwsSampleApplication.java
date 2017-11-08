package com.builders.poc.awssample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.messaging.config.annotation.EnableSqs;

@EnableAutoConfiguration
@EnableSqs
@SpringBootApplication
public class AwsSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsSampleApplication.class, args);
	}

}
