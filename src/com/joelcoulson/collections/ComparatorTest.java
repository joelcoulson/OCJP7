package com.joelcoulson.collections;

public class ComparatorTest {

    public static void main(String[] args) {

        Person person1 = new Person("Hank", 32);
        Person person2 = new Person("Phil", 53);
        Person person3 = new Person("Hank", 32);

        PersonComparator personComparator = new PersonComparator();

        if(personComparator.compare(person1, person2) == 0) {
            System.out.println("Person 1 and Person 2 are equal");
        } else {
            System.out.println("Person 1 and Person 2 arent equal");
        }

        if(personComparator.compare(person1, person3) == 0) {
            System.out.println("Person 1 and Person 3 are equal");
        } else {
            System.out.println("Person 1 and Person 3 arent equal");
        }
    }
}
