package main.homework19_05.Task2;

public class Car {
    private String model;
    private Manufacturer manufacturer;
    private String color;

    public Car(String model, Manufacturer manufacturer, String color) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.color = color;
    }

    public void printInfo() {
        System.out.println("Модель: " + model);
        System.out.println("Производитель: " + manufacturer.getName() + " (" + manufacturer.getCountry() + ")");
        System.out.println("Цвет: " + color);
        System.out.println();
    }
}
