package com.joelcoulson.io;

import java.io.*;
import java.util.ArrayList;

public class SerializationTest {

    public static void main(String[] args) {
        saveToFile();
        readFromFile();
    }

    public static void saveToFile() {
        // make an arraylist of people
        ArrayList<Person> people = new ArrayList();
        people.add(new Person("Joel", 35));
        people.add(new Person("Henry", 43));
        people.add(new Person("Frank", 23));

        File file = new File("C:\\Users\\Joel\\Projects\\OCJP7\\testfiles\\people.db");

        try {
            // create an objectoutputstream to push the serialized data to disk
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            // serialize each object in the arraylist to disk
            for(Person person : people) {
                objectOutputStream.writeObject(person);
            }
            fileOutputStream.close();
        } catch (IOException ioe) {
            System.out.println("Another kind of exception occurred: " + ioe.getMessage());
        }
    }

    public static void readFromFile() {

        File file = new File("C:\\Users\\Joel\\Projects\\OCJP7\\testfiles\\people.db");

        try {
            // create an objectinputstream to pull the serialized data from disk
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            // here we read all objects in the file until we hit the end and throw an exception
            // this is a pretty damned awful way to do it, but we'll se a better option
            // in the second example
            while(true) {
                Person person = (Person)objectInputStream.readObject();
                System.out.println(person.getName() + " is " + person.getAge() + " years old");
            }

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } catch (ClassNotFoundException cnf) {
            System.out.println(cnf.getMessage());
        }
    }
}
