package oop1;
import oop1.Car;


public class Main {
    public static void main(String[] args) {

        Car lada = new Car(
                null,
                "Granta",
                1.7,
                "Yellow",
                2005,
                "Russia"
        );
        Car audi = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                3.0,
                " ",
                2020,
                "Germany"
        );
        Car bmw = new Car(
                "BMW",
                "Z8",
                3.0,
                "Black",
                0,
                "Germany"
        );
        Car kia = new Car(
                "Kia",
                "Sportage 4th generation",
                2.4,
                "Red",
                2018,
                "South Korea"
        );
        Car hyundai = new Car(
                "Hyundai",
                "Avante",
                1.6,
                "Orange",
                2016,
                "South Korea"
        );

        System.out.println(lada.toString());
        System.out.println(audi.toString());
        System.out.println(bmw.toString());
        System.out.println(kia.toString());
        System.out.println(hyundai.toString());
    }

}
