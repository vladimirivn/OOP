package oop1;

import oop1.transport.*;
import oop1.transport.drivers.DriveC;
import oop1.transport.drivers.Driver;
import oop1.transport.drivers.DriverB;
import oop1.transport.drivers.DriverD;
import oop1.transport.exception.CantFindLicenseException;
import oop1.transport.exception.WrongLicenseException;
import oop1.transport.mechanic.Mechanic;
import oop1.transport.mechanic.ServiceStation;

import java.util.*;

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
//        System.out.println("-------------------------");
//            System.out.println(car);

//            car.printType();
//            car.pitStop();
//            car.bestTimeCircle();
//            car.maximumSpeed();
//        try {
//            car.passDiagnostics();
//        } catch (CantFindLicenseException | WrongLicenseException e) {
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println("-------------------------");
//            System.out.println(bus);

//            bus.printType();
//            bus.pitStop();
//            bus.bestTimeCircle();
//            bus.maximumSpeed();
//        try {
//            bus.passDiagnostics();
//        } catch (CantFindLicenseException e) {
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println("-------------------------");
//            System.out.println(truck);

//            truck.printType();
//            truck.pitStop();
//            truck.bestTimeCircle();
//            truck.maximumSpeed();
//
//        try {
//            truck.passDiagnostics();
//        } catch (CantFindLicenseException | WrongLicenseException e) {
//            System.out.println(e.getMessage());
//        }

//        System.out.println("----------- Заезды --------------");
//        printInfoCompeting(car);
//        printInfoCompeting(bus);
//        printInfoCompeting(truck);

        System.out.println();

        List<Driver> drivers = new ArrayList<>();

        drivers.add(driverB);
        drivers.add(driverC);
        drivers.add(driverD);

        System.out.println(drivers);

        Mechanic mechanic1 = new Mechanic("Ivanov", "B Motors");
        Mechanic mechanic2 = new Mechanic("Pavlov", "C Motors");
        Mechanic mechanic3 = new Mechanic("Pomidorov", "D Motors");


        car.addMechanic(mechanic1);
//        car.addMechanic(mechanic1);
//        car.addMechanic(mechanic2);

//        bus.addMechanic(mechanic1);
        bus.addMechanic(mechanic2);

//        truck.addMechanic(mechanic1);
        truck.addMechanic(mechanic3);


        List<Transport<?>> racingList = new ArrayList<>();

        racingList.add(car);
        racingList.add(bus);
        racingList.add(truck);

        System.out.println();
        System.out.println("-----добавление автотранспорта в очередь --------------------");

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addTransportToQueue(car);
        serviceStation.addTransportToQueue(bus);
        serviceStation.addTransportToQueue(truck);

        System.out.println();
        System.out.println("------------ вывод списка всех автомобилей и механиков ----------------------------");

        for (Transport<?> transport : racingList) {
            System.out.println(transport.getBrand() + " " + transport.getDriver() + " " + transport.getMechanics());
        }
        System.out.println();
        System.out.println("------------ Техобслуживание автомобилей ----------------------------");


        for (Transport<?> transport : racingList) {
            serviceStation.startMaintenance();
        }

        System.out.println();
        System.out.println("------------ Map ----------------------------");

        Map<Transport<?>, Mechanic> transportMechanicMap = new HashMap<>();

        for (Transport<?> racer : racingList) {
            for (Mechanic mechanic : racer.getMechanics()) {
                transportMechanicMap.put(racer, mechanic);
            }
        }

        System.out.println(transportMechanicMap);
        System.out.println();

        for (Map.Entry<Transport<?>, Mechanic> entry : transportMechanicMap.entrySet()) {
            System.out.println("Ключ ( " + entry.getKey() + " ) ---> Значение ( " + entry.getValue() + " )");
        }

        System.out.println();
        Set<Driver> driverSet = new HashSet<>(drivers);
        System.out.println(driverSet);

        System.out.println("\n---------- итератор--------------");

        Iterator<Driver> driverIterator = driverSet.iterator();
        while (driverIterator.hasNext()) {
            System.out.println(driverIterator.next());
        }

        System.out.println();

        for (Driver driver : driverSet) {
            System.out.println(driver);
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
