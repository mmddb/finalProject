package com.jon.email.feignClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Component
@FeignClient(value = "ORDER-SERVICE")
public interface OrderFeignClient {

    @GetMapping(value = "/order/{orderId}")
    String getOrderById(@PathVariable String orderId);
}
