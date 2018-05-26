package com.uyxyz.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dubbo-consumer.xml");
        context.start();
        IDemoService iDemoService = (IDemoService)context.getBean("demoService");
        System.out.println(iDemoService.sayHello());
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
