package homework15_05.Task2;

import java.util.Scanner;

public class LightService {
    private static final Scanner scanner = new Scanner(System.in);

    public static void toggleLight(Light light) {
        System.out.print("Включить свет в локации \"" + light.getLocation() + "\"? (да/нет): ");
        String input = scanner.nextLine().trim().toLowerCase();

        if (input.equals("да")) {
            light.setOn(true);
        } else if (input.equals("нет")) {
            light.setOn(false);
        } else {
            System.out.println("Некорректный ввод. Оставляем текущее состояние.");
        }

        printStatus(light);
    }

    public static void adjustBrightness(Light light) {
        System.out.print("Укажите яркость (0–100): ");
        try {
            int value = Integer.parseInt(scanner.nextLine().trim());
            light.setBrightness(value);
        } catch (NumberFormatException e) {
            System.out.println("Некорректный ввод. Яркость не изменена.");
        }

        printStatus(light);
    }

    public static void printStatus(Light light) {
        System.out.println("Свет в локации \"" + light.getLocation() + "\" " +
                (light.isOn() ? "включен" : "выключен") +
                ", яркость: " + light.getBrightness() + "%");
    }
}