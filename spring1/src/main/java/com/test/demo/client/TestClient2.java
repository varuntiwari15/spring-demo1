package com.test.demo.client;

import com.test.demo.beans.BeanA;
import com.test.demo.beans.BeanB;
import com.test.demo.beans.BeanC;
import com.test.demo.configs.AppConfig1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClient2 {
    public static void main(String[] args) {
        // create application context instance
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig1.class);
        //get beans and constructor messages will called
        BeanA beanA = context.getBean(BeanA.class);
        BeanB beanB = context.getBean(BeanB.class);
        BeanC beanC = context.getBean(BeanC.class);
        //output
        //beanA constructor called
        //beanB constructor called
        //beanC constructor called

    }
}
