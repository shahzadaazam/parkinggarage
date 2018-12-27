import java.util.*;

public class FrequentFlyer extends ParkingSpace {

    private int parkingSpaceNumber;
    private double hourlyRate = 5.0;
    private Car parkedCar;
    private Date parkDateTime;
    private Level level;

    public FrequentFlyer(int parkingSpaceNumber, Level level) {
        this.parkingSpaceNumber = parkingSpaceNumber;
        this.level = level;
    }
}