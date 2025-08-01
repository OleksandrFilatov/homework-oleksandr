package main.homework19_05.Task1;

public class Main {
    public static void main(String[] args) {

        Category electronics = new Category("Электроника", "Товары электронной техники");
        Category clothing = new Category("Одежда", "Мужская и женская одежда");

        Product laptop = new Product("Ноутбук Lenovo", electronics, 65000, 5);
        Product tshirt = new Product("Футболка Nike", clothing, 2500, 20);
        Product headphones = new Product("Наушники Sony", electronics, 7500, 10);

        laptop.printInfo();
        tshirt.printInfo();
        headphones.printInfo();
    }
}
