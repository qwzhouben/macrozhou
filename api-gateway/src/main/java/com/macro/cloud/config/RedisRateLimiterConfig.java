package com.macro.cloud.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

/**
 * @DESC: 添加限流策略的配置类，这里有两种策略一种是根据请求参数中的username进行限流，
 * 另一种是根据访问IP进行限流；
 * @author: zhouben
 * @date: 2020/7/11 0011 9:09
 */
@Configuration
public class RedisRateLimiterConfig {

    /*@Bean
    KeyResolver usernameKeyResolver() {
        return exchange -> Mono.just(exchange.getRequest().getQueryParams().getFirst("username"));
    }*/

    @Bean
    KeyResolver ipKeyResolver() {
        return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getHostName());
    }
}
