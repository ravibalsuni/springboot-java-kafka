package com.github.kafka.consumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class KafkaConsumerService {
	
	private Logger logger = LoggerFactory.getLogger(KafkaConsumerService.class);
	private long num=0;
	
	public KafkaConsumerService() {
		logger.info("KafkaConsumerService() invoked..!!");
	}
	
	@KafkaListener(topics="${general.topic.name}", 
			groupId="${general.topic.group.id}")
	public void consume(String message){
		num++;
		logger.info(String.format("Message received -> %s",message));
		logger.info(String.format("Counsume count -> %d",num));
	}
}
