package Driver;

import transport.Bus;

import static Driver.DriverLicence.D;

public class DriverD extends Driver<Bus> {

    public DriverD(String fullName, int drivingExperience) {
        super(fullName, drivingExperience, D);
    }
}
