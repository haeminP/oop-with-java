package midterm1;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.time.Year;

public class Hotel extends Building {
    private String name;
    private double rate;
    private List<String> owners;
    private List<Room> rooms;

    // Default constructor
    public Hotel() {
        super(); // Calls the default constructor of Building
        this.rooms = new ArrayList<>();
        this.owners = new ArrayList<>();
    }

    // Constructor with name, owners, year of built, number of floors, and rate
    public Hotel(String name, List<String> owners, int yearOfBuilt, int numberOfFloors, double rate) {
        super(yearOfBuilt, numberOfFloors); // Calls the superclass constructor
        this.name = name;
        this.owners = new ArrayList<>(owners);
        this.rate = rate;
        this.rooms = new ArrayList<>();
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public List<String> getOwners() {
        return owners;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public Room getRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }

    // Method to add an owner
    public void addOwner(String owner) {
        owners.add(owner);
    }

    // Method to add a room
    public void addRoom(Room room) {
        rooms.add(room);
    }

    // Method to reserve a room
    public int reserve(int roomNumber, Date startDate, Date endDate, Person guest) {
        Room room = getRoom(roomNumber);
        if (room != null && room.isVacant()) {
            return room.reserve(startDate, endDate, guest);
        }
        return 0;
    }

    // Method to cancel a reservation
    public boolean cancel(int reservationNumber) {
        for (Room room : rooms) {
            if (room.cancel(reservationNumber)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hotel ").append(name).append(", ").append(rate).append(" stars.\n");
        sb.append("Hotel Owners: ");

        // Appending each owner's name
        for (int i = 0; i < owners.size(); i++) {
            sb.append(owners.get(i));
            if (i < owners.size() - 1) {
                sb.append("  ");
            }
        }
        sb.append("\nRooms: \n");

        // Appending each room's details
        for (Room room : rooms) {
            sb.append(room.toString()).append("\n");
        }

        return sb.toString();
    }
}
