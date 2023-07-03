package com.test.demo.app;

import com.test.demo.client.TestClient;
import com.test.demo.service.HelloWorldService;
import com.test.demo.service.impl.HelloWorldServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppRunner {

    @Bean
    public HelloWorldService createHelloWorldService() {
        return new HelloWorldServiceImpl();
    }

    @Bean
    public TestClient createClient() {
        return new TestClient();
    }

    public static void main(String... strings) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppRunner.class);
        TestClient bean = context.getBean(TestClient.class);
        bean.showMessage();

    }
}