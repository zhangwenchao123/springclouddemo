package com.wenchao.springcloud.feignclient.client.FallBack;

import com.wenchao.springcloud.feignclient.client.UserFeignClient;
import org.springframework.stereotype.Component;

@Component
public class UserFallBack implements UserFeignClient {

    @Override
    public String getUser() {
        return "feign hystrix 熔断";
    }
}
