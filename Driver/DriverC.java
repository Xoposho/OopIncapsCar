package Driver;

import transport.Truck;

import static Driver.DriverLicence.C;
import static Mechanics.TypeRepair.REPAIR_TRUCK;

public class DriverC extends Driver<Truck> {

    public DriverC(String fullName, int drivingExperience) {
        super(fullName, drivingExperience, C, REPAIR_TRUCK);
    }

    @Override
    public DriverLicence getLicence() {
        return super.getLicence();
    }


}
