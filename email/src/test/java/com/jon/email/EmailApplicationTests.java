package com.jon.email;

import com.jon.email.feignClients.UserFeignClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootTest
class EmailApplicationTests {

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private UserFeignClient userFeignClient;

    @Test
    public void sendSimpleMail() throws Exception {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("763989249@qq.com");
        message.setTo("zphjon@gmail.com");

        message.setSubject("主题：简单邮件");
        message.setText("测试邮件内容");

        mailSender.send(message);
    }

    @Test
    public void getEmail() {
        System.out.println(userFeignClient.getUserEmail("3"));
        System.out.println(userFeignClient.getUserEmail("4"));
        System.out.println(userFeignClient.getUserEmail("5"));
        System.out.println(userFeignClient.getUserEmail("6"));
        System.out.println(userFeignClient.getUserEmail("7"));
    }


}
