#!/bin/bash
nohup java -jar eureka/target/eureka-0.0.1-SNAPSHOT.jar > /home/projectlogs/eureka-log.txt &
nohup java -jar user/target/user-0.0.1-SNAPSHOT.jar > logs/user-log.txt &
nohup java -jar order/target/order-0.0.1-SNAPSHOT.jar > logs/order-log.txt &
nohup java -jar email/target/email-0.0.1-SNAPSHOT.jar > logs/email-log.txt &
nohup java -jar gateway/target/gateway-0.0.1-SNAPSHOT.jar > logs/gateway-log.txt &
nohup java -jar admin/target/admin-0.0.1-SNAPSHOT.jar > logs/admin-log.txt &
