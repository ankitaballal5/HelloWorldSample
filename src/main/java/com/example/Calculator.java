package com.example;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}

/*
 * Changes:
 * 1. No changes were made to the Calculator class as it does not contain any Guava-related code or deprecated methods.
 * 2. The Maven dependency for com.google.guava:guava should be updated to a version newer than 31.1-jre.
 * 3. Dependencies for org.apache.santuario and org.bouncycastle should be updated to their latest versions.
 * 4. The Guava Beta Checker should be used to ensure that no @Beta APIs are used in the project.
 */