package homework20_05.Task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Список задач на сегодня
        ArrayList<Task> tasks = new ArrayList<>();

        // Добавляем задачи
        tasks.add(new Task("Позавтракать", "Приготовить омлет и чай"));
        tasks.add(new Task("Сходить в магазин", "Купить хлеб, молоко и фрукты"));
        tasks.add(new Task("Сделать домашку", "Закончить задание по математике"));
        tasks.add(new Task("Погулять", "Пройтись в парке хотя бы 30 минут"));

        // Выводим список задач
        System.out.println("Список дел на сегодня:\n");
        for (Task task : tasks) {
            task.printTask();
        }
    }
}