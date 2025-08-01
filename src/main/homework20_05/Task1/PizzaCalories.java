package main.homework20_05.Task1;

public class PizzaCalories {

    public static double calculateCalories(int diameter) {
        double radius = diameter / 2.0;
        double area = Math.PI * radius * radius;
        return area * 40;
    }

    public static void main(String[] args) {
        int diameter1 = 24;
        int diameter2 = 28;

        double calories1 = calculateCalories(diameter1);
        double calories2 = calculateCalories(diameter2);

        double extraCalories = calories2 - calories1;

        System.out.println("Калорий в пицце 24 см: " + (int)calories1);
        System.out.println("Калорий в пицце 28 см: " + (int)calories2);
        System.out.println("Лишние калории: " + (int)extraCalories);
    }
}