package oop1.transport;

import oop1.transport.drivers.DriveC;
import oop1.transport.exception.CantFindLicenseException;

public class Bus extends Transport<DriveC> {

    private CapacityBus capacityBus;

    public Bus(String brand,
               String model,
               double engineVolume,
               DriveC driver,
               CapacityBus capacityBus) {

        super(brand, model, engineVolume, driver);

        this.capacityBus = capacityBus;

    }

    public enum CapacityBus {
        EXTRA_SMALL(0, 10),
        SMALL(10, 25),
        MEDIUM(40, 50),
        LARGE(60, 80),
        EXTRA_LARGE(100, 120);

        private int capacityFrom;
        private int capacityTo;

        CapacityBus(int capacityFrom,
                    int capacityTo) {

            setCapacityFrom(capacityFrom);
            setCapacityTo(capacityTo);
        }

        public int getCapacityFrom() {
            return capacityFrom;
        }

        public void setCapacityFrom(int capacityFrom) {
            this.capacityFrom = capacityFrom;
        }

        public int getCapacityTo() {
            return capacityTo;
        }

        public void setCapacityTo(int capacityTo) {
            this.capacityTo = capacityTo;
        }

        @Override
        public String toString() {
            String from = getCapacityFrom() <= 0 ? "" : "от <" + getCapacityFrom() + "> мест";
            String to = getCapacityTo() <= 0 ? "" : " до <" + getCapacityTo() + "> мест";
            return "Вместимость : " + from + to;
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус " + getBrand() + " остановился");
    }

    @Override
    public void bestTimeCircle() {
        int minTimeLap = 5;
        int maxTimeLap = 9;
        int bestTimeLap = (int) (minTimeLap + (maxTimeLap - minTimeLap) * Math.random());
        System.out.println("Лучшее время круга автобуса " + getBrand() + " :" + bestTimeLap);
    }

    @Override
    public void maximumSpeed() {
        int minSpeed = 80;
        int maxSpeed = 150;
        int bestSpeed = (int) (minSpeed + (maxSpeed - minSpeed) * Math.random());
        System.out.println("Максимальная скорость автобуса " + getBrand() + " :" + bestSpeed);
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус " + getBrand() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автобус " + getBrand() + " закончил движение");
    }

    @Override
    public void printType() {
        if (capacityBus == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(capacityBus);
        }
    }

    @Override
    public void passDiagnostics() throws CantFindLicenseException {
        System.out.println("Автобусы диагностику не проходят");
    }

    @Override
    public String toString() {
        return super.toString() + " " + capacityBus.toString();
    }
}
