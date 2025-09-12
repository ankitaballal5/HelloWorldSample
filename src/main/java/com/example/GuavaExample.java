package com.example;


public class GuavaExample {
    public ImmutableList<String> getImmutableList(String... elements) {
        return ImmutableList.of(elements);
    }
}

---
// Changed getImmutableList method to use ImmutableList.of() instead of ImmutableList.copyOf()
// to reflect the upgrade to Guava 33.4.8.