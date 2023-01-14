import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import Exeption.DiagnosticFailedException;
import jdk.jfr.StackTrace;
import transport.Classification.ClassificationBus;
import transport.Classification.ClassificationFreightCar;
import transport.Classification.ClassificationPassengerCar;
import transport.Bus;
import transport.FreightCar;
import transport.PassengerCar;


public class Main {
    public static void main(String[] args) {

        DriverB mikle = new DriverB(
                "Зубенко Михаил Петрович",
                3);


        PassengerCar lada = new PassengerCar(
                "Lada",
                "Granta Sport",
                2.0,
                ClassificationPassengerCar.HATCHBACK,
                mikle);


        DriverC sergay = new DriverC(
                "Зубенко Сергей Иванович",
                1);

        FreightCar maz = new FreightCar(
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


    }
}
//by Igor