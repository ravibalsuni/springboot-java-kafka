package com.github.kafka.producer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicConfig {

	@Value("${kafka.bootstrap.address}")
	private String bootstrapAddress;
	
	@Value("${general.topic.name}")
	private String topic;
	
	@Bean
	public NewTopic generalTopic(){
		return TopicBuilder.name(topic).
				partitions(1).
				replicas(1).build();
	}
	
}
