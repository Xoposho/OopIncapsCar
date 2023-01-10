import Driver.DriverB;
import transport.Bus;
import transport.FreightCar;
import transport.PassengerCar;


public class Main {
    public static void main(String[] args) {
        PassengerCar lada = new PassengerCar("Lada", "Granta Sport", 2.0);
        PassengerCar audi = new PassengerCar("Audi", "A8 50 L TDI quattro", 3.0);
        PassengerCar bmw = new PassengerCar("BMW", "Z8", 2.5);
        PassengerCar kia = new PassengerCar("KIA", "Stinger", 2.5);

        Bus volkswagen = new Bus("Volkswagen", "g67", 6.0);
        Bus mersedes = new Bus("Mersedes", "Sprinter", 3.0);
        Bus zil = new Bus("ZIL", "118 \"Yonger\" ", 10);
        Bus nefaz = new Bus("NefAZ", "5299", 6.7);

        FreightCar maz = new FreightCar("MAZ", "6501", 11.1);
        FreightCar isuzu = new FreightCar("Isuzu", "Elf", 5.2);
        FreightCar gaz = new FreightCar("GAZ", "Next", 4.4);
        FreightCar man = new FreightCar("MAN", "TGM", 6.9);

        System.out.println(lada);
        lada.startMoving();
        System.out.println(audi);
        audi.pitStop();
        System.out.println(bmw);
        bmw.maxSpeed();
        System.out.println(kia);
        kia.bestTimeLap();

        System.out.println();

        System.out.println(volkswagen);
        volkswagen.pitStop();
        System.out.println(mersedes);
        mersedes.maxSpeed();
        System.out.println(zil);
        zil.endMoving();
        System.out.println(nefaz);
        nefaz.startMoving();

        System.out.println();

        System.out.println(maz);
        maz.pitStop();
        System.out.println(isuzu);
        isuzu.bestTimeLap();
        System.out.println(gaz);
        gaz.endMoving();
        System.out.println(man);
        man.maxSpeed();

        System.out.println();

        DriverB <PassengerCar> mikle = new DriverB<PassengerCar>("Зубенко Михаил Петрович", true, 3);
        mikle.startRace(lada);
        DriverB <FreightCar> sergay = new DriverB<FreightCar>("Зубенко Сергей Петрович", true, 1);
        sergay.startRace(maz);
        DriverB <Bus> igor = new DriverB<Bus>("Зубенко Игорь Петрович", true, 10);
        igor.startRace(mersedes);

    }
}
//by Igor