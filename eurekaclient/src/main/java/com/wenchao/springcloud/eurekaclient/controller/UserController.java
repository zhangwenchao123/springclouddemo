package com.wenchao.springcloud.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RestController
public class UserController {

    @Value("${server.port}")
    private  String serverPort;

    @Value("${testParm}")
    private String  testParm;


    @GetMapping(value = "/getUser")
    public String  getUser(){

        return "配置参数："+testParm+" 服务器端口号"+serverPort+"用户信息:小明"+ UUID.randomUUID().toString();
    }

}
