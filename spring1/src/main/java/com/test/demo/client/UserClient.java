package com.test.demo.client;

import com.test.demo.beans2.Address;
import com.test.demo.beans2.User;
import com.test.demo.configs2.UserConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// DI example- field level autowiring, constructor DI, Setter DI
public class UserClient {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
        User user = context.getBean(User.class);
        String firstName = user.getFirstName();
        Address address = user.getAddress();
        System.out.println(firstName);
        System.out.println(address.getCity());

    }
}
