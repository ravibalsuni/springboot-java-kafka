package com.github.kafka.producer;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

import com.github.kafka.producer.service.KafkaProducerService;

@EnableKafka
@SpringBootApplication
public class MyKafkaProducerApplication {
	
	private KafkaProducerService producerService;
	
	private Logger logger  = LoggerFactory.getLogger(MyKafkaProducerApplication.class);

	  @Autowired 
	  public MyKafkaProducerApplication( KafkaProducerService  producerService){ 
		  this.producerService = producerService;
	      logger.info("MyKafkaProducerApplication() invoked..!"); 
	  }
	 

	public static void main(String[] args) {
		SpringApplication.run(MyKafkaProducerApplication.class, args);
	}
	
	@PostConstruct
	public void sendMessageToKafkaTopic(){
		logger.info("sending messages to kafka..!");
		String message = "message ";
		for(int i=0; i<100; i++)
			this.producerService.sendMessage(message +i);
		logger.info("messages sent to kafka..!");
		
	}

}
