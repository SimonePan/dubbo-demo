package com.example.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.util.concurrent.CountDownLatch;

/**
 * @author Grace
 */
// 使用xml配置时放开
//@ImportResource({"classpath:spring/provider.xml"})
@SpringBootApplication
public class ProviderApplication {
    private static CountDownLatch countDownLatch = new CountDownLatch(1);

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(ProviderApplication.class, args).registerShutdownHook();
        countDownLatch.await();
    }

}
