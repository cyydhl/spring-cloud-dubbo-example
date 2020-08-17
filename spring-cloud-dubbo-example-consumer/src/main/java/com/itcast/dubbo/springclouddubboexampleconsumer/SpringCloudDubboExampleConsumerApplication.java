package com.itcast.dubbo.springclouddubboexampleconsumer;

import com.itcast.dubbo.ISayHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringCloudDubboExampleConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDubboExampleConsumerApplication.class, args);
    }

    @Reference
    ISayHelloService sayHelloService;

    @GetMapping("/say")
    public String say(){
        return sayHelloService.sayHello("yyy");
    }


}
