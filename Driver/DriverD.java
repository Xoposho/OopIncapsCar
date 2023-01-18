package Driver;

import transport.Bus;

import static Driver.DriverLicence.D;
import static Mechanics.TypeRepair.REPAIR_BUS;

public class DriverD extends Driver<Bus> {

    public DriverD(String fullName, int drivingExperience) {
        super(fullName, drivingExperience, D, REPAIR_BUS);
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


