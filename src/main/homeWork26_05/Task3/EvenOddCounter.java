package main.homeWork26_05.Task3;

import java.util.Scanner;

public class EvenOddCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число N: ");
        int N = scanner.nextInt();

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Чётных чисел: " + evenCount);
        System.out.println("Нечётных чисел: " + oddCount);
    }
}
