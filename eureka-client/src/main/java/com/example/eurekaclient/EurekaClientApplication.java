package com.example.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 创建一个服务提供者
 * 当Client向Server注册时，它会提供一些元数据，例如主机、端口、URL、主页等
 * Eureka Server从每个Client实例接收心跳消息
 * 如果心跳超时，则通常将该实例从注册Server中删除
 *
 * @author zhoukai
 * @date 2018-07-27
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }
}
