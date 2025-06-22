package HomeWork28_05.Task1;

import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int[] array = new int[8];
        Random random = new Random();

        for (int i = 0; i <array.length; i++) {
            array[i] = random.nextInt(50) + 1;
        }
        System.out.println("Исходный массив: ");
        for (int number : array) {
            System.out.println(number + " ");
        }

        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }

        System.out.println("/nМассив после замены нечётных индексов на 0: ");
        for (int number : array) {
            System.out.println(number + " ");
        }
    }
}
