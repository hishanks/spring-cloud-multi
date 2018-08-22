package com.example.eurekaclienty;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoukai
 * @date 2018/7/28
 */
@RestController
@Slf4j
public class HelloController {

    @GetMapping("/hi")
    public String hi() {
        return "Hello World!";
    }
}
