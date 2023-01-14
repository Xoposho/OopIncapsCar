package Driver;

import transport.FreightCar;

import static Driver.DriverLicence.C;

public class DriverC extends Driver<FreightCar> {

    public DriverC(String fullName, int drivingExperience) {
        super(fullName, drivingExperience, C);


    }
}
