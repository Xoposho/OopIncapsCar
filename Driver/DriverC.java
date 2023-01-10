package Driver;

import transport.Transport;
import transport.Competing;

public class DriverC<T extends Transport & Competing> extends Driver {

    public DriverC(String fullName, boolean driverLicence, int drivingExperience) {
        super(fullName, driverLicence, drivingExperience);
    }

    public void startRace(T transport){
        System.out.println("Водитель " + getFullName() + " начал гонку на автомобиле - " + transport.getBrand() + transport.getModel());
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void startDriving() {
        System.out.println("Водитель " + getFullName() + " начал гонку");
    }

    @Override
    public void stopDriving() {
        System.out.println("Водитель " + getFullName() + " закончил гонку");
    }

    @Override
    public void fillTheTank() {
        System.out.println("Водитель " + getFullName() + " заправляется");
    }
}
