import java.util.*;

public abstract class ParkingSpace {

    private int parkingSpaceNumber;
    private double hourlyRate;
    private Car parkedCar;
    private Date parkDateTime;
    private Level level;

    private boolean isVacant() {
        return parkedCar == null;
    }

    public boolean parkCar(Car car) {
        if (!this.isVacant()) {
            return false;
        }
        this.parkedCar = car;
        return true;
    }

    public Car unparkCar() {
        return parkedCar;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public Date getParkDateTime() {
        return parkDateTime;
    }

}
