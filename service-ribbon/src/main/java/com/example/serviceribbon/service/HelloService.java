package com.example.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhoukai
 * @date 2018/7/27
 */
@Service
public class HelloService {

    private final RestTemplate restTemplate;

    @Autowired
    public HelloService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * 调用微服务eureka-client的/client/home?name=kevin接口
     * 注意事项：调用服务名大写
     *
     * @return String
     */
    @HystrixCommand(fallbackMethod = "invokeMethodFromClientError")
    public String invokeMethodFromClient(String name) {
        String url = "http://EUREKA-CLIENT/client/home?name=kevin";
        return restTemplate.getForObject(url, String.class);
    }

    /**
     * 熔断器方法
     *
     * @param name name
     * @return String
     */
    public String invokeMethodFromClientError(String name) {
        return "执行Ribbon中整合的熔断器方法，参数为：" + name;

    }
}