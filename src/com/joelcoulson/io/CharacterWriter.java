package com.joelcoulson.io;

import java.io.*;

public class CharacterWriter {

    public static void main(String[] args) {

        // we need a file descriptor
        File file = new File("C:\\Users\\Joel\\Projects\\OCJP7\\textfiles\\basic_char_file2.txt");
        String sentence = "This is just a simple line of text\nOh, and hello world!";

        try{
            // attempt to create a new writer
            FileWriter fileWriter = new FileWriter(file);

            // break the string into a char array and output one char at a time
            for(char ch : sentence.toCharArray()) {
                fileWriter.write(ch);
            }

            // ensure we close the file we're writing to
            fileWriter.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found: " + fnfe.getMessage());
        } catch (IOException ioe) {
            System.out.println("Another kind of exception occurred: " + ioe.getMessage());
        }
    }
}