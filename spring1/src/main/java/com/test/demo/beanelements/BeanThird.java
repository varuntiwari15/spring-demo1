package com.test.demo.beanelements;

import org.springframework.stereotype.Component;

@Component
public class BeanThird {

    public String print(String msg){
        return "msg from upper bean: "+ msg;
    }
}
