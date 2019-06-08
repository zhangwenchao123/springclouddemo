package com.wenchao.springcloud.ribbonclient.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserManagementRibbonClient {


    @Autowired
    private RestTemplate  restTemplate;

    // HystrixCommand 熔断机制 先提示  几秒后不再调用
    @GetMapping(value = "/getUserByRibbon")
    @HystrixCommand(fallbackMethod = "getUserByRibbonFallBack")
    public String getUserinfoByRibbon(){

         String   result = restTemplate.getForObject("http://service-eureka-client/getUser",String.class);
         return  result;
    }

    public String getUserByRibbonFallBack(){

        return "getUserByRibbon 调用节点故障";
    }
}
