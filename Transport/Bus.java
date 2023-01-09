package Transport;

public class Bus extends Transport{
    public Bus(String brand, String model, int year, String color, String country, int maxSpeed) {
        super(brand, model, year, color, country, maxSpeed);
    }

    @Override
    public String toString() {
        return "Автобус: " + getBrand() + " " + getModel() + ". "
                + getYear() + " года выпуска. " + getColor() + " цвета. "
                + "Страна производства: " + getCountry() + ". Максимальная скорость: " + getMaxSpeed() + " км/ч.";
    }
}
