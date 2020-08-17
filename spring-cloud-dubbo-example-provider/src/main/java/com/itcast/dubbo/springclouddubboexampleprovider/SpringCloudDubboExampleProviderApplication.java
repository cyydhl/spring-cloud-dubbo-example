package com.itcast.dubbo.springclouddubboexampleprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudDubboExampleProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDubboExampleProviderApplication.class, args);
    }

}
