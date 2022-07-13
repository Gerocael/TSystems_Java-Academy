package persons;

import java.util.Arrays;

public class TestSort {
    public static void main(String[] args){
        //Array of person
        Person[] persons = new Person[5];
        persons[0] = new Person("Jano","Modry", 24);
        persons[1] = new Person("Fero","Zeleny", 30);
        persons[2] = new Person("Zuza","Modra", 17);
        persons[3] = new Person("Jano","Zeleny", 24);
        persons[4] = new Person("Anna","Modra", 28);
        
        //Sorting
        ArraySort as = new ArraySort();
        Arrays.sort(persons);
        
        //Printing sorted array
        for(Person p : persons) {
            System.out.println(p);
        }        
    }
}
