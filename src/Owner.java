import java.util.*;

public class Owner {

    private String name;
    private List<Car> ownedCars;
    private boolean frequentFlyer;
    private String parkingTicket;

    public Owner(String name, List<Car> ownedCars, boolean frequentFlyer) {
        this.name = name;
        this.ownedCars = ownedCars;
        this.frequentFlyer = frequentFlyer;
    }

    public String getName() {
        return this.name;
    }

    public List<Car> getCars() {
        return this.ownedCars;
    }

    public boolean isFrequentFlyer() {
        return this.frequentFlyer;
    }

    public String getParkingTicket() {
        return this.parkingTicket;
    }

    public void assignParkingTicket(String parkingTicket) {
        this.parkingTicket = parkingTicket;
    }

}