package main.homework19_05.Task1;

public class Product {
    private String name;
    private Category category;
    private double price;
    private int quantity;

    public Product(String name, Category category, double price, int quantity) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public void printInfo() {
        System.out.println("Товар: " + name);
        System.out.println("Категория: " + category.getName());
        System.out.println("Цена: " + price + " euro.");
        System.out.println("Количество: " + quantity + " шт.");
        System.out.println();
    }
}
