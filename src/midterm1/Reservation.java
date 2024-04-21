package midterm1;

import java.sql.Date;

public class Reservation {
    private static int lastReservationNumber = 100000; // Class-level variable
    private Date startDate;
    private Date endDate;
    private double pricePerNight;
    private Person guest; // Assuming Person is a defined class
    private int reservationNumber;

    // Constructor
    public Reservation(Date startDate, Date endDate, double pricePerNight, Person guest) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.pricePerNight = pricePerNight;
        this.guest = guest;
        this.reservationNumber = ++lastReservationNumber; // Increment and assign the next reservation number
    }

    // Getter methods
    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getReservationNumber() {
        return reservationNumber;
    }

    // Check availability method
    public boolean isAvailable(Date start, Date end) {
        // The room is considered available if the requested start date is after the current end date
        // or the requested end date is before the current start date.
        return (start.after(this.endDate) || end.before(this.startDate));
    }


    @Override
    public String toString() {
        return "Reservation Number: " + reservationNumber + "\n" +
                "From: " + startDate.toString() + " To: " + endDate.toString() + "\n" +
                "Guest: " + guest.toString() + // Assuming Person class has a meaningful toString implementation
                "\n$" + pricePerNight + " per night";
    }

}
