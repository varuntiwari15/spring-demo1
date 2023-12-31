package com.test.demo.configs;

import com.test.demo.beans.BeanA;
import com.test.demo.beans.BeanB;
import com.test.demo.beans.BeanC;
import com.test.demo.beans.BeansInterface;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.test.demo.beans")  // base package to scan beans
//@ComponentScan // default scan class path all packages
//@ComponentScan(basePackageClasses = {BeanA.class, BeanB.class, BeanC.class}) // defined by specific class names
//@ComponentScan(basePackages = "com.test.demo.beans")  // with base packages value
//@ComponentScan(basePackageClasses = BeansInterface.class) // defined one interface for all bean classes
@ComponentScan(basePackageClasses = BeanC.class) // or give any one class of package, it will scan all classes
public class AppConfig2 {
    // no need to define @Bean for beans, use @Component, @Controller, @Service, @Repository etc on beans
}
