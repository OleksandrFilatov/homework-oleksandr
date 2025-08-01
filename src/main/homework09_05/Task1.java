package main.homework09_05;

public class Task1 {

    public static void main(String[] args) {
        int priceA = 1000; // Цена товара A
        int priceB = 500;  // Цена товара B
        int discount = 100; // Скидка при покупке вместе

        int totalPriceWithoutDiscount = priceA + priceB;
        int totalPriceWithDiscount = totalPriceWithoutDiscount - discount;

        // Выводим стоимость со скидкой
        System.out.println("Сумма со скидкой: " + totalPriceWithDiscount + " руб.");

        // Выводим сумму скидки
        System.out.println("Сумма скидки: " + discount + " руб.");
    }
}