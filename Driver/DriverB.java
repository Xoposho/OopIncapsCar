package Driver;

import transport.PassengerCar;

import static Driver.DriverLicence.B;

public class DriverB extends Driver<PassengerCar> {

    public DriverB(String fullName, int drivingExperience) {
        super(fullName, drivingExperience, null);

    }

    @Override
    public DriverLicence getLicence() {
        return super.getLicence();
    }
}
