package com.test.demo.service.impl;

import com.test.demo.service.Vehicle;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("bike-bean")
//@Primary  use it if dont want to use Qualifier
public class Bike implements Vehicle {
    @Override
    public void name() {
        System.out.println("I am Bike");
    }
}
