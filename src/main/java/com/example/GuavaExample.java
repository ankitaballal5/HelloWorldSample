package com.example;

import com.google.common.collect.ImmutableList.Builder;

public class GuavaExample {
    public ImmutableList<String> getImmutableList(String... elements) {
        Builder<String> builder = ImmutableList.builder();
        for (String element : elements) {
            if (element != null) {
                builder.add(element);
            }
        }
        return builder.build();
    }
}

// Changes:
// - Replaced ImmutableList.copyOf(elements) with ImmutableList.builder().add(elements).build() to address nullness errors.
// - Added null check for each element in the getImmutableList method to prevent NullPointerException.