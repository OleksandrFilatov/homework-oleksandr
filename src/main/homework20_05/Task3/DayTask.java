package main.homework20_05.Task3;

public class DayTask {
    private int number;
    private Task task;

    public DayTask(int number, Task task) {
        this.number = number;
        this.task = task;
    }

    public void printTask(){
        System.out.println("Задача #" + number);
        System.out.println("Наименование: " + task.getTitle());
        System.out.println("Описание: " + task.getDescription());
        System.out.println();
    }
}
