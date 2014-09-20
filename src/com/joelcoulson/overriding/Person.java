package com.joelcoulson.overriding;

/**
 * Created by joel on 31/08/14.
 */

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // here we override the equals class to test on equality on name rather than on the object reference
    public boolean equals(Object object) {

        // first verify that the object is indeed of a type that we can test
        if(!(object instanceof com.joelcoulson.overriding.Person))
            throw new IllegalArgumentException("Object needs to be of type Person");

        // great, its a Person type. now lets test the equality
        if(((Person)object).getName() == this.getName()) {
            return true;
        } else {
            return false;
        }
    }

}
