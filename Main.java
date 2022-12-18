public class Main {
    public static void main(String[] args) {
        Car lada = new Car(null, "Granta", 1.7, "yellow", 2015, "Russia");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "black", 2020, "Germany");
        Car bmw = new Car("BMW", "Z8", 0, "black", 2021, "Germany");
        Car kia = new Car("Kia", "Sportage", 2.4, "red", 0, "South Korea");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, null, 2016, "South Korea");

        lada.carInfo();
        audi.carInfo();
        bmw.carInfo();
        kia.carInfo();
        hyundai.carInfo();
    }


}
