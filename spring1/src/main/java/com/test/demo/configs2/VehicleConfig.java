package com.test.demo.configs2;

import com.test.demo.service.Vehicle;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.test.demo.service", "com.test.demo.beansautowiring"})
public class VehicleConfig {
}
