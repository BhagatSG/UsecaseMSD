# Springboot-Hive Integration Web UI for Data Visualisation

Pre-requisite:\
-->Hadoop-services up using\
start-all.sh\
-->HiveServer2 and HiveMetaStore services up using\
cd /Users/bhagat/Data/appData/hive/scripts\
run-hive.sh start


In src/main/resources/application.properties, change the url, username & password for Hive.

you can run the application using ./mvnw spring-boot:run.\
Or you can build the JAR file with ./mvnw clean package.\
Then you can run the JAR file: --> java -jar target/gs-accessing-data-mysql-0.1.0.jar

Now that the application is running, you can test it.\
http://localhost:8080/ --> It will show the index.html view with two hyperlinks for First Query Output & Second Query Output in tabular form.\
http://localhost:8080/showfirstQueryOutputs --> It will show the First Query Output.\
http://localhost:8080/showsecondQueryOutputs --> It will show the Second Query Output.

