package com.jon.email;


import com.jon.email.entity.Order;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@Api
@EnableEurekaClient
public class EmailController {

    @Autowired
    private JavaMailSender mailSender;

    private final String OFFICIAL_EMAIL = "763989249@qq.com";

    @PostMapping(value = "/statusemail")
    @ApiOperation(value = "Send e-mail to user when order status has updated")
    public ResponseEntity sendEmail(String status, String orderId, String driverId) throws Exception {
        try {
            sendmail(status, orderId, driverId);
        }catch (Exception e){
            return new ResponseEntity(null, HttpStatus.EXPECTATION_FAILED);
        }
        return new ResponseEntity(null, HttpStatus.CREATED);
    }

    @PostMapping(value = "/quoteemail")
    @ApiOperation(value = "Send e-mail to user when driver give quote to client's order")
    public ResponseEntity quoteEmail(String quote, String orderId, String driverId) throws Exception {
        try {
            // send to user, tell them the new quote
        }catch (Exception e){
            return new ResponseEntity(null, HttpStatus.EXPECTATION_FAILED);
        }
        return new ResponseEntity(null, HttpStatus.CREATED);
    }

    // subject : register success
    // order published, fetched, transported, completed
    private void sendmail(String status, String orderId, String useremail) throws Exception {

        // get user's email from USER SERVICES

        // get Order from ORDER_SERVICE
        Order order = new Order();
        // get User

        // Set driver's reviews link to user

        useremail = "zphjon@gmail.com";
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(OFFICIAL_EMAIL);

        message.setTo(useremail);
        message.setSubject("Order " + status);
        message.setText("Your order has been " + status + "\n " + order.toString() + "\n\n Best BravoTransport!");

        message.setSentDate(new Date(System.currentTimeMillis()));
        System.out.println(message);
        mailSender.send(message);
    }
}
