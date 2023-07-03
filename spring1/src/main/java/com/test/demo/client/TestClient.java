package com.test.demo.client;

import com.test.demo.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;

public class TestClient {

    @Autowired
    private HelloWorldService helloWorld;

    public void showMessage() {
        helloWorld.print("Hello world!");
    }
}
