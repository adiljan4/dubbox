package com.uyxyz.service.impl;

import com.uyxyz.service.ValidationService;
import com.uyxyz.service.pojo.ValidationParameter;

public class ValidationServiceImpl implements ValidationService {

    public void save(ValidationParameter parameter) {
        System.out.println(parameter);
        System.out.println("save successfully");
    }

    public void update(ValidationParameter parameter) {
        System.out.println(parameter);
        System.out.println("save successfully");
    }

    public void delete(long id, String operator) {
        System.out.println(id+""+operator);
        System.out.println("delete successfully");
    }
}
