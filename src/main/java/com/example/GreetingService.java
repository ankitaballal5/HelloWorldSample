package com.example;

import com.google.common.base.Strings;

public class GreetingService {
    public String greet(String name) {
        if (Strings.isNullOrEmpty(name)) {
            return "Hello, stranger!";
        }
        return "Hello, " + name + "!";
    }
}