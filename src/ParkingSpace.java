import java.util.*;

public abstract class ParkingSpace {

    private int parkingSpaceNumber;
    private double hourlyRate;
    private Car parkedCar;
    private Date parkDateTime;
    private Level level;

    public ParkingSpace(int parkingSpaceNumber, double hourlyRate, Level level) {
        this.parkingSpaceNumber = parkingSpaceNumber;
        this.hourlyRate = hourlyRate;
        this.level = level;
    }

    private boolean isEmpty() {
        return parkedCar == null;
    }

    private void startParkTime() {
        this.parkDateTime = new Date();
    }

    private void resetParkTime() {
        this.parkDateTime = null;
    }

    public boolean parkCar(Car car) {
        if (!this.isEmpty()) {
            return false;
        }
        this.parkedCar = car;
        this.startParkTime();
        return true;
    }

    public Car unparkCar() {
        this.resetParkTime();
        return parkedCar;
    }

    public double getHourlyRate() {
        return this.hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public Date getParkDateTime() {
        return parkDateTime;
    }

}
