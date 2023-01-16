package oop1.transport;

public class Car extends Transport{

    public Car(String brand, String model, double engineVolume)
    {
        super(brand, model, engineVolume);

    }

    @Override
    public void startMoving() {
        System.out.println("Автомобиль " + getBrand() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автомобиль " + getBrand() + " закончил движение");
    }

    @Override
    public String toString() {
        return super.toString() + " - легковой автомобиль";
    }

}
