package com.example;

import java.util.ServiceLoader;

public class GreetingService {
    public String greet(String name) {
        return "Hello, " + name + "!";
    }
}