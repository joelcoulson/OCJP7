package com.joelcoulson.nio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class BasicFileAttributesTest {

    public static void main(String[] args) {

        Path path = Paths.get("/usr/bin/ls");

        try {
            BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);

            System.out.println("Creation time: " + basicFileAttributes.creationTime());
            System.out.println("File size: " + basicFileAttributes.size());

        } catch(IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

}
