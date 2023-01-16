package oop1.transport;

public class Bus extends Transport {

    public  Bus ( String brand, String model, double engineVolume)
    {
        super(brand, model, engineVolume);
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
