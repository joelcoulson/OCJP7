package DAO;

public class PersonDAOTest {

    public static void main(String[] args) {
        getPersonTest();
    }

    public static void getPersonTest() {
        PersonDAO personDAO = new PersonDAO();
        Person person = personDAO.getPerson("Jamie");

        System.out.println("ID: " + person.getId());
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }

    public static void addPersonTest() {
        Person person = new Person(4, "Frank", 50);
        PersonDAO personDAO = new PersonDAO();
        personDAO.addPerson(person);
    }

}
