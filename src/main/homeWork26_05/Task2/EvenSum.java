package main.homeWork26_05.Task2;

import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число N: ");
        int N = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i <= N; i++){
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Сумма всех чётных чисел от 0 до " + N + " равна: " + sum);
    }
}
