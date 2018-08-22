package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoukai
 * @date 2018/7/28
 */
@RestController
public class HelloController {

    @Value("${foo}")
    String foo;

    @GetMapping("/hi")
    public String hi() {
        return foo;
    }
}