package myPersons;

public class PersonMain {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Janko"),
                new Person("Peter", 20),
                new Person("Lukáš", 30),
                new Person("Fero", 14),
        };
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}