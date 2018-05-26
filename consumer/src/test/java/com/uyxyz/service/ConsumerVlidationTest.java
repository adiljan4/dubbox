package com.uyxyz.service;

import com.uyxyz.service.pojo.ValidationParameter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class ConsumerVlidationTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dubbo-consumer-validation.xml");
        context.start();
        ValidationService validationService  = (ValidationService)context.getBean("validationService");

        ValidationParameter validationParameter = new ValidationParameter();
        validationParameter.setName("birdil");
        validationParameter.setAge(18);
        validationParameter.setEmail("527542020@qq.com");
        validationParameter.setLoginDate(new Date(System.currentTimeMillis() - 1000000));
        validationParameter.setExpiryDate(new Date(System.currentTimeMillis() + 1000000));

//        validationService.save(validationParameter);
//        validationService.update(validationParameter);

        validationService.delete(1,"test");
        System.out.println("********** Vlidation Finshed ********** ");

        try {
            Thread.sleep(2000000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
