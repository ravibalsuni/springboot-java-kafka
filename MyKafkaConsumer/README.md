# 1
	Consuming Messages via Kafka Producer
This Springboot application consumes messages on topic - "my-kafka-topic"

# 2
	Following Properties are used in application.properties file (please modify as per your requirement)

server.port=9002

kafka.bootstrap.address=your-ip:9092

general.topic.name=my-kafka-topic

general.topic.group.id=group_id

ssl.client.auth=none


# 3
	Please note kafka installation steps are mentioned in Step 1 of below README.md file :

https://github.com/ravibalsuni/springboot-java-kafka/blob/master/README.md

# 4
    Import Maven Project in Eclipse, Right Click on Eclipse Project MyKafkaConsumer, Run As Maven install

# 5 
    Right Click MyKafkaConsumerApplication.java, Run As -> Java Application

# 6
    sample logs on eclipse console
    
    

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::       (v2.3.10.RELEASE)

2021-05-19 12:27:13.364  INFO 20850 --- [           main] c.g.k.c.MyKafkaConsumerApplication       : Starting MyKafkaConsumerApplication on ubuntu-pc with PID 20850 (/home/ravi/Desktop/Applications/eclipse/jee-2020-03/eclipse/this.workspace/MyKafkaConsumer/target/classes started by ravi in /home/ravi/Desktop/Applications/eclipse/jee-2020-03/eclipse/this.workspace/MyKafkaConsumer)
2021-05-19 12:27:13.369  INFO 20850 --- [           main] c.g.k.c.MyKafkaConsumerApplication       : No active profile set, falling back to default profiles: default
2021-05-19 12:27:14.746  INFO 20850 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 9002 (http)
2021-05-19 12:27:14.761  INFO 20850 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2021-05-19 12:27:14.761  INFO 20850 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.45]
2021-05-19 12:27:14.856  INFO 20850 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2021-05-19 12:27:14.856  INFO 20850 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1382 ms
2021-05-19 12:27:14.936  INFO 20850 --- [           main] c.g.k.c.service.KafkaConsumerService     : KafkaConsumerService() invoked..!!
2021-05-19 12:27:15.184  INFO 20850 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2021-05-19 12:27:15.539  INFO 20850 --- [           main] o.a.k.clients.admin.AdminClientConfig    : AdminClientConfig values: 
	bootstrap.servers = [localhost:9092]
	client.dns.lookup = default
	client.id = 
	connections.max.idle.ms = 300000
	default.api.timeout.ms = 60000
	metadata.max.age.ms = 300000
	metric.reporters = []
	metrics.num.samples = 2
	metrics.recording.level = INFO
	metrics.sample.window.ms = 30000
	receive.buffer.bytes = 65536
	reconnect.backoff.max.ms = 1000
	reconnect.backoff.ms = 50
	request.timeout.ms = 30000
	retries = 2147483647
	retry.backoff.ms = 100
	sasl.client.callback.handler.class = null
	sasl.jaas.config = null
	sasl.kerberos.kinit.cmd = /usr/bin/kinit
	sasl.kerberos.min.time.before.relogin = 60000
	sasl.kerberos.service.name = null
	sasl.kerberos.ticket.renew.jitter = 0.05
	sasl.kerberos.ticket.renew.window.factor = 0.8
	sasl.login.callback.handler.class = null
	sasl.login.class = null
	sasl.login.refresh.buffer.seconds = 300
	sasl.login.refresh.min.period.seconds = 60
	sasl.login.refresh.window.factor = 0.8
	sasl.login.refresh.window.jitter = 0.05
	sasl.mechanism = GSSAPI
	security.protocol = PLAINTEXT
	security.providers = null
	send.buffer.bytes = 131072
	ssl.cipher.suites = null
	ssl.enabled.protocols = [TLSv1.2]
	ssl.endpoint.identification.algorithm = https
	ssl.key.password = null
	ssl.keymanager.algorithm = SunX509
	ssl.keystore.location = null
	ssl.keystore.password = null
	ssl.keystore.type = JKS
	ssl.protocol = TLSv1.2
	ssl.provider = null
	ssl.secure.random.implementation = null
	ssl.trustmanager.algorithm = PKIX
	ssl.truststore.location = null
	ssl.truststore.password = null
	ssl.truststore.type = JKS

