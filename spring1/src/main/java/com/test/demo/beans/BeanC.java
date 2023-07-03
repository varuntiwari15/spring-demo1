package com.test.demo.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanC {
    public BeanC() {
        System.out.println("beanC constructor called");
    }
}
