package com.example;

import com.google.common.collect.ImmutableList;
import java.util.List;

public class GuavaExample {
    public List<String> getImmutableList(String... elements) {
        return ImmutableList.copyOf(List.of(elements));
    }
}