2021-05-19 12:27:15.698  INFO 20850 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka version: 2.5.1
2021-05-19 12:27:15.700  INFO 20850 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId: 0efa8fb0f4c73d92
2021-05-19 12:27:15.700  INFO 20850 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka startTimeMs: 1621407435697
2021-05-19 12:27:16.066  INFO 20850 --- [           main] o.a.k.clients.consumer.ConsumerConfig    : ConsumerConfig values: 
	allow.auto.create.topics = true
	auto.commit.interval.ms = 5000
	auto.offset.reset = latest
	bootstrap.servers = [localhost:9092]
	check.crcs = true
	client.dns.lookup = default
	client.id = 
	client.rack = 
	connections.max.idle.ms = 540000
	default.api.timeout.ms = 60000
	enable.auto.commit = false
	exclude.internal.topics = true
	fetch.max.bytes = 52428800
	fetch.max.wait.ms = 500
	fetch.min.bytes = 1
	group.id = group_id
	group.instance.id = null
	heartbeat.interval.ms = 3000
	interceptor.classes = []
	internal.leave.group.on.close = true
	isolation.level = read_uncommitted
	key.deserializer = class org.apache.kafka.common.serialization.StringDeserializer
	max.partition.fetch.bytes = 1048576
	max.poll.interval.ms = 300000
	max.poll.records = 500
	metadata.max.age.ms = 300000
	metric.reporters = []
	metrics.num.samples = 2
	metrics.recording.level = INFO
	metrics.sample.window.ms = 30000
	partition.assignment.strategy = [class org.apache.kafka.clients.consumer.RangeAssignor]
	receive.buffer.bytes = 65536
	reconnect.backoff.max.ms = 1000
	reconnect.backoff.ms = 50
	request.timeout.ms = 30000
	retry.backoff.ms = 100
	sasl.client.callback.handler.class = null
	sasl.jaas.config = null
	sasl.kerberos.kinit.cmd = /usr/bin/kinit
	sasl.kerberos.min.time.before.relogin = 60000
	sasl.kerberos.service.name = null
	sasl.kerberos.ticket.renew.jitter = 0.05
	sasl.kerberos.ticket.renew.window.factor = 0.8
	sasl.login.callback.handler.class = null
	sasl.login.class = null
	sasl.login.refresh.buffer.seconds = 300
	sasl.login.refresh.min.period.seconds = 60
	sasl.login.refresh.window.factor = 0.8
	sasl.login.refresh.window.jitter = 0.05
	sasl.mechanism = GSSAPI
	security.protocol = PLAINTEXT
	security.providers = null
	send.buffer.bytes = 131072
	session.timeout.ms = 10000
	ssl.cipher.suites = null
	ssl.enabled.protocols = [TLSv1.2]
	ssl.endpoint.identification.algorithm = https
	ssl.key.password = null
	ssl.keymanager.algorithm = SunX509
	ssl.keystore.location = null
	ssl.keystore.password = null
	ssl.keystore.type = JKS
	ssl.protocol = TLSv1.2
	ssl.provider = null
	ssl.secure.random.implementation = null
	ssl.trustmanager.algorithm = PKIX
	ssl.truststore.location = null
	ssl.truststore.password = null
	ssl.truststore.type = JKS
	value.deserializer = class org.apache.kafka.common.serialization.StringDeserializer

