package Driver;

import transport.Transport;
import java.util.Objects;

public abstract class Driver<T extends Transport> {
    private String fullName;
    private int drivingExperience;
    private final DriverLicence licence;

    public Driver(String fullName, int drivingExperience, DriverLicence licence) {
        this.fullName = Objects.requireNonNullElse(fullName, "default");
        this.licence = licence;

        if (drivingExperience <= 0) {
            this.drivingExperience = 1;
        } else {
            this.drivingExperience = drivingExperience;
        }
    }

    @Override
    public String toString() {
        return "Водитель: " +
                "ФИО - " + fullName + ". " + licence +
                ", опыт вождения " + drivingExperience +
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
        return drivingExperience == driver.drivingExperience && Objects.equals(fullName, driver.fullName) && licence == driver.licence;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, drivingExperience, licence);
    }

    public void setFullName(String fullName) {
        this.fullName = Objects.requireNonNullElse(fullName, "default");
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

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public DriverLicence getLicence() {
        return licence;
    }
}
