import java.util.*;

public class ParkingStructure {

    private static ParkingStructure ps = null;

    //List maintaining levels of the parking structure
    private List<Level> levels = new ArrayList<>();

    //HashMap mapping car license plates and the corresponding parking space
    private HashMap<String, ParkingSpace> parkingMap = new HashMap<>();

    //Stack DS to maintain free parking spaces
    private Stack<ParkingSpace> availableSpaces = new Stack<>();

    private ParkingStructure() {

        //Create parking structure here

        //1. Create levels and parking spaces for each level
        //2. Populate available spaces in stack

        //L1
        List<ParkingSpace> l1ParkingSpaces = new ArrayList<>();
        Level l1 = new Level("L1", l1ParkingSpaces);

        //40 General parking spots
        for (int i = 0; i < 40; i++) {
            ParkingSpace ps = new General(i, l1);
            l1ParkingSpaces.add(ps);
            availableSpaces.push(ps);
        }

        //20 Valet parking spots
        for (int i = 40; i < 60; i++) {
            ParkingSpace ps = new Valet(i, l1);
            l1ParkingSpaces.add(ps);
            availableSpaces.push(ps);
        }

        //10 Valet parking spots
        for (int i = 60; i < 70; i++) {
            ParkingSpace ps = new FrequentFlyer(i, l1);
            l1ParkingSpaces.add(ps);
            availableSpaces.push(ps);
        }

        //Adding l1 to levels list
        levels.add(l1);

        //L2
        List<ParkingSpace> l2ParkingSpaces = new ArrayList<>();
        Level l2 = new Level("L2", l2ParkingSpaces);

        //40 General parking spots
        for (int i = 0; i < 40; i++) {
            ParkingSpace ps = new General(i, l2);
            l2ParkingSpaces.add(ps);
            availableSpaces.push(ps);
        }

        //20 Valet parking spots
        for (int i = 40; i < 60; i++) {
            ParkingSpace ps = new Valet(i, l2);
            l2ParkingSpaces.add(ps);
            availableSpaces.push(ps);
        }

        //10 Valet parking spots
        for (int i = 60; i < 70; i++) {
            ParkingSpace ps = new FrequentFlyer(i, l2);
            l2ParkingSpaces.add(ps);
            availableSpaces.push(ps);
        }

        //Adding l2 to levels list
        levels.add(l2);

        //L3
        List<ParkingSpace> l3ParkingSpaces = new ArrayList<>();
        Level l3 = new Level("L3", l3ParkingSpaces);

        //40 General parking spots
        for (int i = 0; i < 40; i++) {
            ParkingSpace ps = new General(i, l3);
            l3ParkingSpaces.add(ps);
            availableSpaces.push(ps);
        }

        //20 Valet parking spots
        for (int i = 40; i < 60; i++) {
            ParkingSpace ps = new Valet(i, l3);
            l3ParkingSpaces.add(ps);
            availableSpaces.push(ps);
        }

        //10 Valet parking spots
        for (int i = 60; i < 70; i++) {
            ParkingSpace ps = new FrequentFlyer(i, l2);
            l3ParkingSpaces.add(ps);
            availableSpaces.push(ps);
        }

        //Adding l3 to levels list
        levels.add(l3);


    }



    //Generates 18 character long random ticket string
    private String generateParkingTicket() {

        //Reference: https://stackoverflow.com/questions/20536566/creating-a-random-string-with-a-z-and-0-9-in-java

        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();

        while (salt.length() < 18) {    //length of random string
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }

    //Singleton implementation
    public static ParkingStructure getParkingStructure() {
        if (ps == null) {
            ps = new ParkingStructure();
            return ps;
        }
        return ps;
    }

    //returns next available parking space or null if none available
    public ParkingSpace getAvailableParkingSpace() {

        return (availableSpaces.peek() == null) ? null : availableSpaces.pop();
    }

    //returns unwanted available parking space to available stack
    public void returnAvailableParkingSpace(ParkingSpace ps) {
        availableSpaces.push(ps);
    }

    //returns true if parking structure/garage is full
    public boolean isFull() {

        return availableSpaces.peek() == null;
    }

    //==============================================
    //Methods to be implemented

    //returns parking ticket string
    public String AddCar(Car car, ParkingSpace ps) {

        if (ps.parkCar(car)) {
            String parkingTicket = generateParkingTicket();
            parkingMap.put(parkingTicket, ps);
            System.out.println("Parked successfully");
            return parkingTicket;
        }
        System.out.println("Unable to park in this spot");
        return null;
    }

    //returns removed Car
    public Car RemoveCar(ParkingSpace ps, String parkingTicket) {

        if (ps.equals(parkingMap.get(parkingTicket))) {
            System.out.println("Unparking Car");
            return parkingMap.get(parkingTicket).unparkCar();
        }
        System.out.println("Cannot unpark car. Parking space does not match parking ticket");
        return null;
    }

    //returns calculated cost in double
    public double ParkingCost(ParkingSpace ps) {

        return 0.0;
    }

    public HashMap<String, Owner> GetOwner(Level level, ParkingSpace ps) {

        return null;
    }

    public void GetParkingSpace(String name) {

    }

    // public void GetParkingSpace(String licensePlate) {

    // }

    //==============================================
}