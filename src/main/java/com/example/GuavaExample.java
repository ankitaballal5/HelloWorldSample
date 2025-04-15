package com.example;

import java.util.List;
import java.util.stream.Collectors;

public class GuavaExample {
    public List<String> getImmutableList(String... elements) {
        return List.of(elements);
    }
}