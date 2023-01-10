package Driver;

import transport.Transport;

import java.util.Objects;

public abstract class Driver {
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

    public abstract void startDriving();

    public abstract void stopDriving();

    public abstract void fillTheTank();

    @Override
    public String toString() {
        return "Водитель: " +
                "ФИО - " + fullName +
                ", действительность водительских прав - " + driverLicence +
                ", опыт вождения" + drivingExperience +
                " лет.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return driverLicence == driver.driverLicence && drivingExperience == driver.drivingExperience && fullName.equals(driver.fullName);
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
