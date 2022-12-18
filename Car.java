import java.util.Objects;

public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Car(String brand, String model, double engineVolume, String color, int year, String country) {

        this.brand = Objects.requireNonNullElse(brand, "default");
        this.model = Objects.requireNonNullElse(model, "default");
        this.country = Objects.requireNonNullElse(country, "default");
        this.color = Objects.requireNonNullElse(color, "white");

        if (engineVolume != 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }

        if (year != 0) {
            this.year = year;
        } else {
            this.year = 2000;
        }

    }

    void carInfo() {
        System.out.println(
                brand + " " +
                        model + ", " +
                        year + " год выпуска, сборка " +
                        country + ", " +
                        color + " цвета, объём двигателя - " +
                        engineVolume + " л.");
    }
}
