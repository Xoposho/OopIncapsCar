package transport;

import Driver.DriverB;
import Exeption.DiagnosticFailedException;
import Mechanics.Mechanics;
import transport.Classification.ClassificationPassengerCar;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import static Mechanics.TypeRepair.REPAIR_CAR;

public class Car extends Transport implements Competing, Map<Transport<?>, Mechanics> {

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

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Mechanics get(Object key) {
        return null;
    }

    @Override
    public Mechanics remove(Object key) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public Set<Transport<?>> keySet() {
        return null;
    }

    @Override
    public Collection<Mechanics> values() {
        return null;
    }

    @Override
    public Set<Entry<Transport<?>, Mechanics>> entrySet() {
        return null;
    }

    @Override
    public void putAll(Map<? extends Transport<?>, ? extends Mechanics> m) {

    }

    @Override
    public Mechanics put(Transport<?> key, Mechanics value) {
        return null;
    }
}
//by Igor