package com.example;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;

public class GuavaExample {
    public ImmutableList<String> getImmutableList(String... elements) {
        Builder<String> builder = ImmutableList.builder();
        for (String element : elements) {
            builder.add(element);
        }
        return builder.build();
    }
}