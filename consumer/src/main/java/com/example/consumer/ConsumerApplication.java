package com.example.consumer;

import com.example.provider.DemoService;
import com.example.provider.DemoServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource({"classpath:consumer.xml"})
@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
        DemoService demoService = new DemoServiceImpl();
        System.out.println(demoService.sayHello("world"));
    }

}
