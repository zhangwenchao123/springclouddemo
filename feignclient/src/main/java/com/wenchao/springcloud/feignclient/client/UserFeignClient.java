package com.wenchao.springcloud.feignclient.client;

import com.wenchao.springcloud.feignclient.client.FallBack.UserFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-eureka-client",fallback = UserFallBack.class)
public interface UserFeignClient {

    @GetMapping(value = "/getUser")
    public String getUser();
}