2021-05-19 12:27:16.117  INFO 20850 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka version: 2.5.1
2021-05-19 12:27:16.118  INFO 20850 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId: 0efa8fb0f4c73d92
2021-05-19 12:27:16.118  INFO 20850 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka startTimeMs: 1621407436117
2021-05-19 12:27:16.119  INFO 20850 --- [           main] o.a.k.clients.consumer.KafkaConsumer     : [Consumer clientId=consumer-group_id-1, groupId=group_id] Subscribed to topic(s): my-kafka-topic
2021-05-19 12:27:16.122  INFO 20850 --- [           main] o.s.s.c.ThreadPoolTaskScheduler          : Initializing ExecutorService
2021-05-19 12:27:16.209  INFO 20850 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 9002 (http) with context path ''
2021-05-19 12:27:16.199  INFO 20850 --- [ntainer#0-0-C-1] org.apache.kafka.clients.Metadata        : [Consumer clientId=consumer-group_id-1, groupId=group_id] Cluster ID: rYAbZAeXQhCDOaKo9-JTsA
2021-05-19 12:27:16.217  INFO 20850 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.AbstractCoordinator  : [Consumer clientId=consumer-group_id-1, groupId=group_id] Discovered group coordinator ubuntu-pc:9092 (id: 2147483647 rack: null)
2021-05-19 12:27:16.225  INFO 20850 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.AbstractCoordinator  : [Consumer clientId=consumer-group_id-1, groupId=group_id] (Re-)joining group
2021-05-19 12:27:16.236  INFO 20850 --- [           main] c.g.k.c.MyKafkaConsumerApplication       : Started MyKafkaConsumerApplication in 3.433 seconds (JVM running for 3.885)
2021-05-19 12:27:16.307  INFO 20850 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.AbstractCoordinator  : [Consumer clientId=consumer-group_id-1, groupId=group_id] Join group failed with org.apache.kafka.common.errors.MemberIdRequiredException: The group member needs to have a valid member id before actually entering a consumer group
2021-05-19 12:27:16.307  INFO 20850 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.AbstractCoordinator  : [Consumer clientId=consumer-group_id-1, groupId=group_id] (Re-)joining group
2021-05-19 12:27:16.335  INFO 20850 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-group_id-1, groupId=group_id] Finished assignment for group at generation 10: {consumer-group_id-1-fc2177f2-e43c-476a-bdfe-37c310d95a0d=Assignment(partitions=[my-kafka-topic-0])}
2021-05-19 12:27:16.504  INFO 20850 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.AbstractCoordinator  : [Consumer clientId=consumer-group_id-1, groupId=group_id] Successfully joined group with generation 10
2021-05-19 12:27:16.510  INFO 20850 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-group_id-1, groupId=group_id] Adding newly assigned partitions: my-kafka-topic-0
2021-05-19 12:27:16.533  INFO 20850 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-group_id-1, groupId=group_id] Setting offset for partition my-kafka-topic-0 to the committed offset FetchPosition{offset=200, offsetEpoch=Optional.empty, currentLeader=LeaderAndEpoch{leader=Optional[ubuntu-pc:9092 (id: 0 rack: null)], epoch=0}}
2021-05-19 12:27:16.534  INFO 20850 --- [ntainer#0-0-C-1] o.s.k.l.KafkaMessageListenerContainer    : group_id: partitions assigned: [my-kafka-topic-0]
2021-05-19 12:27:16.743  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 0
2021-05-19 12:27:16.743  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 1
2021-05-19 12:27:16.743  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 1
2021-05-19 12:27:16.743  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 2
2021-05-19 12:27:16.744  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 2
2021-05-19 12:27:16.744  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 3
2021-05-19 12:27:16.744  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 3
2021-05-19 12:27:16.744  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 4
2021-05-19 12:27:16.744  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 4
2021-05-19 12:27:16.744  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 5
2021-05-19 12:27:16.744  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 5
2021-05-19 12:27:16.745  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 6
2021-05-19 12:27:16.745  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 6
2021-05-19 12:27:16.745  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 7
2021-05-19 12:27:16.745  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 7
2021-05-19 12:27:16.745  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 8
2021-05-19 12:27:16.745  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 8
2021-05-19 12:27:16.745  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 9
2021-05-19 12:27:16.746  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 9
2021-05-19 12:27:16.746  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 10
2021-05-19 12:27:16.746  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 10
2021-05-19 12:27:16.746  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 11
2021-05-19 12:27:16.746  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 11
2021-05-19 12:27:16.746  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 12
2021-05-19 12:27:16.747  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 12
2021-05-19 12:27:16.747  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 13
2021-05-19 12:27:16.747  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 13
2021-05-19 12:27:16.747  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 14
2021-05-19 12:27:16.747  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 14
2021-05-19 12:27:16.747  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 15
2021-05-19 12:27:16.748  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 15
2021-05-19 12:27:16.748  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 16
2021-05-19 12:27:16.748  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 16
2021-05-19 12:27:16.748  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 17
2021-05-19 12:27:16.749  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 17
2021-05-19 12:27:16.749  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 18
2021-05-19 12:27:16.749  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 18
2021-05-19 12:27:16.749  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 19
2021-05-19 12:27:16.749  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 19
2021-05-19 12:27:16.749  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 20
2021-05-19 12:27:16.749  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 20
2021-05-19 12:27:16.749  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 21
2021-05-19 12:27:16.750  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 21
2021-05-19 12:27:16.750  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 22
2021-05-19 12:27:16.750  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 22
2021-05-19 12:27:16.750  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 23
2021-05-19 12:27:16.750  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 23
2021-05-19 12:27:16.750  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 24
2021-05-19 12:27:16.750  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 24
2021-05-19 12:27:16.751  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 25
2021-05-19 12:27:16.751  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 25
2021-05-19 12:27:16.751  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 26
2021-05-19 12:27:16.751  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 26
2021-05-19 12:27:16.751  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 27
2021-05-19 12:27:16.751  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 27
2021-05-19 12:27:16.751  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 28
2021-05-19 12:27:16.751  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 28
2021-05-19 12:27:16.752  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 29
2021-05-19 12:27:16.752  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 29
2021-05-19 12:27:16.752  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 30
2021-05-19 12:27:16.752  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 30
2021-05-19 12:27:16.752  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 31
2021-05-19 12:27:16.752  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 31
2021-05-19 12:27:16.752  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 32
2021-05-19 12:27:16.753  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 32
2021-05-19 12:27:16.753  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 33
2021-05-19 12:27:16.753  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 33
2021-05-19 12:27:16.753  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 34
2021-05-19 12:27:16.753  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 34
2021-05-19 12:27:16.753  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 35
2021-05-19 12:27:16.754  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 35
2021-05-19 12:27:16.754  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 36
2021-05-19 12:27:16.754  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 36
2021-05-19 12:27:16.754  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 37
2021-05-19 12:27:16.755  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 37
2021-05-19 12:27:16.755  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 38
2021-05-19 12:27:16.755  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 38
2021-05-19 12:27:16.755  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 39
2021-05-19 12:27:16.755  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 39
2021-05-19 12:27:16.756  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 40
2021-05-19 12:27:16.756  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 40
2021-05-19 12:27:16.756  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 41
2021-05-19 12:27:16.756  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 41
2021-05-19 12:27:16.756  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 42
2021-05-19 12:27:16.757  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 42
2021-05-19 12:27:16.757  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 43
2021-05-19 12:27:16.757  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 43
2021-05-19 12:27:16.757  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 44
2021-05-19 12:27:16.757  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 44
2021-05-19 12:27:16.758  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 45
2021-05-19 12:27:16.758  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 45
2021-05-19 12:27:16.758  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 46
2021-05-19 12:27:16.758  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 46
2021-05-19 12:27:16.758  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 47
2021-05-19 12:27:16.759  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 47
2021-05-19 12:27:16.759  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 48
2021-05-19 12:27:16.759  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 48
2021-05-19 12:27:16.759  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 49
2021-05-19 12:27:16.760  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 49
2021-05-19 12:27:16.760  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 50
2021-05-19 12:27:16.760  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 50
2021-05-19 12:27:16.760  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 51
2021-05-19 12:27:16.760  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 51
2021-05-19 12:27:16.761  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 52
2021-05-19 12:27:16.761  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 52
2021-05-19 12:27:16.761  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 53
2021-05-19 12:27:16.761  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 53
2021-05-19 12:27:16.762  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 54
2021-05-19 12:27:16.762  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 54
2021-05-19 12:27:16.762  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 55
2021-05-19 12:27:16.762  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 55
2021-05-19 12:27:16.762  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 56
2021-05-19 12:27:16.763  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 56
2021-05-19 12:27:16.763  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 57
2021-05-19 12:27:16.763  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 57
2021-05-19 12:27:16.763  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 58
2021-05-19 12:27:16.763  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 58
2021-05-19 12:27:16.764  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 59
2021-05-19 12:27:16.764  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 59
2021-05-19 12:27:16.764  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 60
2021-05-19 12:27:16.764  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 60
2021-05-19 12:27:16.764  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 61
2021-05-19 12:27:16.764  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 61
2021-05-19 12:27:16.764  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 62
2021-05-19 12:27:16.765  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 62
2021-05-19 12:27:16.765  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 63
2021-05-19 12:27:16.765  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 63
2021-05-19 12:27:16.765  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 64
2021-05-19 12:27:16.765  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 64
2021-05-19 12:27:16.765  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 65
2021-05-19 12:27:16.765  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 65
2021-05-19 12:27:16.766  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 66
2021-05-19 12:27:16.766  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 66
2021-05-19 12:27:16.766  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 67
2021-05-19 12:27:16.766  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 67
2021-05-19 12:27:16.766  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 68
2021-05-19 12:27:16.766  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 68
2021-05-19 12:27:16.766  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 69
2021-05-19 12:27:16.767  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 69
2021-05-19 12:27:16.767  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 70
2021-05-19 12:27:16.767  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 70
2021-05-19 12:27:16.767  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 71
2021-05-19 12:27:16.767  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 71
2021-05-19 12:27:16.767  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 72
2021-05-19 12:27:16.768  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 72
2021-05-19 12:27:16.768  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 73
2021-05-19 12:27:16.768  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 73
2021-05-19 12:27:16.768  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 74
2021-05-19 12:27:16.768  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 74
2021-05-19 12:27:16.768  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 75
2021-05-19 12:27:16.768  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 75
2021-05-19 12:27:16.769  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 76
2021-05-19 12:27:16.769  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 76
2021-05-19 12:27:16.769  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 77
2021-05-19 12:27:16.769  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 77
2021-05-19 12:27:16.769  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 78
2021-05-19 12:27:16.769  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 78
2021-05-19 12:27:16.769  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 79
2021-05-19 12:27:16.769  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 79
2021-05-19 12:27:16.770  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 80
2021-05-19 12:27:16.770  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 80
2021-05-19 12:27:16.770  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 81
2021-05-19 12:27:16.770  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 81
2021-05-19 12:27:16.770  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 82
2021-05-19 12:27:16.770  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 82
2021-05-19 12:27:16.770  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 83
2021-05-19 12:27:16.771  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 83
2021-05-19 12:27:16.771  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 84
2021-05-19 12:27:16.771  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 84
2021-05-19 12:27:16.771  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 85
2021-05-19 12:27:16.771  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 85
2021-05-19 12:27:16.771  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 86
2021-05-19 12:27:16.771  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 86
2021-05-19 12:27:16.771  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 87
2021-05-19 12:27:16.772  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 87
2021-05-19 12:27:16.772  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 88
2021-05-19 12:27:16.772  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 88
2021-05-19 12:27:16.772  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 89
2021-05-19 12:27:16.772  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 89
2021-05-19 12:27:16.772  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 90
2021-05-19 12:27:16.772  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 90
2021-05-19 12:27:16.773  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 91
2021-05-19 12:27:16.773  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 91
2021-05-19 12:27:16.773  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 92
2021-05-19 12:27:16.773  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 92
2021-05-19 12:27:16.773  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 93
2021-05-19 12:27:16.773  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 93
2021-05-19 12:27:16.773  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 94
2021-05-19 12:27:16.773  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 94
2021-05-19 12:27:16.773  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 95
2021-05-19 12:27:16.774  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 95
2021-05-19 12:27:16.774  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 96
2021-05-19 12:27:16.774  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 96
2021-05-19 12:27:16.774  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 97
2021-05-19 12:27:16.774  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 97
2021-05-19 12:27:16.774  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 98
2021-05-19 12:27:16.774  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 98
2021-05-19 12:27:16.774  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 99
2021-05-19 12:27:16.774  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Message received -> message 99
2021-05-19 12:27:16.775  INFO 20850 --- [ntainer#0-0-C-1] c.g.k.c.service.KafkaConsumerService     : Counsume count -> 100
    
# All messages are consumed from mentioned Topic