package com.example;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.stream.Collectors;

public class GuavaExample {
    public ImmutableList<String> getImmutableList(String... elements) {
        return ImmutableList.copyOf(List.of(elements));
    }
}