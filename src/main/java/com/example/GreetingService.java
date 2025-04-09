package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GreetingService {
    public String greet(String name) {
        return "Hello, " + name + "!";
    }
}