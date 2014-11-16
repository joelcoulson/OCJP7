package com.joelcoulson.nio;

import java.io.IOException;
import java.nio.file.*;

public class FileTreeWalk {

    public static void main(String args[]) {
        Path source = Paths.get("/home/joel/Projects");
        try {
            Files.walkFileTree(source, new FileVisitor("glob:*.java"));
        } catch(IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}