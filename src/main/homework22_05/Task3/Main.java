package main.homework22_05.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число от 1 до 7:");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
            case 7:
                System.out.println("Выходной");
                break;
            default:
                System.out.println("Некорректный ввод. Введите число от 1 до 7.");
        }

        scanner.close();
    }
}
