package com.test.demo.configs;

import com.test.demo.beans.BeanA;
import com.test.demo.beans.BeanB;
import com.test.demo.beans.BeanC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig1 {

    @Bean
    public BeanA beanA(){
        return new BeanA();
    }

    @Bean
    public BeanB beanB(){
        return new BeanB();
    }

    @Bean
    public BeanC beanC(){
        return new BeanC();
    }
}
