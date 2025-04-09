package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        Path path = Paths.get("path_to_your_file.txt");
        try {
            Files.readAllBytes(path);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

// Comment block summarizing changes:
// Replaced deprecated FileSystemUtils with NIO's Files class.
// Added try-catch block to handle IOExceptions when reading files.