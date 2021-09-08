package com.jon.email;

import com.jon.email.feignClients.UserFeignClient;
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

    @Autowired
    private UserFeignClient userFeignClient;

    private final String OFFICIAL_EMAIL = "763989249@qq.com";

    @PostMapping(value = "/statusemail")
    @ApiOperation(value = "Send e-mail to user when order status has updated")
    public ResponseEntity statusEmail(String status, String userId, String orderId) throws Exception {
        try {
            String content = "Hi, your order ( Id : " + orderId + " ) status has been updated to " + status +
                    " ,you can check the details in our website." + " \n\n Best wishes!";
            String email = userFeignClient.getUserEmail(userId);
            send(email, "Order Status Update", content);
        }catch (Exception e){
            return new ResponseEntity(null, HttpStatus.EXPECTATION_FAILED);
        }
        return new ResponseEntity(null, HttpStatus.CREATED);
    }

    @PostMapping(value = "/registeremail")
    @ApiOperation("send a register confirmation email")
    public ResponseEntity registerEmail(String email, String username) throws Exception {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(OFFICIAL_EMAIL);
            message.setTo(email);
            message.setSubject(" Register Confirmation");
            message.setText("How are you, " + username +" ! Your have registered with us successfully. \n\n" +
                    "Best wishes!" );
            message.setSentDate(new Date(System.currentTimeMillis()));
            mailSender.send(message);
        }catch (Exception e){
            return new ResponseEntity(null, HttpStatus.EXPECTATION_FAILED);
        }
        return new ResponseEntity(null, HttpStatus.CREATED);
    }

    @PostMapping(value = "/quoteemail")
    @ApiOperation(value = "Send e-mail to tell user when driver give quote")
    public ResponseEntity quoteEmail(String clientId, String quote, String driverId, String orderId) throws Exception {
        try {
            String clientEmail = userFeignClient.getUserEmail(clientId);
            String payment = userFeignClient.getUserPayment(driverId);
            String content = "Hi, there was a quote of " + quote + " pounds given to your order" +
                   ", please login to the website to see the details." +
                    "\n Driver's payment info : " + payment +
                    "\n after you paid, remember click the paid button in your website account";
            System.out.println(clientEmail + payment + content);

            // 接受链接 set fetched orderId, driverid, PUT ??
            String accept = "You can click http://34.150.38.10:8082/accept?driverId="+driverId+"&orderId="+orderId
                    + " to accept \n";
            // reviews
            String review = "Click http://34.150.38.10:8081/review?userId="+driverId
                    + " to see the reviews of driver";

            send(clientEmail, "New quote", content  + accept + review);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity(null, HttpStatus.EXPECTATION_FAILED);
        }
        return new ResponseEntity(null, HttpStatus.CREATED);
    }

    private void send(String email, String subject, String content) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(OFFICIAL_EMAIL);
        message.setTo(email);
        message.setSubject(subject);
        message.setText(content);
        message.setSentDate(new Date(System.currentTimeMillis()));
        System.out.println(message);
        mailSender.send(message);
    }
}
