package transport;

import Driver.Driver;
import Exeption.DiagnosticFailedException;
import Mechanics.Mechanics;
import Mechanics.TypeRepair;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Transport <T extends Driver> implements Competing{
    private String brand;
    private String model;
    private double engineVolume;
    private final TypeRepair typeRepair;
    private final List<Mechanics> mechanic = new ArrayList<>();
    private final T driver;

    public Transport(String brand, String model, double engineVolume, TypeRepair typeRepair, T driver) {
        this.brand = Objects.requireNonNullElse(brand, "default");
        this.model = Objects.requireNonNullElse(model, "default");
        this.typeRepair = typeRepair;
        this.driver = driver;

        if (engineVolume != 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }


    }
    public void addMechanic(Mechanics mechanics){
        mechanic.add(mechanics);
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


    public List<Mechanics> getMechanics() {
        return mechanic;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Driver getDriver() {
        return driver;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public TypeRepair getTypeRepair() {
        return typeRepair;
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
