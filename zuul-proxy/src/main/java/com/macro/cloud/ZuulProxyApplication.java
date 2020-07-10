package com.macro.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @DESC:
 * @author: zhouben
 * @date: 2020/7/9 0009 18:04
 */
@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
public class ZuulProxyApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulProxyApplication.class, args);
    }
}
