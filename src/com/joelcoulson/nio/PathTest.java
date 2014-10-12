package com.joelcoulson.nio;

import java.nio.file.*;
import java.io.File;

public class PathTest {
	
    public static void main(String[] args) {
        // create a new path object by calling the static get method
        Path path = Paths.get("C:\\Users\\Joel\\Projects\\OCJP7\\testfiles\\people.db");

        // get some basic information about the path
        System.out.println("File name: " + path.getFileName());
        System.out.println("Parent path: " + path.getRoot());
        System.out.println("Root directory: " + path.getRoot());
        System.out.println("Full path URI: " + path.toUri());

        // this will return the normalized path (that is the path without
        // dots and also following symlinks)
        System.out.println("Absolute path: " + path.toAbsolutePath());

        // this will add the filename to the end of the directory specified in the path
        Path path2 = Paths.get("C:\\Users\\Joel\\Projects\\OCJP7\\testfiles\\");
        System.out.println("Resolved path: " + path2.resolve("people.db"));

        // this will generate a file object from a path
        File file = path.toFile();

        // this will compare two paths
        if(path.compareTo(path2.resolve("people.db")) == 0) {
            System.out.println(path.toAbsolutePath() + " is the same as " + path2.resolve("people.db").toAbsolutePath());
        }
	}
}
