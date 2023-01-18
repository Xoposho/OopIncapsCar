package transport;

import Driver.DriverC;
import Exeption.DiagnosticFailedException;
import static Mechanics.TypeRepair.REPAIR_TRUCK;
import transport.Classification.ClassificationFreightCar;

import java.util.Objects;

public class Truck  extends Transport implements Competing {

    private ClassificationFreightCar loadCapacity;

    private final DriverC driver;

    public Truck(String brand, String model, double engineVolume, ClassificationFreightCar loadCapacity, DriverC driver) {
        super(brand, model, engineVolume, REPAIR_TRUCK, driver);
        this.driver = driver;
        this.loadCapacity = loadCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return loadCapacity == truck.loadCapacity && Objects.equals(driver, truck.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), loadCapacity, driver);
    }

    public ClassificationFreightCar getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(ClassificationFreightCar loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public DriverC getDriver() {
        return driver;
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " + getModel() + " едет");
    }

    @Override
    public void endMoving() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " + getModel() + "  остановился");
    }

    @Override
    public void diagnostic() throws DiagnosticFailedException {
        if (driver.getLicence() != null) {
            System.out.println("Диагностика прошла успешно!");
        } else {
            throw new DiagnosticFailedException("Необходимо указать тип прав!");
        }
    }

    @Override
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("Не указана грузоподъёмность!");
        } else {
            System.out.println(loadCapacity);
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовой автомобиль  " + getBrand() + " " + getModel() + "  обслуживается");
    }

    @Override
    public void bestTimeLap() {
        System.out.println("Лучшее время круга " + getBrand() + " " + getModel() + ": ");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость " + getBrand() + " " + getModel() + ": ");
    }
}
