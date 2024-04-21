package midterm1;

import java.sql.Date;
import java.time.Year;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        List<String> owners = Arrays.asList("Ali Baba", "Alice Mama");
        Hotel hotel = new Hotel("Baba Mama", owners, 1999, 5, 3.5);

        // Add rooms to the hotel
        hotel.addRoom(new Room(Room.RoomType.SINGLE, 35.5, 200.0, 101, 1, "Single Room without view"));
        hotel.addRoom(new Room(Room.RoomType.DOUBLE, 50.5, 350.0, 102, 1, "Double Room without view"));
        hotel.addRoom(new Room(Room.RoomType.STUDIO, 70.5, 500.0, 103, 2, "Studio with city view"));
        hotel.addRoom(new Room(Room.RoomType.SUITE, 120.5, 750.0, 104, 2, "Suite with sea view"));

        // Show hotel and rooms info
        System.out.println(hotel);

        // Perform room reservations
        // Assuming Date format is YYYY-MM-DD
        int reservation1 = hotel.reserve(101, Date.valueOf("2024-04-01"), Date.valueOf("2024-04-05"), new Person("Joe", "Uncle"));
        int reservation2 = hotel.reserve(102, Date.valueOf("2024-04-10"), Date.valueOf("2024-04-15"), new Person("Anna", "Aunt"));
        int reservation3 = hotel.reserve(103, Date.valueOf("2024-04-20"), Date.valueOf("2024-04-25"), new Person("John", "Doe"));
        int reservation4 = hotel.reserve(101, Date.valueOf("2024-04-03"), Date.valueOf("2024-04-07"), new Person("Jane", "Doe")); // Should be unsuccessful

        // Display reservation results
        System.out.println("Reservation 1: " + reservation1);
        System.out.println("Reservation 2: " + reservation2);
        System.out.println("Reservation 3: " + reservation3);
        System.out.println("Reservation 4 (should be unsuccessful): " + reservation4);

        // Change the price of a room
        Room roomToChangePrice = hotel.getRoom(102);
        if (roomToChangePrice != null) {
            roomToChangePrice.setPricePerNight(55.0);
        }

        // Cancel one reservation
        boolean cancellationResult = hotel.cancel(reservation2);
        System.out.println("Cancellation of Reservation 2 was " + (cancellationResult ? "successful" : "unsuccessful"));

        // Show the status of all the rooms
        for (Room room : hotel.getRooms()) {
            System.out.println(room.status());
        }
    }
}
