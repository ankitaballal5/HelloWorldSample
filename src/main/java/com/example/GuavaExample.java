package com.example;

import com.google.common.collect.ImmutableList;

public class GuavaExample {
    public ImmutableList<String> getImmutableList(String... elements) {
        return ImmutableList.copyOf(elements);
    }
}
/*
 * Summary of changes:
 * No changes were necessary in this file as it does not contain any code related to the guava dependency upgrade. However, the Maven dependency for com.google.guava:guava should be updated to a version newer than 31.1-jre, and dependencies for org.apache.santuario and org.bouncycastle should be added or updated to their latest versions.
 */