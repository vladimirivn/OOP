package oop1.transport.drivers;

import oop1.transport.Driver;

public class DriverD extends Driver {

    public DriverD(String fullName,
                   boolean driversLicense,
                   int drivingExperience) {

        super(fullName, driversLicense, drivingExperience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель с правами категории D " + getFullName() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель с правами категории D " + getFullName() + " закончил движение");
    }

    @Override
    public void refuelAuto() {
        System.out.println("Водитель с правами категории D " + getFullName() + " заправляет автомобиль");
    }
}
