package com.uyxyz.service;

import com.alibaba.dubbo.rpc.RpcContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Currency;
import java.util.concurrent.Future;

import static javax.print.attribute.standard.MediaPrintableArea.MM;

public class ConsumerAsyncTest {

    public static void main(String[] args) throws Exception {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dubbo-consumer-async.xml");
        context.start();

        long beginTime = System.currentTimeMillis();
        System.out.println("当前时间："+LocalDateTime.now());

        for(int i = 1 ; i <= 10 ; i ++) {

//            AsyncInvokeService asyncInvokeService = (AsyncInvokeService) context.getBean("asyncService");
//            Integer result =  asyncInvokeService.getResult();
//
//            //模拟本地复杂的逻辑操作，耗时4秒
//            Thread.sleep(4000l);
//
//            //本地经过4秒处理得到的计算数据是2
//            Integer localResult =  2;

            /***************异步调用方法**************/

            AsyncInvokeService asyncInvokeService = (AsyncInvokeService) context.getBean("asyncService");

//            Integer result =  asyncInvokeService.getResult();
            String result =  asyncInvokeService.getResultStr();

            System.out.println(String.format("第" + i + " 异步请求返回结果: "+result+"  当前时间："+LocalDateTime.now().toString()));

            Thread.sleep(4000l); //模拟本地复杂的逻辑操作，耗时4秒

//            Future<Integer> future = RpcContext.getContext().getFuture();
            Future<String> future = RpcContext.getContext().getFuture();

            result = future.get();
            System.out.println("第"+i+"次的本地方法执行后的时间:"+result);

            Integer localResult = 2 ; //本地经过4秒处理得到的计算数据是2

//            System.out.println("第"+i+"次 的调用时间"+(result + localResult));
            System.out.println("第"+i+"次  异步调用结果："+ result +" 本地处理时间："+ localResult);

        }

        System.out.println("调用10次总的使用的时间：" + (System.currentTimeMillis() - beginTime));

        Thread.sleep(2000000l);

    }


}
