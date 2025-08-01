package main.homework12_05;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("------------------First Car---------------------");
        Car sport = new Car();
        sport.setBrand("Lamborgini");
        sport.setModel("Diablo");
        sport.setYear(2005);
        sport.setMileage(10000);
        sport.printInfo();
        System.out.println("------------------Second Car--------------------");
        Car light = new Car();
        light.setBrand("Big");
        light.setModel("322");
        light.setYear(2032);
        light.setMileage(0);
        light.printInfo();
    }
}

class Car {
    private String brand;
    private String model;
    private int year;
    private int mileage;

    void printInfo() {
        System.out.println("Brand: " + getBrand() + "\nModel: " + getModel() + "\nYear: " + getYear() + "\nMileage: " + getMileage());
    }

    String getBrand() {
        return brand;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    String getModel() {
        return model;
    }

    void setModel(String model) {
        this.model = model;
    }

    int getYear() {
        return year;
    }

    void setYear(int year) {
        this.year = year;
    }

    int getMileage() {
        return mileage;
    }

    void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
