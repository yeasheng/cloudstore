package com.yeasheng.cloudstore.controller;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户中心控制器
 *
 * @author yansh
 * @version 2021/6/1
 **/
@RestController
@RequestMapping("/user/data")
public class UserCenterController {

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private DiscoveryClient client;

    @GetMapping("/getTodayStatistic/{id}")
    public Integer getTodayStatistic(@PathVariable("id") Integer id){

        // 使用discoveryClient 类能够与eureka server 交互， getInstances 获取注册到eureka server的 "store-product-service" 实例列表

        List<ServiceInstance> instances = client.getInstances("store-product-service");

        // 获取第一个服务信息
        ServiceInstance instanceInfo = instances.get(0);
        //获取ip
        String ip = instanceInfo.getHost();
        //获取port
        int port = instanceInfo.getPort();
        String url  ="http://store-product-service/order/data/getTodayFinishOrderNum/"+id;
        System.out.println("请求URL："+url);
        return restTemplate.getForObject(url, Integer.class);
    }






}
