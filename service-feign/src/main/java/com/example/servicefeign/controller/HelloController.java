package com.example.servicefeign.controller;

import com.example.servicefeign.service.ScheduleEurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoukai
 * @date 2018/7/27
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
     * 对外暴露一个/feign/hi?name=kevin接口
     *
     * @param name
     * @return
     */
    @GetMapping("/hi")
    public String sayHiFromEurekaClient(@RequestParam("name") String name) {
        return scheduleEurekaClient.sayHiFromEurekaClient(name);
    }
}