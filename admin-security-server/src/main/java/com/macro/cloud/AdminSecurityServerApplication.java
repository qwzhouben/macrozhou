package com.macro.cloud;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @DESC:
 * @author: zhouben
 * @date: 2020/7/11 0011 9:56
 */
@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
public class AdminSecurityServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminSecurityServerApplication.class,args);
    }
}
