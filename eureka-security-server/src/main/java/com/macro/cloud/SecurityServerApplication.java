package com.macro.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @DESC:
 * @author: zhouben
 * @date: 2020/7/8 0008 21:52
 */
@EnableEurekaServer
@SpringBootApplication
public class SecurityServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SecurityServerApplication.class, args);
    }
}
