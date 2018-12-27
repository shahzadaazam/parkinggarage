public class Car {

    private String licensePlate;
    private String make;
    private String model;
    private String year;

    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Car(String licensePlate, String make, String model, String year) {
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
        this.year = year;
    }

}