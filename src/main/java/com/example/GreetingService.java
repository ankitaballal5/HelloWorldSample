package com.example;

import com.google.common.base.Strings;

public class GreetingService {
    public String greet(String name) {
        return "Hello, " + Strings.nullToEmpty(name) + "!";
    }
}

<!-- Maven dependency for Guava -->
<dependency>
    <groupId>com.google.guava</groupId>
    <artifactId>guava</artifactId>
    <version>33.4.8</version>
</dependency>