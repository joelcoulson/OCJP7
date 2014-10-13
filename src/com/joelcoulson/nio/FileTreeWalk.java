package com.joelcoulson.nio;

import java.io.IOException;
import java.nio.file.*;

public class FileTreeWalk {

    public static void main(String args[]) {
        Path source = Paths.get("C:\\Users\\jcoulson\\Projects\\OCJP7\\");
        try {
            Files.walkFileTree(source, new FileVisitor());
        } catch(IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}