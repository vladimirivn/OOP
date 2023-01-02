package oop1;

public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;
    private static final String DEFAULT_VALUE = "default";
    private static final double DEFAULT_ENGINE_VOLUME = 1.5;
    private static final String DEFAULT_COLOR = "White";
    private static final int DEFAULT_PRODUCTION_YEAR = 2000;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry)
    {

        if(brand == null || brand.isBlank()) {
          this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }

        if(model == null || model.isBlank()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = model;
        };

        if(engineVolume <= 0) {
            this.engineVolume = DEFAULT_ENGINE_VOLUME;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color == null || color.isBlank()) {
            this.color = DEFAULT_COLOR;
        } else {
            this.color = color;
        }

        if(productionYear <= 0) {
            this.productionYear = DEFAULT_PRODUCTION_YEAR;
        } else {
            this.productionYear = productionYear;
        }
        if(productionCountry == null || productionCountry.isBlank()) {
            this.productionCountry = DEFAULT_VALUE;
        } else {
            this.productionCountry = productionCountry;
        }
    }

    @Override
    public String toString() {
        return "Марка: " + brand + ", модель: " + model + ", объем двигателя: " + engineVolume +
                " цвет: " + color + ", год выпуска: " + productionYear +
                ", страна сборки: " + productionCountry;
    }
}
