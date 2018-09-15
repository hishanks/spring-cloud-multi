package com.example.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhoukai
 * @date 2018-07-27
 */
@RestController
@RequestMapping("/client")
public class HelloController {

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(@RequestParam("name") String name) {
        return String.format("Hello! name is %s, port is %s", name, port);
    }
}