package com.test.demo.beanelements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "bean2")
public class BeanSecond {

    @Autowired
    private BeanThird beanThird;

    public String print(String msg){
        return beanThird.print(msg);
    }
}
