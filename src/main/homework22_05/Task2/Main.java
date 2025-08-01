package main.homework22_05.Task2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int num1 = random.nextInt(101);
        int num2 = random.nextInt(101);
        int num3 = random.nextInt(101);
        int num4 = random.nextInt(101);

        System.out.println("Сгенерированные числа:");
        System.out.println("число 1: " + num1);
        System.out.println("число 2: " + num2);
        System.out.println("число 3: " + num3);
        System.out.println("число 4: " + num4);

        int max = num1;

        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num2;
        }
        if (num4 > max) {
            max = num2;
        }
        System.out.println("Максимальное число: " + max);
    }
}
