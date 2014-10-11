package com.joelcoulson.io;

import java.io.*;

public class BufferedReaderEx {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Joel\\Projects\\OCJP7\\textfiles\\basic_char_file.txt");

        try {
            // the buffered reader will allow you to read in larger "chunks" (i.e. a full line of text)
            // as compared to using the more simple FileReader on it's own
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // read a line at a time
            String line;
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found: " + fnfe.getMessage());
        } catch (IOException ioe) {
            System.out.println("Another kind of exception occurred: " + ioe.getMessage());
        }
    }
}
