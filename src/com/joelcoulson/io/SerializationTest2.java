package com.joelcoulson.io;

import java.io.*;
import java.util.ArrayList;

public class SerializationTest2 {

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

            // rather than serializing each object in the arraylist to disk
            // we instead serialize the entire arraylist as a single object
            objectOutputStream.writeObject(people);

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

            // here we read the single arraylist object from disk and then iterate through it
            // this is far more elegant than reading in each object until we hit the end, thus
            // throwing an exception as seen in the previous example, but it does also mean that
            // we use all of the memory the arraylist will consume as soon as we read it in
            ArrayList<Person> people = (ArrayList<Person>)objectInputStream.readObject();

            // now lets iterate through the arraylist
            for(Person person : people) {
                System.out.println(person.getName() + " is " + person.getAge() + " years old");
            }

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } catch (ClassNotFoundException cnf) {
            System.out.println(cnf.getMessage());
        }
    }
}
