import Transport.Bus;
import Transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car(null, "Granta", 1.7, "yellow", 2015, "Russia",
                "Manual", "Sedan", null, 5, "Summer", 240);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "black", 2020, "Germany",
                "Manual", "Sedan", "В345ПР030", 5, "Winter",350);
        Car bmw = new Car("BMW", "Z8", 0, "black", 2021, "Germany",
                "Manual", "Sedan", null, 2, "Summer", 400);
        Car kia = new Car("Kia", "Sportage", 2.4, "red", 0, "South Korea",
                "Automatic", "Liftback", "Л345В030", 5, "Winter", 200);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, null, 2016, "South Korea",
                "Automatic", "Crossover", "К978СМ030", 5, "Summer", 190);

        Bus volkswagen = new Bus("volkswagen", "g67", 2022, "green", "Germany", 200);
        System.out.println(volkswagen);
        Bus haval = new Bus("haval", "h79", 2020, "red", "China", 185);
        System.out.println(haval);
        Bus zil = new Bus("zil", "118 \"Yonger\" ", 1963, "green and white stripes", "USSR", 999);
        System.out.println(zil);
    }
}
//by Igor