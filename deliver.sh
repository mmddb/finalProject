#!/bin/bash
nohup java -jar eureka/target/eureka-0.0.1-SNAPSHOT.jar &
nohup java -jar gateway/target/gateway-0.0.1-SNAPSHOT.jar &
nohup java -jar email/target/email-0.0.1-SNAPSHOT.jar &
nohup java -jar user/target/user-0.0.1-SNAPSHOT.jar &
nohup java -jar order/target/order-0.0.1-SNAPSHOT.jar &
nohup java -jar admin/target/admin-0.0.1-SNAPSHOT.jar &