package com.yeasheng.cloudstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心启动类
 * @author yansh
 * @version 2021/5/30
 **/
@SpringBootApplication
@EnableEurekaServer
public class StoreEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(StoreEurekaApplication.class, args);
    }
}
