package midterm1;

public class Person {
    private String firstName;
    private String lastName;
    public Person(String first, String last) {
        firstName = first;
        lastName = last;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
