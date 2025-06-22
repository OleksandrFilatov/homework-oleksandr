package homework12_05;

public class Task3 {
    public static void main(String[] args) {
        Temperature temp = new Temperature();
        temp.celsius = 10;
        temp.toFahrenheit();
        System.out.println("temp " + temp.fahrenheit);
    }
}

class Temperature {
    double celsius;
    double fahrenheit;

    public void toFahrenheit() {
        fahrenheit = (celsius * 9.0 / 5.0) + 32;
    }
}