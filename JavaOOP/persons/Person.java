package persons;

public class Person implements Comparable<Person> {
    private final String firstName;
    private final String lastName;
    private final int age;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return firstName + " " + lastName + " " + age;
    }

    @Override
    public int compareTo(Person p) {
        int nameCompare = this.lastName.compareTo(p.lastName);
        if(nameCompare == 0) {
            int ageCompare = this.age - p.age;
            if(ageCompare != 0) {
                return ageCompare;
            }
            return this.age - p.age;
        }
        return nameCompare;
    }

}