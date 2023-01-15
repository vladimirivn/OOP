package oop1;
import oop1.transport.Bus;
import oop1.transport.Car;


public class Main {
    public static void main(String[] args) {

        Car lada = new Car(
                "Lada",
                " ",
                1.7,
                "",
                -3,
                "Russia",
                150,
                "MT",
                "Sedan",
                "A0000AA134rus",
                0,
                true,
                new Car.Key(true,false)
        );
        Car audi = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                3.0,
                "Black",
                2020,
                "Germany",
                250,
                "AT",
                "Sedan",
                "GB-1234AA",
                5,
                true,
                new Car.Key(false,true)
        );
        Car bmw = new Car(
                "BMW",
                "Z8",
                3.0,
                "Black",
                2021,
                "Germany",
                290,
                "AT",
                "Cabriolet",
                "GB-2222BB",
                5,
                true,
                new Car.Key()
        );
        Car kia = new Car(
                "Kia",
                "Sportage 4th generation",
                2.4,
                "Red",
                2018,
                "South Korea",
                190,
                "AT",
                "SUV",
                "KR-04532I",
                6,
                false,
                new Car.Key(false,false)
        );
        Car hyundai = new Car(
                "Hyundai",
                "Avante",
                1.6,
                "Orange",
                2016,
                "South Korea",
                -200,
                "AT",
                "Sedan",
                "У0440УУ195",
                6,
                false,
                new Car.Key(true,true)
        );

        System.out.println(lada);
        System.out.println("-----------------------------------------------------");
        System.out.println(audi);
        System.out.println("-----------------------------------------------------");
        System.out.println(bmw);
        System.out.println("-----------------------------------------------------");
        System.out.println(kia);
        System.out.println("-----------------------------------------------------");
        System.out.println(hyundai);
        System.out.println("----------------- автобусы ------------------------------------");

        Bus ikarus = new Bus( "Ikarus", "i345", 2021,
                     "Hungary", "Orange", 100);
        Bus volgabus = new Bus( "VolgaBus", "Volzhanin", 2022,
                "Russia", "White", 110);
        Bus neoplan = new Bus( "Neoplan", "Skyliner", 2019,
                "Germany", "Blue", 120);

        System.out.println(ikarus);
        System.out.println("--------------------------");
        System.out.println(volgabus);
        System.out.println("--------------------------");
        System.out.println(neoplan);

    }

}
