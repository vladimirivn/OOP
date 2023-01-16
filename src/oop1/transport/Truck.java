package oop1.transport;

public class Truck extends Transport{
    public  Truck ( String brand, String model, double engineVolume)
    {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик " + getBrand() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Грузовик " + getBrand() + " закончил движение");
    }

    @Override
    public String toString() {
        return super.toString() + " - грузовик";
    }
}
