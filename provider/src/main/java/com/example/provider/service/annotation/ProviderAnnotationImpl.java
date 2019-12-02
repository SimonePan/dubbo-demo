package com.example.provider.service.annotation;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @description: 注解方式
 * @author: Grace.Pan
 * @create: 2019-11-30 14:47
 */
@Service(timeout = 3000)
public class ProviderAnnotationImpl implements ProviderAnnotation {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
