#STEP 1: GET KAFKA
  <br>https://downloads.apache.org/kafka/3.1.1/kafka_2.13-3.1.1.tgz<br/>
  <br>CD {path}/kafka_kafka_2.13-3.1.1<br/>

#STEP 2: START THE KAFKA ENVIRONMENT
  Start Zookeeper and Servers
  <br>$ bin/zookeeper-server-start.sh config/zookeeper.properties<br/>
  <br>$ bin/kafka-server-start.sh config/server.properties</br>

#STEP 3: CREATE A TOPIC TO STORE YOUR EVENTS
  $ bin/kafka-topics.sh --create --topic quickstart-events --bootstrap-server localhost:9092

#STEP 4: READ THE EVENTS
  $ bin/kafka-console-consumer.sh --topic quickstart-events --from-beginning --bootstrap-server localhost:9092





