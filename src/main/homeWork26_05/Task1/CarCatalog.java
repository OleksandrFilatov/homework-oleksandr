package main.homeWork26_05.Task1;

import java.util.Scanner;

public class CarCatalog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько машин вы хотите добавить в каталог? ");
        int numbersOfCars = scanner.nextInt();
        scanner.nextLine();

        Car[] cars = new Car[numbersOfCars];

        for (int i = 0; i < numbersOfCars; i++){
            System.out.println("Введите данные для машин #" + (i + 1));

            System.out.println("Производитель: ");
            String producer = scanner.nextLine();

            System.out.println("Модель: ");
            String model = scanner.nextLine();

            System.out.println("Мощность: ");
            int power = scanner.nextInt();
            scanner.nextLine();

            cars[i] = new Car(producer, model, power);
        }
        System.out.println("/nКаталог автомобилей:");
        for (Car car : cars) {
            car.printInfo();
        }
    }
}
