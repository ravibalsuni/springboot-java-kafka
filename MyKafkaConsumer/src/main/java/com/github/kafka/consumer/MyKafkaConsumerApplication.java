package com.github.kafka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class MyKafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyKafkaConsumerApplication.class, args);
	}

}
