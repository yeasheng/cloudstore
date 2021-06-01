package com.yeasheng.cloudstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 消费者服务启动类
 *
 * @author yansh
 * @version 2021/6/1
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class StorePortalApplication {
    public static void main(String[] args) {
        SpringApplication.run(StorePortalApplication.class, args);
    }
}
