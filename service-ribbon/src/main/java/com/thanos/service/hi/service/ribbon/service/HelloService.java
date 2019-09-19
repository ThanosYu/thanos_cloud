package com.thanos.service.hi.service.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Shi Qiang Yu
 * @date 9/18/2019 1:03 PM
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    // for hystrix
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
    }

    // for hystrix
    public String hiError(String name) {
        return name + ", sorry the hi client is not available!";
    }

}

