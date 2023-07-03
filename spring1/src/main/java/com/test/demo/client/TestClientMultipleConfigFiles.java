package com.test.demo.client;

import com.test.demo.configs.AppConfig1;
import com.test.demo.configs.AppConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// supply all config files in context or create one main config file and inject all other config files in that
// or use @Import with @Configuration and in @Import give other dependent config files
// configuration support all types of DI as normal beans does
public class TestClientMultipleConfigFiles {
    public static void main(String[] args) {
        // create application context instance and supply multiple config files
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig1.class, AppConfig2.class);
        //output--default eager loading while creating context it will load beans
        //beanA constructor called
        //beanB constructor called
        //beanC constructor called
    }
}
