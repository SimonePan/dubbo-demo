package com.example.consumer.annotation;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.provider.service.annotation.ProviderAnnotation;
import org.springframework.stereotype.Component;

/**
 * @description: 消费者注解使用
 * @author: Grace.Pan
 * @create: 2019-11-30 15:11
 */
@Component("annotatedConsumer")
public class ConsumerAnnotationService {

    @Reference
    private ProviderAnnotation providerAnnotation;

    public String syaHello(String name) {
        return providerAnnotation.sayHello(name);
    }
}
