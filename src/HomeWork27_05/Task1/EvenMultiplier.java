package HomeWork27_05.Task1;

import java.util.Scanner;

public class EvenMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long product = 1;

        System.out.println("Введите чётные числа. Введите 0, чтобы закончить:");

        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }
            if (number % 2 == 0) {
                product *= number;
            } else {
                System.out.println("Число не чётное. Оно будет пропущено.");
            }
        }
    }
}

