# 1
	Producing Messages via Kafka Producer
This Springboot application produces messages on topic - "my-kafka-topic"

# 2
	Following Properties are used in application.properties file (please modify as per your requirement)

server.port=9001

kafka.bootstrap.address=your-ip:9092

general.topic.name=my-kafka-topic

general.topic.group.id=group_id

ssl.client.auth=none


# 3
	Please note kafka installation steps are mentioned in Step 1 of below README.md file :

https://github.com/ravibalsuni/springboot-java-kafka/blob/master/README.md

# 4
    Import Maven Project in Eclipse, Right Click on Eclipse Project MyKafkaProducer, Run As Maven install

# 5 
    Right Click MyKafkaProducerApplication.java, Run As -> Java Application

# 6
    sample logs on eclipse console

    
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::       (v2.3.10.RELEASE)

2021-05-19 12:23:43.382  INFO 20707 --- [           main] c.g.k.p.MyKafkaProducerApplication       : Starting MyKafkaProducerApplication on ubuntu-pc with PID 20707 (/home/ravi/Desktop/Applications/eclipse/jee-2020-03/eclipse/this.workspace/MyKafkaProducer/target/classes started by ravi in /home/ravi/Desktop/Applications/eclipse/jee-2020-03/eclipse/this.workspace/MyKafkaProducer)
2021-05-19 12:23:43.387  INFO 20707 --- [           main] c.g.k.p.MyKafkaProducerApplication       : No active profile set, falling back to default profiles: default
2021-05-19 12:23:44.727  INFO 20707 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 9001 (http)
2021-05-19 12:23:44.744  INFO 20707 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2021-05-19 12:23:44.744  INFO 20707 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.45]
2021-05-19 12:23:44.847  INFO 20707 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2021-05-19 12:23:44.847  INFO 20707 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1373 ms
2021-05-19 12:23:44.983  INFO 20707 --- [           main] c.g.k.p.MyKafkaProducerApplication       : MyKafkaProducerApplication() invoked..!
2021-05-19 12:23:44.985  INFO 20707 --- [           main] c.g.k.p.MyKafkaProducerApplication       : sending messages to kafka..!
2021-05-19 12:23:45.029  INFO 20707 --- [           main] o.a.k.clients.producer.ProducerConfig    : ProducerConfig values: 
	acks = 1
	batch.size = 16384
	bootstrap.servers = [192.168.1.210:9092]
	buffer.memory = 33554432
	client.dns.lookup = default
	client.id = producer-1
	compression.type = none
	connections.max.idle.ms = 540000
	delivery.timeout.ms = 120000
	enable.idempotence = false
	interceptor.classes = []
	key.serializer = class org.apache.kafka.common.serialization.StringSerializer
	linger.ms = 0
	max.block.ms = 60000
	max.in.flight.requests.per.connection = 5
	max.request.size = 1048576
	metadata.max.age.ms = 300000
	metadata.max.idle.ms = 300000
	metric.reporters = []
	metrics.num.samples = 2
	metrics.recording.level = INFO
	metrics.sample.window.ms = 30000
	partitioner.class = class org.apache.kafka.clients.producer.internals.DefaultPartitioner
	receive.buffer.bytes = 32768
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
	transaction.timeout.ms = 60000
	transactional.id = null
	value.serializer = class org.apache.kafka.common.serialization.StringSerializer

