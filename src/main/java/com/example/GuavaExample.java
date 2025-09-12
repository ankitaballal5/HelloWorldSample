package com.example;


public class GuavaExample {
    public ImmutableList<String> getImmutableList(String... elements) {
        return ImmutableList.of(elements);
    }
}

---
// Changed getImmutableList method to use ImmutableList.of(elements) instead of ImmutableList.copyOf(elements)
// to avoid deprecation.