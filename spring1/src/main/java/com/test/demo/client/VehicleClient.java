package com.test.demo.client;

import com.test.demo.beansautowiring.VehicleUser;
import com.test.demo.configs2.VehicleConfig;
import com.test.demo.service.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class VehicleClient {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(VehicleConfig.class);
        VehicleUser vehicleUser = context.getBean(VehicleUser.class);
        vehicleUser.showVehicleName();
    }
}
