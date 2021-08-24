package com.jon.email.feignClients;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "USER-SERVICE")
public interface UserFeignClient {

    @RequestMapping(value = "/email")
    String getUserEmail(@RequestParam String userId);

    @RequestMapping(value = "/payment")
    String getUserPayment(@RequestParam String userId);
}
