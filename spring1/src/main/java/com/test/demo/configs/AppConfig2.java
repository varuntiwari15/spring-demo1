package com.test.demo.configs;

import com.test.demo.beans.BeanA;
import com.test.demo.beans.BeanB;
import com.test.demo.beans.BeanC;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.test.demo.beans")  // base package to scan beans
public class AppConfig2 {
    // no need to define @Bean for beans, use @Component, @Controller, @Service, @Repository etc on beans
}
