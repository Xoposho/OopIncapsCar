package transport;

import Driver.Driver;

public class Bus extends Transport implements Competing {
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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
