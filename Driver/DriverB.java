package Driver;

import transport.Car;

import static Driver.DriverLicence.B;
import static Mechanics.TypeRepair.REPAIR_CAR;

public class DriverB extends Driver<Car> {

    public DriverB(String fullName, int drivingExperience) {
        super(fullName, drivingExperience, B, REPAIR_CAR);
    }

    @Override
    public DriverLicence getLicence() {
        return super.getLicence();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
