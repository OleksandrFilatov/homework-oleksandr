package main.homework13_05;

public class Task4 {
    public static void main(String[] args) {
        double length = 10.0;
        double width = 5.0;

        double area = Rectangle.calculateArea(length, width);
        double perimeter = Rectangle.calculatePerimeter(length, width);

        System.out.println("Длина: " + length);
        System.out.println("Ширина: " + width);
        System.out.println("Площадь прямоугольника: " + area);
        System.out.println("Периметр прямоугольника: " + perimeter);
    }
}

class Rectangle {
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }
}
