package Driver;

import transport.PassengerCar;
import transport.Transport;
import java.util.Objects;

public abstract class Driver<T extends Transport> {
    private String fullName;
    private boolean driverLicence;
    private int drivingExperience;

    public Driver(String fullName, boolean driverLicence, int drivingExperience) {
        this.fullName = Objects.requireNonNullElse(fullName, "default");
        this.driverLicence = driverLicence;

        if (drivingExperience <= 0) {
            this.drivingExperience = 1;
        } else {
            this.drivingExperience = drivingExperience;
        }
    }

    @Override
    public String toString() {
        return "Водитель: " +
                "ФИО - " + fullName +
                ", действительность водительских прав - " + driverLicence +
                ", опыт вождения" + drivingExperience +
                " лет.";
    }

    public void startRace(T transport) {
        System.out.println("Водитель " + getFullName() + " начал гонку на автомобиле - " + transport.getBrand() + transport.getModel());
    }

    public void startDriving() {
        System.out.println("Водитель " + getFullName() + " начал гонку");
    }

    public void stopDriving() {
        System.out.println("Водитель " + getFullName() + " закончил гонку");
    }

    public void fillTheTank() {
        System.out.println("Водитель " + getFullName() + " заправляется");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return driverLicence == driver.driverLicence && drivingExperience == driver.drivingExperience && Objects.equals(fullName, driver.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, driverLicence, drivingExperience);
    }

    public void setFullName(String fullName) {
        this.fullName = Objects.requireNonNullElse(fullName, "default");
    }

    public void setDriverLicence(boolean driverLicence) {
        this.driverLicence = driverLicence;
    }

    public void setDrivingExperience(int drivingExperience) {
        if (drivingExperience <= 0) {
            this.drivingExperience = 1;
        } else {
            this.drivingExperience = drivingExperience;
        }
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isDriverLicence() {
        return driverLicence;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    private class Competing {
    }
}
