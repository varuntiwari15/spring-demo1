package com.test.demo.client;

import com.test.demo.beans.LazyBean;
import com.test.demo.configs.AppConfig4;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClient4 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig4.class);
// all eager beans will be called, lazy beans will not be called until called manually
        LazyBean lazyBean = context.getBean(LazyBean.class); // now lazy bean will be called
    }
}
