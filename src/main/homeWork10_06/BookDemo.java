package main.homeWork10_06;

public class BookDemo {
    public static void main(String[] args) {
        BookRepository repository = new BookRepository(100); // например, 100 книг максимум
        BookService service = new BookService(repository);
        UserInterface ui = new UserInterface(service);
        ui.run();
    }
}
