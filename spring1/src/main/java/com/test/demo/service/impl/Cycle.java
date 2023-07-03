package com.test.demo.service.impl;

import com.test.demo.service.Vehicle;
import org.springframework.stereotype.Component;

@Component("cycle-bean")
public class Cycle implements Vehicle {
    @Override
    public void name() {
        System.out.println("I am cycle");
    }
}
