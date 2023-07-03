package com.test.demo.client;

import com.test.demo.beans.BeanA;
import com.test.demo.beans.BeanB;
import com.test.demo.beans.BeanC;
import com.test.demo.configs.AppConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClient3 {
    public static void main(String[] args) {
        //application context instance
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig2.class);
        //get beans
        BeanA beanA = context.getBean(BeanA.class);
        BeanB beanB = context.getBean(BeanB.class);
        BeanC beanC = context.getBean(BeanC.class);
    }
}
