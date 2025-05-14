package homework13_05;

public class Task1 {
    public static void main(String[] args) {
        double priceA = 1000;
        double priceB = 500;
        double discount = 100;

        double totalPrice = getTotalPrice(priceA, priceB, discount);

        System.out.println("Итоговая сумма покупки со скидкой: " + totalPrice + " евро");
        System.out.println("Сумма скидки: " + discount + " евро");
    }

    public static double getTotalPrice(double priceA, double priceB, double discount) {
        return priceA + priceB - discount;
    }
}