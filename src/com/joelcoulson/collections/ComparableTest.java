package com.joelcoulson.collections;

public class ComparableTest {

    public static void main(String[] args) {

        Person person1 = new Person("Jay", 30);
        Person person2 = new Person("Frank", 31);
        Person person3 = new Person("Jay", 30);

        if(person1.compareTo(person2) == 0) {
            System.out.println("Person 1 and Person 2 are equal");
        } else {
            System.out.println("Person 1 and Person 2 arent equal");
        }

        if(person1.compareTo(person3) == 0) {
            System.out.println("Person 1 and Person 3 are equal");
        } else {
            System.out.println("Person 1 and Person 3 arent equal");
        }
    }
}
