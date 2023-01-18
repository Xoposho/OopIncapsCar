package transport;

import Driver.DriverB;
import Exeption.DiagnosticFailedException;
import Mechanics.Mechanics;
import transport.Classification.ClassificationPassengerCar;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import static Mechanics.TypeRepair.REPAIR_CAR;

public class Car extends Transport implements Competing {

    private ClassificationPassengerCar bodyType;
    private final DriverB driver;

    public Car(String brand, String model, double engineVolume, ClassificationPassengerCar bodyType, DriverB driver) {
        super(brand, model, engineVolume, REPAIR_CAR, driver);
        this.driver = driver;
        this.bodyType = bodyType;
    }

    public ClassificationPassengerCar getBodyType() {
        return bodyType;
    }

    public void setBodyType(ClassificationPassengerCar bodyType) {
        this.bodyType = bodyType;
    }

    public DriverB getDriver() {
        return driver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return bodyType == car.bodyType && Objects.equals(driver, car.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bodyType, driver);
    }

    @Override
    public void startMoving() {
        System.out.println("Легковой автомобиль " + getBrand() + " " + getModel() + " едет");
    }

    @Override
    public void endMoving() {
        System.out.println("Легковой автомобиль " + getBrand() + " " + getModel() + "  остановился");
    }

    @Override
    public void diagnostic() throws DiagnosticFailedException {
        if (driver.getLicence() != null){
            System.out.println("Диагностика прошла успешно!");
        } else {
            throw new DiagnosticFailedException("Необходимо указать тип прав!");
        }
    }

    @Override
    public void printType() {
        if (bodyType == null){
            System.out.println("Не указан тип кузова!");
        } else {
            System.out.println(bodyType);
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Легковой автомобиль  " + getBrand() + " " + getModel() + "  обслуживается");
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
//by Igor