package com.test.demo.beansautowiring;

import com.test.demo.service.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleUser {
    @Autowired // ambiguity as three types of vehicles- Car, Bike, Cycle, also can user JSr-@Inject
    @Qualifier("cycle-bean")  // need to give any one type of impl of vehicle and this
    // combination can be used with CI, SI also, also this combination
    // instead of this combination (@Autowired and @Qualifier("test")) we can also use
    // JSR @Resource("test") annotation
    // or @Inject with @Qualifier
    // or @Inject and @Named === @Qualifier
    // also we can use @Primary to denote priority bean selection..like for Bike @Primary
    // then remove Qualifier with name and use only @Primary at Bike class
    private Vehicle vehicle;

    public void showVehicleName(){
        vehicle.name();
    }


}
