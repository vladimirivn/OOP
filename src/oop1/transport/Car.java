package oop1.transport;

import oop1.transport.drivers.DriverB;
import oop1.transport.exception.CantFindLicenseException;
import oop1.transport.exception.WrongLicenseException;

public class Car extends Transport<DriverB> {
    private CarBodyType carBodyType;

    public Car(String brand,
               String model,
               double engineVolume,
               DriverB driver,
               CarBodyType carBodyType) {

        super(brand, model, engineVolume, driver);

        this.carBodyType = carBodyType;
    }

    public enum CarBodyType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбэк"),
        COUPE("Купе"),
        WAGON("Универсал"),
        OFF_ROAD("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP_TRUCK("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private String bodyType;

        CarBodyType(String bodyType) {

            setBodyType(bodyType);
        }

        public String getBodyType() {
            return this.bodyType;
        }

        public void setBodyType(String bodyType) {
            this.bodyType = bodyType;
        }

        @Override
        public String toString() {
            return "тип кузова: <" + bodyType + ">";
        }

    }

    @Override
    public void pitStop() {
        System.out.println("Автомобиль " + getBrand() + " остановился");
    }

    @Override
    public void bestTimeCircle() {
        int minTimeLap = 3;
        int maxTimeLap = 5;
        int bestTimeLap = (int) (minTimeLap + (maxTimeLap - minTimeLap) * Math.random());
        System.out.println("Лучшее время круга автомобиля " + getBrand() + " :" + bestTimeLap);
    }

    @Override
    public void maximumSpeed() {
        int minSpeed = 120;
        int maxSpeed = 250;
        int bestSpeed = (int) (minSpeed + (maxSpeed - minSpeed) * Math.random());
        System.out.println("Максимальная скорость автомобиля " + getBrand() + " :" + bestSpeed);
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
    public void printType() {
        if (carBodyType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Легковой автомобиль : " + getBrand() + ", марка : " + getModel() + ", " + carBodyType);
        }
    }

    @Override
    public void passDiagnostics() throws CantFindLicenseException {

        if (!getDriver().isDriversLicense()) {
            throw new CantFindLicenseException(getDriver().getFullName() + " не имеет прав, диагностика не пройдена");
//        }
//        else if (getDriver().getClass() != DriverB.class) {
//            throw new WrongLicenseException("Некорректный тип прав водителя!");
        } else {
            System.out.println(getDriver().getFullName() +
                    " имеет соответствующую категорию прав: " + getDriver().getClass() + ", диагностика пройдена");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", " + carBodyType.toString();
    }
}
