package com.tripillar.filehandling.text;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
    public static void main(String[] args) {
        String path = "C:/Users/palla/OneDrive/Desktop/output.txt.txt"; // Update this path
        String content = "Hello, this is a sample text.";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write(content);
            System.out.println("File written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
