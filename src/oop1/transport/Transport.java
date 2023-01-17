package oop1.transport;

public abstract class Transport<T extends Driver> implements Competing {
    private final String brand; // Марка
    private final String model; // Модель
    private double engineVolume; //Объем двигателя

    private T driver;

    private static final String DEFAULT_VALUE = "default";
    private static final double DEFAULT_ENGINE_VOLUME = 1.5;

    public Transport(String brand,
                     String model,
                     double engineVolume,
                     T driver) {

        if(brand == null || brand.isBlank() || brand.isEmpty()) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }
        if(model == null || model.isBlank() || model.isEmpty()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = model;
        }

        setEngineVolume(engineVolume);
        setDriver(driver);
    }
    public abstract void startMoving();
    public abstract void stopMoving();

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
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

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Марка: " + brand + ", модель: " + model + ", объем двигателя: " + engineVolume;
    }
}
