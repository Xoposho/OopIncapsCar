package Transport;

import java.util.Calendar;
import java.util.Objects;

public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private String seasonTire;

    public Car(String brand, String model, double engineVolume, String color,
               int year, String country, String transmission, String bodyType,
               String registrationNumber, int numberOfSeats, String seasonTire, int maxSpeed) {
        super(brand, model, year, color, country, maxSpeed);
        this.transmission = Objects.requireNonNullElse(transmission, "Manual");
        this.bodyType = Objects.requireNonNullElse(bodyType, "Sedan");
        this.registrationNumber = Objects.requireNonNullElse(registrationNumber, "x000xx000");
        this.seasonTire = Objects.requireNonNullElse(seasonTire, "Summer");

        if (numberOfSeats >= 2) {
            this.numberOfSeats = numberOfSeats;
        } else {
            this.numberOfSeats = 2;
        }

        if (engineVolume != 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }

    }

    public void carInfo() {
        System.out.println( "Car:" +
                " brand - " + getBrand() +
                ", model - " + getModel() +
                ", engine volume - " + engineVolume + "л." +
                ", color - " + getColor() +
                ", year of issue - " + getYear() +
                ", country of origin - " + getCountry() +
                ", transmission - " + transmission +
                ", body type - " + bodyType +
                ", registration number - " + registrationNumber +
                ", number of seats - " + numberOfSeats +
                ", season tire - " + seasonTire);
    }
    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getSeasonTire() {
        return seasonTire;
    }

    public void setSeasonTire() {
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH);
        boolean summer = month == 3 || month == 4 || month == 5 || month == 6 || month == 7 || month == 8;
        boolean winter = month == 1 || month == 2 || month == 9 || month == 10 || month == 11 || month == 12;

        if (summer && this.seasonTire.equalsIgnoreCase("winter")) {
            this.seasonTire = "Summer";
        } else if (winter && this.seasonTire.equalsIgnoreCase("summer")) {
            this.seasonTire = "Winter";
        }
    }
}
//by Igor