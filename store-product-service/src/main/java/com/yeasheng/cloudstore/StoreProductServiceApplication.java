package com.yeasheng.cloudstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 商品服务生产者启动类
 * @author yansh
 * @version 2021/5/30
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class StoreProductServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(StoreProductServiceApplication.class, args);
    }
}
