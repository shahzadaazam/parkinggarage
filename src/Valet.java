import java.util.*;

public class Valet extends ParkingSpace {

    private int parkingSpaceNumber;
    private double hourlyRate = 2.5;
    private Car parkedCar;
    private Date parkDateTime;
    private Level level;

    public Valet(int parkingSpaceNumber, Level level) {
        this.parkingSpaceNumber = parkingSpaceNumber;
        this.level = level;
    }

}