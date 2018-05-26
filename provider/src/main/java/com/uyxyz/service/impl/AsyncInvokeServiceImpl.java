package com.uyxyz.service.impl;

import com.uyxyz.service.AsyncInvokeService;

public class AsyncInvokeServiceImpl implements AsyncInvokeService {

    public Integer getResult() {

        try {
            //睡眠3秒
            Thread.sleep(3000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return 0;
    }

    public String getResultStr() {

        try {
            //睡眠3秒
            Thread.sleep(3000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "ok";
    }
}
