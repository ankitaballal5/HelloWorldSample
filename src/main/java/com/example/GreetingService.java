package com.example;

import java.util.Formatter;

public class GreetingService {
    public String greet(String name) {
        return String.format("Hello, %s!", name);
    }
}