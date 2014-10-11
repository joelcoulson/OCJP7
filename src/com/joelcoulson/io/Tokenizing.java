package com.joelcoulson.io;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Tokenizing {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Joel\\Projects\\OCJP7\\textfiles\\basic_char_file.txt");

        try {

            FileReader fileReader = new FileReader(file);
            Scanner scanner = new Scanner(fileReader);

            // set the delimiter on the scanner to be the newline char
            Pattern pattern = Pattern.compile("\\W");
            scanner.useDelimiter(pattern);

            // get the next token from the scanner
            while(scanner.hasNext()) {
                System.out.println("Token: " + scanner.next());
            }

        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found: " + fnfe.getMessage());
        } catch (IOException ioe) {
            System.out.println("Another kind of exception occurred: " + ioe.getMessage());
        }

    }
}
