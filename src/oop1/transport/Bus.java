package oop1.transport;

import oop1.transport.drivers.DriveC;

public class Bus extends Transport<DriveC> {

    public Bus(String brand,
               String model,
               double engineVolume,
               DriveC driver) {

        super(brand, model, engineVolume, driver);
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус " + getBrand() + " остановился");
    }
    @Override
    public void bestTimeCircle() {
        int minTimeLap = 5;
        int maxTimeLap = 9;
        int bestTimeLap = (int) (minTimeLap + (maxTimeLap - minTimeLap)* Math.random());
        System.out.println("Лучшее время круга автобуса " + getBrand() + " :" + bestTimeLap);
    }
    @Override
    public void maximumSpeed() {
        int minSpeed = 80;
        int maxSpeed = 150;
        int bestSpeed = (int) (minSpeed + (maxSpeed - minSpeed)* Math.random());
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
    public String toString() {
        return super.toString() + " - автобус";
    }
}
