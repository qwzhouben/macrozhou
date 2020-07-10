package com.macro.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @DESC:
 * @author: zhouben
 * @date: 2020/7/10 0010 9:40
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigSecurityServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigSecurityServerApplication.class, args);
    }
}
