package com.joelcoulson.io;

import java.io.*;

public class ByteReader {

    public static void main(String[] args) {

        // we need a file descriptor
        File file = new File("C:\\Users\\Joel\\Projects\\OCJP7\\images\\logo.png");

        try {
            // attempt to create a new reader
            FileInputStream fileInputStream = new FileInputStream(file);
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);

            // create an array of bytes equal to the length of the file
            byte bytes[] = new byte[dataInputStream.available()];

            // read the file into the byte array
            dataInputStream.readFully(bytes);

            // iterate through the byte array
            for (byte chunk : bytes) {
                System.out.println("Byte: " + chunk);
            }
            fileInputStream.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found: " + fnfe.getMessage());
        } catch (IOException ioe) {
            System.out.println("Another kind of exception occurred: " + ioe.getMessage());
        }
    }
}
