package com.thanos.service.feign.service;

import org.springframework.stereotype.Component;

/**
 * @author Shi Qiang Yu
 * @date 9/19/2019 9:38 AM
 */
// for hystrix
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return name + ", Feign is sorry that hi client is not available!";
    }
}

