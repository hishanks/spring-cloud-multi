package com.example.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 定义一个Feign接口
 * 通过@FeignClient("服务名")来指定调用哪个服务
 * 相对的@GetMapping("/client/home")指定调用哪个接口
 *
 * @author zhoukai
 * @date 2018/7/27
 */
@Component
@FeignClient(value = "eureka-client", fallback = ScheduleEurekaClientImpl.class)
public interface ScheduleEurekaClient {

    /**
     * 调用eureka-client服务的/client/home方法
     *
     * @param name name
     * @return String
     */
    @RequestMapping(value = "/client/home", method = RequestMethod.GET)
    String sayHiFromEurekaClient(@RequestParam("name") String name);
}