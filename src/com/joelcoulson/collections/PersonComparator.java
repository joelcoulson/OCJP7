package com.joelcoulson.collections;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    // compares two Person object attributes
    public int compare(Person person1, Person person2) {
        if( (person1.getAge() == person2.getAge()) && (person1.getName().equals(person2.getName())) ) {
            return 0;
        } else {
            return -1;
        }
    }
}
