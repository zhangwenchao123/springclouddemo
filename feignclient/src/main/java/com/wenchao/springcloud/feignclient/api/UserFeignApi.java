package com.wenchao.springcloud.feignclient.api;

import com.wenchao.springcloud.feignclient.client.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserFeignApi {


    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping(value = "/getUserByFeign")
    public String getUserByFeign(){

        String result = userFeignClient.getUser();
        return result;
    }
}
