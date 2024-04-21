package midterm1;

import java.sql.Date;
import java.util.ArrayList;

public class Room {
    public enum RoomType {
        SINGLE, DOUBLE, STUDIO, SUITE
    }

    private RoomType roomType;
    private double pricePerNight;
    private double roomSize;
    private int floorNumber;
    private int roomNumber;
    private String description;
    private boolean isVacant;
    private ArrayList<Reservation> reservations;

    // Constructor
    public Room(RoomType roomType, double pricePerNight, double roomSize, int roomNumber, int floorNumber, String description) {
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.roomSize = roomSize;
        this.roomNumber = roomNumber;
        this.floorNumber = floorNumber;
        this.description = description;
        this.isVacant = true; // initializing vacancy status
        this.reservations = new ArrayList<>(); // initializing the list of reservations
    }

    // Getter methods
    public boolean isVacant() {
        return isVacant;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    // Setter method for price
    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    // Method to reserve the room
    public int reserve(Date startDate, Date endDate, Person guest) {
        for (Reservation r : reservations) {
            if (!r.isAvailable(startDate, endDate)) {
                return 0; // Room is not available
            }
        }

        Reservation newReservation = new Reservation(startDate, endDate, this.pricePerNight, guest);
        reservations.add(newReservation);
        this.isVacant = false;
        return newReservation.getReservationNumber();
    }

    // Method to cancel a reservation
    public boolean cancel(int reservationNumber) {
        for (Reservation r : reservations) {
            if (r.getReservationNumber() == reservationNumber) {
                reservations.remove(r);
                return true;
            }
        }
        return false;
    }

    // Methods to check in and check out
    public void checkin() {
        this.isVacant = false;
    }

    public void checkout() {
        this.isVacant = true;
    }

    public String status() {
        String status = "Reservation list of room number " + roomNumber + ": " + (isVacant ? "Vacant." : "Occupied.") + "\n";

        for (Reservation reservation : reservations) {
            status += reservation.toString() + "\n";
        }

        return status;
    }

    @Override
    public String toString() {
        return roomType + ", price=$" + pricePerNight +
                ", Size=" + roomSize + ", Number=" + roomNumber +
                ", Floor=" + floorNumber + "\nDescription: " + description;
    }
}
