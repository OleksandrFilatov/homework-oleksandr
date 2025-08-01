package main.homework15_05.Task1;

import java.util.Scanner;

public class Phone {
    private String model;
    private String color;
    private boolean isSilent;

    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
        this.isSilent = false;
    }

    public void changeSilentMode() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Включить режим 'без звука'? (да/нет): ");
        String input = scanner.nextLine().trim().toLowerCase();

        if (input.equals("да")) {
            isSilent = true;
        } else if (input.equals("нет")) {
            isSilent = false;
        } else {
            System.out.println("Некорректный ввод. Оставлено текущее значение.");
        }

        System.out.println("Режим 'без звука': " + (isSilent ? "включен" : "выключен"));
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("iPhone 14", "черный");
        phone1.changeSilentMode();
    }
}
