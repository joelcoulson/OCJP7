package com.joelcoulson.io;

import java.io.*;

public class ByteReader2 {

    public static void main(String[] args) {

        // we need a file descriptor
        File file = new File("C:\\Users\\Joel\\Projects\\OCJP7\\images\\logo.png");

        try {
            // attempt to create a new reader
            FileInputStream fileInputStream = new FileInputStream(file);
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);

            // loop as many times as there are bytes in the file
            for(int i = 0; i < dataInputStream.available(); i++) {
                System.out.println("Byte " + i + ": " + dataInputStream.readByte());
            }

        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found: " + fnfe.getMessage());
        } catch (IOException ioe) {
            System.out.println("Another kind of exception occurred: " + ioe.getMessage());
        }
    }
}
