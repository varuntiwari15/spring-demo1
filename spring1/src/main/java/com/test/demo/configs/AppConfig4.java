package com.test.demo.configs;

import com.test.demo.beans.EagerBean;
import com.test.demo.beans.LazyBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {LazyBean.class})
public class AppConfig4 {

}
