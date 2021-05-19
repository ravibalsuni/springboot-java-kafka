# Springboot Java Kafka_2.12-2.8.0 repo  
(This demo was implemented on ubuntu 18.04)

It includes:

		1) Apache Kafka 2.12-2.8.0 Installation

		2) MyKafkaProducer Springboot Application 

		3) MyKafkaConsumer Springboot Application (which listens kafka msgs forever) 


# Step 1  

	Installing Kafka 2.12-2.8.0

	1.1) download binaries - 'kafka_2.12-2.8.0.tgz' from:
	     https://github.com/ravibalsuni/springboot-java-kafka/kafka_2.12-2.8.0.tgz

	1.2) Unzip the folder you downloaded in the required installation path as per your choice. 
	     The contents extract to a folder named "kafka_2.12-2.8.0"
	     e.g. /home/ravi/Downloads/kafka_2.12-2.8.0.tgz

	1.3) my installation directory for reference -  /home/ravi/kafka-installation/kafka_2.12-2.8.0

	1.4) create following scripts to start Zookeeper first and then Kafka
	     start-kafka.sh		https://github.com/ravibalsuni/springboot-java-kafka/start-kafka.sh
	     stop-kafka.sh		https://github.com/ravibalsuni/springboot-java-kafka/stop-kafka.sh
	     start-zookeeper.sh		https://github.com/ravibalsuni/springboot-java-kafka/start-zookeeper.sh
	     stop-zookeeper.sh		https://github.com/ravibalsuni/springboot-java-kafka/stop-zookeeper.sh

	1.5) modify these script files with your installation path as per point 1.3) 
	     i.e. replace line 1 of all the script files
	     	cd /home/ravi/kafka-installation/kafka_2.12-2.8.0/
	     as per your installation path

	1.6) run following command to start zookeeper server first (use your installation path as per 1.3) above )
		 
		 /home/ravi/kafka-installation/start-zookeeper.sh
		
		 or
		 
		 cd  /home/ravi/kafka-installation
		 ./start-zookeeper.sh

		# Note - Zookeeper user following port by default "zookeeper.connect=localhost:2181" and "clientPort=2181"
		  located at -
		   ( 
			/home/ravi/kafka-installation/kafka_2.12-2.8.0/config/server.properties
				and
			/home/ravi/kafka-installation/kafka_2.12-2.8.0/config/zookeeper.properties
		   )

		# Error
			
			if the server is not running up try to change the port number in above files
			or you can use 	following command - sudo kill -9 `sudo lsof -t -i:2181`and 
			re-try this step 1.6) again by running start-zookeeper.sh script
	
	1.7) similarly run following command to start kafka server

		 /home/ravi/kafka-installation/start-kafka.sh

		 or

		 cd  /home/ravi/kafka-installation
		 ./start-kafka.sh


# Step 2	
	Refer MyKafkaProducer Springboot Project to send few messages on topic created in TopicConfig.java file
	We use following topic - "my-kafka-topic" to produce messages 


# Step 3	
	Refer MyKafkaConsumer Springboot Project to receive few messages from topic created in the above Step 2 
	We use same topic - "my-kafka-topic" to consume messages 



