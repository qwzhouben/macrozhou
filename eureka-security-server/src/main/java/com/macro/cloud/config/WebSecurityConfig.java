package com.macro.cloud.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @DESC: 默认情况下添加SpringSecurity依赖的应用每个请求都需要添加CSRF
 * token才能访问，Eureka客户端注册时并不会添加，所以需要配置/eureka/**路径不需要CSRF token
 * @author: zhouben
 * @date: 2020/7/8 0008 21:53
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().ignoringAntMatchers("/eureka/**");
        super.configure(http);
    }
}
