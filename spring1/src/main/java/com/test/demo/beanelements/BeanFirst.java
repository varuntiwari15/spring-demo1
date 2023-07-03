package com.test.demo.beanelements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("beanFirst-custom-name")
public class BeanFirst {

    @Autowired // default by type, if name use @Qualifier with that
    private BeanSecond beanSecond;

    public void print(String msg){
        System.out.println(beanSecond.print(msg));
    }
}
