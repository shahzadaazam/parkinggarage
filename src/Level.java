import java.util.*;

public class Level {

    private String levelNumber;
    private List<ParkingSpace> parkingSpaces;

    public Level(String levelNumber, List<ParkingSpace> parkingSpaces) {
        this.levelNumber = levelNumber;
        this.parkingSpaces = parkingSpaces;
    }

    public Level(String levelNumber) {
        this.levelNumber = levelNumber;
        this.parkingSpaces = null;
    }

    public void assignParkingSpaces(List<ParkingSpace> parkingSpaces) {
        this.parkingSpaces = parkingSpaces;
    }

}