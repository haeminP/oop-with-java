package section9;

public class Seat {
    private String firstName;
    private String lastName;
    private int amountPaid;

    // Method to initialize Seat fields
    public void reserve (String first, String last, int payment) {
        firstName = first;
        lastName = last;
        amountPaid = payment;
    }

    public void makeEmpty() {
        firstName = "empty";
        lastName = "empty";
        amountPaid = 0;
    }

    public boolean isEmpty() {
        return firstName.equals("empty");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAmountPaid() {
        return amountPaid;
    }

    public void print() {
        System.out.print(firstName + " " + lastName + " ");
        System.out.println("Paid: " + amountPaid);
    }
}
