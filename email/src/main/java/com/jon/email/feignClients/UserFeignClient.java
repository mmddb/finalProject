package com.jon.email.feignClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "USER-SERVICE")
public interface UserFeignClient {

    @RequestMapping(value = "/email")
    String getUserEmail(@RequestParam String userId);
}
