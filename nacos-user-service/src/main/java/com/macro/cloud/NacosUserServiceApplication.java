package com.macro.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @DESC:
 * @author: zhouben
 * @date: 2020/7/9 0009 14:10
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosUserServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosUserServiceApplication.class, args);
    }
}
