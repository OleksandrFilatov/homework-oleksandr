package main.homework14_05.task2;

public class Car {
    // Поля (характеристики машины)
    private String brand;
    private String model;
    private double fuelConsumption;
    private double fuelTankCapacity;
    private double maxDistance;


    public Car(String brand, String model, double fuelConsumption, double fuelTankCapacity) {
        this.brand = brand;
        this.model = model;
        this.fuelConsumption = fuelConsumption;
        this.fuelTankCapacity = fuelTankCapacity;
        this.maxDistance = fuelTankCapacity * 100 / fuelConsumption;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public double getMaxDistance() {
        return maxDistance;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
        recalculateMaxDistance();  // пересчёт, если расход изменился
    }

    public void setFuelTankCapacity(double fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
        recalculateMaxDistance();  // пересчёт, если бак изменился
    }


    private void recalculateMaxDistance() {
        this.maxDistance = this.fuelTankCapacity * 100 / this.fuelConsumption;
    }


    @Override
    public String toString() {
        return "Автомобиль " + brand + " " + model +
                ": расход топлива " + fuelConsumption + " л/100 км, объем бака " +
                fuelTankCapacity + " л, максимальная дистанция " +
                maxDistance + " км.";
    }
}
