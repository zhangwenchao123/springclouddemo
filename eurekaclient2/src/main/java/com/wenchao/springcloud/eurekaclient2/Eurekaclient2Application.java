package com.wenchao.springcloud.eurekaclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Eurekaclient2Application {

    public static void main(String[] args) {
        SpringApplication.run(Eurekaclient2Application.class, args);
    }

}
