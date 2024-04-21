package midterm1;

import java.time.Year;

public class Building {
    private Year yearBuilt;
    private int floors;
    public Building() {
        yearBuilt = Year.now();
        floors = 1;
    }

    public Building(int year, int floors){
        yearBuilt = Year.of(year);
        this.floors = floors;
    }
}
