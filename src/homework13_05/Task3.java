package homework13_05;

public class Task3 {
    public static void main(String[] args) {
        double celsius = 25.0;


        double fahrenheit = Temperature.toFahrenheit(celsius);

        System.out.println("Температура в Цельсиях: " + celsius);
        System.out.println("Температура в Фаренгейтах: " + fahrenheit);
    }
}

class Temperature {
    public static double toFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
