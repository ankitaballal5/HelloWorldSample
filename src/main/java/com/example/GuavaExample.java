package com.example;

import com.google.common.collect.ImmutableList;
import java.util.List;

public class GuavaExample {
    public ImmutableList<String> getImmutableList(String... elements) {
        return ImmutableList.copyOf(elements);
    }
}