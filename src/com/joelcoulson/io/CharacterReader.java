package com.joelcoulson.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharacterReader {

    public static void main(String[] args) {

        // we need a file descriptor
        File file = new File("C:\\Users\\Joel\\Projects\\OCJP7\\textfiles\\basic_char_file.txt");

        try{
            // attempt to create a new reader
            FileReader fileReader = new FileReader(file);
            int ch = 0;

            // get one char at a time
            while((ch = fileReader.read()) != -1) {
                // cast the int back to a char
                System.out.print((char)ch);
            }

        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found: " + fnfe.getMessage());
        } catch (IOException ioe) {
            System.out.println("Another kind of exception occurred: " + ioe.getMessage());
        }

    }
}
