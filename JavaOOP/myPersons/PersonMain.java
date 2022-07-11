package myPersons;

public class PersonMain {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Janko"),
                new Person("Peter", 20),
                new Student("Fero", "752424"),
                new Student("Lya", 24, "223463"),
                new Employee("Dzugus", "random"),
        };
        for (Person person : persons) {
            System.out.println(person);
        }
//        Person p1 = new Person("Jan");
//        Person p2 = p1;
//        p2.setName("Peter");
//        System.out.println(p1);
//        System.out.println(p2);
    }
}