package com.test.demo.beans;

import org.springframework.stereotype.Component;

@Component
public class EagerBean {
    public EagerBean() {
        System.out.println("I am eager bean");
    }
}
