package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        Path path = Paths.get("path/to/file.txt");
        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            System.out.println("Error deleting file: " + e.getMessage());
        }
    }
}

--- END CODE ---