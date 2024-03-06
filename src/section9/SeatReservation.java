package section9;

import java.util.ArrayList;
import java.util.Scanner;

public class SeatReservation {
    // Arraylist for seat reservation
    private ArrayList<Seat> allSeats;

    public SeatReservation() {
        allSeats = new ArrayList<Seat>();
    }

    public void makeSeatsEmpty() {
        int i;
        for (i = 0; i < allSeats.size(); ++i) {
            allSeats.get(i).makeEmpty();
        }
    }

    public void printSeats() {
        int i;
        for (i = 0; i < allSeats.size(); ++i) {
            allSeats.get(i).print();
        }
    }

    public void addSeats(int numSeats) {
        int i;
        for (i = 0; i < numSeats; ++i) {
            allSeats.add(new Seat());
        }
    }


    public Seat getSeat(int seatNum) {
        return allSeats.get(seatNum);
    }

    public void setSeat(int seatNum, Seat newSeat) {
        allSeats.set(seatNum, newSeat);
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput = "";
        String firstName, lastName;
        int amountPaid;
        int seatNum;
        Seat newSeat;
        SeatReservation ezReservation = new SeatReservation();

        // Add 5 seat objects
        ezReservation.addSeats(5);

        // Make all seats empty
        ezReservation.makeSeatsEmpty();

        while (!userInput.equals("q")) {
            System.out.println();
            System.out.print("Enter command (p/r/d/q): ");
            userInput = scnr.next();


            if (userInput.equals("p")) {
                ezReservation.printSeats();
            }

            else if (userInput.equals("r")) {
                System.out.print("Enter seat num: ");
                seatNum = scnr.nextInt();

                if (!ezReservation.getSeat(seatNum).isEmpty()){
                    System.out.println("Seat not empty");
                } else {
                    System.out.print("Enter first name: ");
                    firstName = scnr.next();
                    System.out.print("Enter last name: ");
                    lastName = scnr.next();
                    System.out.print("Enter amount paid: ");
                    amountPaid = scnr.nextInt();

                    // Create new Seat object and add to the reservations
                    newSeat = new Seat();
                    newSeat.reserve(firstName, lastName, amountPaid);
                    ezReservation.setSeat(seatNum, newSeat);

                    System.out.println("Reservation completed");
                }

            }

            else if (userInput.equals("d")) {
                System.out.print("Enter seat num: ");
                seatNum = scnr.nextInt();
                if (ezReservation.getSeat(seatNum).isEmpty()) {
                    System.out.println("Seat is empty");
                } else {
                    ezReservation.getSeat(seatNum).makeEmpty();
                    System.out.println("Seat is deleted");
                }

            }

            else if (userInput.equals("q")) {
                System.out.println("Quitting.");
            }

            else {
                System.out.println("Invalid command.");
            }
        }

    }
}
