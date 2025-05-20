package homework20_05.Task4;

import java.util.Scanner;

public class CombineWords {

    public static String getHalfWord(String word, boolean isFirstHalf) {
        int length = word.length();
        int half = length / 2;

        if (length % 2 != 0) {

            if (isFirstHalf) {
                return word.substring(0, half);
            } else {
                return word.substring(half + 1);
            }
        } else {
            if (isFirstHalf) {
                return word.substring(0, half);
            } else {
                return word.substring(half);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое слово: ");
        String word1 = scanner.nextLine();

        System.out.print("Введите второе слово: ");
        String word2 = scanner.nextLine();

        String firstPart = getHalfWord(word1, true);
        String secondPart = getHalfWord(word2, false);

        String result = firstPart + secondPart;

        System.out.println("Результат: " + result);
    }
}