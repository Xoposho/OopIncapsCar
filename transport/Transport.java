package transport;

import Exeption.DiagnosticFailedException;

import java.util.Objects;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        this.brand = Objects.requireNonNullElse(brand, "default");
        this.model = Objects.requireNonNullElse(model, "default");

        if (engineVolume != 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }
    }

    public abstract void startMoving();

    public abstract void endMoving();

    public abstract void diagnostic() throws DiagnosticFailedException;

    public abstract void printType();

    @Override
    public String toString() {
        return "Автомобиль: " +
                "марка - " + brand +
                ", модель - " + model +
                ", объём двигателя - "+ engineVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setBrand(String brand) {
        this.brand = Objects.requireNonNullElse(brand, "default");
    }

    public void setModel(String model) {
        this.model = Objects.requireNonNullElse(model, "default");
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
}
