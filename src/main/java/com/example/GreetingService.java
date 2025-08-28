package com.example;

import org.apache.commons.lang3.StringUtils;

public class GreetingService {
    public String greet(String name) {
        return "Hello, " + String.valueOf(name).substring(0, 1).toUpperCase() + name.substring(1) + "!";
    }
}