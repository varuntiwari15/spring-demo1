package com.test.demo.beans2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
    private String firstName;
    private String lastName;

    //@Autowired  // field level DI
    private Address address;

    //@Autowired  // constructor based DI // also can omit this in new spring version
    public User(Address address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    /*@Autowired  // setter DI
    public void setAddress(Address address) {
        this.address = address;
    }*/
}
