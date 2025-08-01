package main.homework15_05.Task2;

public class Main {
    public static void main(String[] args) {
        Light kitchenLight = new Light("Кухня");

        LightService.toggleLight(kitchenLight);
        LightService.adjustBrightness(kitchenLight);
    }
}