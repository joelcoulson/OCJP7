package com.joelcoulson.nio;

import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

// here we extend the SimpleFileVisit interface and override some methods
public class FileVisitor extends SimpleFileVisitor<Path> {

    private String pattern;

    public FileVisitor(String pattern) {
        this.pattern = pattern;
    }

    public FileVisitResult visitFile(Path path, BasicFileAttributes fileAttributes) {

        System.out.print("File name: " + path.getFileName() + "(" + fileAttributes.size() + ") bytes. ");

        // here we set up a new glob to look for all instances of the pattern
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher(pattern);
        if(pathMatcher.matches(path.getFileName())) {
            System.out.println("Pattern was matched!");
        }

        System.out.println("File: " + path.getFileName());
        // here we tell the calling Files.walkFileTree to continue to the next file
        return FileVisitResult.CONTINUE;
    }

    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes fileAttributes) {
        System.out.println("--------- Directory name: " + path + " ---------");

        // here we tell the calling Files.walkFileTree to continue to the next directory
        return FileVisitResult.CONTINUE;
    }
}
