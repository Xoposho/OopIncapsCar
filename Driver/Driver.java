package Driver;

import Mechanics.Mechanics;
import Mechanics.TypeRepair;
import transport.Transport;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Driver<T extends Transport> {
    private String fullName;
    private int drivingExperience;
    private final DriverLicence licence;
    private final TypeRepair mechanic;

    public Driver(String fullName, int drivingExperience, DriverLicence licence, TypeRepair mechanic) {
        this.fullName = Objects.requireNonNullElse(fullName, "default");
        this.licence = licence;
        this.mechanic = mechanic;
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

    public TypeRepair getMechanic() {
        return mechanic;
    }
    public Mechanics[] getMechanics(Mechanics[] mechanics) {
        System.out.println("Механики водителя " + getFullName() + ": ");
        List<Mechanics> mech = new ArrayList<>();
        for (Mechanics m : mechanics) {
            if (getMechanic().equals(m.getTypeCarRepair1()) ||
                    getMechanic().equals(m.getTypeCarRepair2()) ||
                    getMechanic().equals(m.getTypeCarRepair3())) {
                mech.add(m);
                System.out.println(m);
            }
        }
        return mech.toArray(new Mechanics[mech.size() - 1]);
    }
}
