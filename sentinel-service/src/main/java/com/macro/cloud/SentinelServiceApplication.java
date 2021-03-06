package com.macro.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @DESC:
 * @author: zhouben
 * @date: 2020/7/12 0012 10:38
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SentinelServiceApplication.class, args);
    }
}
