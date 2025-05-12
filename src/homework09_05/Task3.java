package homework09_05;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Остаток от деления на 2:");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " % 2 = " + (i % 2));
        }

        System.out.println("\nОстаток от деления на 3:");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " % 3 = " + (i % 3));
        }
    }
}