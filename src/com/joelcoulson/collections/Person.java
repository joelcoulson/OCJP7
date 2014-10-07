package com.joelcoulson.collections;

public class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // overidden compareTo method
    @Override
    public int compareTo(Person person) {
        if( (this.age == (person.getAge())) && (this.name.equals(person.getName())) ) {
            return 0;
        } else {
            return -1;
        }
    }
}
