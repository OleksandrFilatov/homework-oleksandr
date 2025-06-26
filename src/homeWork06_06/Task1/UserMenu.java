package homeWork06_06.Task1;

import java.util.Scanner;

public class UserMenu {
    private BookService service;
    private Scanner scanner = new Scanner(System.in);

    public UserMenu(BookService service) {
        this.service = service;
    }

    public void start() {
        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1 - Добавить книгу");
            System.out.println("2 - Найти книгу по ID");
            System.out.println("3 - Найти книгу по названию");
            System.out.println("0 - Выход");
            System.out.println("Выберите действие: ");
            int choise = scanner.nextInt();
            scanner.nextLine();

            switch (choise) {
                case 1 -> addBook();
                case 2 -> findBookById();
                case 3 -> findBookByTitle();
                case 0 -> {
                    System.out.println("Выход из программы.");
                    return;
                }
                default -> System.out.println("Неверный выбор!");
            }
        }
    }

    private void addBook() {
        System.out.println("Введите ID книги: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите название книги: ");
        String title = scanner.nextLine();
        System.out.println("Введите автора: ");
        String author = scanner.nextLine();
        service.addBook(id, title, author);
        System.out.println("Книга добавлена!");

    }

    private void findBookById() {
        System.out.println("Введите ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Book book = service.searchById(id);
        System.out.println(book != null ? book : "Книга не найдена. ");

    }

    private void findBookByTitle() {
        System.out.println("Введите название книги: ");
        String title = scanner.nextLine();
        Book book = service.searchByTitle(title);
        System.out.println(book != null ? book : "Книга не найдена. ");
    }
}
