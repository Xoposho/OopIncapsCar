import Driver.Driver;
import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import Exeption.DiagnosticFailedException;
import Mechanics.Mechanics;
import transport.Classification.ClassificationBus;
import transport.Classification.ClassificationFreightCar;
import transport.Classification.ClassificationPassengerCar;
import transport.Bus;
import transport.Truck;
import transport.Car;
import transport.Transport;
import static Mechanics.TypeRepair.*;
import Driver.DriverLicence;

import java.util.*;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        DriverB mikle = new DriverB(
                "Зубенко Михаил Петрович",
                3);


        Car lada = new Car(
                "Lada",
                "Granta Sport",
                2.0,
                ClassificationPassengerCar.HATCHBACK,
                mikle);


        DriverC sergay = new DriverC(
                "Зубенко Сергей Иванович",
                1);

        Truck maz = new Truck(
                "MAZ",
                "6501",
                11.1,
                ClassificationFreightCar.N2,
                sergay);

        DriverD igor = new DriverD(
                "Зубенко Игорь Алексеевич",
                10);

        Bus volkswagen = new Bus(
                "Volkswagen",
                "g67",
                6.0,
                ClassificationBus.MEDIUM,
                igor);

        try {
            lada.diagnostic();
        } catch (DiagnosticFailedException e) {
            e.printStackTrace();
            System.out.println("Ошибка при проведении диагностики");
        }

        try {
            maz.diagnostic();
        } catch (DiagnosticFailedException e){
            e.printStackTrace();
            System.out.println("Ошибка при проведении диагностики");
        }
        ArrayList<Driver<?>> drivers = new ArrayList<>();
        drivers.add(igor);
        drivers.add(mikle);
        drivers.add(sergay);

        Mechanics m1 = new Mechanics("Fricov Alexey Ivanovich", "Volksvagen", REPAIR_CAR);
        Mechanics m2 = new Mechanics("Fricov Peter Spidermanov", "MAZ", REPAIR_BUS, REPAIR_CAR);
        Mechanics m3 = new Mechanics("Fricov Vladimir Alexeevich", "ZAZ", REPAIR_TRUCK, REPAIR_BUS, REPAIR_CAR);
        Mechanics m4 = new Mechanics("Fricov Alexey Igorevich", "Your Car", REPAIR_BUS);

        lada.addMechanic(m1);
        lada.addMechanic(m2);
        maz.addMechanic(m3);
        volkswagen.addMechanic(m4);

        Set<Driver<?>> driverSet = new HashSet<>(drivers);
        Iterator<Driver<?>> driverIterator = driverSet.iterator();

        while (driverIterator.hasNext()){
            System.out.println(driverIterator.next());
        }

//        for (Driver<?> m: driverSet){
//            System.out.println(m + " ready for start race"); //Alternative
//        }

        Map<Transport<?>, Mechanics> repair = new HashMap<>();
        repair.put(lada, m1);
        repair.put(maz, m3);
        repair.put(volkswagen, m2);

        System.out.println(repair);










    }
}
//by Igor