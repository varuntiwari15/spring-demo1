package com.test.demo.service.impl;

import com.test.demo.service.Vehicle;
import org.springframework.stereotype.Component;

@Component("car-bean")
public class Car implements Vehicle {
    @Override
    public void name() {
        System.out.println("I am CAR");
    }
}
