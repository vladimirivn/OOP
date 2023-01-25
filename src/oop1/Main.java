package oop1;

import oop1.transport.*;
import oop1.transport.drivers.DriveC;
import oop1.transport.drivers.Driver;
import oop1.transport.drivers.DriverB;
import oop1.transport.drivers.DriverD;
import oop1.transport.exception.CantFindLicenseException;
import oop1.transport.exception.WrongLicenseException;
import oop1.transport.mechanic.Mechanic;
import oop1.transport.mechanic.TransportType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        for (int i = 1; i <= 1; i++) {
        DriverB driverB = new DriverB("Водитель категории B", true, 1);
        Car car = new Car("Lada",
                "Vesta Sport",
                1.7,
                driverB,
                Car.CarBodyType.SEDAN
        );
        DriveC driverC = new DriveC("Водитель категории C", true, 4);
        Bus bus = new Bus("Volzhanin",
                "Liner",
                2.5,
                driverC,
                Bus.CapacityBus.EXTRA_SMALL
        );
        DriverD driverD = new DriverD("Водитель категории D", true, 6);
        Truck truck = new Truck("Kamaz",
                "Travel",
                3.5,
                driverD,
                Truck.WeightTruck.N3
        );
        System.out.println("-------------------------");
//            System.out.println(car);

//            car.printType();
//            car.pitStop();
//            car.bestTimeCircle();
//            car.maximumSpeed();
        try {
            car.passDiagnostics();
        } catch (CantFindLicenseException | WrongLicenseException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("-------------------------");
//            System.out.println(bus);

//            bus.printType();
//            bus.pitStop();
//            bus.bestTimeCircle();
//            bus.maximumSpeed();
        try {
            bus.passDiagnostics();
        } catch (CantFindLicenseException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("-------------------------");
//            System.out.println(truck);

//            truck.printType();
//            truck.pitStop();
//            truck.bestTimeCircle();
//            truck.maximumSpeed();

        try {
            truck.passDiagnostics();
        } catch (CantFindLicenseException | WrongLicenseException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("----------- Заезды --------------");
        printInfoCompeting(car);
        printInfoCompeting(bus);
        printInfoCompeting(truck);

        System.out.println("-------------------------");
        List<Driver> drivers = new ArrayList<>();

        drivers.add(driverB);
        drivers.add(driverC);
        drivers.add(driverD);

        Mechanic mechanic1 = new Mechanic("Ivanov", "B Motors", TransportType.CAR);
        Mechanic mechanic2 = new Mechanic("Pavlov", "B Motors", TransportType.CAR);
        Mechanic mechanic3 = new Mechanic("Petrov", "C Motors", TransportType.BUS);
        Mechanic mechanic4 = new Mechanic("Kotov", "C Motors", TransportType.BUS);
        Mechanic mechanic5 = new Mechanic("Sidorov", "D Motors", TransportType.TRUCK);
        Mechanic mechanic6 = new Mechanic("Pomidorov", "D Motors", TransportType.TRUCK);


        car.addMechanic(mechanic1);
        car.addMechanic(mechanic2);

        bus.addMechanic(mechanic3);
        bus.addMechanic(mechanic4);

        truck.addMechanic(mechanic5);
        truck.addMechanic(mechanic6);


        List<Transport<?>> racers = new ArrayList<>();

        racers.add(car);
        racers.add(bus);
        racers.add(truck);

        for (Transport<?> transport : racers) {
            System.out.println(transport + " " + transport.getDriver() + " " + transport.getMechanics());
        }

    }


    private static void printInfoCompeting(Transport<?> transport) {
        if (transport.getDriver().isDriversLicense()) {
            System.out.println(transport.getDriver().getFullName() +
                    " управляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде");
        } else {
            System.out.println(transport.getDriver().getFullName() +
                    " не может управлять автомобилем " + transport.getBrand() + " и не будет участвовать в заезде");
        }
    }
}
