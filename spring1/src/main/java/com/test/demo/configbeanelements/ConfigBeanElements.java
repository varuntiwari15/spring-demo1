package com.test.demo.configbeanelements;

import com.test.demo.beanelements.BeanFirst;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = BeanFirst.class)
public class ConfigBeanElements {
}
