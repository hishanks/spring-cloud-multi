package com.example.servicefeign.service;

import org.springframework.stereotype.Service;

/**
 * @author zhoukai
 * @date 2018/7/27
 */
@Service
public class ScheduleEurekaClientImpl implements ScheduleEurekaClient {

    @Override
    public String sayHiFromEurekaClient(String name) {
        return String.format("执行熔断器方法，参数为：%s", name);
    }
}