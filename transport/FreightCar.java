package transport;

import transport.Classification.ClassificationFreightCar;

public class FreightCar extends Transport implements Competing {

    private ClassificationFreightCar loadCapacity;

    public FreightCar(String brand, String model, double engineVolume, ClassificationFreightCar loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    public ClassificationFreightCar getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(ClassificationFreightCar loadCapacity) {
        this.loadCapacity = loadCapacity;
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
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("Дынных по транспортному средству недостаточно");
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
