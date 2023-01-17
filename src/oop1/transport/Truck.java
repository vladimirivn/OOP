package oop1.transport;

import oop1.transport.drivers.DriverD;

public class Truck extends Transport<DriverD>{
    public Truck(String brand,
                 String model,
                 double engineVolume,
                 DriverD driver) {

        super(brand, model, engineVolume, driver);
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовой автомобиль " + getBrand() + " остановился");
    }

    @Override
    public void bestTimeCircle() {
        int minTimeLap = 4;
        int maxTimeLap = 7;
        int bestTimeLap = (int) (minTimeLap + (maxTimeLap - minTimeLap)* Math.random());
        System.out.println("Лучшее время круга грузового автомобиля " + getBrand() + " :" + bestTimeLap);
    }

    @Override
    public void maximumSpeed() {
        int minSpeed = 100;
        int maxSpeed = 180;
        int bestSpeed = (int) (minSpeed + (maxSpeed - minSpeed)* Math.random());
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
    public String toString() {
        return super.toString() + " - грузовой автомобиль";
    }
}
