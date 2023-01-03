package oop1.transport;

public class Car {
    private final String brand; // Марка
    private final String model; // Модель
    private double engineVolume; //Объем двигателя
    private String color; // Цвет кузова
    private final int productionYear; // Год производства
    private final String productionCountry; // Страна производства

    private String transmission; // Тип трансмиссии
    private final String style; // Тип кузова
    private String registrationNumber; // Регистрационный номер
    private final int numberOfSeats; // Число мест
    private boolean summerTires; // Летняя резина
    private Key key;


    private static final String DEFAULT_VALUE = "default";
    private static final double DEFAULT_ENGINE_VOLUME = 1.5;
    private static final String DEFAULT_COLOR = "White";
    private static final int DEFAULT_PRODUCTION_YEAR = 2000;
    private static final String DEFAULT_TRANSMISSION = "MT";
    private static final String DEFAULT_STYLE = "Sedan";
    private static final int DEFAULT_NUMBER_OF_SEATS = 5;


    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               String transmission,
               String style,
               String registrationNumber,
               int numberOfSeats,
               boolean summerTires,
               Key key)
    {
        if(brand == null || brand.isBlank() || brand.isEmpty()) {
          this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }
        if(model == null || model.isBlank() || model.isEmpty()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = model;
        };

        setEngineVolume(engineVolume);
        setColor(color);

        if(productionYear <= 0) {
            this.productionYear = DEFAULT_PRODUCTION_YEAR;
        } else {
            this.productionYear = productionYear;
        }
        if(productionCountry == null || productionCountry.isBlank() || productionCountry.isEmpty()) {
            this.productionCountry = DEFAULT_VALUE;
        } else {
            this.productionCountry = productionCountry;
        }

        setTransmission(transmission);

        if(style == null || style.isBlank() || style.isEmpty()) {
            this.style = DEFAULT_STYLE;
        } else {
            this.style = style;
        }

        setRegistrationNumber(registrationNumber);

        if(numberOfSeats <= 0) {
            this.numberOfSeats = DEFAULT_NUMBER_OF_SEATS;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        this.summerTires = summerTires;

        setKey(key);
    }
    public static class Key {
        private final boolean remoteStartEngine;
        private final boolean keylessAccess;

        public Key(boolean remoteStartEngine, boolean keylessAccess) {
            this.remoteStartEngine = remoteStartEngine;
            this.keylessAccess = keylessAccess;
        }
        public Key() {
            this(false,false);
        }

        public boolean isRemoteStartEngine() {
            return remoteStartEngine;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return "удаленный запуск: " + remoteStartEngine + "\nбесключевой доступ: " + keylessAccess;
        }
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getProductionYear() {
        return productionYear;
    }
    public String getProductionCountry() {
        return productionCountry;
    }
    public String getStyle() {
        return style;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume) {
        if(engineVolume <= 0) {
            this.engineVolume = DEFAULT_ENGINE_VOLUME;
        } else {
            this.engineVolume = engineVolume;
        }
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        if (color == null || color.isBlank() || color.isEmpty()) {
            this.color = DEFAULT_COLOR;
        } else {
            this.color = color;
        }
    }
    public String getTransmission() {
        return transmission;
    }
    public void setTransmission(String transmission) {
        if(transmission == null || transmission.isBlank() || transmission.isEmpty()) {
            this.transmission = DEFAULT_TRANSMISSION;
        } else {
            this.transmission = transmission;
        }
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(String registrationNumber) {
        if(registrationNumber == null || registrationNumber.isBlank() || registrationNumber.isEmpty()) {
            this.registrationNumber = DEFAULT_VALUE;
        } else {
            this.registrationNumber = registrationNumber;
        }
    }
    public boolean isSummerTires() {
        return summerTires;
    }
    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

    public Key getKey() {
        return key;
    }
    public void setKey(Key key){
        if(key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
    }

    public void changeTypeTires(int month){
        if (month >= 4 && month <=10) {
            setSummerTires(true);
        } else {
            setSummerTires(false);
        }
    }


    @Override
    public String toString() {
        return "Марка: " + brand + "\nмодель: " + model + "\nобъем двигателя: " + engineVolume +
                "\nцвет: " + color + "\nгод выпуска: " + productionYear +
                "\nстрана сборки: " + productionCountry + "\nкоробка передач: " + transmission +
                "\nтип кузова: " + style + "\nрегистрационный номер: " + registrationNumber +
                "\nколичество мест: " + numberOfSeats + "\nлетние шины: " + summerTires +
                "\n" + key;
    }

}
