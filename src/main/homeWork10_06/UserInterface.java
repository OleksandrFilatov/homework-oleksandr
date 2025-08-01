package main.homeWork10_06;

import java.util.Scanner;

public class UserInterface {

    private BookService bookService;
    private Scanner scanner = new Scanner(System.in);

    public UserInterface(BookService bookService) {
        this.bookService = bookService;
    }

    public void run() {
        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Найти книгу по ID");
            System.out.println("3. Найти книгу по названию");
            System.out.println("4. Найти книгу по автору");
            System.out.println("0. Выход");
            System.out.print("Выберите пункт: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // чтобы считать Enter

            switch (choice) {
                case 1 -> addBook();
                case 2 -> findById();
                case 3 -> findByTitle();
                case 4 -> findByAuthor();
                case 0 -> {
                    System.out.println("Выход из программы.");
                    return;
                }
                default -> System.out.println("Неверный выбор. Повторите.");
            }
        }
    }

    private void addBook() {
        System.out.print("Введите ID книги: ");
        String bookId = scanner.nextLine();

        System.out.print("Введите название книги: ");
        String title = scanner.nextLine();

        System.out.print("Введите автора книги: ");
        String author = scanner.nextLine();

        Book newBook = new Book(bookId, title, author);
        boolean added = bookService.addNewBook(newBook);

        if (added) {
            System.out.println("Книга успешно добавлена!");
        } else {
            System.out.println("Ошибка: такая книга уже существует или введены некорректные данные.");
        }
    }

    private void findById() {
        System.out.print("Введите ID: ");
        String id = scanner.nextLine();
        Book book = bookService.findBookById(id);
        System.out.println(book != null ? book : "Книга не найдена.");
    }

    private void findByTitle() {
        System.out.print("Введите название: ");
        String title = scanner.nextLine();
        Book book = bookService.findBookByTitle(title);
        System.out.println(book != null ? book : "Книга не найдена.");
    }

    private void findByAuthor() {
        System.out.print("Введите автора: ");
        String author = scanner.nextLine();
        Book[] books = bookService.findBooksByAuthor(author);

        if (books.length == 0) {
            System.out.println("Книги не найдены.");
        } else {
            System.out.println("Книги этого автора:");
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }
}

