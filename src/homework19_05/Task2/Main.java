package homework19_05.Task2;

public class Main {
    public static void main(String[] args) {
        Manufacturer toyota = new Manufacturer("Toyota", "Japan");
        Manufacturer bmw = new Manufacturer("Bmw", "Germany");

        Car car1 = new Car("Camry", toyota, "Чёрный");
        Car car2 = new Car("Supra", toyota, "Красный");
        Car car3 = new Car("X5", bmw, "Белый");

        car1.printInfo();
        car2.printInfo();
        car3.printInfo();
    }
}
