package oop1.transport;

public class Transport {
    private final String brand; // Марка
    private final String model; // Модель
    private final int productionYear; // Год выпуска
    private final String productionCountry; // Страна сборки
    private String color; // Цвет кузова
    private int maximumSpeedCar; // Максимальная скорость передвижения

    private static final String DEFAULT_VALUE = "default";
    private static final String DEFAULT_COLOR = "White";
    private static final int DEFAULT_PRODUCTION_YEAR = 2000;
    private static final int DEFAULT_MAXIMUM_SPEED_OF_CAR = 60;

    public Transport(String brand,
                     String model,
                     int productionYear,
                     String productionCountry,
                     String color,
                     int maximumSpeedCar)
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

        setColor(color);
        setMaximumSpeedCar(maximumSpeedCar);
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

    public int getMaximumSpeedCar() {
        return maximumSpeedCar;
    }
    public void setMaximumSpeedCar(int maximumSpeedCar) {
        if(maximumSpeedCar <= 0) {
            this.maximumSpeedCar = DEFAULT_MAXIMUM_SPEED_OF_CAR;
        } else {
            this.maximumSpeedCar = maximumSpeedCar;
        }
    }

    @Override
    public String toString() {
        return "Марка: " + brand + "\nмодель: " + model +
                "\nгод выпуска: " + productionYear + "\nстрана сборки: " + productionCountry +
                "\nцвет: " + color + "\nмаксимальная скорость: " + maximumSpeedCar;
    }
}
