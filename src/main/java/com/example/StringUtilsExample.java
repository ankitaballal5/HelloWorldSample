package com.example;

import org.apache.commons.lang3.StringUtils;

public class StringUtilsExample {
    public boolean isPalindrome(String input) {
        if (StringUtils.isEmpty(input)) {
            return false;
        }
        String reversed = StringUtils.reverse(input);
        return input.equals(reversed);
    }
}

/*
 * Changes:
 * 1. No changes were made to the provided Java code as it does not contain any deprecated methods or usages related to the commons-lang3 dependency.
 * 2. Ensure the project's Maven dependency for com.google.guava:guava is updated to a version newer than 31.1-jre.
 * 3. Add or update dependencies for org.apache.santuario and org.bouncycastle to their latest versions.
 */