package com.example.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoukai
 * @date 2018-07-27
 */
@RestController
@RequestMapping("/client")
public class HelloController {

    @Value("${server.port}")
    String port;

    @GetMapping("/home")
    public String home(@RequestParam("name") String name) {
        return String.format("Hello! name is %s, port is %s", name, port);
    }
}