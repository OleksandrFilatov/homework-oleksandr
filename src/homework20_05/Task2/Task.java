package homework20_05.Task2;

public class Task {
    private String title;
    private String description;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public void printTask() {
        System.out.println("Задача: " + title);
        System.out.println("Описание: " + description);
        System.out.println();
    }
}
