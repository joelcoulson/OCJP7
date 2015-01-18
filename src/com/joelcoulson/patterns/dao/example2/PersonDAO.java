package DAO;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.io.*;
import java.util.ArrayList;

// the DAO object performs the CRUD functions on the database, often taking in and handing back transfer objects
// to the calling class

public class PersonDAO {

    private PersonDatabase personDatabase;

    public PersonDAO() {
        personDatabase = PersonDatabase.getInstance();
    }

    public void addPerson(Person person) {
        if(!(person instanceof Person)) throw new IllegalArgumentException();

        // get a writer
        BufferedWriter bufferedWriter = personDatabase.getWriter();

        // write the contents of the Person transfer object to the database (ie, the file)
        try {
            bufferedWriter.write(Integer.toString(person.getId()) + ';' + person.getName() + ';'
                    + Integer.toString(person.getAge()) + "\n");
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }

        // close the handler
        personDatabase.closeWriterHandler();
    }

    public Person getPerson(String name) {
        ArrayList<Person> people = getPeople();
        for(Person person : people) {
            if(person.getName().equals(name)) {
                return person;
            }
        }

        // worst case scenario. we havent found the person they were looking for
        return null;
    }

    public ArrayList<Person> getPeople() {

        ArrayList<Person> people = new ArrayList();

        // get a reader
        BufferedReader bufferedReader = personDatabase.getReader();

        // split the contents of each line and read it into an ArrayList of Person objects
        try {
            String line;
            while( (line = bufferedReader.readLine()) != null ) {
                // split on the semicolon delimiter
                String[] tokens = line.split(";");

                // construct a Person out of the line tokens
                Person person = new Person(Integer.parseInt(tokens[0]), tokens[1], Integer.parseInt(tokens[2]));

                // add that Person object to the Arraylist
                people.add(person);
            }
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }

        // close the handler
        personDatabase.closeReaderHandler();

        return people;
    }
}
