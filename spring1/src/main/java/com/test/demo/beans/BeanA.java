package com.test.demo.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanA {
    public BeanA() {
        System.out.println("beanA constructor called");
    }
}
