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

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }
}