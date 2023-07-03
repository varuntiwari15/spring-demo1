package com.test.demo.configs2;

import com.test.demo.beans2.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = User.class)
public class UserConfig {
}
