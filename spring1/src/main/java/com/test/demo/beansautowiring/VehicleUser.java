package com.test.demo.beansautowiring;

import com.test.demo.service.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleUser {
    @Autowired // ambiguity as three types of vehicles- Car, Bike, Cycle
    @Qualifier("cycle-bean")  // need to give any one type of impl of vehicle and this
    // combination can be used with CI, SI also
    private Vehicle vehicle;

    public void showVehicleName(){
        vehicle.name();
    }


}