2021-05-19 12:23:45.197  INFO 20707 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka version: 2.5.1
2021-05-19 12:23:45.199  INFO 20707 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId: 0efa8fb0f4c73d92
2021-05-19 12:23:45.200  INFO 20707 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka startTimeMs: 1621407225195
2021-05-19 12:23:45.644  INFO 20707 --- [ad | producer-1] org.apache.kafka.clients.Metadata        : [Producer clientId=producer-1] Cluster ID: rYAbZAeXQhCDOaKo9-JTsA
2021-05-19 12:23:45.673  INFO 20707 --- [           main] c.g.k.p.MyKafkaProducerApplication       : messages sent to kafka..!
2021-05-19 12:23:45.835  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 0 with offset -200
2021-05-19 12:23:45.837  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 1 with offset -201
2021-05-19 12:23:45.838  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 2 with offset -202
2021-05-19 12:23:45.838  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 3 with offset -203
2021-05-19 12:23:45.839  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 4 with offset -204
2021-05-19 12:23:45.839  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 5 with offset -205
2021-05-19 12:23:45.843  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 6 with offset -206
2021-05-19 12:23:45.843  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 7 with offset -207
2021-05-19 12:23:45.843  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 8 with offset -208
2021-05-19 12:23:45.843  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 9 with offset -209
2021-05-19 12:23:45.844  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 10 with offset -210
2021-05-19 12:23:45.844  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 11 with offset -211
2021-05-19 12:23:45.844  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 12 with offset -212
2021-05-19 12:23:45.844  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 13 with offset -213
2021-05-19 12:23:45.844  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 14 with offset -214
2021-05-19 12:23:45.844  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 15 with offset -215
2021-05-19 12:23:45.845  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 16 with offset -216
2021-05-19 12:23:45.845  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 17 with offset -217
2021-05-19 12:23:45.845  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 18 with offset -218
2021-05-19 12:23:45.845  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 19 with offset -219
2021-05-19 12:23:45.845  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 20 with offset -220
2021-05-19 12:23:45.845  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 21 with offset -221
2021-05-19 12:23:45.846  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 22 with offset -222
2021-05-19 12:23:45.846  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 23 with offset -223
2021-05-19 12:23:45.846  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 24 with offset -224
2021-05-19 12:23:45.846  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 25 with offset -225
2021-05-19 12:23:45.846  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 26 with offset -226
2021-05-19 12:23:45.847  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 27 with offset -227
2021-05-19 12:23:45.847  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 28 with offset -228
2021-05-19 12:23:45.847  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 29 with offset -229
2021-05-19 12:23:45.848  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 30 with offset -230
2021-05-19 12:23:45.848  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 31 with offset -231
2021-05-19 12:23:45.848  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 32 with offset -232
2021-05-19 12:23:45.850  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 33 with offset -233
2021-05-19 12:23:45.853  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 34 with offset -234
2021-05-19 12:23:45.853  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 35 with offset -235
2021-05-19 12:23:45.853  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 36 with offset -236
2021-05-19 12:23:45.854  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 37 with offset -237
2021-05-19 12:23:45.855  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 38 with offset -238
2021-05-19 12:23:45.855  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 39 with offset -239
2021-05-19 12:23:45.855  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 40 with offset -240
2021-05-19 12:23:45.855  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 41 with offset -241
2021-05-19 12:23:45.855  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 42 with offset -242
2021-05-19 12:23:45.855  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 43 with offset -243
2021-05-19 12:23:45.856  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 44 with offset -244
2021-05-19 12:23:45.856  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 45 with offset -245
2021-05-19 12:23:45.856  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 46 with offset -246
2021-05-19 12:23:45.864  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 47 with offset -247
2021-05-19 12:23:45.865  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 48 with offset -248
2021-05-19 12:23:45.865  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 49 with offset -249
2021-05-19 12:23:45.865  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 50 with offset -250
2021-05-19 12:23:45.865  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 51 with offset -251
2021-05-19 12:23:45.865  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 52 with offset -252
2021-05-19 12:23:45.865  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 53 with offset -253
2021-05-19 12:23:45.865  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 54 with offset -254
2021-05-19 12:23:45.865  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 55 with offset -255
2021-05-19 12:23:45.866  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 56 with offset -256
2021-05-19 12:23:45.866  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 57 with offset -257
2021-05-19 12:23:45.866  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 58 with offset -258
2021-05-19 12:23:45.866  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 59 with offset -259
2021-05-19 12:23:45.866  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 60 with offset -260
2021-05-19 12:23:45.866  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 61 with offset -261
2021-05-19 12:23:45.866  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 62 with offset -262
2021-05-19 12:23:45.866  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 63 with offset -263
2021-05-19 12:23:45.867  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 64 with offset -264
2021-05-19 12:23:45.867  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 65 with offset -265
2021-05-19 12:23:45.867  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 66 with offset -266
2021-05-19 12:23:45.869  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 67 with offset -267
2021-05-19 12:23:45.870  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 68 with offset -268
2021-05-19 12:23:45.870  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 69 with offset -269
2021-05-19 12:23:45.871  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 70 with offset -270
2021-05-19 12:23:45.872  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 71 with offset -271
2021-05-19 12:23:45.872  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 72 with offset -272
2021-05-19 12:23:45.879  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 73 with offset -273
2021-05-19 12:23:45.880  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 74 with offset -274
2021-05-19 12:23:45.880  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 75 with offset -275
2021-05-19 12:23:45.880  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 76 with offset -276
2021-05-19 12:23:45.880  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 77 with offset -277
2021-05-19 12:23:45.880  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 78 with offset -278
2021-05-19 12:23:45.880  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 79 with offset -279
2021-05-19 12:23:45.881  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 80 with offset -280
2021-05-19 12:23:45.883  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 81 with offset -281
2021-05-19 12:23:45.883  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 82 with offset -282
2021-05-19 12:23:45.883  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 83 with offset -283
2021-05-19 12:23:45.883  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 84 with offset -284
2021-05-19 12:23:45.884  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 85 with offset -285
2021-05-19 12:23:45.884  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 86 with offset -286
2021-05-19 12:23:45.884  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 87 with offset -287
2021-05-19 12:23:45.884  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 88 with offset -288
2021-05-19 12:23:45.884  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 89 with offset -289
2021-05-19 12:23:45.884  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 90 with offset -290
2021-05-19 12:23:45.884  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 91 with offset -291
2021-05-19 12:23:45.884  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 92 with offset -292
2021-05-19 12:23:45.884  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 93 with offset -293
2021-05-19 12:23:45.887  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 94 with offset -294
2021-05-19 12:23:45.887  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 95 with offset -295
2021-05-19 12:23:45.887  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 96 with offset -296
2021-05-19 12:23:45.890  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 97 with offset -297
2021-05-19 12:23:45.890  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 98 with offset -298
2021-05-19 12:23:45.890  INFO 20707 --- [ad | producer-1] c.g.k.p.service.KafkaProducerService     : Sent Message - message 99 with offset -299
2021-05-19 12:23:45.945  INFO 20707 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2021-05-19 12:23:46.243  INFO 20707 --- [           main] o.a.k.clients.admin.AdminClientConfig    : AdminClientConfig values: 
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

2021-05-19 12:23:46.268  INFO 20707 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka version: 2.5.1
2021-05-19 12:23:46.269  INFO 20707 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId: 0efa8fb0f4c73d92
2021-05-19 12:23:46.269  INFO 20707 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka startTimeMs: 1621407226268
2021-05-19 12:23:46.334  INFO 20707 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 9001 (http) with context path ''
2021-05-19 12:23:46.349  INFO 20707 --- [           main] c.g.k.p.MyKafkaProducerApplication       : Started MyKafkaProducerApplication in 3.481 seconds (JVM running for 3.976)
   
   
# Messages are produced/sent to the mentioned Topic