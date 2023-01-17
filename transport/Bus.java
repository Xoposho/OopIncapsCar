package transport;

import static Mechanics.TypeRepair.REPAIR_BUS;
import transport.Classification.ClassificationBus;
import Driver.DriverD;
public class Bus extends Transport implements Competing {

    private ClassificationBus seatCount;
    private final DriverD driver;
    public Bus(String brand, String model, double engineVolume, ClassificationBus seatCount, DriverD driver) {
        super(brand, model, engineVolume, REPAIR_BUS, driver);
        this.driver = driver;
        this.seatCount = seatCount;
    }

    public ClassificationBus getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(ClassificationBus seatCount) {
        this.seatCount = seatCount;
    }

    public DriverD getDriver() {
        return driver;
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " едет");
    }

    @Override
    public void endMoving() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + "  остановился");
    }

    @Override
    public void diagnostic(){
    }

    @Override
    public void printType() {
        if (seatCount == null) {
            System.out.println("Не указана вместительность!");
        } else {
            System.out.println(seatCount);
        }
    }
    @Override
    public void pitStop() {
        System.out.println("Автобус  " + getBrand() + " " + getModel() + "  обслуживается");
    }

    public void bestTimeLap() {
        System.out.println("Лучшее время круга на " + getBrand() + " " + getModel() + ": ");
    }
    public void maxSpeed() {
        System.out.println("Максимальная скорость на " + getBrand() + " " + getModel() + ": ");
    }
}
