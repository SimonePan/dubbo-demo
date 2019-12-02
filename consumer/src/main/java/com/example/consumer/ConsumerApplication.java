package com.example.consumer;

import com.example.consumer.annotation.ConsumerAnnotationService;
import com.example.consumer.config.DubboConfiguration;
import com.example.provider.service.DemoService;
import com.example.provider.service.impl.DemoServiceImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Grace
 */
//@ImportResource({"classpath:consumer.xml"})
@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        //SpringApplication.run(ConsumerApplication.class, args);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DubboConfiguration.class);
        context.start();
        ConsumerAnnotationService consumerAnnotationService = context.getBean(ConsumerAnnotationService.class);
        String grace = consumerAnnotationService.syaHello("Grace");
        System.out.println(grace);
    }

    private void testXml() {
        DemoService demoService = new DemoServiceImpl();
        System.out.println(demoService.sayHello("world"));
    }

}
