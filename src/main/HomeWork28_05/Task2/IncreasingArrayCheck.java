package main.HomeWork28_05.Task2;

import java.util.Random;

public class IncreasingArrayCheck {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(90) + 10;
        }

        System.out.println("Массив: ");
        for (int number : array) {
            System.out.println(number + " ");
        }
        System.out.println();

        boolean isStrictlyIncreasing = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                isStrictlyIncreasing = false;
                break;
            }
        }
        if (isStrictlyIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        }else  {
            System.out.println("Массив НЕ является строго возрастающей последовательностью.");
        }
    }
}
