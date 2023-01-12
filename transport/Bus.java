package transport;

import Driver.Driver;
import transport.Classification.ClassificationBus;

public class Bus extends Transport implements Competing {

    private ClassificationBus seatCount;
    public Bus(String brand, String model, double engineVolume, ClassificationBus seatCount) {
        super(brand, model, engineVolume);
        this.seatCount = seatCount;
    }

    public ClassificationBus getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(ClassificationBus seatCount) {
        this.seatCount = seatCount;
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
    public void printType() {
        if (seatCount == null) {
            System.out.println("Дынных по транспортному средству недостаточно");
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
