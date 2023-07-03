package com.test.demo.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanB {
    public BeanB() {
        System.out.println("beanB constructor called");
    }
}
