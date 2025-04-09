package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
/*
 * No changes were made to the original code as it does not contain any Guava-related code or deprecated methods.
 * To address the CVE-2023-2976 vulnerability and ensure compatibility with the latest Guava versions, 
 * update the Maven dependency for com.google.guava:guava to a version newer than 31.1-jre, 
 * and update dependencies for org.apache.santuario and org.bouncycastle to their latest versions in the project's pom.xml file.
 */