package Transport;

import java.util.Objects;

public abstract class Transport {
    private String brand;
    private String model;
    private final int year;
    private String color;
    private final String country;
    private  int maxSpeed;

    public Transport(String brand, String model, int year, String color, String country, int maxSpeed) {
        this.brand = Objects.requireNonNullElse(brand, "default");
        this.model = Objects.requireNonNullElse(model, "default");
        this.country = Objects.requireNonNullElse(country, "default");
        this.color = Objects.requireNonNullElse(color, "white");

        if (year >= 1) {
            this.year = year;
        } else {
            this.year = 2000;
        }

        if (maxSpeed >= 1) {
            this.maxSpeed = maxSpeed;
        } else {
            this.maxSpeed = 150;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getCountry() {
        return country;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setBrand(String brand) {
        this.brand = Objects.requireNonNullElse(brand, "default");
    }

    public void setModel(String model) {
        this.model = Objects.requireNonNullElse(model, "default");
    }

    public void setColor(String color) {
        this.color = Objects.requireNonNullElse(color, "white");
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed >= 1) {
            this.maxSpeed = maxSpeed;
        } else {
            this.maxSpeed = 150;
        }
    }
}
