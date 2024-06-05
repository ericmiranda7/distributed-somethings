package com.distributed.bffl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServiceDiscoveryController {
    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/service-instances/{appName}")
    public List<ServiceInstance> getServiceInstances(@PathVariable String appName) {
        return discoveryClient.getInstances(appName);
    }
}
