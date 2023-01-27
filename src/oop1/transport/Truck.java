package oop1.transport;

import oop1.transport.drivers.DriverB;
import oop1.transport.drivers.DriverD;
import oop1.transport.exception.CantFindLicenseException;
import oop1.transport.exception.WrongLicenseException;

public class Truck extends Transport<DriverD> {
    private WeightTruck weightTruck;

    public Truck(String brand,
                 String model,
                 double engineVolume,
                 DriverD driver,
                 WeightTruck weightTruck) {

        super(brand, model, engineVolume, driver);

        this.weightTruck = weightTruck;
    }

    public enum WeightTruck {

        N1(0F, 3.5F),
        N2(3.5F, 12F),
        N3(12F, null);

        private Float weightFrom;
        private Float weightTo;

        WeightTruck(Float weightFrom,
                    Float weightTo) {

            setWeightFrom(weightFrom);
            setWeightTo(weightTo);
        }

        public Float getWeightFrom() {
            return weightFrom;
        }

        public void setWeightFrom(Float weightFrom) {
            this.weightFrom = weightFrom;
        }

        public Float getWeightTo() {
            return weightTo;
        }

        public void setWeightTo(Float weightTo) {
            this.weightTo = weightTo;
        }

        @Override
        public String toString() {
            String from = getWeightFrom() == null ? "" : "от <" + getWeightFrom() + "> тонн";
            String to = getWeightTo() == null ? "" : " до <" + getWeightTo() + "> тонн";
            return "Грузоподъемность : " + from + to;
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовой автомобиль " + getBrand() + " остановился");
    }

    @Override
    public void bestTimeCircle() {
        int minTimeLap = 4;
        int maxTimeLap = 7;
        int bestTimeLap = (int) (minTimeLap + (maxTimeLap - minTimeLap) * Math.random());
        System.out.println("Лучшее время круга грузового автомобиля " + getBrand() + " :" + bestTimeLap);
    }

    @Override
    public void maximumSpeed() {
        int minSpeed = 100;
        int maxSpeed = 180;
        int bestSpeed = (int) (minSpeed + (maxSpeed - minSpeed) * Math.random());
        System.out.println("Максимальная скорость грузового автомобиля " + getBrand() + " :" + bestSpeed);
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовой автомобиль " + getBrand() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Грузовой автомобиль " + getBrand() + " закончил движение");
    }

    @Override
    public void printType() {
        if (weightTruck == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(weightTruck);
        }
    }

    @Override
    public void passDiagnostics() throws WrongLicenseException, CantFindLicenseException {

        if (getDriver() == null) {
            throw new WrongLicenseException("Некорректный тип прав водителя!");
        } else if (!getDriver().isDriversLicense()) {
            throw new CantFindLicenseException(getDriver().getFullName() + " не имеет прав, диагностика не пройдена");
        } else {
            System.out.println(getDriver().getFullName() +
                    " имеет соответствующую категорию прав: " + getDriver().getClass() + ", диагностика пройдена");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " " + weightTruck.toString();
    }
}
