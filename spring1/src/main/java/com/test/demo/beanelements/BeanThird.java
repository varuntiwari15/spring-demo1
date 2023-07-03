package com.test.demo.beanelements;

import org.springframework.stereotype.Component;

@Component
public class BeanThird {

    public void print(String msg){
        System.out.println("Bean :"+ this.getClass().getName()+" msg : "+ msg);
    }
}
