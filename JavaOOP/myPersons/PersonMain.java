package myPersons;

import cars.Car;
import cars.PersonalCar;
import cars.Truck;

import java.io.ObjectInput;

public class PersonMain {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Janko"),
                new Person("Peter", 20),
                new Person("Michaela", 250),
                new Student("Marian", "12345"),
                new Student("Marina", 99, "65532"),
                new Employee("Robert", 35, "master mega chief")
        };

        for (Person person : persons) {
            person.setAge(300); //NIE
            System.out.println(person.toString()); //person.toString()
        }

//        System.out.println(Person.JAHODA);

//        Person p1 = new Person("Jan");
//        Person p2 = p1;
//        p2.setName("Peter");
//        System.out.println(p1);
//        System.out.println(p2);

//        Student s1 = new Student("Matej", "384709");
//        System.out.println(s1 instanceof Student);
//        System.out.println(s1 instanceof Person);
//        System.out.println(s1 instanceof Object);
//
//        Car c = new Car("BMW");
//        System.out.println(s1);
//        s1.setCar(c);
//        System.out.println(s1);
//        s1.getCar().start();
//        System.out.println(s1);
//        s1.getCar().stop();
//        System.out.println(s1);
//        System.out.println(s1.getClass());

        Student s2 = new Student("Jozef", "234343");
        Car c2 = new PersonalCar("Audi", 5);
        s2.setCar(c2);
        s2.getCar().start();
        System.out.println(s2);

        Student s3 = new Student("Filip", "224324");
        Car c3 = new Truck("Mercedes", "Kýbel hadov");
        s3.setCar(c3);
        s3.getCar().start();
        System.out.println(s3);

        for(Person p: persons){
            if(p.getCar() != null && p.getCar().isStarted()){
                p.getCar().start();
            }
        }
    }
}