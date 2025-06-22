package homework14_05.task2;

public class CarDemo {
    public static void main(String[] args) {

        Car car = new Car("Toyota", "Camry", 8.5, 60);


        System.out.println(car);


        car.setFuelConsumption(7.0);


        System.out.println(car);
    }
}