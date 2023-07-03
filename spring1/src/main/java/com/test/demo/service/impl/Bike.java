package com.test.demo.service.impl;

import com.test.demo.service.Vehicle;
import org.springframework.stereotype.Component;

@Component("bike-bean")
public class Bike implements Vehicle {
    @Override
    public void name() {
        System.out.println("I am Bike");
    }
}
