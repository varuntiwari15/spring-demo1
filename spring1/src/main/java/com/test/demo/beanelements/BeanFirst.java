package com.test.demo.beanelements;

import org.springframework.stereotype.Component;

@Component("beanFirst-custom-name")
public class BeanFirst {

    public void print(String msg){
        System.out.println("Bean :"+ this.getClass().getName()+" msg : "+ msg);
    }
}
