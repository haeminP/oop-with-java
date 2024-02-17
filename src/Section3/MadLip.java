package Section3;

import java.util.Scanner;

public class MadLip {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String firstName;
        int wholeNumber;
        String pluralNoun;
        String genericLocation;

        firstName = scnr.next();
        wholeNumber = scnr.nextInt();
        pluralNoun = scnr.next();
        genericLocation = scnr.next();


        System.out.println(firstName + " buys " + wholeNumber + " different types of " + pluralNoun + " at " + genericLocation + ".");
    }
}
