package DAO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PersonDatabase {

    // this is a singleton object as we only want a single connection to be open to the file at any one time
    private static PersonDatabase personDatabase;
    private final static String databaseFile = "C:\\Users\\Joel\\Projects\\OCJP7_TEMP\\files\\people.db";
    private static BufferedReader bufferedReader;
    private static BufferedWriter bufferedWriter;

    private PersonDatabase() {}

    public static PersonDatabase getInstance() {
        synchronized (PersonDatabase.class) {
            if(personDatabase == null) {
                personDatabase = new PersonDatabase();
            }
            return personDatabase;
        }
    }

    public BufferedReader getReader() {
        synchronized (PersonDatabase.class) {
            // check to see if we've already got a valid open file handler. if not, create one
            try {
                if(bufferedReader == null) {
                    bufferedReader = new BufferedReader(new FileReader(new File(databaseFile)));
                }
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
            return bufferedReader;
        }
    }

    public BufferedWriter getWriter() {
        synchronized (PersonDatabase.class) {
            // check to see if we've already got a valid open file handler. if not, create one
            try {
                if(bufferedWriter == null) {
                    // append, not overwrite!
                    bufferedWriter = new BufferedWriter(new FileWriter(new File(databaseFile), true));
                }
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
            return bufferedWriter;
        }
    }

    public void closeReaderHandler() {
        synchronized (PersonDatabase.class) {
            if(personDatabase != null) {
                try {
                    bufferedReader.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
        }
    }

    public void closeWriterHandler() {
        synchronized (PersonDatabase.class) {
            if(personDatabase != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
        }
    }
}
