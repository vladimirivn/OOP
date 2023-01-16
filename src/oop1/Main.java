package oop1;
import oop1.transport.Car;
import oop1.transport.Bus;
import oop1.transport.Truck;

public class Main {
    public static void main(String[] args) {


        for (int i = 1; i <= 4; i++) {

            Car car = new Car("Lada_" + i,
                    "Vesta Sport ",
                    1.7
            );
            Bus bus = new Bus("Volzhanin_" + i,
                    "Liner_" + i,
                    2.5
            );
            Truck truck = new Truck("Kamaz_" + i,
                    "Travel_" + i,
                    3.5
            );
            System.out.println(car);
            System.out.println(bus);
            System.out.println(truck);
        }
    }
}
