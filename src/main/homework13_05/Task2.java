package main.homework13_05;

public class Task2 {
    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", "Лев Толстой");

        book1.borrowBook();
        book1.borrowBook();
        book1.returnBook();
        book1.returnBook();
    }
}

class Book {
    String title;
    String author;
    boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Книга \"" + title + "\" выдана.");
        } else {
            System.out.println("Книга \"" + title + "\" уже выдана.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Книга \"" + title + "\" возвращена.");
        } else {
            System.out.println("Книга \"" + title + "\" уже в библиотеке.");
        }
    }
}