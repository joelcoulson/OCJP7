package com.joelcoulson.nio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FileTest {

    public static void main(String[] args) {

        Path path = Paths.get("C:\\Users\\Joel\\Projects\\OCJP7\\testfiles\\people.db");

        // checking for various file attributes
        if(Files.isDirectory(path)) {
            System.out.println(path.toAbsolutePath() + " is a directory");
        }
        if(Files.isExecutable(path)) {
            System.out.println(path.toAbsolutePath() + " is executable");
        }
        if(Files.isReadable(path)) {
            System.out.println(path.toAbsolutePath() + " is readable");
        }

        try {
            // here we get some more attributes individually
            System.out.println("File size is (bytes): " + Files.getAttribute(path, "size", LinkOption.NOFOLLOW_LINKS));
            System.out.println("Create time: " + Files.getAttribute(path, "creationTime", LinkOption.NOFOLLOW_LINKS));

            // here we get all the attributes at once using the basicfileattributes class
            BasicFileAttributes bfa = Files.readAttributes(path, BasicFileAttributes.class);
            System.out.println("File size is (bytes): " + bfa.size());
            System.out.println("Create time: " + bfa.creationTime());
        } catch(IOException ioe) {
            System.out.println(ioe);
        }
    }
}
