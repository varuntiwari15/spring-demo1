package com.test.demo.beanelements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "bean2")
public class BeanSecond {

    public void print(String msg){
        System.out.println("Bean :"+ this.getClass().getName()+" msg : "+ msg);
    }
}
