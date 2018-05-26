package com.uyxyz.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderValidationTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dubbo-provider-validation.xml");
        context.start();
        try {
            Thread.sleep(2000000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
