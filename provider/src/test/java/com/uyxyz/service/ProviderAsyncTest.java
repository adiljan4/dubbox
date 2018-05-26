package com.uyxyz.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderAsyncTest {

    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dubbo-provider-async.xml");
        context.start();
        Thread.sleep(2000000l);

    }
}
