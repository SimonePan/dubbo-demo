package com.example.provider;

import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: Grace.Pan
 * @create: 2019-11-29 10:45
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello" + name;
    }
}
