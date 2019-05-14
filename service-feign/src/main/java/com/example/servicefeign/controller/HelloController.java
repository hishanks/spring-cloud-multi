package com.example.servicefeign.controller;

import com.example.servicefeign.service.ScheduleEurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Shanks
 * @date 2018-07-27
 */
@RestController
@RequestMapping("/feign")
public class HelloController {

    private final ScheduleEurekaClient scheduleEurekaClient;

    @Autowired
    public HelloController(ScheduleEurekaClient scheduleEurekaClient) {
        this.scheduleEurekaClient = scheduleEurekaClient;
    }

    /**
     * 对外暴露一个/feign/hi?name=Shanks的接口
     * 通过@FeignClient(value = "eureka-client", fallback = ScheduleEurekaClientImpl.class)调用微服务eureka-client的接口
     *
     * @param name name
     * @return String
     */
    @GetMapping("/hi")
    public String sayHiFromEurekaClient(@RequestParam("name") String name) {
        return scheduleEurekaClient.sayHiFromEurekaClient(name);
    }
}