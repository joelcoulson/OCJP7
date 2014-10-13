package com.joelcoulson.nio;

import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

// here we provide an implementation of the SimpleFileVisitor interface
public class FileVisitor extends SimpleFileVisitor<Path> {

    public FileVisitResult visitFile(Path path, BasicFileAttributes fileAttributes) {

        System.out.print("File name: " + path.getFileName() + "(" + fileAttributes.size() + ") bytes");

        // here we set up a new glob to look for all instances of *.java
        String pattern = "glob:*.java";
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher(pattern);
        if(pathMatcher.matches(path.getFileName())) {
            System.out.println("This is a Java source file!");
        }

        // here we tell the calling Files.walkFileTree to continue to the next file
        return FileVisitResult.CONTINUE;
    }

    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes fileAttributes) {
        System.out.println("--------- Directory name: " + path + " ---------");

        // here we tell the calling Files.walkFileTree to continue to the next directory
        return FileVisitResult.CONTINUE;
    }
}
