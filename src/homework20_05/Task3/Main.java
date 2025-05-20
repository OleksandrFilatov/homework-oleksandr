package homework20_05.Task3;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<DayTask> todayTasks = new ArrayList<>();


        Task task1 = new Task("Позавтракать", "Приготовить овсянку и чай");
        Task task2 = new Task("Сделать зарядку", "15 минут упражнений");
        Task task3 = new Task("Работа над проектом", "Написать часть отчёта");


        todayTasks.add(new DayTask(1, task1));
        todayTasks.add(new DayTask(2, task2));
        todayTasks.add(new DayTask(3, task3));


        System.out.println("Список дел на сегодня:\n");
        for (DayTask dayTask : todayTasks) {
            dayTask.printTask();
        }
    }
}
