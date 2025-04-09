package com.example;

import java.text.MessageFormat;

public class GreetingService {
    public String greet(String name) {
        return String.format("Hello, %s!", name);
    }
}