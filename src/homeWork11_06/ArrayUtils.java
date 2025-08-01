package homeWork11_06;

public class ArrayUtils {

    public static int[] getEvenElements(int[] input) {
        // Подсчёт количества чётных элементов
        int count = 0;
        for (int num : input) {
            if (num % 2 == 0) count++;
        }

        // Новый массив с нужной длиной
        int[] result = new int[count];
        int index = 0;
        for (int num : input) {
            if (num % 2 == 0) {
                result[index] = num;
                index++;
            }
        }

        return result;
    }

    public static double getAverage(int[] input) {
        if (input.length == 0) return 0;

        int sum = 0;
        for (int num : input) {
            sum += num;
        }

        return (double) sum / input.length;
    }
}
