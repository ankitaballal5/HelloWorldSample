package com.example;

import java.util.List;

public class GuavaExample {
    public List<String> getImmutableList(String... elements) {
        return List.of(elements);
    }
}