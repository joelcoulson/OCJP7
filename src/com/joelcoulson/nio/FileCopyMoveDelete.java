package com.joelcoulson.nio;

import java.io.IOException;
import java.nio.file.*;

public class FileCopyMoveDelete {

    public static void main(String[] args) {

        // copying a file
        Path sourcePath = Paths.get("C:\\Users\\Joel\\Projects\\OCJP7\\testfiles\\testfile.txt");
        Path destinationPath = Paths.get("C:\\Users\\Joel\\Projects\\OCJP7\\testfiles\\testfile_copy.txt");

        try {
            Files.copy(sourcePath, destinationPath);
        } catch(IOException ioe) {
            System.out.println(ioe.getMessage());
        }

        // moving a file
        Path newDestinationPath = Paths.get("C:\\Users\\Joel\\Projects\\OCJP7\\testfiles\\testfile_copy_new.txt");
        try {
            Files.move(destinationPath, newDestinationPath);
        } catch(IOException ioe) {
            System.out.println(ioe.getMessage());
        }

        // deleting a file
        try {
            Files.delete(newDestinationPath);
        } catch(IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
