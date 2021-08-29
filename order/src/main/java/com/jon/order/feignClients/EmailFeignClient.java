package com.jon.order.feignClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Component
@FeignClient(value = "EMAIL-SERVICE")
public interface EmailFeignClient {

    @PostMapping(value = "/quoteemail")
    void quoteEmail(@RequestParam String clientId, @RequestParam String quote,
                    @RequestParam String driverId,@RequestParam String orderId);

    @PostMapping(value = "/statusemail")
    void statusEmail(@RequestParam String status, @RequestParam String userId, @RequestParam String orderId);

}
