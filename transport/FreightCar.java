package transport;

import Driver.DriverC;
import Exeption.DiagnosticFailedException;
import transport.Classification.ClassificationFreightCar;

public class FreightCar extends Transport implements Competing {

    private ClassificationFreightCar loadCapacity;

    private final DriverC driver;

    public FreightCar(String brand, String model, double engineVolume, ClassificationFreightCar loadCapacity, DriverC driver) {
        super(brand, model, engineVolume);
        this.driver = driver;
        this.loadCapacity = loadCapacity;
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
