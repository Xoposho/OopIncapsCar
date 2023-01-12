import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import transport.Bus;
import transport.Classification.ClassificationBus;
import transport.Classification.ClassificationFreightCar;
import transport.Classification.ClassificationPassengerCar;
import transport.FreightCar;
import transport.PassengerCar;


public class Main {
    public static void main(String[] args) {
        PassengerCar lada = new PassengerCar("Lada", "Granta Sport", 2.0, ClassificationPassengerCar.HATCHBACK);
        PassengerCar audi = new PassengerCar("Audi", "A8 50 L TDI quattro", 3.0, ClassificationPassengerCar.COUPE);
        PassengerCar bmw = new PassengerCar("BMW", "Z8", 2.5, ClassificationPassengerCar.COUPE);
        PassengerCar kia = new PassengerCar("KIA", "Stinger", 2.5, ClassificationPassengerCar.CROSSOVER);

        Bus volkswagen = new Bus("Volkswagen", "g67", 6.0, ClassificationBus.MEDIUM);
        Bus mersedes = new Bus("Mersedes", "Sprinter", 3.0, ClassificationBus.SMALL);
        Bus zil = new Bus("ZIL", "118 \"Yonger\" ", 10, ClassificationBus.ESPECIALLY_BIG);
        Bus nefaz = new Bus("NefAZ", "5299", 6.7, ClassificationBus.BIG);

        FreightCar maz = new FreightCar("MAZ", "6501", 11.1, ClassificationFreightCar.N2);
        FreightCar isuzu = new FreightCar("Isuzu", "Elf", 5.2, ClassificationFreightCar.N1);
        FreightCar gaz = new FreightCar("GAZ", "Next", 4.4, ClassificationFreightCar.N3);
        FreightCar man = new FreightCar("MAN", "TGM", 6.9, ClassificationFreightCar.N2);

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

        DriverB mikle = new DriverB("Зубенко Михаил Петрович", true, 3);
        mikle.startRace(lada);
        DriverC sergay = new DriverC("Зубенко Сергей Иванович", true, 1);
        sergay.startRace(maz);
        DriverD igor = new DriverD("Зубенко Игорь Алексеевич", true, 10);
        igor.startRace(mersedes);
        maz.maxSpeed();

        System.out.println(audi.getBodyType());
        System.out.println(mersedes.getSeatCount());
        System.out.println(gaz.getLoadCapacity());
        audi.setBodyType(ClassificationPassengerCar.CROSSOVER);
        System.out.println(audi.getBodyType());

    }
}
//by Igor