package com.example.serviceribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 基于Java Config配置RestTemplate
 *
 * @author zhoukai
 * @date 2018/7/27
 */
@Configuration
public class RestTemplateConfig {

    /**
     * 通过@Bean注解向IoC容器注入一个Bean：restTemplate
     * 通过@LoadBalanced注解表明restTemplate开启负载均衡
     *
     * @return restTemplate
     */
    @Bean
    @LoadBalanced
    RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}