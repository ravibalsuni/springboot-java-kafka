package com.github.kafka.producer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Service
public class KafkaProducerService {
	
	private Logger logger  = LoggerFactory.getLogger(KafkaProducerService.class);

	@Value("${general.topic.name}")
	private String topic;
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	
	public void sendMessage(String message){
		ListenableFuture<SendResult<String, String>> future=
				this.kafkaTemplate.send(topic,message);
		future.addCallback(new ListenableFutureCallback<SendResult<String, String>>() {

			@Override
			public void onSuccess(SendResult<String, String> result) {
				logger.info("Sent Message - "+message+
						" with offset -"+result.getRecordMetadata().offset());
				
			}

			@Override
			public void onFailure(Throwable ex) {
				logger.info("Unable to send Message - "+ex.getMessage());
				
			}

		});
	}
}
