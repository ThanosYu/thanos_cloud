package com.thanos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Thanos Yu
 * @date 2018/9/27
 */

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ClientApplication {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "Hi " + name + ",i am from port:" + port;
    }


    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }
}
