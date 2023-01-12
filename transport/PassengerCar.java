package transport;

import transport.Classification.ClassificationPassengerCar;

public class PassengerCar extends Transport implements Competing {

    private ClassificationPassengerCar bodyType;

    public PassengerCar(String brand, String model, double engineVolume, ClassificationPassengerCar bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    public ClassificationPassengerCar getBodyType() {
        return bodyType;
    }

    public void setBodyType(ClassificationPassengerCar bodyType) {
        this.bodyType = bodyType;
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