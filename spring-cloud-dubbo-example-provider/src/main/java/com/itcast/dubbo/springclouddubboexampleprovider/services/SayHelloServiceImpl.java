package com.itcast.dubbo.springclouddubboexampleprovider.services;

import com.itcast.dubbo.ISayHelloService;
import org.apache.dubbo.config.annotation.Service;


@Service
public class SayHelloServiceImpl implements ISayHelloService {

    @Override
    public String sayHello(String msg) {
        return "Hello, 啦啦啦";
    }
}
