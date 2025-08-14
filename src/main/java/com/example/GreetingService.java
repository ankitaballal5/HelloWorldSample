package com.example;

import com.google.common.base.Strings;

public class GreetingService {
    public String greet(String name) {
        return "Hello, " + Strings.capitalize(name) + "!";
    }
}