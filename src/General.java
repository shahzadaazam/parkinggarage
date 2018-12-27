import java.util.*;

public class General extends ParkingSpace {

    private int parkingSpaceNumber;
    private double hourlyRate = 1.0;
    private Car parkedCar;
    private Date parkDateTime;
    private Level level;

    public General(int parkingSpaceNumber, Level level) {
        this.parkingSpaceNumber = parkingSpaceNumber;
        this.level = level;
    }
}